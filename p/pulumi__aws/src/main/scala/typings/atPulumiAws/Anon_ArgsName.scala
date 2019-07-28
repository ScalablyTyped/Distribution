package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsName extends js.Object {
  var args: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var name: Input[String]
  var path: Input[String]
}

object Anon_ArgsName {
  @scala.inline
  def apply(name: Input[String], path: Input[String], args: Input[js.Array[Input[String]]] = null): Anon_ArgsName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgsName]
  }
}

