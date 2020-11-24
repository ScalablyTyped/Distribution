package typings.storybookReactNative.absolutePositionedKeyboardAwareViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {onLayout (dimens : @storybook/react-native.@storybook/react-native/dist/preview/components/OnDeviceUI/absolute-positioned-keyboard-aware-view.PreviewDimens): void} & @storybook/react-native.@storybook/react-native/dist/preview/components/OnDeviceUI/absolute-positioned-keyboard-aware-view.PreviewDimens */
@js.native
trait Props extends js.Object {
  
  def onLayout(dimens: PreviewDimens): Unit = js.native
  
  var previewHeight: Double = js.native
  
  var previewWidth: Double = js.native
}
object Props {
  
  @scala.inline
  def apply(onLayout: PreviewDimens => Unit, previewHeight: Double, previewWidth: Double): Props = {
    val __obj = js.Dynamic.literal(onLayout = js.Any.fromFunction1(onLayout), previewHeight = previewHeight.asInstanceOf[js.Any], previewWidth = previewWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setOnLayout(value: PreviewDimens => Unit): Self = this.set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreviewHeight(value: Double): Self = this.set("previewHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewWidth(value: Double): Self = this.set("previewWidth", value.asInstanceOf[js.Any])
  }
}
