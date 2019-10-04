package typings.atPulumiAws.typesOutputMod.dmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointS3Settings extends js.Object {
  var bucketFolder: js.UndefOr[String] = js.undefined
  var bucketName: js.UndefOr[String] = js.undefined
  var compressionType: js.UndefOr[String] = js.undefined
  var csvDelimiter: js.UndefOr[String] = js.undefined
  var csvRowDelimiter: js.UndefOr[String] = js.undefined
  var externalTableDefinition: js.UndefOr[String] = js.undefined
  var serviceAccessRoleArn: js.UndefOr[String] = js.undefined
}

object EndpointS3Settings {
  @scala.inline
  def apply(
    bucketFolder: String = null,
    bucketName: String = null,
    compressionType: String = null,
    csvDelimiter: String = null,
    csvRowDelimiter: String = null,
    externalTableDefinition: String = null,
    serviceAccessRoleArn: String = null
  ): EndpointS3Settings = {
    val __obj = js.Dynamic.literal()
    if (bucketFolder != null) __obj.updateDynamic("bucketFolder")(bucketFolder)
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName)
    if (compressionType != null) __obj.updateDynamic("compressionType")(compressionType)
    if (csvDelimiter != null) __obj.updateDynamic("csvDelimiter")(csvDelimiter)
    if (csvRowDelimiter != null) __obj.updateDynamic("csvRowDelimiter")(csvRowDelimiter)
    if (externalTableDefinition != null) __obj.updateDynamic("externalTableDefinition")(externalTableDefinition)
    if (serviceAccessRoleArn != null) __obj.updateDynamic("serviceAccessRoleArn")(serviceAccessRoleArn)
    __obj.asInstanceOf[EndpointS3Settings]
  }
}

