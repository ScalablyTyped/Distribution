package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefAttributes[T] extends Attributes {
  var ref: js.UndefOr[Ref[T]] = js.undefined
}

object RefAttributes {
  @scala.inline
  def apply[T](key: Key = null, ref: Ref[T] = null): RefAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefAttributes[T]]
  }
}

