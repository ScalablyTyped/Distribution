package typings
package sqsDashConsumerLib.sqsDashConsumerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Consumer
  extends nodeLib.NodeJSNs.EventEmitter {
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

