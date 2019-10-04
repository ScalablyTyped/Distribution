package typings.atPulumiAws.typesInputMod.kinesisNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson extends js.Object {
  var recordRowPath: Input[String]
}

object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson {
  @scala.inline
  def apply(recordRowPath: Input[String]): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson = {
    val __obj = js.Dynamic.literal(recordRowPath = recordRowPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson]
  }
}

