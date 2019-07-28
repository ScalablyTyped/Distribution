package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StatusType extends js.Object {
  var status: js.UndefOr[Input[String]] = js.undefined
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object Anon_StatusType {
  @scala.inline
  def apply(status: Input[String] = null, `type`: Input[String] = null): Anon_StatusType = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_StatusType]
  }
}

