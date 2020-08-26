package typings.quickLru.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[KeyType, ValueType] extends js.Object {
  /**
  		The maximum number of items before evicting the least recently used items.
  		*/
  val maxSize: Double = js.native
  /**
  		Called right before an item is evicted from the cache.
  		Useful for side effects or for items like object URLs that need explicit cleanup (`revokeObjectURL`).
  		*/
  var onEviction: js.UndefOr[js.Function2[/* key */ KeyType, /* value */ ValueType, Unit]] = js.native
}

object Options {
  @scala.inline
  def apply[KeyType, ValueType](maxSize: Double): Options[KeyType, ValueType] = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[KeyType, ValueType]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _], KeyType, ValueType] (val x: Self with (Options[KeyType, ValueType])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEviction(value: (/* key */ KeyType, /* value */ ValueType) => Unit): Self = this.set("onEviction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEviction: Self = this.set("onEviction", js.undefined)
  }
  
}

