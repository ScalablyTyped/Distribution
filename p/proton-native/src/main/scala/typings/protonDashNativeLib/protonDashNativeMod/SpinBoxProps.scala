package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SpinBoxProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
       * Whether the Spinbox is enabled.
       */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * When the Spinbox value is changed. The current value is passed as a parameter.
       */
  var onChange: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
       * What the value of the Spinbox is set to.
       */
  var value: js.UndefOr[scala.Double] = js.undefined
  /**
       * Whether the Spinbox can be seen.
       */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

