package typings.reduxOptimisticUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Id extends StObject {
    
    /**
      * Transaction id. Id should be unique for each optimistic action
      *
      * @type {number}
      */
    var id: Double = js.native
    
    /**
      * Type, BEGIN, COMMIT or REVERT
      *
      * @type {string}
      */
    var `type`: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: Double, `type`: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Optimistic extends StObject {
    
    /**
      * Optimistic information
      */
    var optimistic: Id = js.native
  }
  object Optimistic {
    
    @scala.inline
    def apply(optimistic: Id): Optimistic = {
      val __obj = js.Dynamic.literal(optimistic = optimistic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optimistic]
    }
    
    @scala.inline
    implicit class OptimisticMutableBuilder[Self <: Optimistic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptimistic(value: Id): Self = StObject.set(x, "optimistic", value.asInstanceOf[js.Any])
    }
  }
}
