package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SwitchIOSProps extends ViewProps {
  /**
       * If true the user won't be able to toggle the switch. Default value is false.
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Background color when the switch is turned on.
       */
  var onTintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Callback that is called when the user toggles the switch.
       */
  var onValueChange: js.UndefOr[js.Function1[/* value */ scala.Boolean, scala.Unit]] = js.undefined
  /**
       * Background color for the switch round button.
       */
  var thumbTintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Background color when the switch is turned off.
       */
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The value of the switch, if true the switch will be turned on. Default value is false.
       */
  var value: js.UndefOr[scala.Boolean] = js.undefined
}

