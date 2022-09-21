package typings.reactNativeShareMenu

import org.scalablytyped.runtime.Shortcut
import typings.reactNativeShareMenu.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-share-menu", JSImport.Default)
  @js.native
  val default: ShareMenu = js.native
  
  @js.native
  trait ShareMenuReactView extends StObject {
    
    def continueInApp(): Unit = js.native
    def continueInApp(extraData: js.Object): Unit = js.native
    
    def data(): js.Promise[Data] = js.native
    
    def dismissExtension(): Unit = js.native
    def dismissExtension(error: String): Unit = js.native
    
    def openApp(): Unit = js.native
  }
  @JSImport("react-native-share-menu", "ShareMenuReactView")
  @js.native
  val ShareMenuReactView: typings.reactNativeShareMenu.mod.ShareMenuReactView = js.native
  
  type ShareCallback = js.Function1[/* share */ js.UndefOr[ShareData], Unit]
  
  trait ShareData extends StObject {
    
    var data: String | js.Array[String]
    
    var extraData: js.UndefOr[js.Object] = js.undefined
    
    var mimeType: String
  }
  object ShareData {
    
    inline def apply(data: String | js.Array[String], mimeType: String): ShareData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareData]
    }
    
    extension [Self <: ShareData](x: Self) {
      
      inline def setData(value: String | js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setExtraData(value: js.Object): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShareListener extends StObject {
    
    def remove(): Unit
  }
  object ShareListener {
    
    inline def apply(remove: () => Unit): ShareListener = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[ShareListener]
    }
    
    extension [Self <: ShareListener](x: Self) {
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
  
  trait ShareMenu extends StObject {
    
    def addNewShareListener(callback: ShareCallback): ShareListener
    
    def clearSharedText(): Unit
    
    def getInitialShare(callback: ShareCallback): Unit
    
    def getSharedText(callback: ShareCallback): Unit
  }
  object ShareMenu {
    
    inline def apply(
      addNewShareListener: ShareCallback => ShareListener,
      clearSharedText: () => Unit,
      getInitialShare: ShareCallback => Unit,
      getSharedText: ShareCallback => Unit
    ): ShareMenu = {
      val __obj = js.Dynamic.literal(addNewShareListener = js.Any.fromFunction1(addNewShareListener), clearSharedText = js.Any.fromFunction0(clearSharedText), getInitialShare = js.Any.fromFunction1(getInitialShare), getSharedText = js.Any.fromFunction1(getSharedText))
      __obj.asInstanceOf[ShareMenu]
    }
    
    extension [Self <: ShareMenu](x: Self) {
      
      inline def setAddNewShareListener(value: ShareCallback => ShareListener): Self = StObject.set(x, "addNewShareListener", js.Any.fromFunction1(value))
      
      inline def setClearSharedText(value: () => Unit): Self = StObject.set(x, "clearSharedText", js.Any.fromFunction0(value))
      
      inline def setGetInitialShare(value: ShareCallback => Unit): Self = StObject.set(x, "getInitialShare", js.Any.fromFunction1(value))
      
      inline def setGetSharedText(value: ShareCallback => Unit): Self = StObject.set(x, "getSharedText", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ShareMenu
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ShareMenu = default
}
