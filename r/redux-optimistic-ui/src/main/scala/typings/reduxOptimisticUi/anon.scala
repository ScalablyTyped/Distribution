package typings.reduxOptimisticUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    /**
      * Transaction id. Id should be unique for each optimistic action
      *
      * @type {number}
      */
    var id: Double
    
    /**
      * Type, BEGIN, COMMIT or REVERT
      *
      * @type {string}
      */
    var `type`: String
  }
  object Id {
    
    inline def apply(id: Double, `type`: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Optimistic extends StObject {
    
    /**
      * Optimistic information
      */
    var optimistic: Id
  }
  object Optimistic {
    
    inline def apply(optimistic: Id): Optimistic = {
      val __obj = js.Dynamic.literal(optimistic = optimistic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optimistic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Optimistic] (val x: Self) extends AnyVal {
      
      inline def setOptimistic(value: Id): Self = StObject.set(x, "optimistic", value.asInstanceOf[js.Any])
    }
  }
}
