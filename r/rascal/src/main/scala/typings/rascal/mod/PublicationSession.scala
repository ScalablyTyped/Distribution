package typings.rascal.mod

import typings.amqplib.propertiesMod.Message
import typings.node.eventsMod.EventEmitter
import typings.rascal.rascalStrings.`return`
import typings.rascal.rascalStrings.error
import typings.rascal.rascalStrings.success
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rascal", "PublicationSession")
@js.native
class PublicationSession protected () extends EventEmitter {
  def this(vhost: Vhost, messageId: String) = this()
  
  def abort(): Unit = js.native
  
  def emitPaused(): Unit = js.native
  
  def isAborted(): Boolean = js.native
  
  @JSName("on")
  def on_error(event: error, cb: js.Function2[/* err */ Error, /* messageId */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_return(event: `return`, cb: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("on")
  def on_success(event: success, cb: js.Function1[/* messageId */ String, Unit]): this.type = js.native
}
