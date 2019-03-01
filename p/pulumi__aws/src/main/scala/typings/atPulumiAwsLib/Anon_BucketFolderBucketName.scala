package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketFolderBucketName extends js.Object {
  var bucketFolder: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var bucketName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var compressionType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var csvDelimiter: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var csvRowDelimiter: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var externalTableDefinition: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var serviceAccessRoleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_BucketFolderBucketName {
  @scala.inline
  def apply(
    bucketFolder: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    bucketName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    compressionType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    csvDelimiter: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    csvRowDelimiter: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    externalTableDefinition: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    serviceAccessRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_BucketFolderBucketName = {
    val __obj = js.Dynamic.literal()
    if (bucketFolder != null) __obj.updateDynamic("bucketFolder")(bucketFolder.asInstanceOf[js.Any])
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    if (compressionType != null) __obj.updateDynamic("compressionType")(compressionType.asInstanceOf[js.Any])
    if (csvDelimiter != null) __obj.updateDynamic("csvDelimiter")(csvDelimiter.asInstanceOf[js.Any])
    if (csvRowDelimiter != null) __obj.updateDynamic("csvRowDelimiter")(csvRowDelimiter.asInstanceOf[js.Any])
    if (externalTableDefinition != null) __obj.updateDynamic("externalTableDefinition")(externalTableDefinition.asInstanceOf[js.Any])
    if (serviceAccessRoleArn != null) __obj.updateDynamic("serviceAccessRoleArn")(serviceAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketFolderBucketName]
  }
}

