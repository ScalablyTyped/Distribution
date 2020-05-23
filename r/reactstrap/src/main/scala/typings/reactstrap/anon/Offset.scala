package typings.reactstrap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var offset: js.UndefOr[String | Double] = js.undefined
  var order: js.UndefOr[String | Double] = js.undefined
  var pull: js.UndefOr[String | Double] = js.undefined
  var push: js.UndefOr[String | Double] = js.undefined
  var size: js.UndefOr[Boolean | Double | String] = js.undefined
}

object Offset {
  @scala.inline
  def apply(
    offset: String | Double = null,
    order: String | Double = null,
    pull: String | Double = null,
    push: String | Double = null,
    size: Boolean | Double | String = null
  ): Offset = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

