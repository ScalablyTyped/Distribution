package typings.atPulumiPulumi.runtimeClosureCreateClosureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyInfoAndValue extends js.Object {
  var entry: Entry
  var info: js.UndefOr[PropertyInfo] = js.undefined
}

object PropertyInfoAndValue {
  @scala.inline
  def apply(entry: Entry, info: PropertyInfo = null): PropertyInfoAndValue = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyInfoAndValue]
  }
}

