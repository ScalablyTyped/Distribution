package typings.atPulumiAws.typesInputMod.kinesis

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn extends js.Object {
  var mapping: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the Kinesis Analytics Application.
    */
  var name: Input[String]
  var sqlType: Input[String]
}

object AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn {
  @scala.inline
  def apply(name: Input[String], sqlType: Input[String], mapping: Input[String] = null): AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sqlType = sqlType.asInstanceOf[js.Any])
    if (mapping != null) __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn]
  }
}

