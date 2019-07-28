package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MappingParameters extends js.Object {
  var mappingParameters: js.UndefOr[Anon_Csv] = js.undefined
  var recordFormatType: String
}

object Anon_MappingParameters {
  @scala.inline
  def apply(recordFormatType: String, mappingParameters: Anon_Csv = null): Anon_MappingParameters = {
    val __obj = js.Dynamic.literal(recordFormatType = recordFormatType)
    if (mappingParameters != null) __obj.updateDynamic("mappingParameters")(mappingParameters)
    __obj.asInstanceOf[Anon_MappingParameters]
  }
}

