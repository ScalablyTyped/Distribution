package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldMaskMask extends js.Object {
  // TypeScript Version: 2.2
  var args: js.UndefOr[js.Object] = js.undefined
  var name: java.lang.String
}

object FieldMaskMask {
  @scala.inline
  def apply(name: java.lang.String, args: js.Object = null): FieldMaskMask = {
    val __obj = js.Dynamic.literal(name = name)
    if (args != null) __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[FieldMaskMask]
  }
}

