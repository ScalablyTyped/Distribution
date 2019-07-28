package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RecordColumnsRecordEncoding extends js.Object {
  var recordColumns: Input[js.Array[Input[Anon_MappingName]]]
  var recordEncoding: js.UndefOr[Input[String]] = js.undefined
  var recordFormat: Input[Anon_MappingParametersRecordFormatType]
}

object Anon_RecordColumnsRecordEncoding {
  @scala.inline
  def apply(
    recordColumns: Input[js.Array[Input[Anon_MappingName]]],
    recordFormat: Input[Anon_MappingParametersRecordFormatType],
    recordEncoding: Input[String] = null
  ): Anon_RecordColumnsRecordEncoding = {
    val __obj = js.Dynamic.literal(recordColumns = recordColumns.asInstanceOf[js.Any], recordFormat = recordFormat.asInstanceOf[js.Any])
    if (recordEncoding != null) __obj.updateDynamic("recordEncoding")(recordEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RecordColumnsRecordEncoding]
  }
}

