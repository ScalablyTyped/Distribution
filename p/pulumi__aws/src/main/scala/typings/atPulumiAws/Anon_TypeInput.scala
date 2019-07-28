package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeInput extends js.Object {
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object Anon_TypeInput {
  @scala.inline
  def apply(`type`: Input[String] = null): Anon_TypeInput = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeInput]
  }
}

