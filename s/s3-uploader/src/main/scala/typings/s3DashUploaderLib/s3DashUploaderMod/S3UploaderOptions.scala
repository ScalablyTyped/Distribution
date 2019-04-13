package typings
package s3DashUploaderLib.s3DashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3UploaderOptions extends js.Object {
  var awsAccessKeyId: js.UndefOr[java.lang.String] = js.undefined
  var awsBucketAcl: js.UndefOr[java.lang.String] = js.undefined
  var awsBucketPath: js.UndefOr[java.lang.String] = js.undefined
  var awsBucketRegion: js.UndefOr[java.lang.String] = js.undefined
  var awsHttpTimeout: js.UndefOr[scala.Double] = js.undefined
  var awsMaxRetries: js.UndefOr[scala.Double] = js.undefined
  var awsSecretAccessKey: js.UndefOr[java.lang.String] = js.undefined
  var resizeQuality: js.UndefOr[scala.Double] = js.undefined
  var returnExif: js.UndefOr[scala.Boolean] = js.undefined
  var tmpDir: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var versions: js.UndefOr[js.Array[S3UploaderVersion]] = js.undefined
  var workers: js.UndefOr[scala.Double] = js.undefined
}

object S3UploaderOptions {
  @scala.inline
  def apply(
    awsAccessKeyId: java.lang.String = null,
    awsBucketAcl: java.lang.String = null,
    awsBucketPath: java.lang.String = null,
    awsBucketRegion: java.lang.String = null,
    awsHttpTimeout: scala.Int | scala.Double = null,
    awsMaxRetries: scala.Int | scala.Double = null,
    awsSecretAccessKey: java.lang.String = null,
    resizeQuality: scala.Int | scala.Double = null,
    returnExif: js.UndefOr[scala.Boolean] = js.undefined,
    tmpDir: java.lang.String = null,
    url: java.lang.String = null,
    versions: js.Array[S3UploaderVersion] = null,
    workers: scala.Int | scala.Double = null
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

