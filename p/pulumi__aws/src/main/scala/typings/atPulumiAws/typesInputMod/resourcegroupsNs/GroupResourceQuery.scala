package typings.atPulumiAws.typesInputMod.resourcegroupsNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupResourceQuery extends js.Object {
  var query: Input[String]
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object GroupResourceQuery {
  @scala.inline
  def apply(query: Input[String], `type`: Input[String] = null): GroupResourceQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupResourceQuery]
  }
}

