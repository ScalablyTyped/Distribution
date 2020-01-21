package typings.reactNative.mod

import typings.reactNative.AnonChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewabilityConfigCallbackPair extends js.Object {
  var onViewableItemsChanged: (js.Function1[/* info */ AnonChanged, Unit]) | Null
  var viewabilityConfig: ViewabilityConfig
}

object ViewabilityConfigCallbackPair {
  @scala.inline
  def apply(
    viewabilityConfig: ViewabilityConfig,
    onViewableItemsChanged: /* info */ AnonChanged => Unit = null
  ): ViewabilityConfigCallbackPair = {
    val __obj = js.Dynamic.literal(viewabilityConfig = viewabilityConfig.asInstanceOf[js.Any])
    if (onViewableItemsChanged != null) __obj.updateDynamic("onViewableItemsChanged")(js.Any.fromFunction1(onViewableItemsChanged))
    __obj.asInstanceOf[ViewabilityConfigCallbackPair]
  }
}

