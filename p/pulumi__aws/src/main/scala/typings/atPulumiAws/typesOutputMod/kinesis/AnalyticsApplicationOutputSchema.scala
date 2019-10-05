package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationOutputSchema extends js.Object {
  var recordFormatType: js.UndefOr[String] = js.undefined
}

object AnalyticsApplicationOutputSchema {
  @scala.inline
  def apply(recordFormatType: String = null): AnalyticsApplicationOutputSchema = {
    val __obj = js.Dynamic.literal()
    if (recordFormatType != null) __obj.updateDynamic("recordFormatType")(recordFormatType)
    __obj.asInstanceOf[AnalyticsApplicationOutputSchema]
  }
}

