package typings.reactEmailEditor.mod

import typings.reactEmailEditor.AnonRows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Design extends js.Object {
  val body: AnonRows
  val counters: js.UndefOr[js.Object] = js.undefined
}

object Design {
  @scala.inline
  def apply(body: AnonRows, counters: js.Object = null): Design = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (counters != null) __obj.updateDynamic("counters")(counters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Design]
  }
}

