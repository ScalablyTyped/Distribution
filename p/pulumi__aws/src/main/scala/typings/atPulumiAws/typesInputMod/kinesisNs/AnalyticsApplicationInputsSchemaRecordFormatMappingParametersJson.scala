package typings.atPulumiAws.typesInputMod.kinesisNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson extends js.Object {
  var recordRowPath: Input[String]
}

object AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson {
  @scala.inline
  def apply(recordRowPath: Input[String]): AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson = {
    val __obj = js.Dynamic.literal(recordRowPath = recordRowPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson]
  }
}

