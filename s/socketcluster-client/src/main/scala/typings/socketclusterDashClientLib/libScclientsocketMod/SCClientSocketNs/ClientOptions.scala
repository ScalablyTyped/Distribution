package typings
package socketclusterDashClientLib.libScclientsocketMod.SCClientSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  // (milliseconds) - This is the timeout for getting a response to a SCSocket emit event (when a callback is provided).
  var ackTimeout: js.UndefOr[scala.Double] = js.undefined
  // A custom engine to use for storing and loading JWT auth tokens on the client side.
  var authEngine: js.UndefOr[scDashAuthLib.scDashAuthMod.SCAuthEngine | scala.Null] = js.undefined
  // The name of the JWT auth token (provided to the authEngine - By default this is the localStorage variable name); defaults to 'socketCluster.authToken'.
  var authTokenName: js.UndefOr[java.lang.String] = js.undefined
  // Whether or not to automatically connect the socket as soon as it is created. Default is true.
  var autoConnect: js.UndefOr[scala.Boolean] = js.undefined
  // Whether or not to automatically reconnect the socket when it loses the connection.
  var autoReconnect: js.UndefOr[scala.Boolean] = js.undefined
  // Valid properties are: initialDelay (milliseconds), randomness (milliseconds), multiplier (decimal; default is 1.5) and maxDelay (milliseconds).
  var autoReconnectOptions: js.UndefOr[AutoReconnectOptions] = js.undefined
  // This is true by default. If you set this to false, then the socket will not automatically try to subscribe to pending subscriptions on
  // connect - Instead, you will have to manually invoke the processSubscriptions callback from inside the 'connect' event handler on the client side.
  // See SCSocket Client API. This gives you more fine-grained control with regards to when pending subscriptions are processed after the socket
  // connection is established (or re-established).
  var autoSubscribeOnConnect: js.UndefOr[scala.Boolean] = js.undefined
  // The type to use to represent binary on the client. Defaults to 'arraybuffer'.
  var binaryType: js.UndefOr[java.lang.String] = js.undefined
  // A prefix to add to the channel names.
  var channelPrefix: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  // If you set this to true, any data/objects/arrays that you pass to the client socket will be cloned before being sent/queued up. If the socket
  // is disconnected and you emit an event, it will be added to a queue which will be processed upon reconnection. The cloneData option is false
  // by default; this means that if you emit/publish an object and that object changes somewhere else in your code before the queue is processed,
  // then the changed version of that object will be sent out to the server.
  var cloneData: js.UndefOr[scala.Boolean] = js.undefined
  // Lets you set a custom codec engine. This allows you to specify how data gets encoded before being sent over the wire and how it gets decoded
  // once it reaches the other side. The codecEngine must be an object which exposes an encode(object) and a decode(encodedData) function.
  // The encode function can return any data type - Commonly a string or a Buffer/ArrayBuffer. The decode function needs to return a JavaScript
  // object which adheres to the SC protocol. The idea of using a custom codec is that it allows you to compress SC packets in any format you like
  // (optimized for any use case) - By decoding these packets back into their original protocol form, SC will be able process them appropriately.
  // Note that if you provide a codecEngine when creating a client socket see 'codecEngine', you will need to make sure that the server uses the
  // same codec by passing the same engine to `worker.scServer.setCodecEngine(codecEngine)` when your SC worker initializes on the server side
  // (see 'setCodecEngine' method here). The default codec engine used by SC is here.
  var codecEngine: js.UndefOr[socketclusterDashServerLib.scserverMod.SCServerNs.SCCodecEngine | scala.Null] = js.undefined
  // (milliseconds)
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  // Whether or not a client automatically disconnects on page unload. If enabled, the client will disconnect when a user navigates away from the page.
  // This can happen when a user closes the tab/window, clicks a link to leave the page, or types a new URL into the address bar. Defaults to true.
  var disconnectOnUnload: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  // Defaults to the current host (read from the URL).
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  // Defaults to true; multiplexing allows you to reuse a socket instead of creating a second socket to the same address.
  var multiplex: js.UndefOr[scala.Boolean] = js.undefined
  // The URL which SC uses to make the initial handshake for the WebSocket. Defaults to '/socketcluster/'.
  var path: js.UndefOr[java.lang.String] = js.undefined
  // Turn on/off per-message deflate compression. If this is true, you need to make sure that this property is also set to true on the server-side.
  //  Note that this option is only relevant when running the client from Node.js. Most modern browsers will automatically use perMessageDeflate so
  // you only need to turn it on from the server-side.
  var perMessageDeflate: js.UndefOr[scala.Boolean] = js.undefined
  // Defaults to 80 if !secure otherwise defaults to 443.
  var port: js.UndefOr[scala.Double] = js.undefined
  // Defaults to null (0 milliseconds); this property affects channel subscription batching; it determines the period in milliseconds for batching
  // multiple subscription requests together. It only affects channels that have the batch option set to true. A value of null or 0 means that all
  // subscribe or unsubscribe requests which were made within the same call stack will be batched together. This property was introduced on the
  // client-side in SC version 8 (both the client and server versions need to be >= 8.0.0). Note that there is also a separate property with the
  // same name which can be configured on the server.
  var pubSubBatchDuration: js.UndefOr[scala.Double] = js.undefined
  // A map of key-value pairs which will be used as query parameters for the initial HTTP handshake which will initiate the WebSocket connection.
  var query: js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  // Set this to false during debugging - Otherwise client connection will fail when using self-signed certificates.
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  // Defaults to false.
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  var subscriptionRetryOptions: js.UndefOr[js.Object | scala.Null] = js.undefined
  // The query parameter name to use to hold the timestamp.
  var timestampParam: js.UndefOr[java.lang.String] = js.undefined
  // Whether or not to add a timestamp to the WebSocket handshake request.
  var timestampRequests: js.UndefOr[scala.Boolean] = js.undefined
}

