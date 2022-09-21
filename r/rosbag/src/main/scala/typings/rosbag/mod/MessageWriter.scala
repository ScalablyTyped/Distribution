package typings.rosbag.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rosbag", "MessageWriter")
@js.native
open class MessageWriter protected () extends StObject {
  /**
    * takes an object string message definition and returns
    * a message writer which can be used to write messages based
    * on the message definition.
    * @param definitions
    */
  def this(definitions: js.Array[RosMsgDefinition]) = this()
  
  def bufferSizeCalculator(message: Any): Double = js.native
  
  /**
    * Calculates the buffer size needed to write this message in bytes.
    * @param message
    */
  def calculateBufferSize(message: Any): Double = js.native
  
  /**
    * @param message
    * @param bufferToWrite - bufferToWrite is optional - if it is not provided, a buffer will be generated.
    */
  def writeMessage(message: Any): Buffer = js.native
  def writeMessage(message: Any, bufferToWrite: Buffer): Buffer = js.native
  
  def writer(message: Any, bufferToWrite: Buffer): Buffer = js.native
}
