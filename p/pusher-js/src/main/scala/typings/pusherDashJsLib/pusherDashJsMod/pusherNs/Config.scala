package typings
package pusherDashJsLib.pusherDashJsMod.pusherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Config extends js.Object {
  /**
           * After this time (in miliseconds) without any messages received from the server,
           * a ping message will be sent to check if the connection is still working.
           * Default value is is supplied by the server, low values will result in unnecessary traffic.
           */
  var activityTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
           * Allows passing additional data to authorizers. Supports query string params and headers (AJAX only).
           * For example, following will pass foo=bar via the query string and baz: boo via headers:
           */
  var auth: js.UndefOr[AuthConfig] = js.undefined
  /**
           * Endpoint on your server that will return the authentication signature needed for private channels.
           */
  var authEndpoint: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Defines how the authentication endpoint, defined using authEndpoint, will be called.
           * There are two options available: ajax and jsonp.
           */
  var authTransport: js.UndefOr[
    pusherDashJsLib.pusherDashJsLibStrings.ajax | pusherDashJsLib.pusherDashJsLibStrings.jsonp
  ] = js.undefined
  /**
           * If you need custom authorization behavior you can provide your own authorizer function as follows:
           */
  var authorizer: js.UndefOr[Authorizer] = js.undefined
  /**
           * Allows connecting to a different datacenter by setting up correct hostnames and ports for the connection.
           */
  var cluster: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Disables stats collection, so that connection metrics are not submitted to Pusher’s servers. These stats
           * are used for internal monitoring only and they do not affect the account stats.
           */
  var disableStats: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Specified which transports must not be used by Pusher to establish a connection.
           * This settings overwrites transports whitelisted via the enabledTransports options.
           * Available transports: ws, wss, xhr_streaming, xhr_polling, sockjs.
           * Additional transports may be added in the future and without adding them to this list, they will be enabled.
           */
  var disabledTransports: js.UndefOr[js.Array[Transport]] = js.undefined
  /**
           * Specifies which transports should be used by Pusher to establish a connection.
           * Useful for applications running in controlled, well-behaving environments.
           * Available transports: ws, wss, xhr_streaming, xhr_polling, sockjs.
           * Additional transports may be added in the future and without adding them to this list, they will be disabled.
           */
  var enabledTransports: js.UndefOr[js.Array[Transport]] = js.undefined
  /**
           * Forces the connection to use encrypted transports.
           */
  var encrypted: js.UndefOr[scala.Boolean] = js.undefined
  var httpHost: js.UndefOr[java.lang.String] = js.undefined
  var httpPort: js.UndefOr[scala.Double] = js.undefined
  var httpsPort: js.UndefOr[scala.Double] = js.undefined
  /**
           * Ignores null origin checks for HTTP fallbacks. Use with care, it should be disabled only if necessary (i.e. PhoneGap).
           */
  var ignoreNullOrigin: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Time before the connection is terminated after sending a ping message.
           * Default is 30000 (30s). Low values will cause false disconnections, if latency is high.
           */
  var pongTimeout: js.UndefOr[scala.Double] = js.undefined
  var wsHost: js.UndefOr[java.lang.String] = js.undefined
  var wsPath: js.UndefOr[java.lang.String] = js.undefined
  var wsPort: js.UndefOr[scala.Double] = js.undefined
  var wssPort: js.UndefOr[scala.Double] = js.undefined
}

