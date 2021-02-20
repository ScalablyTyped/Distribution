package typings.snowflakeSdk

import typings.node.NodeJS.ReadableStream
import typings.snowflakeSdk.snowflakeSdkStrings.DEBUG
import typings.snowflakeSdk.snowflakeSdkStrings.ERROR
import typings.snowflakeSdk.snowflakeSdkStrings.INFO
import typings.snowflakeSdk.snowflakeSdkStrings.TRACE
import typings.snowflakeSdk.snowflakeSdkStrings.WARN
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
    def apply(value: String): js.UndefOr[StatementStatus with String] = js.native
    
    @js.native
    sealed trait Complete extends StatementStatus
    /* "complete" */ val Complete: typings.snowflakeSdk.mod.StatementStatus.Complete with String = js.native
    
    @js.native
    sealed trait Fetching extends StatementStatus
    /* "fetching" */ val Fetching: typings.snowflakeSdk.mod.StatementStatus.Fetching with String = js.native
  }
  
  @JSImport("snowflake-sdk", "configure")
  @js.native
  def configure(): Unit = js.native
  @JSImport("snowflake-sdk", "configure")
  @js.native
  def configure(options: ConfigureOptions): Unit = js.native
  
  @JSImport("snowflake-sdk", "createConnection")
  @js.native
  def createConnection(options: ConnectionOptions): Connection = js.native
  
  @JSImport("snowflake-sdk", "deserializeConnection")
  @js.native
  def deserializeConnection(options: ConnectionOptions, serializedConnection: String): Connection = js.native
  
  @js.native
  sealed trait ocspModes extends StObject
  @JSImport("snowflake-sdk", "ocspModes")
  @js.native
  object ocspModes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ocspModes with String] = js.native
    
    @js.native
    sealed trait FAIL_CLOSED extends ocspModes
    /* "FAIL_CLOSED" */ val FAIL_CLOSED: typings.snowflakeSdk.mod.ocspModes.FAIL_CLOSED with String = js.native
    
    @js.native
    sealed trait FAIL_OPEN extends ocspModes
    /* "FAIL_OPEN" */ val FAIL_OPEN: typings.snowflakeSdk.mod.ocspModes.FAIL_OPEN with String = js.native
    
    @js.native
    sealed trait INSECURE extends ocspModes
    /* "INSECURE" */ val INSECURE: typings.snowflakeSdk.mod.ocspModes.INSECURE with String = js.native
  }
  
  @JSImport("snowflake-sdk", "serializeConnection")
  @js.native
  def serializeConnection(connection: Connection): String = js.native
  
  type Bind = String | Double
  
  type Binds = js.Array[Bind] | InsertBinds
  
  @js.native
  trait Column extends StObject {
    
    /**
      * Returns the id of this column.
      */
    def getId(): Double = js.native
    
    /**
      * Returns the index of this column.
      */
    def getIndex(): Double = js.native
    
    /**
      * Returns the name of this column.
      */
    def getName(): String = js.native
    
    /**
      * Returns the scale associated with this column.
      */
    def getScale(): Double = js.native
    
    /**
      * Retuns the type associated with this column.
      */
    def getType(): String = js.native
    
    /**
      * Determines if this column is nullable.
      */
    def isNullable(): Boolean = js.native
  }
  object Column {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIndex(value: () => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScale(value: () => Double): Self = StObject.set(x, "getScale", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsNullable(value: () => Boolean): Self = StObject.set(x, "isNullable", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ConfigureOptions extends StObject {
    
    var insecureConnect: js.UndefOr[Boolean] = js.native
    
    var logLevel: js.UndefOr[ERROR | WARN | INFO | DEBUG | TRACE] = js.native
    
    /**
      * ### Related Docs
      * - {@link https://docs.snowflake.com/en/user-guide/nodejs-driver-use.html#choosing-fail-open-or-fail-close-mode Choosing `Fail-Open` or `Fail-Close` Mode}
      */
    var ocspFailOpen: js.UndefOr[Boolean] = js.native
  }
  object ConfigureOptions {
    
    @scala.inline
    def apply(): ConfigureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigureOptions]
    }
    
    @scala.inline
    implicit class ConfigureOptionsMutableBuilder[Self <: ConfigureOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsecureConnect(value: Boolean): Self = StObject.set(x, "insecureConnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsecureConnectUndefined: Self = StObject.set(x, "insecureConnect", js.undefined)
      
      @scala.inline
      def setLogLevel(value: ERROR | WARN | INFO | DEBUG | TRACE): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setOcspFailOpen(value: Boolean): Self = StObject.set(x, "ocspFailOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOcspFailOpenUndefined: Self = StObject.set(x, "ocspFailOpen", js.undefined)
    }
  }
  
  /* Inlined node.events.<global>.NodeJS.EventEmitter & {getTokens (): unknown, isUp (): boolean, getServiceName (): string, getClientSessionKeepAlive (): boolean, getClientSessionKeepAliveHeartbeatFrequency (): number, getJsTreatIntegerAsBigInt (): boolean, getId (): string, heartbeat (): void, connect (fn : (err : std.Error, conn : snowflake-sdk.snowflake-sdk.Connection): void): void, execute (options : {  sqlText :string,   streamResult :boolean | undefined,   binds :snowflake-sdk.snowflake-sdk.Binds | undefined,   fetchAsString :std.Array<'String' | 'Boolean' | 'Number' | 'Date' | 'JSON'> | undefined, complete (err : std.Error, stmt : snowflake-sdk.snowflake-sdk.Statement, rows : std.Array<any> | undefined): void}): void, fetchResult (): any, destroy (fn : (err : std.Error, conn : snowflake-sdk.snowflake-sdk.Connection): void): void, serialize (): string} */
  @js.native
  trait Connection extends StObject {
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    /**
      * Establishes a connection if not in a fatal state.
      */
    def connect(fn: js.Function2[/* err */ Error, /* conn */ this.type, Unit]): Unit = js.native
    
    /**
      * Immediately terminates the connection without waiting for
      * currently executing statements to complete.
      */
    def destroy(fn: js.Function2[/* err */ Error, /* conn */ this.type, Unit]): Unit = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
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
    
    def getMaxListeners(): Double = js.native
    
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
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    // Added in Node 6...
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    /**
      * Returns a serialized version of this connection.
      */
    def serialize(): String = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
  }
  
  @js.native
  trait ConnectionOptions extends StObject {
    
    /**
      * The full name of your account (provided by Snowflake). Note that your full account name might include additional segments
      * that identify the region and cloud platform where your account is hosted.
      */
    var account: String = js.native
    
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
    var clientSessionKeepAlive: js.UndefOr[Boolean] = js.native
    
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
    var clientSessionKeepAliveHeartbeatFrequency: js.UndefOr[Double] = js.native
    
    /**
      * The default database to use for the session after connecting.
      */
    var database: js.UndefOr[String] = js.native
    
    var jsTreatIntegerAsBigInt: js.UndefOr[Boolean] = js.native
    
    /**
      * Password for the user.
      */
    var password: String = js.native
    
    /**
      * @deprecated
      * The ID for the region where your account is located.
      *
      * This parameter is no longer used because the region information, if required, is included as part of the full account name.
      * It is documented here only for backward compatibility
      */
    var region: js.UndefOr[String] = js.native
    
    /**
      * The default security role to use for the session after connecting.
      */
    var role: js.UndefOr[String] = js.native
    
    /**
      * The default schema to use for the session after connecting.
      */
    var schema: js.UndefOr[String] = js.native
    
    /**
      * Snowflake user login name to connect with.
      */
    var username: String = js.native
    
    /**
      * The default virtual warehouse to use for the session after connecting. Used for performing queries, loading data, etc.
      */
    var warehouse: js.UndefOr[String] = js.native
  }
  object ConnectionOptions {
    
    @scala.inline
    def apply(account: String, password: String, username: String): ConnectionOptions = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    @scala.inline
    implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSessionKeepAlive(value: Boolean): Self = StObject.set(x, "clientSessionKeepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSessionKeepAliveHeartbeatFrequency(value: Double): Self = StObject.set(x, "clientSessionKeepAliveHeartbeatFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSessionKeepAliveHeartbeatFrequencyUndefined: Self = StObject.set(x, "clientSessionKeepAliveHeartbeatFrequency", js.undefined)
      
      @scala.inline
      def setClientSessionKeepAliveUndefined: Self = StObject.set(x, "clientSessionKeepAlive", js.undefined)
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setJsTreatIntegerAsBigInt(value: Boolean): Self = StObject.set(x, "jsTreatIntegerAsBigInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsTreatIntegerAsBigIntUndefined: Self = StObject.set(x, "jsTreatIntegerAsBigInt", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarehouse(value: String): Self = StObject.set(x, "warehouse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarehouseUndefined: Self = StObject.set(x, "warehouse", js.undefined)
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
