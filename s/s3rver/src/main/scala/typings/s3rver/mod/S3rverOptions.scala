package typings.s3rver.mod

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
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (configureBuckets != null) __obj.updateDynamic("configureBuckets")(configureBuckets.asInstanceOf[js.Any])
    if (errorDocument != null) __obj.updateDynamic("errorDocument")(errorDocument.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (indexDocument != null) __obj.updateDynamic("indexDocument")(indexDocument.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnClose)) __obj.updateDynamic("resetOnClose")(resetOnClose.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3rverOptions]
  }
}

