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
object MessageChannel extends Instantiable0[MessageChannel]

