package typings.qlik.mod

import typings.qlik.qlikStrings.media
import typings.qlik.qlikStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomProperyMedia
  extends CustomPropertyCommon
     with CustomProperty {
  
  var component: media = js.native
  
  var layoutRef: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_CustomProperyMedia: string = js.native
}
object CustomProperyMedia {
  
  @scala.inline
  def apply(component: media, `type`: string): CustomProperyMedia = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperyMedia]
  }
  
  @scala.inline
  implicit class CustomProperyMediaMutableBuilder[Self <: CustomProperyMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: media): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutRef(value: String): Self = StObject.set(x, "layoutRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutRefUndefined: Self = StObject.set(x, "layoutRef", js.undefined)
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
