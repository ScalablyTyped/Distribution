package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplyMethodName extends js.Object {
  var applyMethod: js.UndefOr[Input[String]] = js.undefined
  var name: Input[String]
  var value: Input[String]
}

object Anon_ApplyMethodName {
  @scala.inline
  def apply(name: Input[String], value: Input[String], applyMethod: Input[String] = null): Anon_ApplyMethodName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (applyMethod != null) __obj.updateDynamic("applyMethod")(applyMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ApplyMethodName]
  }
}

