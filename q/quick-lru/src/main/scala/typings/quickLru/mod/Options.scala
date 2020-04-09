package typings.quickLru.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		The maximum number of items before evicting the least recently used items.
  		*/
  val maxSize: Double
  /**
  		Called right before an item is evicted from the cache.
  		Useful for side effects or for items like object URLs that need explicit cleanup (`revokeObjectURL`).
  		*/
  var onEviction: js.UndefOr[js.Function2[/* key */ js.Any, /* value */ js.Any, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(maxSize: Double, onEviction: (/* key */ js.Any, /* value */ js.Any) => Unit = null): Options = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any])
    if (onEviction != null) __obj.updateDynamic("onEviction")(js.Any.fromFunction2(onEviction))
    __obj.asInstanceOf[Options]
  }
}

