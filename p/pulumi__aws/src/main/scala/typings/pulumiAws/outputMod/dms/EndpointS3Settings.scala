package typings.pulumiAws.outputMod.dms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointS3Settings extends js.Object {
  var bucketFolder: js.UndefOr[String] = js.native
  var bucketName: js.UndefOr[String] = js.native
  var compressionType: js.UndefOr[String] = js.native
  var csvDelimiter: js.UndefOr[String] = js.native
  var csvRowDelimiter: js.UndefOr[String] = js.native
  var externalTableDefinition: js.UndefOr[String] = js.native
  var serviceAccessRoleArn: js.UndefOr[String] = js.native
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

