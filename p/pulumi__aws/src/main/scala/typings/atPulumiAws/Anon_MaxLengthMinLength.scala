package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxLengthMinLength extends js.Object {
  var maxLength: js.UndefOr[Input[String]] = js.undefined
  var minLength: js.UndefOr[Input[String]] = js.undefined
}

object Anon_MaxLengthMinLength {
  @scala.inline
  def apply(maxLength: Input[String] = null, minLength: Input[String] = null): Anon_MaxLengthMinLength = {
    val __obj = js.Dynamic.literal()
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxLengthMinLength]
  }
}

