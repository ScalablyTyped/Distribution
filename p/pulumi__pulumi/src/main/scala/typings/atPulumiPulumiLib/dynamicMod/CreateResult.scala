package typings
package atPulumiPulumiLib.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResult extends js.Object {
  /**
    * The ID of the created resource.
    */
  val id: atPulumiPulumiLib.resourceMod.ID
  /**
    * Any properties that were computed during creation.
    */
  val outs: js.UndefOr[js.Any] = js.undefined
}

object CreateResult {
  @scala.inline
  def apply(id: atPulumiPulumiLib.resourceMod.ID, outs: js.Any = null): CreateResult = {
    val __obj = js.Dynamic.literal(id = id)
    if (outs != null) __obj.updateDynamic("outs")(outs)
    __obj.asInstanceOf[CreateResult]
  }
}

