package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassAttributes[T] extends Attributes {
  var ref: js.UndefOr[LegacyRef[T]] = js.undefined
}

object ClassAttributes {
  @scala.inline
  def apply[T](key: Key = null, ref: js.UndefOr[Null | LegacyRef[T]] = js.undefined): ClassAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassAttributes[T]]
  }
}

