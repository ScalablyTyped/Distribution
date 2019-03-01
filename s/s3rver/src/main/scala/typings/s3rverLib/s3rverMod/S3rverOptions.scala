package typings
package s3rverLib.s3rverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3rverOptions extends js.Object {
  var directory: java.lang.String
  var errorDocument: js.UndefOr[java.lang.String] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var indexDocument: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object S3rverOptions {
  @scala.inline
  def apply(
    directory: java.lang.String,
    errorDocument: java.lang.String = null,
    hostname: java.lang.String = null,
    indexDocument: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): S3rverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directory")(directory)
    if (errorDocument != null) __obj.updateDynamic("errorDocument")(errorDocument)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (indexDocument != null) __obj.updateDynamic("indexDocument")(indexDocument)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[S3rverOptions]
  }
}

