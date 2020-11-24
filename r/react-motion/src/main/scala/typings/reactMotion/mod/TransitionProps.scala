package typings.reactMotion.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transition properties
  */
@js.native
trait TransitionProps extends js.Object {
  
  var children: js.UndefOr[js.Function1[/* interpolatedStyles */ js.Array[TransitionPlainStyle], Element]] = js.native
  
  /**
    * Default styles on first render
    */
  var defaultStyles: js.UndefOr[js.Array[TransitionPlainStyle]] = js.native
  
  /**
    * Triggers when an element has disappeared
    * @param styleThatLeft
    */
  var didLeave: js.UndefOr[js.Function1[/* styleThatLeft */ TransitionStyle, Unit]] = js.native
  
  /**
    * Styles to interpolate. Accepts array of TransitionStyle objects or interpolated function similar as for
    * <StaggeredMotion/>
    */
  var styles: js.Array[TransitionStyle] | InterpolateFunction = js.native
  
  /**
    * Triggers when a new element will appear
    * @param styleThatEntered
    */
  var willEnter: js.UndefOr[js.Function1[/* styleThatEntered */ TransitionStyle, PlainStyle]] = js.native
  
  /**
    * Triggers when an element will disappear
    * @param styleThatLeft
    */
  var willLeave: js.UndefOr[js.Function1[/* styleThatLeft */ TransitionStyle, Style | Unit]] = js.native
}
object TransitionProps {
  
  @scala.inline
  def apply(styles: js.Array[TransitionStyle] | InterpolateFunction): TransitionProps = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionProps]
  }
  
  @scala.inline
  implicit class TransitionPropsOps[Self <: TransitionProps] (val x: Self) extends AnyVal {
    
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
    def setStylesVarargs(value: TransitionStyle*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStylesFunction1(
      value: /* previousInterpolatedStyles */ js.UndefOr[js.Array[TransitionPlainStyle]] => js.Array[TransitionStyle]
    ): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: js.Array[TransitionStyle] | InterpolateFunction): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: /* interpolatedStyles */ js.Array[TransitionPlainStyle] => Element): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDefaultStylesVarargs(value: TransitionPlainStyle*): Self = this.set("defaultStyles", js.Array(value :_*))
    
    @scala.inline
    def setDefaultStyles(value: js.Array[TransitionPlainStyle]): Self = this.set("defaultStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultStyles: Self = this.set("defaultStyles", js.undefined)
    
    @scala.inline
    def setDidLeave(value: /* styleThatLeft */ TransitionStyle => Unit): Self = this.set("didLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDidLeave: Self = this.set("didLeave", js.undefined)
    
    @scala.inline
    def setWillEnter(value: /* styleThatEntered */ TransitionStyle => PlainStyle): Self = this.set("willEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWillEnter: Self = this.set("willEnter", js.undefined)
    
    @scala.inline
    def setWillLeave(value: /* styleThatLeft */ TransitionStyle => Style | Unit): Self = this.set("willLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWillLeave: Self = this.set("willLeave", js.undefined)
  }
}
