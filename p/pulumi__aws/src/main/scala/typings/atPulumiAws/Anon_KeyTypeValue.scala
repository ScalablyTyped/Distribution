package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyTypeValue extends js.Object {
  var key: Input[String]
  var `type`: Input[String]
  var value: Input[String]
}

object Anon_KeyTypeValue {
  @scala.inline
  def apply(key: Input[String], `type`: Input[String], value: Input[String]): Anon_KeyTypeValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyTypeValue]
  }
}

