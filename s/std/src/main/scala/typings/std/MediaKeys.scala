package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This EncryptedMediaExtensions API interface the represents a set of keys that an associated HTMLMediaElement can use for decryption of media data during playback.
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys)
  */
@js.native
trait MediaKeys extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/createSession) */
  /* standard dom */
  def createSession(): MediaKeySession = js.native
  def createSession(sessionType: MediaKeySessionType): MediaKeySession = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/setServerCertificate) */
  /* standard dom */
  def setServerCertificate(serverCertificate: BufferSource): js.Promise[scala.Boolean] = js.native
}
