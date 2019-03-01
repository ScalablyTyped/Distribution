package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewabilityConfigCallbackPair extends js.Object {
  var onViewableItemsChanged: (js.Function1[/* info */ reactDashNativeLib.Anon_Changed, scala.Unit]) | scala.Null
  var viewabilityConfig: ViewabilityConfig
}

object ViewabilityConfigCallbackPair {
  @scala.inline
  def apply(
    viewabilityConfig: ViewabilityConfig,
    onViewableItemsChanged: js.Function1[/* info */ reactDashNativeLib.Anon_Changed, scala.Unit] = null
  ): ViewabilityConfigCallbackPair = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("viewabilityConfig")(viewabilityConfig)
    if (onViewableItemsChanged != null) __obj.updateDynamic("onViewableItemsChanged")(onViewableItemsChanged)
    __obj.asInstanceOf[ViewabilityConfigCallbackPair]
  }
}

