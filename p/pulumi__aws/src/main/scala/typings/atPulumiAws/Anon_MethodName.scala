package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MethodName extends js.Object {
  var method: js.UndefOr[Input[String]] = js.undefined
  var name: js.UndefOr[Input[String]] = js.undefined
  var path: js.UndefOr[Input[String]] = js.undefined
  var statusCode: js.UndefOr[Input[String]] = js.undefined
  var `type`: Input[String]
}

object Anon_MethodName {
  @scala.inline
  def apply(
    `type`: Input[String],
    method: Input[String] = null,
    name: Input[String] = null,
    path: Input[String] = null,
    statusCode: Input[String] = null
  ): Anon_MethodName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MethodName]
  }
}

