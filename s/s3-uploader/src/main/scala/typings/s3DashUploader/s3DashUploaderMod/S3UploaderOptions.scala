package typings.s3DashUploader.s3DashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3UploaderOptions extends js.Object {
  var awsAccessKeyId: js.UndefOr[String] = js.undefined
  var awsBucketAcl: js.UndefOr[String] = js.undefined
  var awsBucketPath: js.UndefOr[String] = js.undefined
  var awsBucketRegion: js.UndefOr[String] = js.undefined
  var awsHttpTimeout: js.UndefOr[Double] = js.undefined
  var awsMaxRetries: js.UndefOr[Double] = js.undefined
  var awsSecretAccessKey: js.UndefOr[String] = js.undefined
  var resizeQuality: js.UndefOr[Double] = js.undefined
  var returnExif: js.UndefOr[Boolean] = js.undefined
  var tmpDir: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var versions: js.UndefOr[js.Array[S3UploaderVersion]] = js.undefined
  var workers: js.UndefOr[Double] = js.undefined
}

object S3UploaderOptions {
  @scala.inline
  def apply(
    awsAccessKeyId: String = null,
    awsBucketAcl: String = null,
    awsBucketPath: String = null,
    awsBucketRegion: String = null,
    awsHttpTimeout: Int | Double = null,
    awsMaxRetries: Int | Double = null,
    awsSecretAccessKey: String = null,
    resizeQuality: Int | Double = null,
    returnExif: js.UndefOr[Boolean] = js.undefined,
    tmpDir: String = null,
    url: String = null,
    versions: js.Array[S3UploaderVersion] = null,
    workers: Int | Double = null
  ): S3UploaderOptions = {
    val __obj = js.Dynamic.literal()
    if (awsAccessKeyId != null) __obj.updateDynamic("awsAccessKeyId")(awsAccessKeyId)
    if (awsBucketAcl != null) __obj.updateDynamic("awsBucketAcl")(awsBucketAcl)
    if (awsBucketPath != null) __obj.updateDynamic("awsBucketPath")(awsBucketPath)
    if (awsBucketRegion != null) __obj.updateDynamic("awsBucketRegion")(awsBucketRegion)
    if (awsHttpTimeout != null) __obj.updateDynamic("awsHttpTimeout")(awsHttpTimeout.asInstanceOf[js.Any])
    if (awsMaxRetries != null) __obj.updateDynamic("awsMaxRetries")(awsMaxRetries.asInstanceOf[js.Any])
    if (awsSecretAccessKey != null) __obj.updateDynamic("awsSecretAccessKey")(awsSecretAccessKey)
    if (resizeQuality != null) __obj.updateDynamic("resizeQuality")(resizeQuality.asInstanceOf[js.Any])
    if (!js.isUndefined(returnExif)) __obj.updateDynamic("returnExif")(returnExif)
    if (tmpDir != null) __obj.updateDynamic("tmpDir")(tmpDir)
    if (url != null) __obj.updateDynamic("url")(url)
    if (versions != null) __obj.updateDynamic("versions")(versions)
    if (workers != null) __obj.updateDynamic("workers")(workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3UploaderOptions]
  }
}

