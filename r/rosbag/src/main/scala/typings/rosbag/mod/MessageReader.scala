package typings.rosbag.mod

import typings.node.bufferMod.global.Buffer
import typings.rosbag.anon.Freeze
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rosbag", "MessageReader")
@js.native
open class MessageReader protected () extends StObject {
  /**
    * takes an object message definition and returns
    * a message reader which can be used to read messages based
    * on the message definition.
    * @param definitions
    * @param options
    */
  def this(definitions: js.Array[RosMsgDefinition], options: Freeze) = this()
  
  def readMessage(buffer: Buffer): Any = js.native
  
  def reader(buffer: Buffer): Any = js.native
}
