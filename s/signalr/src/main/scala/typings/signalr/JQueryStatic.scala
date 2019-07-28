package typings.signalr

import typings.signalr.SignalRNs.Connection
import typings.signalr.SignalRNs.HubNs.HubCreator
import typings.signalr.SignalRNs.HubNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("connection")
  var connection_Original: SignalR = js.native
  @JSName("hubConnection")
  var hubConnection_Original: HubCreator = js.native
  @JSName("signalR")
  var signalR_Original: SignalR = js.native
  /**
    * Creates a new SignalR connection for the given url
    *
    * @param url   The URL of the long polling endpoint
    * @param queryString   [Optional] Custom querystring parameters to add to the connection URL. If an object, every non-function member will be added to the querystring. If a string, it's added to the QS as specified.
    * @param logging [Optional] A flag indicating whether connection logging is enabled to the browser console/log. Defaults to false.
    */
  def connection(url: String): Connection = js.native
  def connection(url: String, queryString: String): Connection = js.native
  def connection(url: String, queryString: String, logging: Boolean): Connection = js.native
  def connection(url: String, queryString: js.Object): Connection = js.native
  def connection(url: String, queryString: js.Object, logging: Boolean): Connection = js.native
  def hubConnection(): typings.signalr.SignalRNs.HubNs.Connection = js.native
  def hubConnection(url: String): typings.signalr.SignalRNs.HubNs.Connection = js.native
  def hubConnection(url: String, options: Options): typings.signalr.SignalRNs.HubNs.Connection = js.native
  /**
    * Creates a new SignalR connection for the given url
    *
    * @param url   The URL of the long polling endpoint
    * @param queryString   [Optional] Custom querystring parameters to add to the connection URL. If an object, every non-function member will be added to the querystring. If a string, it's added to the QS as specified.
    * @param logging [Optional] A flag indicating whether connection logging is enabled to the browser console/log. Defaults to false.
    */
  def signalR(url: String): Connection = js.native
  def signalR(url: String, queryString: String): Connection = js.native
  def signalR(url: String, queryString: String, logging: Boolean): Connection = js.native
  def signalR(url: String, queryString: js.Object): Connection = js.native
  def signalR(url: String, queryString: js.Object, logging: Boolean): Connection = js.native
}

