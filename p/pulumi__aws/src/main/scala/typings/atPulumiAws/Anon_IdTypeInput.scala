package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdTypeInput extends js.Object {
  var id: Input[String]
  var `type`: Input[String]
}

object Anon_IdTypeInput {
  @scala.inline
  def apply(id: Input[String], `type`: Input[String]): Anon_IdTypeInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdTypeInput]
  }
}

