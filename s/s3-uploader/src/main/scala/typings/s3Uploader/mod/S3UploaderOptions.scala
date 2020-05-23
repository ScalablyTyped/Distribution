package typings.s3Uploader.mod

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
    awsHttpTimeout: js.UndefOr[Double] = js.undefined,
    awsMaxRetries: js.UndefOr[Double] = js.undefined,
    awsSecretAccessKey: String = null,
    resizeQuality: js.UndefOr[Double] = js.undefined,
    returnExif: js.UndefOr[Boolean] = js.undefined,
    tmpDir: String = null,
    url: String = null,
    versions: js.Array[S3UploaderVersion] = null,
    workers: js.UndefOr[Double] = js.undefined
  ): S3UploaderOptions = {
    val __obj = js.Dynamic.literal()
    if (awsAccessKeyId != null) __obj.updateDynamic("awsAccessKeyId")(awsAccessKeyId.asInstanceOf[js.Any])
    if (awsBucketAcl != null) __obj.updateDynamic("awsBucketAcl")(awsBucketAcl.asInstanceOf[js.Any])
    if (awsBucketPath != null) __obj.updateDynamic("awsBucketPath")(awsBucketPath.asInstanceOf[js.Any])
    if (awsBucketRegion != null) __obj.updateDynamic("awsBucketRegion")(awsBucketRegion.asInstanceOf[js.Any])
    if (!js.isUndefined(awsHttpTimeout)) __obj.updateDynamic("awsHttpTimeout")(awsHttpTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(awsMaxRetries)) __obj.updateDynamic("awsMaxRetries")(awsMaxRetries.get.asInstanceOf[js.Any])
    if (awsSecretAccessKey != null) __obj.updateDynamic("awsSecretAccessKey")(awsSecretAccessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeQuality)) __obj.updateDynamic("resizeQuality")(resizeQuality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnExif)) __obj.updateDynamic("returnExif")(returnExif.get.asInstanceOf[js.Any])
    if (tmpDir != null) __obj.updateDynamic("tmpDir")(tmpDir.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    if (!js.isUndefined(workers)) __obj.updateDynamic("workers")(workers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3UploaderOptions]
  }
}

