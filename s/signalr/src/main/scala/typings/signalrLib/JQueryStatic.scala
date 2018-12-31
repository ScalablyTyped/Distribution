package typings
package signalrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("connection")
  var connection_Original: SignalR = js.native
  @JSName("hubConnection")
  var hubConnection_Original: signalrLib.SignalRNs.HubNs.HubCreator = js.native
  @JSName("signalR")
  var signalR_Original: SignalR = js.native
  /**
    * Creates a new SignalR connection for the given url
    *
    * @param url   The URL of the long polling endpoint
    * @param queryString   [Optional] Custom querystring parameters to add to the connection URL. If an object, every non-function member will be added to the querystring. If a string, it's added to the QS as specified.
    * @param logging [Optional] A flag indicating whether connection logging is enabled to the browser console/log. Defaults to false.
    */
  def connection(url: java.lang.String): signalrLib.SignalRNs.Connection = js.native
  def connection(url: java.lang.String, queryString: java.lang.String): signalrLib.SignalRNs.Connection = js.native
  def connection(url: java.lang.String, queryString: java.lang.String, logging: scala.Boolean): signalrLib.SignalRNs.Connection = js.native
  def connection(url: java.lang.String, queryString: js.Object): signalrLib.SignalRNs.Connection = js.native
  def connection(url: java.lang.String, queryString: js.Object, logging: scala.Boolean): signalrLib.SignalRNs.Connection = js.native
  /**
    * Creates a new hub connection.
    *
    * @param url [Optional] The hub route url, defaults to "/signalr".
    * @param options [Optional] Settings to use when creating the hubConnection.
    */
  def hubConnection(): signalrLib.SignalRNs.HubNs.Connection = js.native
  def hubConnection(url: java.lang.String): signalrLib.SignalRNs.HubNs.Connection = js.native
  def hubConnection(url: java.lang.String, options: signalrLib.SignalRNs.HubNs.Options): signalrLib.SignalRNs.HubNs.Connection = js.native
  /**
    * Creates a new SignalR connection for the given url
    *
    * @param url   The URL of the long polling endpoint
    * @param queryString   [Optional] Custom querystring parameters to add to the connection URL. If an object, every non-function member will be added to the querystring. If a string, it's added to the QS as specified.
    * @param logging [Optional] A flag indicating whether connection logging is enabled to the browser console/log. Defaults to false.
    */
  def signalR(url: java.lang.String): signalrLib.SignalRNs.Connection = js.native
  def signalR(url: java.lang.String, queryString: java.lang.String): signalrLib.SignalRNs.Connection = js.native
  def signalR(url: java.lang.String, queryString: java.lang.String, logging: scala.Boolean): signalrLib.SignalRNs.Connection = js.native
  def signalR(url: java.lang.String, queryString: js.Object): signalrLib.SignalRNs.Connection = js.native
  def signalR(url: java.lang.String, queryString: js.Object, logging: scala.Boolean): signalrLib.SignalRNs.Connection = js.native
}

