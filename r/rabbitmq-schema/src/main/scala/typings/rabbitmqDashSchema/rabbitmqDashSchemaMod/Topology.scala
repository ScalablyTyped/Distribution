package typings.rabbitmqDashSchema.rabbitmqDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Topology extends js.Object {
  var options: js.UndefOr[js.Object] = js.undefined
}

object Topology {
  @scala.inline
  def apply(options: js.Object = null): Topology = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topology]
  }
}

