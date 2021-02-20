package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This EncryptedMediaExtensions API interface provides access to a Key System for decryption and/or a content protection provider. You can request an instance of this object using the Navigator.requestMediaKeySystemAccess method. */
@js.native
trait MediaKeySystemAccess extends StObject {
  
  def createMediaKeys(): js.Promise[MediaKeys] = js.native
  
  def getConfiguration(): MediaKeySystemConfiguration = js.native
  
  val keySystem: java.lang.String = js.native
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
  
  @scala.inline
  implicit class MediaKeySystemAccessMutableBuilder[Self <: MediaKeySystemAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateMediaKeys(value: () => js.Promise[MediaKeys]): Self = StObject.set(x, "createMediaKeys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetConfiguration(value: () => MediaKeySystemConfiguration): Self = StObject.set(x, "getConfiguration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeySystem(value: java.lang.String): Self = StObject.set(x, "keySystem", value.asInstanceOf[js.Any])
  }
}
