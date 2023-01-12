package typings.reactNativeShareExtension

import org.scalablytyped.runtime.Shortcut
import typings.reactNativeShareExtension.reactNativeShareExtensionStrings.imagesSlashAsterisk
import typings.reactNativeShareExtension.reactNativeShareExtensionStrings.textSlashplain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-share-extension", JSImport.Default)
  @js.native
  val default: ShareExtension = js.native
  
  trait ShareData extends StObject {
    
    var `type`: textSlashplain | imagesSlashAsterisk
    
    var value: String
  }
  object ShareData {
    
    inline def apply(`type`: textSlashplain | imagesSlashAsterisk, value: String): ShareData = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShareData] (val x: Self) extends AnyVal {
      
      inline def setType(value: textSlashplain | imagesSlashAsterisk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShareExtension extends StObject {
    
    def close(): Unit
    
    def data(): js.Promise[ShareData]
    
    def openURL(uri: String): Unit
  }
  object ShareExtension {
    
    inline def apply(close: () => Unit, data: () => js.Promise[ShareData], openURL: String => Unit): ShareExtension = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), data = js.Any.fromFunction0(data), openURL = js.Any.fromFunction1(openURL))
      __obj.asInstanceOf[ShareExtension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShareExtension] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setData(value: () => js.Promise[ShareData]): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setOpenURL(value: String => Unit): Self = StObject.set(x, "openURL", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ShareExtension
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ShareExtension = default
}
