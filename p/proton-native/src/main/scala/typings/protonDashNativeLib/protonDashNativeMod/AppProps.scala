package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppProps extends js.Object {
  /**
    * Called when the quit menu item is called, right before the entire app quits.
    */
  var onShouldQuit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object AppProps {
  @scala.inline
  def apply(onShouldQuit: js.Function0[scala.Unit] = null): AppProps = {
    val __obj = js.Dynamic.literal()
    if (onShouldQuit != null) __obj.updateDynamic("onShouldQuit")(onShouldQuit)
    __obj.asInstanceOf[AppProps]
  }
}

