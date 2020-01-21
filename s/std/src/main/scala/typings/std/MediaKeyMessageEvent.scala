package typings.std

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This EncryptedMediaExtensions API interface contains the content and related data when the content decryption module generates a message for the session. */
@js.native
trait MediaKeyMessageEvent extends Event_ {
  val message: ArrayBuffer = js.native
  val messageType: MediaKeyMessageType = js.native
}

@JSGlobal("MediaKeyMessageEvent")
@js.native
object MediaKeyMessageEvent
  extends Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MediaKeyMessageEventInit, 
      MediaKeyMessageEvent
    ]

