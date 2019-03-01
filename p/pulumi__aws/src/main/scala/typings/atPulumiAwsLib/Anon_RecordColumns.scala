package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RecordColumns extends js.Object {
  var recordColumns: js.Array[Anon_Mapping]
  var recordEncoding: js.UndefOr[java.lang.String] = js.undefined
  var recordFormat: Anon_MappingParameters
}

object Anon_RecordColumns {
  @scala.inline
  def apply(
    recordColumns: js.Array[Anon_Mapping],
    recordFormat: Anon_MappingParameters,
    recordEncoding: java.lang.String = null
  ): Anon_RecordColumns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("recordColumns")(recordColumns)
    __obj.updateDynamic("recordFormat")(recordFormat)
    if (recordEncoding != null) __obj.updateDynamic("recordEncoding")(recordEncoding)
    __obj.asInstanceOf[Anon_RecordColumns]
  }
}

