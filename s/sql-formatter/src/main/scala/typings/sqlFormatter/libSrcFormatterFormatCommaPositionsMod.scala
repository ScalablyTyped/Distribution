package typings.sqlFormatter

import typings.sqlFormatter.libSrcFormatOptionsMod.CommaPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcFormatterFormatCommaPositionsMod {
  
  @JSImport("sql-formatter/lib/src/formatter/formatCommaPositions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(query: String, commaPosition: CommaPosition, indent: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], commaPosition.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
}
