package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Channel Messaging API interface allows us to create a new message channel and send data through it via its two MessagePort properties. */
trait MessageChannel extends js.Object {
  /**
    * Returns the first MessagePort object.
    */
  val port1: MessagePort
  /**
    * Returns the second MessagePort object.
    */
  val port2: MessagePort
}

@JSGlobal("MessageChannel")
@js.native
class MessageChannelCls () extends MessageChannel {
  /**
    * Returns the first MessagePort object.
    */
  /* CompleteClass */
  override val port1: MessagePort = js.native
  /**
    * Returns the second MessagePort object.
    */
  /* CompleteClass */
  override val port2: MessagePort = js.native
}

@JSGlobal("MessageChannel")
@js.native
object MessageChannel extends Instantiable0[MessageChannel]

