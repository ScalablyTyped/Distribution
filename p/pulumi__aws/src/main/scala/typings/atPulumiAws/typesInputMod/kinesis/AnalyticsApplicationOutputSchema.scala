package typings.atPulumiAws.typesInputMod.kinesis

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationOutputSchema extends js.Object {
  var recordFormatType: js.UndefOr[Input[String]] = js.undefined
}

object AnalyticsApplicationOutputSchema {
  @scala.inline
  def apply(recordFormatType: Input[String] = null): AnalyticsApplicationOutputSchema = {
    val __obj = js.Dynamic.literal()
    if (recordFormatType != null) __obj.updateDynamic("recordFormatType")(recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationOutputSchema]
  }
}

