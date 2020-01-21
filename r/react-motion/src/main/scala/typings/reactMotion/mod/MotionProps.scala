package typings.reactMotion.mod

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <Motion/> properties
  */
trait MotionProps extends js.Object {
  /**
    * Callback with your interpolated styles. Must return one react element to render
    * @param interpolatedStyle
    */
  var children: js.UndefOr[js.Function1[/* interpolatedStyle */ PlainStyle, Element]] = js.undefined
  /**
    * The default style. Being ignored on subsequent renders
    * @default Object with same keys as in style whose values are the initial numbers you're interpolating on
    */
  var defaultStyle: js.UndefOr[PlainStyle] = js.undefined
  /**
    * The callback that fires when the animation comes to a rest.
    */
  var onRest: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Object that maps to either number or opaque config returned by spring().
    * Must keep same keys throughout component's existence
    */
  var style: Style
}

object MotionProps {
  @scala.inline
  def apply(
    style: Style,
    children: /* interpolatedStyle */ PlainStyle => Element = null,
    defaultStyle: PlainStyle = null,
    onRest: () => Unit = null
  ): MotionProps = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle.asInstanceOf[js.Any])
    if (onRest != null) __obj.updateDynamic("onRest")(js.Any.fromFunction0(onRest))
    __obj.asInstanceOf[MotionProps]
  }
}

