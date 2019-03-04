package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryType extends js.Object {
  var query: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var `type`: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_QueryType {
  @scala.inline
  def apply(
    query: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_QueryType = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_QueryType]
  }
}

