package typings.protonNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppProps extends js.Object {
  /**
    * Called when the quit menu item is called, right before the entire app quits.
    */
  var onShouldQuit: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AppProps {
  @scala.inline
  def apply(onShouldQuit: () => Unit = null): AppProps = {
    val __obj = js.Dynamic.literal()
    if (onShouldQuit != null) __obj.updateDynamic("onShouldQuit")(js.Any.fromFunction0(onShouldQuit))
    __obj.asInstanceOf[AppProps]
  }
}

