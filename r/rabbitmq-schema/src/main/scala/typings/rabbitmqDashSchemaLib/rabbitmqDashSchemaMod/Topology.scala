package typings
package rabbitmqDashSchemaLib.rabbitmqDashSchemaMod

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
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Topology]
  }
}

