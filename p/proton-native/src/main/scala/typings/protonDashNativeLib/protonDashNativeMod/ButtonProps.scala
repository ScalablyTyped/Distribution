package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ButtonProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
       * The text to display in the button.
       */
  var children: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Whether the button can be clicked.
       */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Called when the button is clicked.
       */
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Whether the button can be seen.
       */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

