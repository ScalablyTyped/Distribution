package typings.refractor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nsisMod {
  
  object default {
    
    inline def apply(Prism: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(Prism.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("refractor/lang/nsis", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("refractor/lang/nsis", "default.aliases")
    @js.native
    val aliases: js.Array[Any] = js.native
    
    @JSImport("refractor/lang/nsis", "default.displayName")
    @js.native
    val displayName: String = js.native
  }
}
