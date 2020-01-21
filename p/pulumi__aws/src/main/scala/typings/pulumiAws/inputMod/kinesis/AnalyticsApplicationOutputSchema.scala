package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationOutputSchema extends js.Object {
  var recordFormatType: js.UndefOr[Input[String]] = js.native
}

object AnalyticsApplicationOutputSchema {
  @scala.inline
  def apply(recordFormatType: Input[String] = null): AnalyticsApplicationOutputSchema = {
    val __obj = js.Dynamic.literal()
    if (recordFormatType != null) __obj.updateDynamic("recordFormatType")(recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationOutputSchema]
  }
}

