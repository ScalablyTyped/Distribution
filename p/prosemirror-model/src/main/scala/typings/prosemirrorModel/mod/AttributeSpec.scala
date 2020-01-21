package typings.prosemirrorModel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeSpec extends js.Object {
  /**
    * The default value for this attribute, to use when no explicit
    * value is provided. Attributes that have no default must be
    * provided whenever a node or mark of a type that has them is
    * created.
    */
  var default: js.UndefOr[js.Any] = js.undefined
}

object AttributeSpec {
  @scala.inline
  def apply(default: js.Any = null): AttributeSpec = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeSpec]
  }
}

