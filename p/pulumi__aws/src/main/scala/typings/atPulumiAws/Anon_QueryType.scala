package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryType extends js.Object {
  var query: Input[String]
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object Anon_QueryType {
  @scala.inline
  def apply(query: Input[String], `type`: Input[String] = null): Anon_QueryType = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_QueryType]
  }
}

