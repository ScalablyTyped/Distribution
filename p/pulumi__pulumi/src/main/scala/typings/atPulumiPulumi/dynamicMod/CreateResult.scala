package typings.atPulumiPulumi.dynamicMod

import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResult extends js.Object {
  /**
    * The ID of the created resource.
    */
  val id: ID
  /**
    * Any properties that were computed during creation.
    */
  val outs: js.UndefOr[js.Any] = js.undefined
}

object CreateResult {
  @scala.inline
  def apply(id: ID, outs: js.Any = null): CreateResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (outs != null) __obj.updateDynamic("outs")(outs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResult]
  }
}

