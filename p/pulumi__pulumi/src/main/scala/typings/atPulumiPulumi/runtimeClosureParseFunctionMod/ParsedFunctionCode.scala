package typings.atPulumiPulumi.runtimeClosureParseFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedFunctionCode extends js.Object {
  var funcExprWithName: js.UndefOr[String] = js.undefined
  var funcExprWithoutName: String
  var functionDeclarationName: js.UndefOr[String] = js.undefined
  var isArrowFunction: Boolean
}

object ParsedFunctionCode {
  @scala.inline
  def apply(
    funcExprWithoutName: String,
    isArrowFunction: Boolean,
    funcExprWithName: String = null,
    functionDeclarationName: String = null
  ): ParsedFunctionCode = {
    val __obj = js.Dynamic.literal(funcExprWithoutName = funcExprWithoutName.asInstanceOf[js.Any], isArrowFunction = isArrowFunction.asInstanceOf[js.Any])
    if (funcExprWithName != null) __obj.updateDynamic("funcExprWithName")(funcExprWithName.asInstanceOf[js.Any])
    if (functionDeclarationName != null) __obj.updateDynamic("functionDeclarationName")(functionDeclarationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedFunctionCode]
  }
}

