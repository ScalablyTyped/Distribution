package typings.rmcPicker.popupPickerTypesMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopupPickerProps extends js.Object {
  var WrapComponent: js.UndefOr[js.Any] = js.native
  var actionTextActiveOpacity: js.UndefOr[Double] = js.native
  var actionTextUnderlayColor: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var content: js.UndefOr[ReactElement | String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dismissText: js.UndefOr[String | ReactElement] = js.native
  var maskTransitionName: js.UndefOr[String] = js.native
  var okText: js.UndefOr[String | ReactElement] = js.native
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  var picker: js.UndefOr[js.Any] = js.native
  var pickerValueChangeProp: js.UndefOr[String] = js.native
  var pickerValueProp: js.UndefOr[String] = js.native
  var popupTransitionName: js.UndefOr[String] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var style: js.UndefOr[js.Any] = js.native
  /** react-native only */
  var styles: js.UndefOr[js.Any] = js.native
  var title: js.UndefOr[String | ReactElement] = js.native
  var transitionName: js.UndefOr[String] = js.native
  var triggerType: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Any] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  /** web only */
  var wrapStyle: js.UndefOr[CSSProperties] = js.native
}

object IPopupPickerProps {
  @scala.inline
  def apply(): IPopupPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopupPickerProps]
  }
  @scala.inline
  implicit class IPopupPickerPropsOps[Self <: IPopupPickerProps] (val x: Self) extends AnyVal {
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
    def setWrapComponent(value: js.Any): Self = this.set("WrapComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapComponent: Self = this.set("WrapComponent", js.undefined)
    @scala.inline
    def setActionTextActiveOpacity(value: Double): Self = this.set("actionTextActiveOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionTextActiveOpacity: Self = this.set("actionTextActiveOpacity", js.undefined)
    @scala.inline
    def setActionTextUnderlayColor(value: String): Self = this.set("actionTextUnderlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionTextUnderlayColor: Self = this.set("actionTextUnderlayColor", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContent(value: ReactElement | String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDismissText(value: String | ReactElement): Self = this.set("dismissText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissText: Self = this.set("dismissText", js.undefined)
    @scala.inline
    def setMaskTransitionName(value: String): Self = this.set("maskTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskTransitionName: Self = this.set("maskTransitionName", js.undefined)
    @scala.inline
    def setOkText(value: String | ReactElement): Self = this.set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setOnOk(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("onOk", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOk: Self = this.set("onOk", js.undefined)
    @scala.inline
    def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = this.set("onVisibleChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVisibleChange: Self = this.set("onVisibleChange", js.undefined)
    @scala.inline
    def setPicker(value: js.Any): Self = this.set("picker", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePicker: Self = this.set("picker", js.undefined)
    @scala.inline
    def setPickerValueChangeProp(value: String): Self = this.set("pickerValueChangeProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickerValueChangeProp: Self = this.set("pickerValueChangeProp", js.undefined)
    @scala.inline
    def setPickerValueProp(value: String): Self = this.set("pickerValueProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickerValueProp: Self = this.set("pickerValueProp", js.undefined)
    @scala.inline
    def setPopupTransitionName(value: String): Self = this.set("popupTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupTransitionName: Self = this.set("popupTransitionName", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTitle(value: String | ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setTriggerType(value: String): Self = this.set("triggerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerType: Self = this.set("triggerType", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWrapStyle(value: CSSProperties): Self = this.set("wrapStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapStyle: Self = this.set("wrapStyle", js.undefined)
  }
  
}

