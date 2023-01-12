package typings.qlik.mod

import typings.qlik.qlikStrings.media
import typings.qlik.qlikStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomProperyMedia
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  var component: media
  
  var layoutRef: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_CustomProperyMedia: string
}
object CustomProperyMedia {
  
  inline def apply(): CustomProperyMedia = {
    val __obj = js.Dynamic.literal(component = "media")
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[CustomProperyMedia]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomProperyMedia] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: media): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setLayoutRef(value: String): Self = StObject.set(x, "layoutRef", value.asInstanceOf[js.Any])
    
    inline def setLayoutRefUndefined: Self = StObject.set(x, "layoutRef", js.undefined)
    
    inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
