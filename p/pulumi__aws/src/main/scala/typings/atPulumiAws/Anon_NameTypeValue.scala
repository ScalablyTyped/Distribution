package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTypeValue extends js.Object {
  var name: Input[String]
  var `type`: js.UndefOr[Input[String]] = js.undefined
  var value: Input[String]
}

object Anon_NameTypeValue {
  @scala.inline
  def apply(name: Input[String], value: Input[String], `type`: Input[String] = null): Anon_NameTypeValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameTypeValue]
  }
}

