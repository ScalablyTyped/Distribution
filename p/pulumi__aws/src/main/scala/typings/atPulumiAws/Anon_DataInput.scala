package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataInput extends js.Object {
  var data: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DataInput {
  @scala.inline
  def apply(data: Input[String] = null): Anon_DataInput = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataInput]
  }
}

