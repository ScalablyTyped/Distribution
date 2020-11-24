package typings.reactNativeSafeAreaContext.safeAreaTypesMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeSafeAreaProviderProps extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var onInsetsChange: InsetChangeNativeCallback = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object NativeSafeAreaProviderProps {
  
  @scala.inline
  def apply(onInsetsChange: /* event */ InsetChangedEvent => Unit): NativeSafeAreaProviderProps = {
    val __obj = js.Dynamic.literal(onInsetsChange = js.Any.fromFunction1(onInsetsChange))
    __obj.asInstanceOf[NativeSafeAreaProviderProps]
  }
  
  @scala.inline
  implicit class NativeSafeAreaProviderPropsOps[Self <: NativeSafeAreaProviderProps] (val x: Self) extends AnyVal {
    
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
    def setOnInsetsChange(value: /* event */ InsetChangedEvent => Unit): Self = this.set("onInsetsChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
