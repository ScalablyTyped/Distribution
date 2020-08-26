package typings.s3Uploader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3UploaderOptions extends js.Object {
  var awsAccessKeyId: js.UndefOr[String] = js.native
  var awsBucketAcl: js.UndefOr[String] = js.native
  var awsBucketPath: js.UndefOr[String] = js.native
  var awsBucketRegion: js.UndefOr[String] = js.native
  var awsHttpTimeout: js.UndefOr[Double] = js.native
  var awsMaxRetries: js.UndefOr[Double] = js.native
  var awsSecretAccessKey: js.UndefOr[String] = js.native
  var resizeQuality: js.UndefOr[Double] = js.native
  var returnExif: js.UndefOr[Boolean] = js.native
  var tmpDir: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var versions: js.UndefOr[js.Array[S3UploaderVersion]] = js.native
  var workers: js.UndefOr[Double] = js.native
}

object S3UploaderOptions {
  @scala.inline
  def apply(): S3UploaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3UploaderOptions]
  }
  @scala.inline
  implicit class S3UploaderOptionsOps[Self <: S3UploaderOptions] (val x: Self) extends AnyVal {
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
    def setAwsAccessKeyId(value: String): Self = this.set("awsAccessKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsAccessKeyId: Self = this.set("awsAccessKeyId", js.undefined)
    @scala.inline
    def setAwsBucketAcl(value: String): Self = this.set("awsBucketAcl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsBucketAcl: Self = this.set("awsBucketAcl", js.undefined)
    @scala.inline
    def setAwsBucketPath(value: String): Self = this.set("awsBucketPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsBucketPath: Self = this.set("awsBucketPath", js.undefined)
    @scala.inline
    def setAwsBucketRegion(value: String): Self = this.set("awsBucketRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsBucketRegion: Self = this.set("awsBucketRegion", js.undefined)
    @scala.inline
    def setAwsHttpTimeout(value: Double): Self = this.set("awsHttpTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsHttpTimeout: Self = this.set("awsHttpTimeout", js.undefined)
    @scala.inline
    def setAwsMaxRetries(value: Double): Self = this.set("awsMaxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsMaxRetries: Self = this.set("awsMaxRetries", js.undefined)
    @scala.inline
    def setAwsSecretAccessKey(value: String): Self = this.set("awsSecretAccessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsSecretAccessKey: Self = this.set("awsSecretAccessKey", js.undefined)
    @scala.inline
    def setResizeQuality(value: Double): Self = this.set("resizeQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeQuality: Self = this.set("resizeQuality", js.undefined)
    @scala.inline
    def setReturnExif(value: Boolean): Self = this.set("returnExif", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnExif: Self = this.set("returnExif", js.undefined)
    @scala.inline
    def setTmpDir(value: String): Self = this.set("tmpDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTmpDir: Self = this.set("tmpDir", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setVersionsVarargs(value: S3UploaderVersion*): Self = this.set("versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: js.Array[S3UploaderVersion]): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
    @scala.inline
    def setWorkers(value: Double): Self = this.set("workers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkers: Self = this.set("workers", js.undefined)
  }
  
}

