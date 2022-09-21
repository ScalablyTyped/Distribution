package typings.snowflakeSdk.mod

import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection
  extends StObject
     with EventEmitter {
  
  /**
    * Establishes a connection if not in a fatal state.
    *
    * If you set the authenticator option to `EXTERNALBROWSER` (in order to use browser-based SSO) or
    * `https://<okta_account_name>.okta.com` (in order to use native SSO through Okta), call the {@link connectAsync}
    * method.
    */
  def connect(fn: js.Function2[/* err */ js.UndefOr[SnowflakeError], /* conn */ this.type, Unit]): Unit = js.native
  
  /**
    * Establishes a connection if not in a fatal state.
    *
    * If you do not set the authenticator option to `EXTERNALBROWSER` (in order to use browser-based SSO) or
    * `https://<okta_account_name>.okta.com` (in order to use native SSO through Okta), call the {@link connect}
    * method.
    */
  def connectAsync(fn: js.Function2[/* err */ js.UndefOr[SnowflakeError], /* conn */ this.type, Unit]): js.Promise[Unit] = js.native
  
  /**
    * Immediately terminates the connection without waiting for
    * currently executing statements to complete.
    */
  def destroy(fn: js.Function2[/* err */ js.UndefOr[SnowflakeError], /* conn */ this.type, Unit]): Unit = js.native
  
  /**
    * ### Related Docs
    * - {@link https://docs.snowflake.com/en/user-guide/nodejs-driver-use.html#executing-statements Executing Statements}
    */
  def execute(options: typings.snowflakeSdk.anon.Binds): Statement = js.native
  
  /**
    * Fetches the result of a previously issued statement.
    */
  def fetchResult(): Any = js.native
  
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
  def getTokens(): Any = js.native
  
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
