package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object safari {
    
    @JSGlobal("safari")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("safari.application")
    @js.native
    def application: SafariApplication = js.native
    inline def application_=(x: SafariApplication): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("application")(x.asInstanceOf[js.Any])
    
    @JSGlobal("safari.extension")
    @js.native
    val `extension`: SafariExtension = js.native
    
    @JSGlobal("safari.self")
    @js.native
    def self: SafariExtensionGlobalPage | SafariExtensionBar = js.native
    inline def self_=(x: SafariExtensionGlobalPage | SafariExtensionBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  }
}
