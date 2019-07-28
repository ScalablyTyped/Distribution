package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTypeInput extends js.Object {
  var name: Input[String]
  var `type`: Input[String]
}

object Anon_NameTypeInput {
  @scala.inline
  def apply(name: Input[String], `type`: Input[String]): Anon_NameTypeInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameTypeInput]
  }
}

