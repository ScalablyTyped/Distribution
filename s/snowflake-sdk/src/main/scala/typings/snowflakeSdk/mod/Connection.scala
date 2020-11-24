package typings.snowflakeSdk.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.events.<global>.NodeJS.EventEmitter & {getTokens (): unknown, isUp (): boolean, getServiceName (): string, getClientSessionKeepAlive (): boolean, getClientSessionKeepAliveHeartbeatFrequency (): number, getJsTreatIntegerAsBigInt (): boolean, getId (): string, heartbeat (): void, connect (fn : (err : std.Error, conn : snowflake-sdk.snowflake-sdk.Connection): void): void, execute (options : {  sqlText :string,   streamResult :boolean | undefined,   binds :snowflake-sdk.snowflake-sdk.Binds | undefined,   fetchAsString :std.Array<'String' | 'Boolean' | 'Number' | 'Date' | 'JSON'> | undefined, complete (err : std.Error, stmt : snowflake-sdk.snowflake-sdk.Statement, rows : std.Array<any> | undefined): void}): void, fetchResult (): any, destroy (fn : (err : std.Error, conn : snowflake-sdk.snowflake-sdk.Connection): void): void, serialize (): string} */
@js.native
trait Connection extends js.Object {
  
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
