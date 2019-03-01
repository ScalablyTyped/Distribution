package typings
package revalidateLib.revalidateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var field: js.UndefOr[js.Any] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object Config {
  @scala.inline
  def apply(field: js.Any = null, message: java.lang.String = null): Config = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Config]
  }
}

