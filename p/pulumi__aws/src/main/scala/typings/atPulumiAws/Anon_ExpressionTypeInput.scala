package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpressionTypeInput extends js.Object {
  var expression: js.UndefOr[Input[String]] = js.undefined
  var `type`: Input[String]
}

object Anon_ExpressionTypeInput {
  @scala.inline
  def apply(`type`: Input[String], expression: Input[String] = null): Anon_ExpressionTypeInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExpressionTypeInput]
  }
}

