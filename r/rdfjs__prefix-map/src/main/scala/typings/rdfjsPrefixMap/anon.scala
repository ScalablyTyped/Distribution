package typings.rdfjsPrefixMap

import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
