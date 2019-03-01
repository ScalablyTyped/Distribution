package typings
package reactDashMotionLib.reactDashMotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transition properties
  */
trait TransitionProps extends js.Object {
  var children: js.UndefOr[
    js.Function1[
      /* interpolatedStyles */ js.Array[TransitionPlainStyle], 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
  /**
    * Default styles on first render
    */
  var defaultStyles: js.UndefOr[js.Array[TransitionPlainStyle]] = js.undefined
  /**
    * Triggers when an element has disappeared
    * @param styleThatLeft
    */
  var didLeave: js.UndefOr[js.Function1[/* styleThatLeft */ TransitionStyle, scala.Unit]] = js.undefined
  /**
    * Styles to interpolate. Accepts array of TransitionStyle objects or interpolated function similar as for
    * <StaggeredMotion/>
    */
  var styles: js.Array[TransitionStyle] | reactDashMotionLib.InterpolateFunction
  /**
    * Triggers when a new element will appear
    * @param styleThatEntered
    */
  var willEnter: js.UndefOr[js.Function1[/* styleThatEntered */ TransitionStyle, PlainStyle]] = js.undefined
  /**
    * Triggers when an element will disappear
    * @param styleThatLeft
    */
  var willLeave: js.UndefOr[js.Function1[/* styleThatLeft */ TransitionStyle, Style | scala.Unit]] = js.undefined
}

object TransitionProps {
  @scala.inline
  def apply(
    styles: js.Array[TransitionStyle] | reactDashMotionLib.InterpolateFunction,
    children: js.Function1[
      /* interpolatedStyles */ js.Array[TransitionPlainStyle], 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ] = null,
    defaultStyles: js.Array[TransitionPlainStyle] = null,
    didLeave: js.Function1[/* styleThatLeft */ TransitionStyle, scala.Unit] = null,
    willEnter: js.Function1[/* styleThatEntered */ TransitionStyle, PlainStyle] = null,
    willLeave: js.Function1[/* styleThatLeft */ TransitionStyle, Style | scala.Unit] = null
  ): TransitionProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (defaultStyles != null) __obj.updateDynamic("defaultStyles")(defaultStyles)
    if (didLeave != null) __obj.updateDynamic("didLeave")(didLeave)
    if (willEnter != null) __obj.updateDynamic("willEnter")(willEnter)
    if (willLeave != null) __obj.updateDynamic("willLeave")(willLeave)
    __obj.asInstanceOf[TransitionProps]
  }
}

