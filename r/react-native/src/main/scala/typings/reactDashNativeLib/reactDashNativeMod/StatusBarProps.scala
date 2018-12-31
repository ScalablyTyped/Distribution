package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBarProps
  extends StatusBarPropsIOS
     with StatusBarPropsAndroid {
  /**
    * If the transition between status bar property changes should be
    * animated. Supported for backgroundColor, barStyle and hidden.
    */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If the status bar is hidden.
    */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
}

