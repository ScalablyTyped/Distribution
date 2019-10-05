package typings.atPulumiAws.typesInputMod.dms

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointS3Settings extends js.Object {
  var bucketFolder: js.UndefOr[Input[String]] = js.undefined
  var bucketName: js.UndefOr[Input[String]] = js.undefined
  var compressionType: js.UndefOr[Input[String]] = js.undefined
  var csvDelimiter: js.UndefOr[Input[String]] = js.undefined
  var csvRowDelimiter: js.UndefOr[Input[String]] = js.undefined
  var externalTableDefinition: js.UndefOr[Input[String]] = js.undefined
  var serviceAccessRoleArn: js.UndefOr[Input[String]] = js.undefined
}

object EndpointS3Settings {
  @scala.inline
  def apply(
    bucketFolder: Input[String] = null,
    bucketName: Input[String] = null,
    compressionType: Input[String] = null,
    csvDelimiter: Input[String] = null,
    csvRowDelimiter: Input[String] = null,
    externalTableDefinition: Input[String] = null,
    serviceAccessRoleArn: Input[String] = null
  ): EndpointS3Settings = {
    val __obj = js.Dynamic.literal()
    if (bucketFolder != null) __obj.updateDynamic("bucketFolder")(bucketFolder.asInstanceOf[js.Any])
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    if (compressionType != null) __obj.updateDynamic("compressionType")(compressionType.asInstanceOf[js.Any])
    if (csvDelimiter != null) __obj.updateDynamic("csvDelimiter")(csvDelimiter.asInstanceOf[js.Any])
    if (csvRowDelimiter != null) __obj.updateDynamic("csvRowDelimiter")(csvRowDelimiter.asInstanceOf[js.Any])
    if (externalTableDefinition != null) __obj.updateDynamic("externalTableDefinition")(externalTableDefinition.asInstanceOf[js.Any])
    if (serviceAccessRoleArn != null) __obj.updateDynamic("serviceAccessRoleArn")(serviceAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointS3Settings]
  }
}

