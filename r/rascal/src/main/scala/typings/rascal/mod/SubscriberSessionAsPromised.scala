package typings.rascal.mod

import typings.amqplib.propertiesMod.Message
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.rascal.rascalStrings.cancelled
import typings.rascal.rascalStrings.error
import typings.rascal.rascalStrings.invalid_content
import typings.rascal.rascalStrings.message
import typings.rascal.rascalStrings.redeliveries_error
import typings.rascal.rascalStrings.redeliveries_exceeded
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rascal", "SubscriberSessionAsPromised")
@js.native
class SubscriberSessionAsPromised () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  def cancel(): js.Promise[Unit] = js.native
  
  var name: String = js.native
  
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
