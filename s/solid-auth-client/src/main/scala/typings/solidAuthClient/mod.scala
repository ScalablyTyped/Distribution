package typings.solidAuthClient

import org.scalablytyped.runtime.Shortcut
import typings.node.eventsMod.EventEmitter
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("solid-auth-client", JSImport.Default)
  @js.native
  val default: SolidAuthClient = js.native
  
  @js.native
  trait AsyncStorage extends StObject {
    
    def getItem(key: String): js.Promise[js.UndefOr[String]] = js.native
    
    def removeItem(key: String): js.Promise[Unit] = js.native
    
    def setItem(key: String, value: String): js.Promise[Unit] = js.native
  }
  object AsyncStorage {
    
    @scala.inline
    def apply(
      getItem: String => js.Promise[js.UndefOr[String]],
      removeItem: String => js.Promise[Unit],
      setItem: (String, String) => js.Promise[Unit]
    ): AsyncStorage = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[AsyncStorage]
    }
    
    @scala.inline
    implicit class AsyncStorageMutableBuilder[Self <: AsyncStorage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetItem(value: String => js.Promise[js.UndefOr[String]]): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetItem(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait LoginOptions extends StObject {
    
    var callbackUri: js.UndefOr[String] = js.native
    
    var popupUri: js.UndefOr[String] = js.native
    
    var storage: js.UndefOr[Storage | AsyncStorage] = js.native
  }
  object LoginOptions {
    
    @scala.inline
    def apply(): LoginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoginOptions]
    }
    
    @scala.inline
    implicit class LoginOptionsMutableBuilder[Self <: LoginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackUri(value: String): Self = StObject.set(x, "callbackUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUriUndefined: Self = StObject.set(x, "callbackUri", js.undefined)
      
      @scala.inline
      def setPopupUri(value: String): Self = StObject.set(x, "popupUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupUriUndefined: Self = StObject.set(x, "popupUri", js.undefined)
      
      @scala.inline
      def setStorage(value: Storage | AsyncStorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    }
  }
  
  @js.native
  trait Session extends StObject {
    
    var webId: String = js.native
  }
  object Session {
    
    @scala.inline
    def apply(webId: String): Session = {
      val __obj = js.Dynamic.literal(webId = webId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Session]
    }
    
    @scala.inline
    implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWebId(value: String): Self = StObject.set(x, "webId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SolidAuthClient extends EventEmitter {
    
    def currentSession(): js.Promise[js.UndefOr[Session]] = js.native
    def currentSession(storage: AsyncStorage): js.Promise[js.UndefOr[Session]] = js.native
    
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    
    def login(identityProvider: String): js.Promise[Unit] = js.native
    def login(identityProvider: String, options: LoginOptions): js.Promise[Unit] = js.native
    
    def logout(): js.Promise[Unit] = js.native
    def logout(storage: AsyncStorage): js.Promise[Unit] = js.native
    
    def popupLogin(): js.Promise[Session] = js.native
    def popupLogin(params: LoginOptions): js.Promise[Session] = js.native
    
    def stopTrackSession(callback: js.Function1[/* session */ js.UndefOr[Session], Unit]): Unit = js.native
    
    def trackSession(callback: js.Function1[/* session */ js.UndefOr[Session], Unit]): js.Promise[Unit] = js.native
  }
  
  type _To = SolidAuthClient
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: SolidAuthClient = default
}
