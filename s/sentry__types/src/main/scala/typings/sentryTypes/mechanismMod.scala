package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mechanismMod {
  
  trait Mechanism extends StObject {
    
    var data: js.UndefOr[StringDictionary[String | Boolean]] = js.undefined
    
    var handled: Boolean
    
    var synthetic: js.UndefOr[Boolean] = js.undefined
    
    var `type`: String
  }
  object Mechanism {
    
    inline def apply(handled: Boolean, `type`: String): Mechanism = {
      val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mechanism]
    }
    
    extension [Self <: Mechanism](x: Self) {
      
      inline def setData(value: StringDictionary[String | Boolean]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
      
      inline def setSynthetic(value: Boolean): Self = StObject.set(x, "synthetic", value.asInstanceOf[js.Any])
      
      inline def setSyntheticUndefined: Self = StObject.set(x, "synthetic", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
