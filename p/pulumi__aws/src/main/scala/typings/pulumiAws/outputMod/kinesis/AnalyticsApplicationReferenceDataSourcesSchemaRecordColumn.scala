package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn extends js.Object {
  /**
    * The Mapping reference to the data element.
    */
  var mapping: js.UndefOr[String] = js.native
  /**
    * Name of the column.
    */
  var name: String = js.native
  /**
    * The SQL Type of the column.
    */
  var sqlType: String = js.native
}

object AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn {
  @scala.inline
  def apply(name: String, sqlType: String, mapping: String = null): AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sqlType = sqlType.asInstanceOf[js.Any])
    if (mapping != null) __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn]
  }
}

