package typings.rdfjsEnvironment

import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bind extends StObject {
    
    var bind: Boolean
  }
  object Bind {
    
    inline def apply(bind: Boolean): Bind = {
      val __obj = js.Dynamic.literal(bind = bind.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bind]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bind] (val x: Self) extends AnyVal {
      
      inline def setBind(value: Boolean): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
    }
  }
  
  trait Clone[T] extends StObject
  
  trait Factory extends StObject {
    
    var factory: DataFactory[Quad, Quad]
  }
  object Factory {
    
    inline def apply(factory: DataFactory[Quad, Quad]): Factory = {
      val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any])
      __obj.asInstanceOf[Factory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Factory] (val x: Self) extends AnyVal {
      
      inline def setFactory(value: DataFactory[Quad, Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    }
  }
}
