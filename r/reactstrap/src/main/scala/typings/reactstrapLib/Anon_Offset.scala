package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset extends js.Object {
  var offset: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var order: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var pull: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var push: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var size: js.UndefOr[scala.Boolean | scala.Double | java.lang.String] = js.undefined
}

object Anon_Offset {
  @scala.inline
  def apply(
    offset: java.lang.String | scala.Double = null,
    order: java.lang.String | scala.Double = null,
    pull: java.lang.String | scala.Double = null,
    push: java.lang.String | scala.Double = null,
    size: scala.Boolean | scala.Double | java.lang.String = null
  ): Anon_Offset = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Offset]
  }
}

