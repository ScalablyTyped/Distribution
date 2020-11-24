package typings.reactNativeSimpleRadioButton.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultRadioFormProps extends js.Object {
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var accessible: js.UndefOr[Boolean] = js.native
  
  var onPress: js.UndefOr[js.Function1[/* val */ js.UndefOr[js.Any], _]] = js.native
  
  var testID: js.UndefOr[String] = js.native
}
object DefaultRadioFormProps {
  
  @scala.inline
  def apply(): DefaultRadioFormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRadioFormProps]
  }
  
  @scala.inline
  implicit class DefaultRadioFormPropsOps[Self <: DefaultRadioFormProps] (val x: Self) extends AnyVal {
    
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
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessible(value: Boolean): Self = this.set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    
    @scala.inline
    def setOnPress(value: /* val */ js.UndefOr[js.Any] => _): Self = this.set("onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
  }
}
