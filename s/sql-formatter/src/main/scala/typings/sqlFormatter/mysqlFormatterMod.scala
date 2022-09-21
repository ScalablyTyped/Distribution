package typings.sqlFormatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mysqlFormatterMod {
  
  @JSImport("sql-formatter/lib/src/languages/mysql/mysql.formatter", JSImport.Default)
  @js.native
  open class default () extends MySqlFormatter
  
  @js.native
  trait MySqlFormatter
    extends typings.sqlFormatter.formatterMod.default
}
