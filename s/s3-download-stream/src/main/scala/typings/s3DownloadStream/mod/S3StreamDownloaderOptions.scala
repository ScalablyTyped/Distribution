package typings.s3DownloadStream.mod

import typings.awsSdk.mod.S3
import typings.awsSdk.s3Mod.GetObjectRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3StreamDownloaderOptions extends js.Object {
  var chunkSize: js.UndefOr[String] = js.native
  var client: S3 = js.native
  var concurrency: js.UndefOr[Double] = js.native
  var params: GetObjectRequest = js.native
}

object S3StreamDownloaderOptions {
  @scala.inline
  def apply(client: S3, params: GetObjectRequest): S3StreamDownloaderOptions = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3StreamDownloaderOptions]
  }
  @scala.inline
  implicit class S3StreamDownloaderOptionsOps[Self <: S3StreamDownloaderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClient(value: S3): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: GetObjectRequest): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setChunkSize(value: String): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    @scala.inline
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrency: Self = this.set("concurrency", js.undefined)
  }
  
}

