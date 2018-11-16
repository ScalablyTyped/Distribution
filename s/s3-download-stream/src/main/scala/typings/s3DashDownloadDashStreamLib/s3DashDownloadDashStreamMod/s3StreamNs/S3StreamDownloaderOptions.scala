package typings
package s3DashDownloadDashStreamLib.s3DashDownloadDashStreamMod.s3StreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait S3StreamDownloaderOptions extends js.Object {
  var chunkSize: js.UndefOr[java.lang.String] = js.undefined
  var client: awsDashSdkLib.awsDashSdkMod.S3
  var concurrency: js.UndefOr[scala.Double] = js.undefined
  var params: awsDashSdkLib.clientsS3Mod.S3Ns.GetObjectRequest
}

