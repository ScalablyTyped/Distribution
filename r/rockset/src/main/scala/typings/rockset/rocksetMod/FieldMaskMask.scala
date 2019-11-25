package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldMaskMask extends js.Object {
  // TypeScript Version: 2.2
  var args: js.UndefOr[js.Object] = js.undefined
  var name: String
}

object FieldMaskMask {
  @scala.inline
  def apply(name: String, args: js.Object = null): FieldMaskMask = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldMaskMask]
  }
}

