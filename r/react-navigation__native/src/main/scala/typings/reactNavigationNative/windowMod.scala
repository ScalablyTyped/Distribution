package typings.reactNavigationNative

import typings.reactNavigationNative.anon.Back
import typings.reactNavigationNative.anon.Title
import typings.reactNavigationNative.reactNavigationNativeStrings.popstate
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowMod {
  
  object default {
    
    @JSImport("@react-navigation/native/lib/typescript/src/@/mocks/window", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-navigation/native/lib/typescript/src/@/mocks/window", "default.addEventListener")
    @js.native
    def addEventListener_popstate(`type`: popstate, listener: js.Function0[Unit]): Unit = js.native
    
    @JSImport("@react-navigation/native/lib/typescript/src/@/mocks/window", "default.document")
    @js.native
    def document: Title = js.native
    @scala.inline
    def document_=(x: Title): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("document")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-navigation/native/lib/typescript/src/@/mocks/window", "default.history")
    @js.native
    def history: Back = js.native
    @scala.inline
    def history_=(x: Back): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("history")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-navigation/native/lib/typescript/src/@/mocks/window", "default.location")
    @js.native
    def location: URL = js.native
    @scala.inline
    def location_=(x: URL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-navigation/native/lib/typescript/src/@/mocks/window", "default.removeEventListener")
    @js.native
    def removeEventListener_popstate(`type`: popstate, listener: js.Function0[Unit]): Unit = js.native
  }
}
