package typings.refractor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object langRegoMod {
  
  object default {
    
    inline def apply(Prism: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(Prism.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("refractor/lang/rego", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("refractor/lang/rego", "default.aliases")
    @js.native
    val aliases: js.Array[Any] = js.native
    
    @JSImport("refractor/lang/rego", "default.displayName")
    @js.native
    val displayName: String = js.native
  }
}
