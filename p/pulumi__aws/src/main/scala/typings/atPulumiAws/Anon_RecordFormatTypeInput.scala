package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RecordFormatTypeInput extends js.Object {
  var recordFormatType: js.UndefOr[Input[String]] = js.undefined
}

object Anon_RecordFormatTypeInput {
  @scala.inline
  def apply(recordFormatType: Input[String] = null): Anon_RecordFormatTypeInput = {
    val __obj = js.Dynamic.literal()
    if (recordFormatType != null) __obj.updateDynamic("recordFormatType")(recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RecordFormatTypeInput]
  }
}

