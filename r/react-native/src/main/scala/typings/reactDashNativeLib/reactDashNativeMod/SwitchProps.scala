package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends SwitchPropsIOS {
  /**
    * If true the user won't be able to toggle the switch.
    * Default value is false.
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * On iOS, custom color for the background.
    * Can be seen when the switch value is false or when the switch is disabled.
    */
  var ios_backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Invoked with the new value when the value changes.
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * Color of the foreground switch grip.
    */
  var thumbColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom colors for the switch track
    *
    * Color when false and color when true
    */
  var trackColor: js.UndefOr[reactDashNativeLib.Anon_False] = js.undefined
  /**
    * The value of the switch. If true the switch will be turned on.
    * Default value is false.
    */
  var value: js.UndefOr[scala.Boolean] = js.undefined
}

