package typings.s3rver.s3rverMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3rverOptions extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var cert: js.UndefOr[String | Buffer] = js.undefined
  var configureBuckets: js.UndefOr[js.Array[S3rverBucketConfig]] = js.undefined
  var directory: String
  var errorDocument: js.UndefOr[String] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var indexDocument: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String | Buffer] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var resetOnClose: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
}

object S3rverOptions {
  @scala.inline
  def apply(
    directory: String,
    address: String = null,
    cert: String | Buffer = null,
    configureBuckets: js.Array[S3rverBucketConfig] = null,
    errorDocument: String = null,
    hostname: String = null,
    indexDocument: String = null,
    key: String | Buffer = null,
    port: Int | Double = null,
    resetOnClose: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined
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

