package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This EncryptedMediaExtensions API interface contains the content and related data when the content decryption module generates a message for the session.
  * Available only in secure contexts.
  */
@js.native
trait MediaKeyMessageEvent
  extends StObject
     with Event {
  
  /* standard dom */
  val message: js.typedarray.ArrayBuffer = js.native
  
  /* standard dom */
  val messageType: MediaKeyMessageType = js.native
}
