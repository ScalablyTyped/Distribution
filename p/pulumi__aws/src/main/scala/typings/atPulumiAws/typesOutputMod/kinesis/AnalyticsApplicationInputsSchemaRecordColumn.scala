package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsSchemaRecordColumn extends js.Object {
  var mapping: js.UndefOr[String] = js.native
  /**
    * Name of the Kinesis Analytics Application.
    */
  var name: String = js.native
  var sqlType: String = js.native
}

object AnalyticsApplicationInputsSchemaRecordColumn {
  @scala.inline
  def apply(name: String, sqlType: String, mapping: String = null): AnalyticsApplicationInputsSchemaRecordColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sqlType = sqlType.asInstanceOf[js.Any])
    if (mapping != null) __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordColumn]
  }
}

