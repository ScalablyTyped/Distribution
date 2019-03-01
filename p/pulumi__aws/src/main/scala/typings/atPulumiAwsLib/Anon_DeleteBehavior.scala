package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteBehavior extends js.Object {
  var deleteBehavior: js.UndefOr[java.lang.String] = js.undefined
  var updateBehavior: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DeleteBehavior {
  @scala.inline
  def apply(deleteBehavior: java.lang.String = null, updateBehavior: java.lang.String = null): Anon_DeleteBehavior = {
    val __obj = js.Dynamic.literal()
    if (deleteBehavior != null) __obj.updateDynamic("deleteBehavior")(deleteBehavior)
    if (updateBehavior != null) __obj.updateDynamic("updateBehavior")(updateBehavior)
    __obj.asInstanceOf[Anon_DeleteBehavior]
  }
}

