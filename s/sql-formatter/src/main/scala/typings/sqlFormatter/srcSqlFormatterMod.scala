package typings.sqlFormatter

import org.scalablytyped.runtime.Instantiable0
import typings.sqlFormatter.anon.PartialFormatOptions
import typings.sqlFormatter.bigqueryFormatterMod.default
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSqlFormatterMod {
  
  @JSImport("sql-formatter/lib/src/sqlFormatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sql-formatter/lib/src/sqlFormatter", "ConfigError")
  @js.native
  open class ConfigError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def format(query: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(query: String, cfg: PartialFormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(query.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object formatters {
    
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.bigquery")
    @js.native
    open class bigquery () extends default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.bigquery")
    @js.native
    def bigquery: Instantiable0[default] = js.native
    inline def bigquery_=(x: Instantiable0[default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bigquery")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.db2")
    @js.native
    open class db2 ()
      extends typings.sqlFormatter.db2FormatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.db2")
    @js.native
    def db2: Instantiable0[typings.sqlFormatter.db2FormatterMod.default] = js.native
    inline def db2_=(x: Instantiable0[typings.sqlFormatter.db2FormatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("db2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.hive")
    @js.native
    open class hive ()
      extends typings.sqlFormatter.hiveFormatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.hive")
    @js.native
    def hive: Instantiable0[typings.sqlFormatter.hiveFormatterMod.default] = js.native
    inline def hive_=(x: Instantiable0[typings.sqlFormatter.hiveFormatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hive")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.mariadb")
    @js.native
    open class mariadb ()
      extends typings.sqlFormatter.mariadbFormatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.mariadb")
    @js.native
    def mariadb: Instantiable0[typings.sqlFormatter.mariadbFormatterMod.default] = js.native
    inline def mariadb_=(x: Instantiable0[typings.sqlFormatter.mariadbFormatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mariadb")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.mysql")
    @js.native
    open class mysql ()
      extends typings.sqlFormatter.mysqlFormatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.mysql")
    @js.native
    def mysql: Instantiable0[typings.sqlFormatter.mysqlFormatterMod.default] = js.native
    inline def mysql_=(x: Instantiable0[typings.sqlFormatter.mysqlFormatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mysql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.n1ql")
    @js.native
    open class n1ql ()
      extends typings.sqlFormatter.n1qlFormatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.n1ql")
    @js.native
    def n1ql: Instantiable0[typings.sqlFormatter.n1qlFormatterMod.default] = js.native
    inline def n1ql_=(x: Instantiable0[typings.sqlFormatter.n1qlFormatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("n1ql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.plsql")
    @js.native
    open class plsql ()
      extends typings.sqlFormatter.plsqlFormatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.plsql")
    @js.native
    def plsql: Instantiable0[typings.sqlFormatter.plsqlFormatterMod.default] = js.native
    inline def plsql_=(x: Instantiable0[typings.sqlFormatter.plsqlFormatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plsql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.postgresql")
    @js.native
    open class postgresql ()
      extends typings.sqlFormatter.postgresqlFormatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.postgresql")
    @js.native
    def postgresql: Instantiable0[typings.sqlFormatter.postgresqlFormatterMod.default] = js.native
    inline def postgresql_=(x: Instantiable0[typings.sqlFormatter.postgresqlFormatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postgresql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.redshift")
    @js.native
    open class redshift ()
      extends typings.sqlFormatter.redshiftFormatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.redshift")
    @js.native
    def redshift: Instantiable0[typings.sqlFormatter.redshiftFormatterMod.default] = js.native
    inline def redshift_=(x: Instantiable0[typings.sqlFormatter.redshiftFormatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("redshift")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.singlestoredb")
    @js.native
    open class singlestoredb ()
      extends typings.sqlFormatter.singlestoredbFormatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.singlestoredb")
    @js.native
    def singlestoredb: Instantiable0[typings.sqlFormatter.singlestoredbFormatterMod.default] = js.native
    inline def singlestoredb_=(x: Instantiable0[typings.sqlFormatter.singlestoredbFormatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("singlestoredb")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.spark")
    @js.native
    open class spark ()
      extends typings.sqlFormatter.sparkFormatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.spark")
    @js.native
    def spark: Instantiable0[typings.sqlFormatter.sparkFormatterMod.default] = js.native
    inline def spark_=(x: Instantiable0[typings.sqlFormatter.sparkFormatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spark")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.sql")
    @js.native
    open class sql ()
      extends typings.sqlFormatter.sqlFormatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.sql")
    @js.native
    def sql: Instantiable0[typings.sqlFormatter.sqlFormatterMod.default] = js.native
    inline def sql_=(x: Instantiable0[typings.sqlFormatter.sqlFormatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.sqlite")
    @js.native
    open class sqlite ()
      extends typings.sqlFormatter.sqliteFormatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.sqlite")
    @js.native
    def sqlite: Instantiable0[typings.sqlFormatter.sqliteFormatterMod.default] = js.native
    inline def sqlite_=(x: Instantiable0[typings.sqlFormatter.sqliteFormatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sqlite")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.transactsql")
    @js.native
    open class transactsql ()
      extends typings.sqlFormatter.transactsqlFormatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.transactsql")
    @js.native
    def transactsql: Instantiable0[typings.sqlFormatter.transactsqlFormatterMod.default] = js.native
    inline def transactsql_=(x: Instantiable0[typings.sqlFormatter.transactsqlFormatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transactsql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.trino")
    @js.native
    open class trino ()
      extends typings.sqlFormatter.trinoFormatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.trino")
    @js.native
    def trino: Instantiable0[typings.sqlFormatter.trinoFormatterMod.default] = js.native
    inline def trino_=(x: Instantiable0[typings.sqlFormatter.trinoFormatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trino")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.tsql")
    @js.native
    open class tsql ()
      extends typings.sqlFormatter.transactsqlFormatterMod.default
    @JSImport("sql-formatter/lib/src/sqlFormatter", "formatters.tsql")
    @js.native
    def tsql: Instantiable0[typings.sqlFormatter.transactsqlFormatterMod.default] = js.native
    inline def tsql_=(x: Instantiable0[typings.sqlFormatter.transactsqlFormatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tsql")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sql-formatter/lib/src/sqlFormatter", "supportedDialects")
  @js.native
  val supportedDialects: js.Array[String] = js.native
  
  type FormatFn = js.Function2[/* query */ String, /* cfg */ js.UndefOr[PartialFormatOptions], String]
  
  /* keyof sql-formatter.anon.Bigquery */ /* Rewritten from type alias, can be one of: 
    - typings.sqlFormatter.sqlFormatterStrings.bigquery
    - typings.sqlFormatter.sqlFormatterStrings.db2
    - typings.sqlFormatter.sqlFormatterStrings.hive
    - typings.sqlFormatter.sqlFormatterStrings.mariadb
    - typings.sqlFormatter.sqlFormatterStrings.mysql
    - typings.sqlFormatter.sqlFormatterStrings.n1ql
    - typings.sqlFormatter.sqlFormatterStrings.plsql
    - typings.sqlFormatter.sqlFormatterStrings.postgresql
    - typings.sqlFormatter.sqlFormatterStrings.redshift
    - typings.sqlFormatter.sqlFormatterStrings.singlestoredb
    - typings.sqlFormatter.sqlFormatterStrings.spark
    - typings.sqlFormatter.sqlFormatterStrings.sql
    - typings.sqlFormatter.sqlFormatterStrings.sqlite
    - typings.sqlFormatter.sqlFormatterStrings.transactsql
    - typings.sqlFormatter.sqlFormatterStrings.trino
    - typings.sqlFormatter.sqlFormatterStrings.tsql
  */
  trait SqlLanguage extends StObject
}
