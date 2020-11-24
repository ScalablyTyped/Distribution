package typings.reactNativeCheckBox.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckBoxProps extends js.Object {
  
  var checkBoxColor: js.UndefOr[String] = js.native
  
  var checkedCheckBoxColor: js.UndefOr[String] = js.native
  
  var checkedImage: js.UndefOr[ReactElement] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var isChecked: Boolean = js.native
  
  var leftText: js.UndefOr[String] = js.native
  
  var leftTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var leftTextView: js.UndefOr[ReactNode] = js.native
  
  def onClick(): Unit = js.native
  
  var rightText: js.UndefOr[String] = js.native
  
  var rightTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var rightTextView: js.UndefOr[ReactNode] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var unCheckedImage: js.UndefOr[ReactElement] = js.native
  
  var uncheckedCheckBoxColor: js.UndefOr[String] = js.native
}
object CheckBoxProps {
  
  @scala.inline
  def apply(isChecked: Boolean, onClick: () => Unit): CheckBoxProps = {
    val __obj = js.Dynamic.literal(isChecked = isChecked.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[CheckBoxProps]
  }
  
  @scala.inline
  implicit class CheckBoxPropsOps[Self <: CheckBoxProps] (val x: Self) extends AnyVal {
    
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
    def setIsChecked(value: Boolean): Self = this.set("isChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckBoxColor(value: String): Self = this.set("checkBoxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckBoxColor: Self = this.set("checkBoxColor", js.undefined)
    
    @scala.inline
    def setCheckedCheckBoxColor(value: String): Self = this.set("checkedCheckBoxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedCheckBoxColor: Self = this.set("checkedCheckBoxColor", js.undefined)
    
    @scala.inline
    def setCheckedImage(value: ReactElement): Self = this.set("checkedImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedImage: Self = this.set("checkedImage", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setLeftText(value: String): Self = this.set("leftText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftText: Self = this.set("leftText", js.undefined)
    
    @scala.inline
    def setLeftTextStyle(value: StyleProp[TextStyle]): Self = this.set("leftTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftTextStyle: Self = this.set("leftTextStyle", js.undefined)
    
    @scala.inline
    def setLeftTextStyleNull: Self = this.set("leftTextStyle", null)
    
    @scala.inline
    def setLeftTextView(value: ReactNode): Self = this.set("leftTextView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftTextView: Self = this.set("leftTextView", js.undefined)
    
    @scala.inline
    def setRightText(value: String): Self = this.set("rightText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightText: Self = this.set("rightText", js.undefined)
    
    @scala.inline
    def setRightTextStyle(value: StyleProp[TextStyle]): Self = this.set("rightTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightTextStyle: Self = this.set("rightTextStyle", js.undefined)
    
    @scala.inline
    def setRightTextStyleNull: Self = this.set("rightTextStyle", null)
    
    @scala.inline
    def setRightTextView(value: ReactNode): Self = this.set("rightTextView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightTextView: Self = this.set("rightTextView", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setUnCheckedImage(value: ReactElement): Self = this.set("unCheckedImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnCheckedImage: Self = this.set("unCheckedImage", js.undefined)
    
    @scala.inline
    def setUncheckedCheckBoxColor(value: String): Self = this.set("uncheckedCheckBoxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUncheckedCheckBoxColor: Self = this.set("uncheckedCheckBoxColor", js.undefined)
  }
}
