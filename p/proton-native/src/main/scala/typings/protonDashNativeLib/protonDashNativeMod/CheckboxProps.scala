package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Whether the checkbox is checked or not.
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The text to display next to the check box.
    */
  var children: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the checkbox can be used.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called when the checkbox is clicked. The current checkbox state is passed as an argument.
    */
  var onToggle: js.UndefOr[js.Function1[/* checked */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * Whether the checkbox can be seen.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

