package typings
package rabbitmqDashSchemaLib.rabbitmqDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binding extends js.Object {
  var args: js.UndefOr[js.Object] = js.undefined
  var destination: Exchange | Queue
  var routingPattern: js.UndefOr[java.lang.String] = js.undefined
  var source: Exchange
}

object Binding {
  @scala.inline
  def apply(
    destination: Exchange | Queue,
    source: Exchange,
    args: js.Object = null,
    routingPattern: java.lang.String = null
  ): Binding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    __obj.updateDynamic("source")(source)
    if (args != null) __obj.updateDynamic("args")(args)
    if (routingPattern != null) __obj.updateDynamic("routingPattern")(routingPattern)
    __obj.asInstanceOf[Binding]
  }
}

