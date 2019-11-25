package typings.revalidate.revalidateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var field: js.UndefOr[js.Any] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(field: js.Any = null, message: String = null): Config = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

