package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Connection Pool options
     *
     * @see Options
     */

trait PoolOptions extends js.Object {
  /**
           * The maximum time, in milliseconds, that pool will try to get connection before throwing error
           */
  var acquire: js.UndefOr[scala.Double] = js.undefined
  /*
           * The time interval, in milliseconds, for evicting stale connections
           */
  var evict: js.UndefOr[scala.Double] = js.undefined
  /**
           * The maximum time, in milliseconds, that a connection can be idle before being released.
           */
  var idle: js.UndefOr[scala.Double] = js.undefined
  /**
           * Maximum connections of the pool
           */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
           * Minimum connections of the pool
           */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
           * A function that validates a connection. Called with client. The default function checks that client is an
           * object, and that its state is not disconnected.
           */
  var validate: js.UndefOr[js.Function1[/* client */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
}

