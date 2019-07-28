package typings.pubsubDashJs.PubSubJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Publish extends js.Object {
  def publish(message: js.Any, data: js.Any): Boolean = js.native
  def publish(message: js.Any, data: js.Any, sync: Boolean, immediateExceptions: js.Function): Boolean = js.native
  def publishSync(message: js.Any, data: js.Any): Boolean = js.native
}

