package typings.sqlFormatter

import org.scalablytyped.runtime.Instantiable0
import typings.sqlFormatter.anon.PartialFormatOptions
import typings.sqlFormatter.libSrcFormatOptionsMod.FormatOptions
import typings.sqlFormatter.libSrcFormatterFormatterMod.default
import typings.sqlFormatter.libSrcLexerTokenizerOptionsMod.TokenizerOptions
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
    extends typings.sqlFormatter.libSrcSqlFormatterMod.ConfigError
  
  @JSImport("sql-formatter", "Formatter")
  @js.native
  open class Formatter protected () extends default {
    def this(cfg: FormatOptions) = this()
  }
  
  @JSImport("sql-formatter", "Tokenizer")
  @js.native
  open class Tokenizer protected ()
    extends typings.sqlFormatter.libSrcLexerTokenizerMod.default {
    def this(cfg: TokenizerOptions) = this()
  }
  
  inline def expandPhrases(phrases: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("expandPhrases")(phrases.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def format(query: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(query: String, cfg: PartialFormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(query.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object formatters {
    
    @JSImport("sql-formatter", "formatters")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.bigquery")
    @js.native
    open class bigquery ()
      extends typings.sqlFormatter.libSrcLanguagesBigqueryBigqueryDotformatterMod.default
    @JSImport("sql-formatter", "formatters.bigquery")
    @js.native
    def bigquery: Instantiable0[typings.sqlFormatter.libSrcLanguagesBigqueryBigqueryDotformatterMod.default] = js.native
    inline def bigquery_=(x: Instantiable0[typings.sqlFormatter.libSrcLanguagesBigqueryBigqueryDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bigquery")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.db2")
    @js.native
    open class db2 ()
      extends typings.sqlFormatter.libSrcLanguagesDb2Db2DotformatterMod.default
    @JSImport("sql-formatter", "formatters.db2")
    @js.native
    def db2: Instantiable0[typings.sqlFormatter.libSrcLanguagesDb2Db2DotformatterMod.default] = js.native
    inline def db2_=(x: Instantiable0[typings.sqlFormatter.libSrcLanguagesDb2Db2DotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("db2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.hive")
    @js.native
    open class hive ()
      extends typings.sqlFormatter.libSrcLanguagesHiveHiveDotformatterMod.default
    @JSImport("sql-formatter", "formatters.hive")
    @js.native
    def hive: Instantiable0[typings.sqlFormatter.libSrcLanguagesHiveHiveDotformatterMod.default] = js.native
    inline def hive_=(x: Instantiable0[typings.sqlFormatter.libSrcLanguagesHiveHiveDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hive")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.mariadb")
    @js.native
    open class mariadb ()
      extends typings.sqlFormatter.libSrcLanguagesMariadbMariadbDotformatterMod.default
    @JSImport("sql-formatter", "formatters.mariadb")
    @js.native
    def mariadb: Instantiable0[typings.sqlFormatter.libSrcLanguagesMariadbMariadbDotformatterMod.default] = js.native
    inline def mariadb_=(x: Instantiable0[typings.sqlFormatter.libSrcLanguagesMariadbMariadbDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mariadb")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.mysql")
    @js.native
    open class mysql ()
      extends typings.sqlFormatter.libSrcLanguagesMysqlMysqlDotformatterMod.default
    @JSImport("sql-formatter", "formatters.mysql")
    @js.native
    def mysql: Instantiable0[typings.sqlFormatter.libSrcLanguagesMysqlMysqlDotformatterMod.default] = js.native
    inline def mysql_=(x: Instantiable0[typings.sqlFormatter.libSrcLanguagesMysqlMysqlDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mysql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.n1ql")
    @js.native
    open class n1ql ()
      extends typings.sqlFormatter.libSrcLanguagesN1qlN1qlDotformatterMod.default
    @JSImport("sql-formatter", "formatters.n1ql")
    @js.native
    def n1ql: Instantiable0[typings.sqlFormatter.libSrcLanguagesN1qlN1qlDotformatterMod.default] = js.native
    inline def n1ql_=(x: Instantiable0[typings.sqlFormatter.libSrcLanguagesN1qlN1qlDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("n1ql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.plsql")
    @js.native
    open class plsql ()
      extends typings.sqlFormatter.libSrcLanguagesPlsqlPlsqlDotformatterMod.default
    @JSImport("sql-formatter", "formatters.plsql")
    @js.native
    def plsql: Instantiable0[typings.sqlFormatter.libSrcLanguagesPlsqlPlsqlDotformatterMod.default] = js.native
    inline def plsql_=(x: Instantiable0[typings.sqlFormatter.libSrcLanguagesPlsqlPlsqlDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plsql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.postgresql")
    @js.native
    open class postgresql ()
      extends typings.sqlFormatter.libSrcLanguagesPostgresqlPostgresqlDotformatterMod.default
    @JSImport("sql-formatter", "formatters.postgresql")
    @js.native
    def postgresql: Instantiable0[typings.sqlFormatter.libSrcLanguagesPostgresqlPostgresqlDotformatterMod.default] = js.native
    inline def postgresql_=(x: Instantiable0[typings.sqlFormatter.libSrcLanguagesPostgresqlPostgresqlDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postgresql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.redshift")
    @js.native
    open class redshift ()
      extends typings.sqlFormatter.libSrcLanguagesRedshiftRedshiftDotformatterMod.default
    @JSImport("sql-formatter", "formatters.redshift")
    @js.native
    def redshift: Instantiable0[typings.sqlFormatter.libSrcLanguagesRedshiftRedshiftDotformatterMod.default] = js.native
    inline def redshift_=(x: Instantiable0[typings.sqlFormatter.libSrcLanguagesRedshiftRedshiftDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("redshift")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.singlestoredb")
    @js.native
    open class singlestoredb ()
      extends typings.sqlFormatter.libSrcLanguagesSinglestoredbSinglestoredbDotformatterMod.default
    @JSImport("sql-formatter", "formatters.singlestoredb")
    @js.native
    def singlestoredb: Instantiable0[
        typings.sqlFormatter.libSrcLanguagesSinglestoredbSinglestoredbDotformatterMod.default
      ] = js.native
    inline def singlestoredb_=(
      x: Instantiable0[
          typings.sqlFormatter.libSrcLanguagesSinglestoredbSinglestoredbDotformatterMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("singlestoredb")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.snowflake")
    @js.native
    open class snowflake ()
      extends typings.sqlFormatter.libSrcLanguagesSnowflakeSnowflakeDotformatterMod.default
    @JSImport("sql-formatter", "formatters.snowflake")
    @js.native
    def snowflake: Instantiable0[typings.sqlFormatter.libSrcLanguagesSnowflakeSnowflakeDotformatterMod.default] = js.native
    inline def snowflake_=(x: Instantiable0[typings.sqlFormatter.libSrcLanguagesSnowflakeSnowflakeDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snowflake")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.spark")
    @js.native
    open class spark ()
      extends typings.sqlFormatter.libSrcLanguagesSparkSparkDotformatterMod.default
    @JSImport("sql-formatter", "formatters.spark")
    @js.native
    def spark: Instantiable0[typings.sqlFormatter.libSrcLanguagesSparkSparkDotformatterMod.default] = js.native
    inline def spark_=(x: Instantiable0[typings.sqlFormatter.libSrcLanguagesSparkSparkDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spark")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.sql")
    @js.native
    open class sql ()
      extends typings.sqlFormatter.libSrcLanguagesSqlSqlDotformatterMod.default
    @JSImport("sql-formatter", "formatters.sql")
    @js.native
    def sql: Instantiable0[typings.sqlFormatter.libSrcLanguagesSqlSqlDotformatterMod.default] = js.native
    inline def sql_=(x: Instantiable0[typings.sqlFormatter.libSrcLanguagesSqlSqlDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.sqlite")
    @js.native
    open class sqlite ()
      extends typings.sqlFormatter.libSrcLanguagesSqliteSqliteDotformatterMod.default
    @JSImport("sql-formatter", "formatters.sqlite")
    @js.native
    def sqlite: Instantiable0[typings.sqlFormatter.libSrcLanguagesSqliteSqliteDotformatterMod.default] = js.native
    inline def sqlite_=(x: Instantiable0[typings.sqlFormatter.libSrcLanguagesSqliteSqliteDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sqlite")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.transactsql")
    @js.native
    open class transactsql ()
      extends typings.sqlFormatter.libSrcLanguagesTransactsqlTransactsqlDotformatterMod.default
    @JSImport("sql-formatter", "formatters.transactsql")
    @js.native
    def transactsql: Instantiable0[
        typings.sqlFormatter.libSrcLanguagesTransactsqlTransactsqlDotformatterMod.default
      ] = js.native
    inline def transactsql_=(
      x: Instantiable0[
          typings.sqlFormatter.libSrcLanguagesTransactsqlTransactsqlDotformatterMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transactsql")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.trino")
    @js.native
    open class trino ()
      extends typings.sqlFormatter.libSrcLanguagesTrinoTrinoDotformatterMod.default
    @JSImport("sql-formatter", "formatters.trino")
    @js.native
    def trino: Instantiable0[typings.sqlFormatter.libSrcLanguagesTrinoTrinoDotformatterMod.default] = js.native
    inline def trino_=(x: Instantiable0[typings.sqlFormatter.libSrcLanguagesTrinoTrinoDotformatterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trino")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("sql-formatter", "formatters.tsql")
    @js.native
    open class tsql ()
      extends typings.sqlFormatter.libSrcLanguagesTransactsqlTransactsqlDotformatterMod.default
    @JSImport("sql-formatter", "formatters.tsql")
    @js.native
    def tsql: Instantiable0[
        typings.sqlFormatter.libSrcLanguagesTransactsqlTransactsqlDotformatterMod.default
      ] = js.native
    inline def tsql_=(
      x: Instantiable0[
          typings.sqlFormatter.libSrcLanguagesTransactsqlTransactsqlDotformatterMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tsql")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sql-formatter", "supportedDialects")
  @js.native
  val supportedDialects: js.Array[String] = js.native
}
