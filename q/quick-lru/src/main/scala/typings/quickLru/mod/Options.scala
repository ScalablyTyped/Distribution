package typings.quickLru.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[KeyType, ValueType] extends js.Object {
  /**
  		The maximum number of items before evicting the least recently used items.
  		*/
  val maxSize: Double
  /**
  		Called right before an item is evicted from the cache.
  		Useful for side effects or for items like object URLs that need explicit cleanup (`revokeObjectURL`).
  		*/
  var onEviction: js.UndefOr[js.Function2[/* key */ KeyType, /* value */ ValueType, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply[KeyType, ValueType](maxSize: Double, onEviction: (/* key */ KeyType, /* value */ ValueType) => Unit = null): Options[KeyType, ValueType] = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any])
    if (onEviction != null) __obj.updateDynamic("onEviction")(js.Any.fromFunction2(onEviction))
    __obj.asInstanceOf[Options[KeyType, ValueType]]
  }
}

