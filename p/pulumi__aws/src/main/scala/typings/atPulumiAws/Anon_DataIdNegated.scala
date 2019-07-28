package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataIdNegated extends js.Object {
  var dataId: Input[String]
  var negated: Input[Boolean]
  var `type`: Input[String]
}

object Anon_DataIdNegated {
  @scala.inline
  def apply(dataId: Input[String], negated: Input[Boolean], `type`: Input[String]): Anon_DataIdNegated = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataIdNegated]
  }
}

