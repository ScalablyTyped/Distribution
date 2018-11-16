package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SFTPStreamConfig extends js.Object {
  /**
       * Set this to a function that receives a single string argument to get detailed (local) debug information.
       */
  var debug: js.UndefOr[js.Function1[/* information */ java.lang.String, _]] = js.undefined
  /**
       * This is the highWaterMark to use for the stream.
       */
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
  /**
       * Set to true to create an instance in server mode.
       */
  var server: js.UndefOr[scala.Boolean] = js.undefined
}

