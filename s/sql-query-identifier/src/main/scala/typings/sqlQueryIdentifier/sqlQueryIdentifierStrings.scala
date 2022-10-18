package typings.sqlQueryIdentifier

import typings.sqlQueryIdentifier.libDefinesMod.Dialect
import typings.sqlQueryIdentifier.libDefinesMod.ExecutionType
import typings.sqlQueryIdentifier.libDefinesMod.StatementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlQueryIdentifierStrings {
  
  @js.native
  sealed trait ALTER_DATABASE
    extends StObject
       with StatementType
  inline def ALTER_DATABASE: ALTER_DATABASE = "ALTER_DATABASE".asInstanceOf[ALTER_DATABASE]
  
  @js.native
  sealed trait ALTER_FUNCTION
    extends StObject
       with StatementType
  inline def ALTER_FUNCTION: ALTER_FUNCTION = "ALTER_FUNCTION".asInstanceOf[ALTER_FUNCTION]
  
  @js.native
  sealed trait ALTER_INDEX
    extends StObject
       with StatementType
  inline def ALTER_INDEX: ALTER_INDEX = "ALTER_INDEX".asInstanceOf[ALTER_INDEX]
  
  @js.native
  sealed trait ALTER_PROCEDURE
    extends StObject
       with StatementType
  inline def ALTER_PROCEDURE: ALTER_PROCEDURE = "ALTER_PROCEDURE".asInstanceOf[ALTER_PROCEDURE]
  
  @js.native
  sealed trait ALTER_SCHEMA
    extends StObject
       with StatementType
  inline def ALTER_SCHEMA: ALTER_SCHEMA = "ALTER_SCHEMA".asInstanceOf[ALTER_SCHEMA]
  
  @js.native
  sealed trait ALTER_TABLE
    extends StObject
       with StatementType
  inline def ALTER_TABLE: ALTER_TABLE = "ALTER_TABLE".asInstanceOf[ALTER_TABLE]
  
  @js.native
  sealed trait ALTER_TRIGGER
    extends StObject
       with StatementType
  inline def ALTER_TRIGGER: ALTER_TRIGGER = "ALTER_TRIGGER".asInstanceOf[ALTER_TRIGGER]
  
  @js.native
  sealed trait ALTER_VIEW
    extends StObject
       with StatementType
  inline def ALTER_VIEW: ALTER_VIEW = "ALTER_VIEW".asInstanceOf[ALTER_VIEW]
  
  @js.native
  sealed trait ANON_BLOCK
    extends StObject
       with ExecutionType
       with StatementType
  inline def ANON_BLOCK: ANON_BLOCK = "ANON_BLOCK".asInstanceOf[ANON_BLOCK]
  
  @js.native
  sealed trait CREATE_DATABASE
    extends StObject
       with StatementType
  inline def CREATE_DATABASE: CREATE_DATABASE = "CREATE_DATABASE".asInstanceOf[CREATE_DATABASE]
  
  @js.native
  sealed trait CREATE_FUNCTION
    extends StObject
       with StatementType
  inline def CREATE_FUNCTION: CREATE_FUNCTION = "CREATE_FUNCTION".asInstanceOf[CREATE_FUNCTION]
  
  @js.native
  sealed trait CREATE_INDEX
    extends StObject
       with StatementType
  inline def CREATE_INDEX: CREATE_INDEX = "CREATE_INDEX".asInstanceOf[CREATE_INDEX]
  
  @js.native
  sealed trait CREATE_PROCEDURE
    extends StObject
       with StatementType
  inline def CREATE_PROCEDURE: CREATE_PROCEDURE = "CREATE_PROCEDURE".asInstanceOf[CREATE_PROCEDURE]
  
  @js.native
  sealed trait CREATE_SCHEMA
    extends StObject
       with StatementType
  inline def CREATE_SCHEMA: CREATE_SCHEMA = "CREATE_SCHEMA".asInstanceOf[CREATE_SCHEMA]
  
  @js.native
  sealed trait CREATE_TABLE
    extends StObject
       with StatementType
  inline def CREATE_TABLE: CREATE_TABLE = "CREATE_TABLE".asInstanceOf[CREATE_TABLE]
  
  @js.native
  sealed trait CREATE_TRIGGER
    extends StObject
       with StatementType
  inline def CREATE_TRIGGER: CREATE_TRIGGER = "CREATE_TRIGGER".asInstanceOf[CREATE_TRIGGER]
  
  @js.native
  sealed trait CREATE_VIEW
    extends StObject
       with StatementType
  inline def CREATE_VIEW: CREATE_VIEW = "CREATE_VIEW".asInstanceOf[CREATE_VIEW]
  
  @js.native
  sealed trait DELETE
    extends StObject
       with StatementType
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait DROP_DATABASE
    extends StObject
       with StatementType
  inline def DROP_DATABASE: DROP_DATABASE = "DROP_DATABASE".asInstanceOf[DROP_DATABASE]
  
  @js.native
  sealed trait DROP_FUNCTION
    extends StObject
       with StatementType
  inline def DROP_FUNCTION: DROP_FUNCTION = "DROP_FUNCTION".asInstanceOf[DROP_FUNCTION]
  
  @js.native
  sealed trait DROP_INDEX
    extends StObject
       with StatementType
  inline def DROP_INDEX: DROP_INDEX = "DROP_INDEX".asInstanceOf[DROP_INDEX]
  
  @js.native
  sealed trait DROP_PROCEDURE
    extends StObject
       with StatementType
  inline def DROP_PROCEDURE: DROP_PROCEDURE = "DROP_PROCEDURE".asInstanceOf[DROP_PROCEDURE]
  
  @js.native
  sealed trait DROP_SCHEMA
    extends StObject
       with StatementType
  inline def DROP_SCHEMA: DROP_SCHEMA = "DROP_SCHEMA".asInstanceOf[DROP_SCHEMA]
  
  @js.native
  sealed trait DROP_TABLE
    extends StObject
       with StatementType
  inline def DROP_TABLE: DROP_TABLE = "DROP_TABLE".asInstanceOf[DROP_TABLE]
  
  @js.native
  sealed trait DROP_TRIGGER
    extends StObject
       with StatementType
  inline def DROP_TRIGGER: DROP_TRIGGER = "DROP_TRIGGER".asInstanceOf[DROP_TRIGGER]
  
  @js.native
  sealed trait DROP_VIEW
    extends StObject
       with StatementType
  inline def DROP_VIEW: DROP_VIEW = "DROP_VIEW".asInstanceOf[DROP_VIEW]
  
  @js.native
  sealed trait INSERT
    extends StObject
       with StatementType
  inline def INSERT: INSERT = "INSERT".asInstanceOf[INSERT]
  
  @js.native
  sealed trait LISTING
    extends StObject
       with ExecutionType
  inline def LISTING: LISTING = "LISTING".asInstanceOf[LISTING]
  
  @js.native
  sealed trait MODIFICATION
    extends StObject
       with ExecutionType
  inline def MODIFICATION: MODIFICATION = "MODIFICATION".asInstanceOf[MODIFICATION]
  
  @js.native
  sealed trait QUERY extends StObject
  inline def QUERY: QUERY = "QUERY".asInstanceOf[QUERY]
  
  @js.native
  sealed trait SELECT
    extends StObject
       with StatementType
  inline def SELECT: SELECT = "SELECT".asInstanceOf[SELECT]
  
  @js.native
  sealed trait TRUNCATE
    extends StObject
       with StatementType
  inline def TRUNCATE: TRUNCATE = "TRUNCATE".asInstanceOf[TRUNCATE]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with ExecutionType
       with StatementType
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait UPDATE
    extends StObject
       with StatementType
  inline def UPDATE: UPDATE = "UPDATE".asInstanceOf[UPDATE]
  
  @js.native
  sealed trait bigquery
    extends StObject
       with Dialect
  inline def bigquery: bigquery = "bigquery".asInstanceOf[bigquery]
  
  @js.native
  sealed trait `comment-block` extends StObject
  inline def `comment-block`: `comment-block` = "comment-block".asInstanceOf[`comment-block`]
  
  @js.native
  sealed trait `comment-inline` extends StObject
  inline def `comment-inline`: `comment-inline` = "comment-inline".asInstanceOf[`comment-inline`]
  
  @js.native
  sealed trait generic
    extends StObject
       with Dialect
  inline def generic: generic = "generic".asInstanceOf[generic]
  
  @js.native
  sealed trait keyword extends StObject
  inline def keyword: keyword = "keyword".asInstanceOf[keyword]
  
  @js.native
  sealed trait mssql
    extends StObject
       with Dialect
  inline def mssql: mssql = "mssql".asInstanceOf[mssql]
  
  @js.native
  sealed trait mysql
    extends StObject
       with Dialect
  inline def mysql: mysql = "mysql".asInstanceOf[mysql]
  
  @js.native
  sealed trait oracle
    extends StObject
       with Dialect
  inline def oracle: oracle = "oracle".asInstanceOf[oracle]
  
  @js.native
  sealed trait parameter extends StObject
  inline def parameter: parameter = "parameter".asInstanceOf[parameter]
  
  @js.native
  sealed trait psql
    extends StObject
       with Dialect
  inline def psql: psql = "psql".asInstanceOf[psql]
  
  @js.native
  sealed trait semicolon extends StObject
  inline def semicolon: semicolon = "semicolon".asInstanceOf[semicolon]
  
  @js.native
  sealed trait sqlite
    extends StObject
       with Dialect
  inline def sqlite: sqlite = "sqlite".asInstanceOf[sqlite]
  
  @js.native
  sealed trait string extends StObject
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait unknown_ extends StObject
  inline def unknown_ : unknown_ = "unknown".asInstanceOf[unknown_]
  
  @js.native
  sealed trait whitespace extends StObject
  inline def whitespace: whitespace = "whitespace".asInstanceOf[whitespace]
}
