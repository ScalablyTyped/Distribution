package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn extends js.Object {
  var mapping: js.UndefOr[String] = js.undefined
  /**
    * Name of the Kinesis Analytics Application.
    */
  var name: String
  var sqlType: String
}

object AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn {
  @scala.inline
  def apply(name: String, sqlType: String, mapping: String = null): AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn = {
    val __obj = js.Dynamic.literal(name = name, sqlType = sqlType)
    if (mapping != null) __obj.updateDynamic("mapping")(mapping)
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn]
  }
}

