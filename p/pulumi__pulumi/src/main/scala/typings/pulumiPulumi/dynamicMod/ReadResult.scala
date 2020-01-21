package typings.pulumiPulumi.dynamicMod

import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadResult extends js.Object {
  /**
    * The ID of the resource ready back (or blank if missing).
    */
  val id: js.UndefOr[ID] = js.undefined
  /**
    * The current property state read from the live environment.
    */
  val props: js.UndefOr[js.Any] = js.undefined
}

object ReadResult {
  @scala.inline
  def apply(id: ID = null, props: js.Any = null): ReadResult = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadResult]
  }
}

