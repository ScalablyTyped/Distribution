package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProgressBarProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
       * Whether the ProgressBar is enabled.
       */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The current value of the ProgressBar (0-100). A value of -1 indicates an indeterminate progressbar.
       */
  var value: js.UndefOr[scala.Double] = js.undefined
  /**
       * Whether the ProgressBar can be seen.
       */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

