package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FunctionsArray extends js.Object {
  var functions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object Anon_FunctionsArray {
  @scala.inline
  def apply(functions: Input[js.Array[Input[String]]] = null): Anon_FunctionsArray = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FunctionsArray]
  }
}

