package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketFolder extends js.Object {
  var bucketFolder: js.UndefOr[java.lang.String] = js.undefined
  var bucketName: js.UndefOr[java.lang.String] = js.undefined
  var compressionType: js.UndefOr[java.lang.String] = js.undefined
  var csvDelimiter: js.UndefOr[java.lang.String] = js.undefined
  var csvRowDelimiter: js.UndefOr[java.lang.String] = js.undefined
  var externalTableDefinition: js.UndefOr[java.lang.String] = js.undefined
  var serviceAccessRoleArn: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BucketFolder {
  @scala.inline
  def apply(
    bucketFolder: java.lang.String = null,
    bucketName: java.lang.String = null,
    compressionType: java.lang.String = null,
    csvDelimiter: java.lang.String = null,
    csvRowDelimiter: java.lang.String = null,
    externalTableDefinition: java.lang.String = null,
    serviceAccessRoleArn: java.lang.String = null
  ): Anon_BucketFolder = {
    val __obj = js.Dynamic.literal()
    if (bucketFolder != null) __obj.updateDynamic("bucketFolder")(bucketFolder)
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName)
    if (compressionType != null) __obj.updateDynamic("compressionType")(compressionType)
    if (csvDelimiter != null) __obj.updateDynamic("csvDelimiter")(csvDelimiter)
    if (csvRowDelimiter != null) __obj.updateDynamic("csvRowDelimiter")(csvRowDelimiter)
    if (externalTableDefinition != null) __obj.updateDynamic("externalTableDefinition")(externalTableDefinition)
    if (serviceAccessRoleArn != null) __obj.updateDynamic("serviceAccessRoleArn")(serviceAccessRoleArn)
    __obj.asInstanceOf[Anon_BucketFolder]
  }
}

