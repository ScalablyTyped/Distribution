package typings.sqlFormatter

import typings.sqlFormatter.libSrcDialectMod.DialectOptions
import typings.sqlFormatter.libSrcSqlFormatterMod.FormatOptionsWithDialect
import typings.sqlFormatter.libSrcSqlFormatterMod.FormatOptionsWithLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sql-formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sql-formatter", "ConfigError")
  @js.native
  open class ConfigError ()
    extends typings.sqlFormatter.libSrcValidateConfigMod.ConfigError
  
  @JSImport("sql-formatter", "bigquery")
  @js.native
  val bigquery: DialectOptions = js.native
  
  @JSImport("sql-formatter", "db2")
  @js.native
  val db2: DialectOptions = js.native
  
  inline def expandPhrases(phrases: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("expandPhrases")(phrases.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def format(query: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(query: String, cfg: FormatOptionsWithLanguage): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(query.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatDialect(query: String, param1: FormatOptionsWithDialect): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDialect")(query.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("sql-formatter", "hive")
  @js.native
  val hive: DialectOptions = js.native
  
  @JSImport("sql-formatter", "mariadb")
  @js.native
  val mariadb: DialectOptions = js.native
  
  @JSImport("sql-formatter", "mysql")
  @js.native
  val mysql: DialectOptions = js.native
  
  @JSImport("sql-formatter", "n1ql")
  @js.native
  val n1ql: DialectOptions = js.native
  
  @JSImport("sql-formatter", "plsql")
  @js.native
  val plsql: DialectOptions = js.native
  
  @JSImport("sql-formatter", "postgresql")
  @js.native
  val postgresql: DialectOptions = js.native
  
  @JSImport("sql-formatter", "redshift")
  @js.native
  val redshift: DialectOptions = js.native
  
  @JSImport("sql-formatter", "singlestoredb")
  @js.native
  val singlestoredb: DialectOptions = js.native
  
  @JSImport("sql-formatter", "snowflake")
  @js.native
  val snowflake: DialectOptions = js.native
  
  @JSImport("sql-formatter", "spark")
  @js.native
  val spark: DialectOptions = js.native
  
  @JSImport("sql-formatter", "sql")
  @js.native
  val sql: DialectOptions = js.native
  
  @JSImport("sql-formatter", "sqlite")
  @js.native
  val sqlite: DialectOptions = js.native
  
  @JSImport("sql-formatter", "supportedDialects")
  @js.native
  val supportedDialects: js.Array[String] = js.native
  
  @JSImport("sql-formatter", "transactsql")
  @js.native
  val transactsql: DialectOptions = js.native
  
  @JSImport("sql-formatter", "trino")
  @js.native
  val trino: DialectOptions = js.native
}
