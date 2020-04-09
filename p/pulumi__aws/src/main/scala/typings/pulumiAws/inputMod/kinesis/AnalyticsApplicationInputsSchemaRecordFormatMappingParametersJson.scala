package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson extends js.Object {
  /**
    * Path to the top-level parent that contains the records.
    */
  var recordRowPath: Input[String] = js.native
}

object AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson {
  @scala.inline
  def apply(recordRowPath: Input[String]): AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson = {
    val __obj = js.Dynamic.literal(recordRowPath = recordRowPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson]
  }
}

