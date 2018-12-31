package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Whether the user can enter their own custom text in addition to the drop down menu.
    */
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the Picker is enabled.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When an *editable* Picker is changed. The current text is passed as an argument.
    */
  var onChange: js.UndefOr[js.Function1[/* text */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * When a *non-editable* Picker is changed. The current selection is passed as an argument.
    */
  var onSelect: js.UndefOr[js.Function1[/* selection */ scala.Double, scala.Unit]] = js.undefined
  /**
    * What element is selected if the picker *is not* editable.
    */
  var selected: js.UndefOr[scala.Double] = js.undefined
  /**
    * What text is selected/typed if the picker *is* editable.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the Picker can be seen.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

