package typings.qlik.mod

import typings.qlik.qlikStrings.media
import typings.qlik.qlikStrings.string
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
  implicit class CustomProperyMediaOps[Self <: CustomProperyMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponent(value: media): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutRef(value: String): Self = this.set("layoutRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutRef: Self = this.set("layoutRef", js.undefined)
  }
}
