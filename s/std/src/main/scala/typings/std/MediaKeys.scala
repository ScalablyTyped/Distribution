package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This EncryptedMediaExtensions API interface the represents a set of keys that an associated HTMLMediaElement can use for decryption of media data during playback.
  * Available only in secure contexts.
  */
@js.native
trait MediaKeys extends StObject {
  
  /* standard dom */
  def createSession(): MediaKeySession = js.native
  def createSession(sessionType: MediaKeySessionType): MediaKeySession = js.native
  
  /* standard dom */
  def setServerCertificate(serverCertificate: BufferSource): js.Promise[scala.Boolean] = js.native
}
