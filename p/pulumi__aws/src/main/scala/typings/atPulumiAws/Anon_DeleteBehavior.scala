package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteBehavior extends js.Object {
  var deleteBehavior: js.UndefOr[String] = js.undefined
  var updateBehavior: js.UndefOr[String] = js.undefined
}

object Anon_DeleteBehavior {
  @scala.inline
  def apply(deleteBehavior: String = null, updateBehavior: String = null): Anon_DeleteBehavior = {
    val __obj = js.Dynamic.literal()
    if (deleteBehavior != null) __obj.updateDynamic("deleteBehavior")(deleteBehavior)
    if (updateBehavior != null) __obj.updateDynamic("updateBehavior")(updateBehavior)
    __obj.asInstanceOf[Anon_DeleteBehavior]
  }
}

