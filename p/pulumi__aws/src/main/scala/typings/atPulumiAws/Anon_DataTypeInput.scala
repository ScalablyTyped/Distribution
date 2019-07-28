package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypeInput extends js.Object {
  var data: js.UndefOr[Input[String]] = js.undefined
  var `type`: Input[String]
}

object Anon_DataTypeInput {
  @scala.inline
  def apply(`type`: Input[String], data: Input[String] = null): Anon_DataTypeInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataTypeInput]
  }
}

