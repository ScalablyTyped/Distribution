package typings
package s3rverLib.s3rverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3rverOptions extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var cert: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var configureBuckets: js.UndefOr[js.Array[S3rverBucketConfig]] = js.undefined
  var directory: java.lang.String
  var errorDocument: js.UndefOr[java.lang.String] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var indexDocument: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var resetOnClose: js.UndefOr[scala.Boolean] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object S3rverOptions {
  @scala.inline
  def apply(
    directory: java.lang.String,
    address: java.lang.String = null,
    cert: java.lang.String | nodeLib.Buffer = null,
    configureBuckets: js.Array[S3rverBucketConfig] = null,
    errorDocument: java.lang.String = null,
    hostname: java.lang.String = null,
    indexDocument: java.lang.String = null,
    key: java.lang.String | nodeLib.Buffer = null,
    port: scala.Int | scala.Double = null,
    resetOnClose: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): S3rverOptions = {
    val __obj = js.Dynamic.literal(directory = directory)
    if (address != null) __obj.updateDynamic("address")(address)
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (configureBuckets != null) __obj.updateDynamic("configureBuckets")(configureBuckets)
    if (errorDocument != null) __obj.updateDynamic("errorDocument")(errorDocument)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (indexDocument != null) __obj.updateDynamic("indexDocument")(indexDocument)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnClose)) __obj.updateDynamic("resetOnClose")(resetOnClose)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[S3rverOptions]
  }
}

