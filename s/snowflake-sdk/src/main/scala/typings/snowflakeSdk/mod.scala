package typings.snowflakeSdk

import typings.node.NodeJS.ReadableStream
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.snowflakeSdk.snowflakeSdkStrings.DEBUG
import typings.snowflakeSdk.snowflakeSdkStrings.ERROR
import typings.snowflakeSdk.snowflakeSdkStrings.INFO
import typings.snowflakeSdk.snowflakeSdkStrings.TRACE
import typings.snowflakeSdk.snowflakeSdkStrings.WARN
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snowflake-sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snowflake-sdk", "BOOLEAN")
  @js.native
  val BOOLEAN: /* "BOOLEAN" */ String = js.native
  
  @JSImport("snowflake-sdk", "DATE")
  @js.native
  val DATE: /* "DATE" */ String = js.native
  
  @JSImport("snowflake-sdk", "JSON")
  @js.native
  val JSON: /* "JSON" */ String = js.native
  
  @JSImport("snowflake-sdk", "NUMBER")
  @js.native
  val NUMBER: /* "NUMBER" */ String = js.native
  
  @JSImport("snowflake-sdk", "STRING")
  @js.native
  val STRING: /* "STRING" */ String = js.native
  
  @js.native
  sealed trait StatementStatus extends StObject
  @JSImport("snowflake-sdk", "StatementStatus")
  @js.native
  object StatementStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatementStatus & String] = js.native
    
    @js.native
    sealed trait Complete
      extends StObject
         with StatementStatus
    /* "complete" */ val Complete: typings.snowflakeSdk.mod.StatementStatus.Complete & String = js.native
    
    @js.native
    sealed trait Fetching
      extends StObject
         with StatementStatus
    /* "fetching" */ val Fetching: typings.snowflakeSdk.mod.StatementStatus.Fetching & String = js.native
  }
  
  inline def configure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[Unit]
  inline def configure(options: ConfigureOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createConnection(options: ConnectionOptions): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[Connection]
  
  inline def deserializeConnection(options: ConnectionOptions, serializedConnection: String): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeConnection")(options.asInstanceOf[js.Any], serializedConnection.asInstanceOf[js.Any])).asInstanceOf[Connection]
  
  @js.native
  sealed trait ocspModes extends StObject
  @JSImport("snowflake-sdk", "ocspModes")
  @js.native
  object ocspModes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ocspModes & String] = js.native
    
    @js.native
    sealed trait FAIL_CLOSED
      extends StObject
         with ocspModes
    /* "FAIL_CLOSED" */ val FAIL_CLOSED: typings.snowflakeSdk.mod.ocspModes.FAIL_CLOSED & String = js.native
    
    @js.native
    sealed trait FAIL_OPEN
      extends StObject
         with ocspModes
    /* "FAIL_OPEN" */ val FAIL_OPEN: typings.snowflakeSdk.mod.ocspModes.FAIL_OPEN & String = js.native
    
    @js.native
    sealed trait INSECURE
      extends StObject
         with ocspModes
    /* "INSECURE" */ val INSECURE: typings.snowflakeSdk.mod.ocspModes.INSECURE & String = js.native
  }
  
  inline def serializeConnection(connection: Connection): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeConnection")(connection.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Bind = String | Double
  
  type Binds = js.Array[Bind] | InsertBinds
  
  trait Column extends StObject {
    
    /**
      * Returns the id of this column.
      */
    def getId(): Double
    
    /**
      * Returns the index of this column.
      */
    def getIndex(): Double
    
    /**
      * Returns the name of this column.
      */
    def getName(): String
    
    /**
      * Returns the scale associated with this column.
      */
    def getScale(): Double
    
    /**
      * Retuns the type associated with this column.
      */
    def getType(): String
    
    /**
      * Determines if this column is nullable.
      */
    def isNullable(): Boolean
  }
  object Column {
    
    inline def apply(
      getId: () => Double,
      getIndex: () => Double,
      getName: () => String,
      getScale: () => Double,
      getType: () => String,
      isNullable: () => Boolean
    ): Column = {
      val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getName = js.Any.fromFunction0(getName), getScale = js.Any.fromFunction0(getScale), getType = js.Any.fromFunction0(getType), isNullable = js.Any.fromFunction0(isNullable))
      __obj.asInstanceOf[Column]
    }
    
    extension [Self <: Column](x: Self) {
      
      inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      inline def setGetIndex(value: () => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
      
      inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetScale(value: () => Double): Self = StObject.set(x, "getScale", js.Any.fromFunction0(value))
      
      inline def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      inline def setIsNullable(value: () => Boolean): Self = StObject.set(x, "isNullable", js.Any.fromFunction0(value))
    }
  }
  
  trait ConfigureOptions extends StObject {
    
    var insecureConnect: js.UndefOr[Boolean] = js.undefined
    
    var logLevel: js.UndefOr[ERROR | WARN | INFO | DEBUG | TRACE] = js.undefined
    
    /**
      * ### Related Docs
      * - {@link https://docs.snowflake.com/en/user-guide/nodejs-driver-use.html#choosing-fail-open-or-fail-close-mode Choosing `Fail-Open` or `Fail-Close` Mode}
      */
    var ocspFailOpen: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigureOptions {
    
    inline def apply(): ConfigureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigureOptions]
    }
    
    extension [Self <: ConfigureOptions](x: Self) {
      
      inline def setInsecureConnect(value: Boolean): Self = StObject.set(x, "insecureConnect", value.asInstanceOf[js.Any])
      
      inline def setInsecureConnectUndefined: Self = StObject.set(x, "insecureConnect", js.undefined)
      
      inline def setLogLevel(value: ERROR | WARN | INFO | DEBUG | TRACE): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setOcspFailOpen(value: Boolean): Self = StObject.set(x, "ocspFailOpen", value.asInstanceOf[js.Any])
      
      inline def setOcspFailOpenUndefined: Self = StObject.set(x, "ocspFailOpen", js.undefined)
    }
  }
  
  @js.native
  trait Connection
    extends StObject
       with EventEmitter {
    
    /**
      * Establishes a connection if not in a fatal state.
      */
    def connect(fn: js.Function2[/* err */ Error, /* conn */ this.type, Unit]): Unit = js.native
    
    /**
      * Immediately terminates the connection without waiting for
      * currently executing statements to complete.
      */
    def destroy(fn: js.Function2[/* err */ Error, /* conn */ this.type, Unit]): Unit = js.native
    
    /**
      * ### Related Docs
      * - {@link https://docs.snowflake.com/en/user-guide/nodejs-driver-use.html#executing-statements Executing Statements}
      */
    def execute(options: typings.snowflakeSdk.anon.Binds): Unit = js.native
    
    /**
      * Fetches the result of a previously issued statement.
      */
    def fetchResult(): js.Any = js.native
    
    def getClientSessionKeepAlive(): Boolean = js.native
    
    def getClientSessionKeepAliveHeartbeatFrequency(): Double = js.native
    
    /**
      * Returns the connection id.
      */
    def getId(): String = js.native
    
    def getJsTreatIntegerAsBigInt(): Boolean = js.native
    
    def getServiceName(): String = js.native
    
    /**
      * Make session tokens available for testing
      */
    def getTokens(): js.Any = js.native
    
    def heartbeat(): Unit = js.native
    
    /**
      * Returns true if the connection is active otherwise false
      */
    def isUp(): Boolean = js.native
    
    /**
      * Returns a serialized version of this connection.
      */
    def serialize(): String = js.native
  }
  
  trait ConnectionOptions extends StObject {
    
    /**
      * The full name of your account (provided by Snowflake). Note that your full account name might include additional segments
      * that identify the region and cloud platform where your account is hosted.
      */
    var account: String
    
    /**
      * By default, client connections typically time out approximately 3-4 hours after the most recent query was executed.
      *
      * If the parameter clientSessionKeepAlive is set to true, the client’s connection to the server will be kept alive
      * indefinitely, even if no queries are executed.
      *
      * The default setting of this parameter is false.
      *
      * If you set this parameter to true, make sure that your program explicitly disconnects from the server when your program
      * has finished. Do not exit without disconnecting.
      */
    var clientSessionKeepAlive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * (Applies only when `clientSessionKeepAlive` is true)
      *
      * This parameter sets the frequency (interval in seconds) between heartbeat messages.
      *
      * You can loosely think of a connection heartbeat message as substituting for a query and restarting the timeout countdown
      * for the connection. In other words, if the connection would time out after at least 4 hours of inactivity, the heartbeat
      * resets the timer so that the timeout will not occur until at least 4 hours after the most recent heartbeat (or query).
      *
      * The default value is 3600 seconds (one hour). The valid range of values is 900 - 3600. Because timeouts usually occur after
      * at least 4 hours, a heartbeat every 1 hour is normally sufficient to keep the connection alive. Heartbeat intervals of less
      * than 3600 seconds are rarely necessary or useful.
      */
    var clientSessionKeepAliveHeartbeatFrequency: js.UndefOr[Double] = js.undefined
    
    /**
      * The default database to use for the session after connecting.
      */
    var database: js.UndefOr[String] = js.undefined
    
    var jsTreatIntegerAsBigInt: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Password for the user.
      */
    var password: String
    
    /**
      * @deprecated
      * The ID for the region where your account is located.
      *
      * This parameter is no longer used because the region information, if required, is included as part of the full account name.
      * It is documented here only for backward compatibility
      */
    var region: js.UndefOr[String] = js.undefined
    
    /**
      * The default security role to use for the session after connecting.
      */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * The default schema to use for the session after connecting.
      */
    var schema: js.UndefOr[String] = js.undefined
    
    /**
      * Snowflake user login name to connect with.
      */
    var username: String
    
    /**
      * The default virtual warehouse to use for the session after connecting. Used for performing queries, loading data, etc.
      */
    var warehouse: js.UndefOr[String] = js.undefined
  }
  object ConnectionOptions {
    
    inline def apply(account: String, password: String, username: String): ConnectionOptions = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    extension [Self <: ConnectionOptions](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setClientSessionKeepAlive(value: Boolean): Self = StObject.set(x, "clientSessionKeepAlive", value.asInstanceOf[js.Any])
      
      inline def setClientSessionKeepAliveHeartbeatFrequency(value: Double): Self = StObject.set(x, "clientSessionKeepAliveHeartbeatFrequency", value.asInstanceOf[js.Any])
      
      inline def setClientSessionKeepAliveHeartbeatFrequencyUndefined: Self = StObject.set(x, "clientSessionKeepAliveHeartbeatFrequency", js.undefined)
      
      inline def setClientSessionKeepAliveUndefined: Self = StObject.set(x, "clientSessionKeepAlive", js.undefined)
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setJsTreatIntegerAsBigInt(value: Boolean): Self = StObject.set(x, "jsTreatIntegerAsBigInt", value.asInstanceOf[js.Any])
      
      inline def setJsTreatIntegerAsBigIntUndefined: Self = StObject.set(x, "jsTreatIntegerAsBigInt", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setWarehouse(value: String): Self = StObject.set(x, "warehouse", value.asInstanceOf[js.Any])
      
      inline def setWarehouseUndefined: Self = StObject.set(x, "warehouse", js.undefined)
    }
  }
  
  type InsertBinds = js.Array[js.Array[Bind]]
  
  @js.native
  trait Statement extends StObject {
    
    /**
      * Cancels this statement if possible.
      * @param fn The callback to use.
      */
    def cancel(fn: js.Function2[/* err */ Error, /* stmt */ this.type, Unit]): Unit = js.native
    
    /**
      * Given a column identifier, returns the corresponding column. The column
      * identifier can be either the column name (String) or the column index
      * (Number). If a column is specified and there is more than one column with
      * that name, the first column with the specified name will be returned.
      */
    def getColumn(columnIdentifier: String): Column = js.native
    def getColumn(columnIdentifier: Double): Column = js.native
    
    /**
      * Returns the columns produced by this statement.
      */
    def getColumns(): js.Array[Column] = js.native
    
    /**
      * Returns the number of rows returned by this statement.
      */
    def getNumRows(): Double = js.native
    
    /**
      * Returns the number of rows updated by this statement.
      */
    def getNumUpdatedRows(): Double = js.native
    
    /**
      * Returns the request id that was used when the statement was issued.
      */
    def getRequestId(): String = js.native
    
    /**
      * Returns an object that contains information about the values of the
      * current warehouse, current database, etc., when this statement finished
      * executing.
      */
    def getSessionState(): js.Any = js.native
    
    /**
      * Returns this statement's SQL text.
      */
    def getSqlText(): String = js.native
    
    /**
      * Returns the statement id generated by the server for this statement.
      * If the statement is still executing and we don't know the statement id
      * yet, this method will return undefined.
      */
    def getStatementId(): String = js.native
    
    /**
      * Returns the current status of this statement.
      */
    def getStatus(): StatementStatus = js.native
    
    def streamRows(): ReadableStream = js.native
  }
}
