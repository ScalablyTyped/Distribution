package typings
package sqsDashProducerLib.sqsDashProducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Producer extends js.Object {
  def queueSize(cb: ProducerCallback[scala.Double]): scala.Unit = js.native
  def send(messages: js.Array[java.lang.String | ProducerMessage], cb: ProducerCallback[scala.Unit]): scala.Unit = js.native
}

