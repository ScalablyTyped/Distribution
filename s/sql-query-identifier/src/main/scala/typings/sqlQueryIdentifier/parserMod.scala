package typings.sqlQueryIdentifier

import typings.sqlQueryIdentifier.definesMod.Dialect
import typings.sqlQueryIdentifier.definesMod.ExecutionType
import typings.sqlQueryIdentifier.definesMod.ParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
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
