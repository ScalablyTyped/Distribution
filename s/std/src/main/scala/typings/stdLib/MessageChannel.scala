package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageChannel extends js.Object {
  val port1: MessagePort
  val port2: MessagePort
}

@JSGlobal("MessageChannel")
@js.native
class MessageChannelCls () extends MessageChannel {
  /* CompleteClass */
  override val port1: MessagePort = js.native
  /* CompleteClass */
  override val port2: MessagePort = js.native
}

@JSGlobal("MessageChannel")
@js.native
object MessageChannel
  extends org.scalablytyped.runtime.Instantiable0[MessageChannel]

