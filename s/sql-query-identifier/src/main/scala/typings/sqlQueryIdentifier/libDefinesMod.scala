package typings.sqlQueryIdentifier

import typings.sqlQueryIdentifier.anon.AcceptTokens
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.QUERY
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.`comment-block`
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.`comment-inline`
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.bigquery
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.generic
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.keyword
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.mssql
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.mysql
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.oracle
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.parameter
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.psql
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.semicolon
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.sqlite
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.string
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.unknown_
import typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.whitespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDefinesMod {
  
  @JSImport("sql-query-identifier/lib/defines", "DIALECTS")
  @js.native
  val DIALECTS: js.Tuple7[mssql, sqlite, mysql, oracle, psql, bigquery, generic] = js.native
  
  trait ConcreteStatement
    extends StObject
       with Statement {
    
    @JSName("executionType")
    var executionType_ConcreteStatement: ExecutionType
    
    @JSName("type")
    var type_ConcreteStatement: StatementType
  }
  object ConcreteStatement {
    
    inline def apply(
      end: Double,
      executionType: ExecutionType,
      parameters: js.Array[String],
      start: Double,
      `type`: StatementType
    ): ConcreteStatement = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], executionType = executionType.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcreteStatement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConcreteStatement] (val x: Self) extends AnyVal {
      
      inline def setExecutionType(value: ExecutionType): Self = StObject.set(x, "executionType", value.asInstanceOf[js.Any])
      
      inline def setType(value: StatementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.mssql
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.sqlite
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.mysql
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.oracle
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.psql
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.bigquery
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.generic
  */
  trait Dialect extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.LISTING
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.MODIFICATION
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.INFORMATION
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ANON_BLOCK
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.UNKNOWN
  */
  trait ExecutionType extends StObject
  object ExecutionType {
    
    inline def ANON_BLOCK: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ANON_BLOCK = "ANON_BLOCK".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ANON_BLOCK]
    
    inline def INFORMATION: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.INFORMATION = "INFORMATION".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.INFORMATION]
    
    inline def LISTING: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.LISTING = "LISTING".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.LISTING]
    
    inline def MODIFICATION: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.MODIFICATION = "MODIFICATION".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.MODIFICATION]
    
    inline def UNKNOWN: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.UNKNOWN]
  }
  
  trait IdentifyOptions extends StObject {
    
    var dialect: js.UndefOr[Dialect] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object IdentifyOptions {
    
    inline def apply(): IdentifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdentifyOptions] (val x: Self) extends AnyVal {
      
      inline def setDialect(value: Dialect): Self = StObject.set(x, "dialect", value.asInstanceOf[js.Any])
      
      inline def setDialectUndefined: Self = StObject.set(x, "dialect", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait IdentifyResult extends StObject {
    
    var end: Double
    
    var executionType: ExecutionType
    
    var parameters: js.Array[String]
    
    var start: Double
    
    var text: String
    
    var `type`: StatementType
  }
  object IdentifyResult {
    
    inline def apply(
      end: Double,
      executionType: ExecutionType,
      parameters: js.Array[String],
      start: Double,
      text: String,
      `type`: StatementType
    ): IdentifyResult = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], executionType = executionType.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentifyResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdentifyResult] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setExecutionType(value: ExecutionType): Self = StObject.set(x, "executionType", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: js.Array[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(value: String*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: StatementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseResult extends StObject {
    
    var body: js.Array[ConcreteStatement]
    
    var end: Double
    
    var start: Double
    
    var tokens: js.Array[Token]
    
    var `type`: QUERY
  }
  object ParseResult {
    
    inline def apply(body: js.Array[ConcreteStatement], end: Double, start: Double, tokens: js.Array[Token]): ParseResult = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("QUERY")
      __obj.asInstanceOf[ParseResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseResult] (val x: Self) extends AnyVal {
      
      inline def setBody(value: js.Array[ConcreteStatement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVarargs(value: ConcreteStatement*): Self = StObject.set(x, "body", js.Array(value*))
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setType(value: QUERY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var end: Double
    
    var input: String
    
    var position: Double
    
    var start: Double
  }
  object State {
    
    inline def apply(end: Double, input: String, position: Double, start: Double): State = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Statement extends StObject {
    
    var algorithm: js.UndefOr[Double] = js.undefined
    
    var canEnd: js.UndefOr[Boolean] = js.undefined
    
    var definer: js.UndefOr[Double] = js.undefined
    
    var end: Double
    
    var endStatement: js.UndefOr[String] = js.undefined
    
    var executionType: js.UndefOr[ExecutionType] = js.undefined
    
    var parameters: js.Array[String]
    
    var sqlSecurity: js.UndefOr[Double] = js.undefined
    
    var start: Double
    
    var `type`: js.UndefOr[StatementType] = js.undefined
  }
  object Statement {
    
    inline def apply(end: Double, parameters: js.Array[String], start: Double): Statement = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Statement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Statement] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: Double): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setCanEnd(value: Boolean): Self = StObject.set(x, "canEnd", value.asInstanceOf[js.Any])
      
      inline def setCanEndUndefined: Self = StObject.set(x, "canEnd", js.undefined)
      
      inline def setDefiner(value: Double): Self = StObject.set(x, "definer", value.asInstanceOf[js.Any])
      
      inline def setDefinerUndefined: Self = StObject.set(x, "definer", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndStatement(value: String): Self = StObject.set(x, "endStatement", value.asInstanceOf[js.Any])
      
      inline def setEndStatementUndefined: Self = StObject.set(x, "endStatement", js.undefined)
      
      inline def setExecutionType(value: ExecutionType): Self = StObject.set(x, "executionType", value.asInstanceOf[js.Any])
      
      inline def setExecutionTypeUndefined: Self = StObject.set(x, "executionType", js.undefined)
      
      inline def setParameters(value: js.Array[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(value: String*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setSqlSecurity(value: Double): Self = StObject.set(x, "sqlSecurity", value.asInstanceOf[js.Any])
      
      inline def setSqlSecurityUndefined: Self = StObject.set(x, "sqlSecurity", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(value: StatementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.INSERT
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.UPDATE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DELETE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SELECT
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.TRUNCATE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_DATABASE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_SCHEMA
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_TABLE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_VIEW
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_TRIGGER
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_FUNCTION
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_INDEX
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_PROCEDURE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_BINARY
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_BINLOG
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_CHARACTER
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_COLLATION
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_CREATE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_ENGINE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_ENGINES
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_ERRORS
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_EVENTS
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_FUNCTION
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_GRANTS
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_MASTER
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_OPEN
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PLUGINS
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PRIVILEGES
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PROCEDURE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PROCESSLIST
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PROFILE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PROFILES
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_RELAYLOG
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_REPLICAS
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_SLAVE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_REPLICA
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_STATUS
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_TRIGGERS
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_VARIABLES
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_WARNINGS
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_DATABASES
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_KEYS
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_INDEX
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_TABLE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_TABLES
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_COLUMNS
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_DATABASE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_SCHEMA
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_TABLE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_VIEW
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_TRIGGER
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_FUNCTION
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_INDEX
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_PROCEDURE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_DATABASE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_SCHEMA
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_TABLE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_VIEW
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_TRIGGER
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_FUNCTION
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_INDEX
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_PROCEDURE
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ANON_BLOCK
    - typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.UNKNOWN
  */
  trait StatementType extends StObject
  object StatementType {
    
    inline def ALTER_DATABASE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_DATABASE = "ALTER_DATABASE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_DATABASE]
    
    inline def ALTER_FUNCTION: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_FUNCTION = "ALTER_FUNCTION".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_FUNCTION]
    
    inline def ALTER_INDEX: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_INDEX = "ALTER_INDEX".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_INDEX]
    
    inline def ALTER_PROCEDURE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_PROCEDURE = "ALTER_PROCEDURE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_PROCEDURE]
    
    inline def ALTER_SCHEMA: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_SCHEMA = "ALTER_SCHEMA".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_SCHEMA]
    
    inline def ALTER_TABLE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_TABLE = "ALTER_TABLE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_TABLE]
    
    inline def ALTER_TRIGGER: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_TRIGGER = "ALTER_TRIGGER".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_TRIGGER]
    
    inline def ALTER_VIEW: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_VIEW = "ALTER_VIEW".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ALTER_VIEW]
    
    inline def ANON_BLOCK: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ANON_BLOCK = "ANON_BLOCK".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.ANON_BLOCK]
    
    inline def CREATE_DATABASE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_DATABASE = "CREATE_DATABASE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_DATABASE]
    
    inline def CREATE_FUNCTION: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_FUNCTION = "CREATE_FUNCTION".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_FUNCTION]
    
    inline def CREATE_INDEX: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_INDEX = "CREATE_INDEX".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_INDEX]
    
    inline def CREATE_PROCEDURE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_PROCEDURE = "CREATE_PROCEDURE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_PROCEDURE]
    
    inline def CREATE_SCHEMA: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_SCHEMA = "CREATE_SCHEMA".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_SCHEMA]
    
    inline def CREATE_TABLE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_TABLE = "CREATE_TABLE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_TABLE]
    
    inline def CREATE_TRIGGER: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_TRIGGER = "CREATE_TRIGGER".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_TRIGGER]
    
    inline def CREATE_VIEW: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_VIEW = "CREATE_VIEW".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.CREATE_VIEW]
    
    inline def DELETE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DELETE = "DELETE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DELETE]
    
    inline def DROP_DATABASE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_DATABASE = "DROP_DATABASE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_DATABASE]
    
    inline def DROP_FUNCTION: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_FUNCTION = "DROP_FUNCTION".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_FUNCTION]
    
    inline def DROP_INDEX: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_INDEX = "DROP_INDEX".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_INDEX]
    
    inline def DROP_PROCEDURE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_PROCEDURE = "DROP_PROCEDURE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_PROCEDURE]
    
    inline def DROP_SCHEMA: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_SCHEMA = "DROP_SCHEMA".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_SCHEMA]
    
    inline def DROP_TABLE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_TABLE = "DROP_TABLE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_TABLE]
    
    inline def DROP_TRIGGER: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_TRIGGER = "DROP_TRIGGER".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_TRIGGER]
    
    inline def DROP_VIEW: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_VIEW = "DROP_VIEW".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.DROP_VIEW]
    
    inline def INSERT: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.INSERT = "INSERT".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.INSERT]
    
    inline def SELECT: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SELECT = "SELECT".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SELECT]
    
    inline def SHOW_BINARY: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_BINARY = "SHOW_BINARY".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_BINARY]
    
    inline def SHOW_BINLOG: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_BINLOG = "SHOW_BINLOG".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_BINLOG]
    
    inline def SHOW_CHARACTER: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_CHARACTER = "SHOW_CHARACTER".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_CHARACTER]
    
    inline def SHOW_COLLATION: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_COLLATION = "SHOW_COLLATION".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_COLLATION]
    
    inline def SHOW_COLUMNS: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_COLUMNS = "SHOW_COLUMNS".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_COLUMNS]
    
    inline def SHOW_CREATE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_CREATE = "SHOW_CREATE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_CREATE]
    
    inline def SHOW_DATABASES: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_DATABASES = "SHOW_DATABASES".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_DATABASES]
    
    inline def SHOW_ENGINE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_ENGINE = "SHOW_ENGINE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_ENGINE]
    
    inline def SHOW_ENGINES: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_ENGINES = "SHOW_ENGINES".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_ENGINES]
    
    inline def SHOW_ERRORS: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_ERRORS = "SHOW_ERRORS".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_ERRORS]
    
    inline def SHOW_EVENTS: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_EVENTS = "SHOW_EVENTS".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_EVENTS]
    
    inline def SHOW_FUNCTION: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_FUNCTION = "SHOW_FUNCTION".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_FUNCTION]
    
    inline def SHOW_GRANTS: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_GRANTS = "SHOW_GRANTS".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_GRANTS]
    
    inline def SHOW_INDEX: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_INDEX = "SHOW_INDEX".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_INDEX]
    
    inline def SHOW_KEYS: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_KEYS = "SHOW_KEYS".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_KEYS]
    
    inline def SHOW_MASTER: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_MASTER = "SHOW_MASTER".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_MASTER]
    
    inline def SHOW_OPEN: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_OPEN = "SHOW_OPEN".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_OPEN]
    
    inline def SHOW_PLUGINS: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PLUGINS = "SHOW_PLUGINS".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PLUGINS]
    
    inline def SHOW_PRIVILEGES: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PRIVILEGES = "SHOW_PRIVILEGES".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PRIVILEGES]
    
    inline def SHOW_PROCEDURE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PROCEDURE = "SHOW_PROCEDURE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PROCEDURE]
    
    inline def SHOW_PROCESSLIST: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PROCESSLIST = "SHOW_PROCESSLIST".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PROCESSLIST]
    
    inline def SHOW_PROFILE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PROFILE = "SHOW_PROFILE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PROFILE]
    
    inline def SHOW_PROFILES: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PROFILES = "SHOW_PROFILES".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_PROFILES]
    
    inline def SHOW_RELAYLOG: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_RELAYLOG = "SHOW_RELAYLOG".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_RELAYLOG]
    
    inline def SHOW_REPLICA: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_REPLICA = "SHOW_REPLICA".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_REPLICA]
    
    inline def SHOW_REPLICAS: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_REPLICAS = "SHOW_REPLICAS".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_REPLICAS]
    
    inline def SHOW_SLAVE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_SLAVE = "SHOW_SLAVE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_SLAVE]
    
    inline def SHOW_STATUS: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_STATUS = "SHOW_STATUS".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_STATUS]
    
    inline def SHOW_TABLE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_TABLE = "SHOW_TABLE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_TABLE]
    
    inline def SHOW_TABLES: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_TABLES = "SHOW_TABLES".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_TABLES]
    
    inline def SHOW_TRIGGERS: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_TRIGGERS = "SHOW_TRIGGERS".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_TRIGGERS]
    
    inline def SHOW_VARIABLES: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_VARIABLES = "SHOW_VARIABLES".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_VARIABLES]
    
    inline def SHOW_WARNINGS: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_WARNINGS = "SHOW_WARNINGS".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.SHOW_WARNINGS]
    
    inline def TRUNCATE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.TRUNCATE = "TRUNCATE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.TRUNCATE]
    
    inline def UNKNOWN: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.UNKNOWN]
    
    inline def UPDATE: typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.UPDATE = "UPDATE".asInstanceOf[typings.sqlQueryIdentifier.sqlQueryIdentifierStrings.UPDATE]
  }
  
  @js.native
  trait Step extends StObject {
    
    def add(token: Token): Unit = js.native
    
    def postCanGoToNext(): Boolean = js.native
    def postCanGoToNext(token: Token): Boolean = js.native
    
    def preCanGoToNext(): Boolean = js.native
    def preCanGoToNext(token: Token): Boolean = js.native
    
    var validation: js.UndefOr[AcceptTokens] = js.native
  }
  
  trait Token extends StObject {
    
    var end: Double
    
    var start: Double
    
    var `type`: whitespace | `comment-inline` | `comment-block` | string | semicolon | keyword | parameter | unknown_
    
    var value: String
  }
  object Token {
    
    inline def apply(
      end: Double,
      start: Double,
      `type`: whitespace | `comment-inline` | `comment-block` | string | semicolon | keyword | parameter | unknown_,
      value: String
    ): Token = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: whitespace | `comment-inline` | `comment-block` | string | semicolon | keyword | parameter | unknown_
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
