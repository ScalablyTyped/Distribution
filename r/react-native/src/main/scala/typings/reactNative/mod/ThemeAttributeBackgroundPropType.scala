package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.ThemeAttrAndroid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeAttributeBackgroundPropType
  extends BaseBackgroundPropType
     with BackgroundPropType {
  var attribute: String = js.native
  @JSName("type")
  var type_ThemeAttributeBackgroundPropType: ThemeAttrAndroid = js.native
}

object ThemeAttributeBackgroundPropType {
  @scala.inline
  def apply(attribute: String, `type`: ThemeAttrAndroid): ThemeAttributeBackgroundPropType = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeAttributeBackgroundPropType]
  }
  @scala.inline
  implicit class ThemeAttributeBackgroundPropTypeOps[Self <: ThemeAttributeBackgroundPropType] (val x: Self) extends AnyVal {
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
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ThemeAttrAndroid): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

