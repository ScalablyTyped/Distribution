package typings.reactNavigationNative

import typings.reactNavigationNative.anon.Back
import typings.reactNavigationNative.anon.Title
import typings.reactNavigationNative.reactNavigationNativeStrings.popstate
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/native/lib/typescript/src/@/mocks/window", JSImport.Namespace)
@js.native
object windowMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    @JSName("addEventListener")
    def addEventListener_popstate(`type`: popstate, listener: js.Function0[Unit]): Unit = js.native
    
    var document: Title = js.native
    
    var history: Back = js.native
    
    var location: URL = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_popstate(`type`: popstate, listener: js.Function0[Unit]): Unit = js.native
  }
}
