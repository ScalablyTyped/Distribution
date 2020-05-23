package typings.rascal.mod

import typings.amqplib.propertiesMod.Message
import typings.node.eventsMod.EventEmitter
import typings.rascal.rascalStrings.cancelled
import typings.rascal.rascalStrings.error
import typings.rascal.rascalStrings.invalid_content
import typings.rascal.rascalStrings.message
import typings.rascal.rascalStrings.redeliveries_error
import typings.rascal.rascalStrings.redeliveries_exceeded
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionSession extends EventEmitter {
  var name: String = js.native
  def cancel(): js.Promise[Unit] = js.native
  def isCancelled(): Boolean = js.native
  @JSName("on")
  def on_cancelled(event: cancelled, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_invalidcontent(
    event: invalid_content,
    listener: js.Function3[/* err */ Error, /* message */ Message, /* ackOrNackFn */ AckOrNack, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: message,
    listener: js.Function3[/* message */ Message, /* content */ js.Any, /* ackOrNackFn */ AckOrNack, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_redeliverieserror(
    event: redeliveries_error,
    listener: js.Function3[/* err */ Error, /* message */ Message, /* ackOrNackFn */ AckOrNack, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_redeliveriesexceeded(
    event: redeliveries_exceeded,
    listener: js.Function3[/* err */ Error, /* message */ Message, /* ackOrNackFn */ AckOrNack, Unit]
  ): this.type = js.native
}

