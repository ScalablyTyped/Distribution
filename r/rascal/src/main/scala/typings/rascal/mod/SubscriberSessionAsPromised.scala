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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rascal", "SubscriberSessionAsPromised")
@js.native
open class SubscriberSessionAsPromised () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  def cancel(): js.Promise[Unit] = js.native
  
  var name: String = js.native
  
  def on(event: error | cancelled, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  def on(
    event: invalid_content | redeliveries_exceeded | redeliveries_error,
    listener: js.Function3[/* err */ js.Error, /* message */ Message, /* ackOrNackFn */ AckOrNack, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: message,
    listener: js.Function3[/* message */ Message, /* content */ Any, /* ackOrNackFn */ AckOrNack, Unit]
  ): this.type = js.native
}
