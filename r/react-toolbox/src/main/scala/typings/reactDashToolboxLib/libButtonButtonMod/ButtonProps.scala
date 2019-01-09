package typings
package reactDashToolboxLib.libButtonButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashToolboxLib.libRippleMod.RippleProps because var conflicts: children, disabled. Inlined onRippleEnded, spread, theme */ trait ButtonProps
  extends reactDashToolboxLib.libButtonBaseMod.ButtonBaseProps {
  /**
    * If true, the button will have a flat look.
    * @default false
    */
  var flat: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the button will have a floating look.
    * @default false
    */
  var floating: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Creates a link for the button.
    */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text string to use for the name of the button.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * To be used with floating button. If true, the button will be smaller.
    * @default false
    */
  var mini: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Function that will be called when the ripple animation ends.
    */
  var onRippleEnded: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * If true, the button will have a raised look.
    * @default false
    */
  var raised: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Factor to indicate how much should the ripple spread under the component.
    * @default 2
    */
  var spread: js.UndefOr[scala.Double] = js.undefined
  /**
    * Passed down to the root element
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[
    reactDashToolboxLib.libButtonBaseMod.ButtonTheme | reactDashToolboxLib.libRippleMod.RippleTheme
  ] = js.undefined
}

