package typings.sqlFormatter

import typings.sqlFormatter.anon.Indent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("sql-formatter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def format(query: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(query.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def format(query: String, cfg: Indent): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(query.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
