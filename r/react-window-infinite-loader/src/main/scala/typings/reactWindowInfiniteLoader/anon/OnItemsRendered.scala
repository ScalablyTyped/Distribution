package typings.reactWindowInfiniteLoader.anon

import typings.react.mod.Ref
import typings.reactWindow.mod.ListOnItemsRenderedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemsRendered extends js.Object {
  var onItemsRendered: typings.reactWindowInfiniteLoader.mod.OnItemsRendered
  var ref: Ref[_]
}

object OnItemsRendered {
  @scala.inline
  def apply(onItemsRendered: /* props */ ListOnItemsRenderedProps => js.Any, ref: Ref[_] = null): OnItemsRendered = {
    val __obj = js.Dynamic.literal(onItemsRendered = js.Any.fromFunction1(onItemsRendered), ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnItemsRendered]
  }
}

