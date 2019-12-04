package typings.atPulumiPulumi.runtimeClosureParseFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedFunction extends ParsedFunctionCode {
  var capturedVariables: CapturedVariables
  var usesNonLexicalThis: Boolean
}

object ParsedFunction {
  @scala.inline
  def apply(
    capturedVariables: CapturedVariables,
    funcExprWithoutName: String,
    isArrowFunction: Boolean,
    usesNonLexicalThis: Boolean,
    funcExprWithName: String = null,
    functionDeclarationName: String = null
  ): ParsedFunction = {
    val __obj = js.Dynamic.literal(capturedVariables = capturedVariables.asInstanceOf[js.Any], funcExprWithoutName = funcExprWithoutName.asInstanceOf[js.Any], isArrowFunction = isArrowFunction.asInstanceOf[js.Any], usesNonLexicalThis = usesNonLexicalThis.asInstanceOf[js.Any])
    if (funcExprWithName != null) __obj.updateDynamic("funcExprWithName")(funcExprWithName.asInstanceOf[js.Any])
    if (functionDeclarationName != null) __obj.updateDynamic("functionDeclarationName")(functionDeclarationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedFunction]
  }
}

