package typings.std

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

object MessageChannel {
  @scala.inline
  def apply(port1: MessagePort, port2: MessagePort): MessageChannel = {
    val __obj = js.Dynamic.literal(port1 = port1.asInstanceOf[js.Any], port2 = port2.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageChannel]
  }
}

