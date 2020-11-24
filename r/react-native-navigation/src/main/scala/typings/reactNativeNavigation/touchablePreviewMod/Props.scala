package typings.reactNativeNavigation.touchablePreviewMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.TouchableHighlight
import typings.reactNative.mod.TouchableNativeFeedback
import typings.reactNative.mod.TouchableOpacity
import typings.reactNative.mod.TouchableWithoutFeedback
import typings.reactNativeNavigation.anon.ReactTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var onPeekIn: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPeekOut: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPressIn: js.UndefOr[js.Function1[/* payload */ ReactTag, Unit]] = js.native
  
  var touchableComponent: js.UndefOr[
    TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | ReactNode
  ] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setOnPeekIn(value: () => Unit): Self = this.set("onPeekIn", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPeekIn: Self = this.set("onPeekIn", js.undefined)
    
    @scala.inline
    def setOnPeekOut(value: () => Unit): Self = this.set("onPeekOut", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPeekOut: Self = this.set("onPeekOut", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setOnPressIn(value: /* payload */ ReactTag => Unit): Self = this.set("onPressIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPressIn: Self = this.set("onPressIn", js.undefined)
    
    @scala.inline
    def setTouchableComponent(
      value: TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | ReactNode
    ): Self = this.set("touchableComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchableComponent: Self = this.set("touchableComponent", js.undefined)
  }
}
