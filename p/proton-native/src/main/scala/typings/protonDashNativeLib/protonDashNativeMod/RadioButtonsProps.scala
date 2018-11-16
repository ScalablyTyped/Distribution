package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RadioButtonsProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
       * Whether the RadioButtons can be used.
       */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Called when a RadioButton is selected. The number selected is passed as an argument.
       */
  var onSelect: js.UndefOr[js.Function1[/* selected */ scala.Double, scala.Unit]] = js.undefined
  /**
       * What RadioButton is selected, zero-indexed. -1 means nothing is selected.
       */
  var selected: js.UndefOr[scala.Double] = js.undefined
  /**
       * Whether the RadioButtons can be seen.
       */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

