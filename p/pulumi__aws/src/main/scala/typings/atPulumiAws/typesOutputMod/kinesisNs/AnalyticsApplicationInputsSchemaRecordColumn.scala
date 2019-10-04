package typings.atPulumiAws.typesOutputMod.kinesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationInputsSchemaRecordColumn extends js.Object {
  var mapping: js.UndefOr[String] = js.undefined
  /**
    * Name of the Kinesis Analytics Application.
    */
  var name: String
  var sqlType: String
}

object AnalyticsApplicationInputsSchemaRecordColumn {
  @scala.inline
  def apply(name: String, sqlType: String, mapping: String = null): AnalyticsApplicationInputsSchemaRecordColumn = {
    val __obj = js.Dynamic.literal(name = name, sqlType = sqlType)
    if (mapping != null) __obj.updateDynamic("mapping")(mapping)
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordColumn]
  }
}

