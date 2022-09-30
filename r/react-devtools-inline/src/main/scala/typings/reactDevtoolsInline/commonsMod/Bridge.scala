package typings.reactDevtoolsInline.commonsMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-devtools-inline/commons", "Bridge")
@js.native
open class Bridge[OutgoingEvents /* <: Record[String, js.Array[Any]] */, IncomingEvents /* <: Record[String, js.Array[Any]] */] protected () extends EventEmitter[IncomingEvents & OutgoingEvents] {
  def this(wall: Wall) = this()
  
  /**
    * Temporarily support older standalone backends by forwarding "overrideValueAtPath"
    * commands to the older message types they may be listening to.
    */
  def overrideValueAtPath(overrideValueAtPath: OverrideValueAtPath): Unit = js.native
  
  def send[EventName /* <: /* keyof OutgoingEvents */ String */](
    event: EventName,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param payload because its type OutgoingEvents[EventName] is not an array type */ payload: /* import warning: importer.ImportType#apply Failed type conversion: OutgoingEvents[EventName] */ js.Any
  ): Unit = js.native
  
  def shutdown(): Unit = js.native
  
  /**
    *  Listening directly to the wall isn't advised.
    */
  def wall: Wall = js.native
}
