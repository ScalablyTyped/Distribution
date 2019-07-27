package typings
package s3DashDownloadDashStreamLib.s3DashDownloadDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3StreamDownloaderOptions extends js.Object {
  var chunkSize: js.UndefOr[java.lang.String] = js.undefined
  var client: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify S3 */ js.Any
  var concurrency: js.UndefOr[scala.Double] = js.undefined
  var params: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify S3.GetObjectRequest */ js.Any
}

object S3StreamDownloaderOptions {
  @scala.inline
  def apply(
    client: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify S3 */ js.Any,
    params: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify S3.GetObjectRequest */ js.Any,
    chunkSize: java.lang.String = null,
    concurrency: scala.Int | scala.Double = null
  ): S3StreamDownloaderOptions = {
    val __obj = js.Dynamic.literal(client = client, params = params)
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize)
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3StreamDownloaderOptions]
  }
}

