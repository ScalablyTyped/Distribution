package typings.reactMotion.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * <Motion/> properties
  */
@js.native
trait MotionProps extends js.Object {
  
  /**
    * Callback with your interpolated styles. Must return one react element to render
    * @param interpolatedStyle
    */
  var children: js.UndefOr[js.Function1[/* interpolatedStyle */ PlainStyle, Element]] = js.native
  
  /**
    * The default style. Being ignored on subsequent renders
    * @default Object with same keys as in style whose values are the initial numbers you're interpolating on
    */
  var defaultStyle: js.UndefOr[PlainStyle] = js.native
  
  /**
    * The callback that fires when the animation comes to a rest.
    */
  var onRest: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Object that maps to either number or opaque config returned by spring().
    * Must keep same keys throughout component's existence
    */
  var style: Style = js.native
}
object MotionProps {
  
  @scala.inline
  def apply(style: Style): MotionProps = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionProps]
  }
  
  @scala.inline
  implicit class MotionPropsOps[Self <: MotionProps] (val x: Self) extends AnyVal {
    
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
    def setStyle(value: Style): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: /* interpolatedStyle */ PlainStyle => Element): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDefaultStyle(value: PlainStyle): Self = this.set("defaultStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultStyle: Self = this.set("defaultStyle", js.undefined)
    
    @scala.inline
    def setOnRest(value: () => Unit): Self = this.set("onRest", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRest: Self = this.set("onRest", js.undefined)
  }
}
