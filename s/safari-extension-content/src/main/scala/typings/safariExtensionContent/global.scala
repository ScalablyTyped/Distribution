package typings.safariExtensionContent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object safari {
    
    @JSGlobal("safari")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("safari.extension")
    @js.native
    val `extension`: SafariContentExtension = js.native
    
    @JSGlobal("safari.self")
    @js.native
    def self: SafariContentWebPage = js.native
    inline def self_=(x: SafariContentWebPage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  }
}
