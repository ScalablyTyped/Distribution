package typings.atStorybookAddonDashKnobs.distComponentsTypesObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectTypeState[T] extends js.Object {
  var failed: Boolean
  var json: js.UndefOr[T] = js.undefined
  var value: String
}

object ObjectTypeState {
  @scala.inline
  def apply[T](failed: Boolean, value: String, json: T = null): ObjectTypeState[T] = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeState[T]]
  }
}

