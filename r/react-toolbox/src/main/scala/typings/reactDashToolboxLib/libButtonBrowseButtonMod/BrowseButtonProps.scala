package typings
package reactDashToolboxLib.libButtonBrowseButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BrowseButtonProps
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
  var onChange: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * If true, the button will have a raised look.
     * @default false
     */
  var raised: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[BrowseButtonTheme] = js.undefined
}

