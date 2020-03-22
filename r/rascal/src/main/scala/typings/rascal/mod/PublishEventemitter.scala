package typings.rascal.mod

import typings.amqplib.propertiesMod.Message
import typings.node.eventsMod.EventEmitter
import typings.rascal.rascalStrings.`return`
import typings.rascal.rascalStrings.error
import typings.rascal.rascalStrings.success
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishEventemitter extends EventEmitter {
  @JSName("on")
  def on_error(event: error, listener: js.Function2[/* err */ Error, /* messageId */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_return(event: `return`, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("on")
  def on_success(event: success, listener: js.Function1[/* messageId */ String, Unit]): this.type = js.native
}

