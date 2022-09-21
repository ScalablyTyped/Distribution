package typings.string

import typings.string.mod.StringJS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object S {
    
    inline def apply(o: Any): StringJS = ^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any]).asInstanceOf[StringJS]
    
    @JSGlobal("S")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("S.TMPL_CLOSE")
    @js.native
    def TMPL_CLOSE: String = js.native
    inline def TMPL_CLOSE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TMPL_CLOSE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("S.TMPL_OPEN")
    @js.native
    def TMPL_OPEN: String = js.native
    inline def TMPL_OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TMPL_OPEN")(x.asInstanceOf[js.Any])
    
    @JSGlobal("S.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
}
