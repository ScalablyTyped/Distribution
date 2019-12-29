package typings.slateDashPlainDashSerializer.slateDashPlainDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializeOptions extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
}

object SerializeOptions {
  @scala.inline
  def apply(delimiter: String = null): SerializeOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializeOptions]
  }
}

