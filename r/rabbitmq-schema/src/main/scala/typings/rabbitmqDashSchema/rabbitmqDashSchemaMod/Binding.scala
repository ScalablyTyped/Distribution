package typings.rabbitmqDashSchema.rabbitmqDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binding extends js.Object {
  var args: js.UndefOr[js.Object] = js.undefined
  var destination: Exchange | Queue
  var routingPattern: js.UndefOr[String] = js.undefined
  var source: Exchange
}

object Binding {
  @scala.inline
  def apply(
    destination: Exchange | Queue,
    source: Exchange,
    args: js.Object = null,
    routingPattern: String = null
  ): Binding = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source)
    if (args != null) __obj.updateDynamic("args")(args)
    if (routingPattern != null) __obj.updateDynamic("routingPattern")(routingPattern)
    __obj.asInstanceOf[Binding]
  }
}

