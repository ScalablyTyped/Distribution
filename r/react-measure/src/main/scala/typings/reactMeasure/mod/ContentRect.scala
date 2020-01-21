package typings.reactMeasure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentRect extends js.Object {
  var bounds: js.UndefOr[BoundingRect] = js.undefined
  var client: js.UndefOr[Rect] = js.undefined
  var entry: js.UndefOr[js.Any] = js.undefined
  var margin: js.UndefOr[Margin] = js.undefined
  var offset: js.UndefOr[Rect] = js.undefined
  var scroll: js.UndefOr[Rect] = js.undefined
}

object ContentRect {
  @scala.inline
  def apply(
    bounds: BoundingRect = null,
    client: Rect = null,
    entry: js.Any = null,
    margin: Margin = null,
    offset: Rect = null,
    scroll: Rect = null
  ): ContentRect = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRect]
  }
}

