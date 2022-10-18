package typings.reactNavigationNative

import typings.reactNavigationNative.anon.Back
import typings.reactNavigationNative.anon.Title
import typings.reactNavigationNative.reactNavigationNativeStrings.popstate
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `libTypescriptSrc@MocksWindowMod` {
  
  object default {
    
    @JSImport("@react-navigation/native/lib/typescript/src/@/mocks/window", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def addEventListener_popstate(`type`: popstate, listener: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@react-navigation/native/lib/typescript/src/@/mocks/window", "default.document")
    @js.native
    def document: Title = js.native
    inline def document_=(x: Title): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("document")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-navigation/native/lib/typescript/src/@/mocks/window", "default.history")
    @js.native
    def history: Back = js.native
    inline def history_=(x: Back): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("history")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-navigation/native/lib/typescript/src/@/mocks/window", "default.location")
    @js.native
    def location: URL = js.native
    inline def location_=(x: URL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location")(x.asInstanceOf[js.Any])
    
    inline def removeEventListener_popstate(`type`: popstate, listener: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@react-navigation/native/lib/typescript/src/@/mocks/window", "default.window")
    @js.native
    val window: Any = js.native
  }
}
