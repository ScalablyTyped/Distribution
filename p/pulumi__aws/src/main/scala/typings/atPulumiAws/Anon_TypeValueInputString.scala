package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeValueInputString extends js.Object {
  var `type`: Input[String]
  var value: Input[String]
}

object Anon_TypeValueInputString {
  @scala.inline
  def apply(`type`: Input[String], value: Input[String]): Anon_TypeValueInputString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeValueInputString]
  }
}

