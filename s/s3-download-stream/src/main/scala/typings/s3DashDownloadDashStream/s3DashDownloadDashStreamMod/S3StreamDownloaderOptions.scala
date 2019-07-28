package typings.s3DashDownloadDashStream.s3DashDownloadDashStreamMod

import typings.awsDashSdk.awsDashSdkMod.S3
import typings.awsDashSdk.clientsS3Mod.GetObjectRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3StreamDownloaderOptions extends js.Object {
  var chunkSize: js.UndefOr[String] = js.undefined
  var client: S3
  var concurrency: js.UndefOr[Double] = js.undefined
  var params: GetObjectRequest
}

object S3StreamDownloaderOptions {
  @scala.inline
  def apply(client: S3, params: GetObjectRequest, chunkSize: String = null, concurrency: Int | Double = null): S3StreamDownloaderOptions = {
    val __obj = js.Dynamic.literal(client = client, params = params)
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize)
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3StreamDownloaderOptions]
  }
}

