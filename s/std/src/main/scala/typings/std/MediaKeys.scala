package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This EncryptedMediaExtensions API interface the represents a set of keys that an associated HTMLMediaElement can use for decryption of media data during playback. */
@js.native
trait MediaKeys extends js.Object {
  def createSession(): MediaKeySession = js.native
  def createSession(sessionType: MediaKeySessionType): MediaKeySession = js.native
  def setServerCertificate(serverCertificate: BufferSource): js.Promise[scala.Boolean] = js.native
}

@JSGlobal("MediaKeys")
@js.native
object MediaKeys extends Instantiable0[MediaKeys]

