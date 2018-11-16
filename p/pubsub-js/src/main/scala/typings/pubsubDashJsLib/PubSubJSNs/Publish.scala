package typings
package pubsubDashJsLib.PubSubJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Publish extends js.Object {
  def publish(message: js.Any, data: js.Any): scala.Boolean = js.native
  def publish(message: js.Any, data: js.Any, sync: scala.Boolean, immediateExceptions: js.Function): scala.Boolean = js.native
  def publishSync(message: js.Any, data: js.Any): scala.Boolean = js.native
}

