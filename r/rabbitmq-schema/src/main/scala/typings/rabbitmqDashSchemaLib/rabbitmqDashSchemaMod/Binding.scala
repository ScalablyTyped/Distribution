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

