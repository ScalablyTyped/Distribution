package typings.reactNavigationStack.vendorTypesMod

import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackHeaderTitleProps extends js.Object {
  
  /**
    * Whether title font should scale to respect Text Size accessibility settings.
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  
  /**
    * Content of the title element. Usually the title string.
    */
  var children: js.UndefOr[String] = js.native
  
  /**
    * Callback to trigger when the size of the title element changes.
    */
  def onLayout(e: LayoutChangeEvent): Unit = js.native
  
  /**
    * Style object for the title element.
    */
  var style: js.UndefOr[WithAnimatedValue[StyleProp[TextStyle]]] = js.native
  
  /**
    * Tint color for the header.
    */
  var tintColor: js.UndefOr[String] = js.native
}
object StackHeaderTitleProps {
  
  @scala.inline
  def apply(onLayout: LayoutChangeEvent => Unit): StackHeaderTitleProps = {
    val __obj = js.Dynamic.literal(onLayout = js.Any.fromFunction1(onLayout))
    __obj.asInstanceOf[StackHeaderTitleProps]
  }
  
  @scala.inline
  implicit class StackHeaderTitlePropsOps[Self <: StackHeaderTitleProps] (val x: Self) extends AnyVal {
    
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
    def setOnLayout(value: LayoutChangeEvent => Unit): Self = this.set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFontScaling: Self = this.set("allowFontScaling", js.undefined)
    
    @scala.inline
    def setChildren(value: String): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setStyle(value: WithAnimatedValue[StyleProp[TextStyle]]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
  }
}
