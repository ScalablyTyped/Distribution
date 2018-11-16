package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Connection options.
     *
     * See: https://rethinkdb.com/api/javascript/connect/
     */

trait ConnectionOptions extends js.Object {
  /** The default database (default `test`) */
  var db: js.UndefOr[java.lang.String] = js.undefined
  /** The host to connect to (default `localhost`) */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** The password for the user account to connect as (default `''`, empty) */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** The port to connect on (default `28015`) */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
           * A hash of options to support SSL connections (default `null`). Currently,
           * there is only one option available, and if the `ssl` option is specified,
           * this key is required.
           */
  var ssl: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
  /** Timeout period in seconds for the connection to be opened (default `20`) */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** The user account to connect as (default `admin`) */
  var user: js.UndefOr[java.lang.String] = js.undefined
}

