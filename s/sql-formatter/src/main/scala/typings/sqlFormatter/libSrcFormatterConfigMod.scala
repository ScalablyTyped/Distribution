package typings.sqlFormatter

import typings.sqlFormatter.libSrcFormatOptionsMod.FormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcFormatterConfigMod {
  
  @JSImport("sql-formatter/lib/src/formatter/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def indentString(cfg: FormatOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indentString")(cfg.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isTabularStyle(cfg: FormatOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTabularStyle")(cfg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
