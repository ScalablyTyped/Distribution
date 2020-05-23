package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This EncryptedMediaExtensions API interface provides access to a Key System for decryption and/or a content protection provider. You can request an instance of this object using the Navigator.requestMediaKeySystemAccess method. */
trait MediaKeySystemAccess extends js.Object {
  val keySystem: java.lang.String
  def createMediaKeys(): js.Promise[MediaKeys]
  def getConfiguration(): MediaKeySystemConfiguration
}

object MediaKeySystemAccess {
  @scala.inline
  def apply(
    createMediaKeys: () => js.Promise[MediaKeys],
    getConfiguration: () => MediaKeySystemConfiguration,
    keySystem: java.lang.String
  ): MediaKeySystemAccess = {
    val __obj = js.Dynamic.literal(createMediaKeys = js.Any.fromFunction0(createMediaKeys), getConfiguration = js.Any.fromFunction0(getConfiguration), keySystem = keySystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaKeySystemAccess]
  }
}

