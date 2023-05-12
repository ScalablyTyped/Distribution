package typings.sqlQueryIdentifier

import typings.sqlQueryIdentifier.libDefinesMod.Dialect
import typings.sqlQueryIdentifier.libDefinesMod.ExecutionType
import typings.sqlQueryIdentifier.libDefinesMod.ParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParserMod {
  
  @JSImport("sql-query-identifier/lib/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Record<sql-query-identifier.sql-query-identifier/lib/defines.StatementType, sql-query-identifier.sql-query-identifier/lib/defines.ExecutionType> */
  object EXECUTION_TYPES {
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.ALTER_DATABASE")
    @js.native
    def ALTER_DATABASE: ExecutionType = js.native
    inline def ALTER_DATABASE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALTER_DATABASE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.ALTER_FUNCTION")
    @js.native
    def ALTER_FUNCTION: ExecutionType = js.native
    inline def ALTER_FUNCTION_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALTER_FUNCTION")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.ALTER_INDEX")
    @js.native
    def ALTER_INDEX: ExecutionType = js.native
    inline def ALTER_INDEX_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALTER_INDEX")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.ALTER_PROCEDURE")
    @js.native
    def ALTER_PROCEDURE: ExecutionType = js.native
    inline def ALTER_PROCEDURE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALTER_PROCEDURE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.ALTER_SCHEMA")
    @js.native
    def ALTER_SCHEMA: ExecutionType = js.native
    inline def ALTER_SCHEMA_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALTER_SCHEMA")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.ALTER_TABLE")
    @js.native
    def ALTER_TABLE: ExecutionType = js.native
    inline def ALTER_TABLE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALTER_TABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.ALTER_TRIGGER")
    @js.native
    def ALTER_TRIGGER: ExecutionType = js.native
    inline def ALTER_TRIGGER_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALTER_TRIGGER")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.ALTER_VIEW")
    @js.native
    def ALTER_VIEW: ExecutionType = js.native
    inline def ALTER_VIEW_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALTER_VIEW")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.ANON_BLOCK")
    @js.native
    def ANON_BLOCK: ExecutionType = js.native
    inline def ANON_BLOCK_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANON_BLOCK")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.CREATE_DATABASE")
    @js.native
    def CREATE_DATABASE: ExecutionType = js.native
    inline def CREATE_DATABASE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATE_DATABASE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.CREATE_FUNCTION")
    @js.native
    def CREATE_FUNCTION: ExecutionType = js.native
    inline def CREATE_FUNCTION_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATE_FUNCTION")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.CREATE_INDEX")
    @js.native
    def CREATE_INDEX: ExecutionType = js.native
    inline def CREATE_INDEX_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATE_INDEX")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.CREATE_PROCEDURE")
    @js.native
    def CREATE_PROCEDURE: ExecutionType = js.native
    inline def CREATE_PROCEDURE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATE_PROCEDURE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.CREATE_SCHEMA")
    @js.native
    def CREATE_SCHEMA: ExecutionType = js.native
    inline def CREATE_SCHEMA_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATE_SCHEMA")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.CREATE_TABLE")
    @js.native
    def CREATE_TABLE: ExecutionType = js.native
    inline def CREATE_TABLE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATE_TABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.CREATE_TRIGGER")
    @js.native
    def CREATE_TRIGGER: ExecutionType = js.native
    inline def CREATE_TRIGGER_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATE_TRIGGER")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.CREATE_VIEW")
    @js.native
    def CREATE_VIEW: ExecutionType = js.native
    inline def CREATE_VIEW_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATE_VIEW")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.DELETE")
    @js.native
    def DELETE: ExecutionType = js.native
    inline def DELETE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.DROP_DATABASE")
    @js.native
    def DROP_DATABASE: ExecutionType = js.native
    inline def DROP_DATABASE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DROP_DATABASE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.DROP_FUNCTION")
    @js.native
    def DROP_FUNCTION: ExecutionType = js.native
    inline def DROP_FUNCTION_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DROP_FUNCTION")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.DROP_INDEX")
    @js.native
    def DROP_INDEX: ExecutionType = js.native
    inline def DROP_INDEX_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DROP_INDEX")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.DROP_PROCEDURE")
    @js.native
    def DROP_PROCEDURE: ExecutionType = js.native
    inline def DROP_PROCEDURE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DROP_PROCEDURE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.DROP_SCHEMA")
    @js.native
    def DROP_SCHEMA: ExecutionType = js.native
    inline def DROP_SCHEMA_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DROP_SCHEMA")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.DROP_TABLE")
    @js.native
    def DROP_TABLE: ExecutionType = js.native
    inline def DROP_TABLE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DROP_TABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.DROP_TRIGGER")
    @js.native
    def DROP_TRIGGER: ExecutionType = js.native
    inline def DROP_TRIGGER_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DROP_TRIGGER")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.DROP_VIEW")
    @js.native
    def DROP_VIEW: ExecutionType = js.native
    inline def DROP_VIEW_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DROP_VIEW")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.INSERT")
    @js.native
    def INSERT: ExecutionType = js.native
    inline def INSERT_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSERT")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SELECT")
    @js.native
    def SELECT: ExecutionType = js.native
    inline def SELECT_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECT")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_BINARY")
    @js.native
    def SHOW_BINARY: ExecutionType = js.native
    inline def SHOW_BINARY_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_BINARY")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_BINLOG")
    @js.native
    def SHOW_BINLOG: ExecutionType = js.native
    inline def SHOW_BINLOG_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_BINLOG")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_CHARACTER")
    @js.native
    def SHOW_CHARACTER: ExecutionType = js.native
    inline def SHOW_CHARACTER_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_CHARACTER")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_COLLATION")
    @js.native
    def SHOW_COLLATION: ExecutionType = js.native
    inline def SHOW_COLLATION_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_COLLATION")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_COLUMNS")
    @js.native
    def SHOW_COLUMNS: ExecutionType = js.native
    inline def SHOW_COLUMNS_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_COLUMNS")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_CREATE")
    @js.native
    def SHOW_CREATE: ExecutionType = js.native
    inline def SHOW_CREATE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_CREATE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_DATABASES")
    @js.native
    def SHOW_DATABASES: ExecutionType = js.native
    inline def SHOW_DATABASES_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_DATABASES")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_ENGINE")
    @js.native
    def SHOW_ENGINE: ExecutionType = js.native
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_ENGINES")
    @js.native
    def SHOW_ENGINES: ExecutionType = js.native
    inline def SHOW_ENGINES_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_ENGINES")(x.asInstanceOf[js.Any])
    
    inline def SHOW_ENGINE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_ENGINE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_ERRORS")
    @js.native
    def SHOW_ERRORS: ExecutionType = js.native
    inline def SHOW_ERRORS_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_ERRORS")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_EVENTS")
    @js.native
    def SHOW_EVENTS: ExecutionType = js.native
    inline def SHOW_EVENTS_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_EVENTS")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_FUNCTION")
    @js.native
    def SHOW_FUNCTION: ExecutionType = js.native
    inline def SHOW_FUNCTION_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_FUNCTION")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_GRANTS")
    @js.native
    def SHOW_GRANTS: ExecutionType = js.native
    inline def SHOW_GRANTS_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_GRANTS")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_INDEX")
    @js.native
    def SHOW_INDEX: ExecutionType = js.native
    inline def SHOW_INDEX_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_INDEX")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_KEYS")
    @js.native
    def SHOW_KEYS: ExecutionType = js.native
    inline def SHOW_KEYS_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_KEYS")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_MASTER")
    @js.native
    def SHOW_MASTER: ExecutionType = js.native
    inline def SHOW_MASTER_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_MASTER")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_OPEN")
    @js.native
    def SHOW_OPEN: ExecutionType = js.native
    inline def SHOW_OPEN_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_OPEN")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_PLUGINS")
    @js.native
    def SHOW_PLUGINS: ExecutionType = js.native
    inline def SHOW_PLUGINS_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_PLUGINS")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_PRIVILEGES")
    @js.native
    def SHOW_PRIVILEGES: ExecutionType = js.native
    inline def SHOW_PRIVILEGES_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_PRIVILEGES")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_PROCEDURE")
    @js.native
    def SHOW_PROCEDURE: ExecutionType = js.native
    inline def SHOW_PROCEDURE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_PROCEDURE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_PROCESSLIST")
    @js.native
    def SHOW_PROCESSLIST: ExecutionType = js.native
    inline def SHOW_PROCESSLIST_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_PROCESSLIST")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_PROFILE")
    @js.native
    def SHOW_PROFILE: ExecutionType = js.native
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_PROFILES")
    @js.native
    def SHOW_PROFILES: ExecutionType = js.native
    inline def SHOW_PROFILES_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_PROFILES")(x.asInstanceOf[js.Any])
    
    inline def SHOW_PROFILE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_PROFILE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_RELAYLOG")
    @js.native
    def SHOW_RELAYLOG: ExecutionType = js.native
    inline def SHOW_RELAYLOG_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_RELAYLOG")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_REPLICA")
    @js.native
    def SHOW_REPLICA: ExecutionType = js.native
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_REPLICAS")
    @js.native
    def SHOW_REPLICAS: ExecutionType = js.native
    inline def SHOW_REPLICAS_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_REPLICAS")(x.asInstanceOf[js.Any])
    
    inline def SHOW_REPLICA_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_REPLICA")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_SLAVE")
    @js.native
    def SHOW_SLAVE: ExecutionType = js.native
    inline def SHOW_SLAVE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_SLAVE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_STATUS")
    @js.native
    def SHOW_STATUS: ExecutionType = js.native
    inline def SHOW_STATUS_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_STATUS")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_TABLE")
    @js.native
    def SHOW_TABLE: ExecutionType = js.native
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_TABLES")
    @js.native
    def SHOW_TABLES: ExecutionType = js.native
    inline def SHOW_TABLES_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_TABLES")(x.asInstanceOf[js.Any])
    
    inline def SHOW_TABLE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_TABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_TRIGGERS")
    @js.native
    def SHOW_TRIGGERS: ExecutionType = js.native
    inline def SHOW_TRIGGERS_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_TRIGGERS")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_VARIABLES")
    @js.native
    def SHOW_VARIABLES: ExecutionType = js.native
    inline def SHOW_VARIABLES_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_VARIABLES")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.SHOW_WARNINGS")
    @js.native
    def SHOW_WARNINGS: ExecutionType = js.native
    inline def SHOW_WARNINGS_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_WARNINGS")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.TRUNCATE")
    @js.native
    def TRUNCATE: ExecutionType = js.native
    inline def TRUNCATE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRUNCATE")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.UNKNOWN")
    @js.native
    def UNKNOWN: ExecutionType = js.native
    inline def UNKNOWN_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("sql-query-identifier/lib/parser", "EXECUTION_TYPES.UPDATE")
    @js.native
    def UPDATE: ExecutionType = js.native
    inline def UPDATE_=(x: ExecutionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPDATE")(x.asInstanceOf[js.Any])
  }
  
  inline def parse(input: String): ParseResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[ParseResult]
  inline def parse(input: String, isStrict: Boolean): ParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], isStrict.asInstanceOf[js.Any])).asInstanceOf[ParseResult]
  inline def parse(input: String, isStrict: Boolean, dialect: Dialect): ParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], isStrict.asInstanceOf[js.Any], dialect.asInstanceOf[js.Any])).asInstanceOf[ParseResult]
  inline def parse(input: String, isStrict: Unit, dialect: Dialect): ParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], isStrict.asInstanceOf[js.Any], dialect.asInstanceOf[js.Any])).asInstanceOf[ParseResult]
}
