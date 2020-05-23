package typings.reactNative.mod

import typings.reactNative.anon.Changed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewabilityConfigCallbackPair extends js.Object {
  var onViewableItemsChanged: (js.Function1[/* info */ Changed, Unit]) | Null
  var viewabilityConfig: ViewabilityConfig
}

object ViewabilityConfigCallbackPair {
  @scala.inline
  def apply(viewabilityConfig: ViewabilityConfig, onViewableItemsChanged: /* info */ Changed => Unit = null): ViewabilityConfigCallbackPair = {
    val __obj = js.Dynamic.literal(viewabilityConfig = viewabilityConfig.asInstanceOf[js.Any], onViewableItemsChanged = js.Any.fromFunction1(onViewableItemsChanged))
    __obj.asInstanceOf[ViewabilityConfigCallbackPair]
  }
}

