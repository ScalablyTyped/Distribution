package typings.sailsIoJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sailsIoJs.sailsIoJsStrings.polling
import typings.sailsIoJs.sailsIoJsStrings.production
import typings.sailsIoJs.sailsIoJsStrings.websocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientSails extends js.Object {
  
  var autoConnect: js.UndefOr[Boolean] = js.native
  
  def connect(): Socket = js.native
  def connect(url: js.UndefOr[scala.Nothing], config: ConnectConfig): Socket = js.native
  def connect(url: String): Socket = js.native
  def connect(url: String, config: ConnectConfig): Socket = js.native
  
  // All logs are disabled when `io.sails.environment = 'production'`
  var environment: js.UndefOr[production | String] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var initialConnectionHeaders: js.UndefOr[InitialConnectionHeaders] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var reconnection: js.UndefOr[Boolean] = js.native
  
  var reconnectionAttempts: js.UndefOr[Double] = js.native
  
  var reconnectionDelay: js.UndefOr[Double] = js.native
  
  var reconnectionDelayMax: js.UndefOr[Double] = js.native
  
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  
  var sdk: js.UndefOr[SDKInfo] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
  
  var transports: js.UndefOr[js.Array[websocket | polling]] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var useCORSRouteToGetCookie: js.UndefOr[Boolean] = js.native
}
