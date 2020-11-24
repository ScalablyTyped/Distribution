package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.sawtoothSdk.protobufMod.Message.MessageType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "Message")
@js.native
/**
  * Constructs a new Message.
  * @param [properties] Properties to set
  */
class Message_ () extends IMessage {
  def this(properties: IMessage) = this()
  
  /** Message content. */
  @JSName("content")
  var content_Message_ : Uint8Array = js.native
  
  /** Message correlationId. */
  @JSName("correlationId")
  var correlationId_Message_ : String = js.native
  
  /** Message messageType. */
  @JSName("messageType")
  var messageType_Message_ : MessageType = js.native
  
  /**
    * Converts this Message to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
