package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The MediaKeys interface of EncryptedMediaExtensions API the represents a set of keys that an associated HTMLMediaElement can use for decryption of media data during playback. */
@js.native
trait MediaKeys extends js.Object {
  def createSession(): MediaKeySession = js.native
  def createSession(sessionType: MediaKeySessionType): MediaKeySession = js.native
  def setServerCertificate(serverCertificate: BufferSource): js.Promise[scala.Boolean] = js.native
}

@JSGlobal("MediaKeys")
@js.native
class MediaKeysCls () extends MediaKeys

@JSGlobal("MediaKeys")
@js.native
object MediaKeys
  extends org.scalablytyped.runtime.Instantiable0[MediaKeys]

