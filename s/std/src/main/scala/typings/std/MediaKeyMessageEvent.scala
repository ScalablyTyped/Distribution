package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This EncryptedMediaExtensions API interface contains the content and related data when the content decryption module generates a message for the session.
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent)
  */
@js.native
trait MediaKeyMessageEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/message) */
  /* standard dom */
  val message: js.typedarray.ArrayBuffer = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/messageType) */
  /* standard dom */
  val messageType: MediaKeyMessageType = js.native
}
