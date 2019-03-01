package typings
package socketDotIoDashRedisLib.socketDotIoDashRedisMod.SocketIORedisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Options to pass to the redis server when creating it
	 */
trait SocketIORedisOptions extends js.Object {
  /**
    * The optional password to connect to redis on
    */
  var auth_pass: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  		 * The optional host to connect to redis on
  		 * @default localhost
  		 */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The optional name of the key to pub/sub events on as prefix
  		 * @default socket.io
  		 */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The optional port to connect to redis on
  		 * @default 6379
  		 */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * The optional redis client to publish events on
  		 */
  var pubClient: js.UndefOr[js.Any] = js.undefined
  /**
  		 * The optional redis client to subscribe to events on
  		 */
  var subClient: js.UndefOr[js.Any] = js.undefined
}

object SocketIORedisOptions {
  @scala.inline
  def apply(
    auth_pass: scala.Double | java.lang.String = null,
    host: java.lang.String = null,
    key: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    pubClient: js.Any = null,
    subClient: js.Any = null
  ): SocketIORedisOptions = {
    val __obj = js.Dynamic.literal()
    if (auth_pass != null) __obj.updateDynamic("auth_pass")(auth_pass.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (key != null) __obj.updateDynamic("key")(key)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (pubClient != null) __obj.updateDynamic("pubClient")(pubClient)
    if (subClient != null) __obj.updateDynamic("subClient")(subClient)
    __obj.asInstanceOf[SocketIORedisOptions]
  }
}

