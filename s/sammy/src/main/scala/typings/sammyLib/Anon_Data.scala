package typings
package sammyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var name: java.lang.String
}

object Anon_Data {
  @scala.inline
  def apply(name: java.lang.String, data: js.Any = null): Anon_Data = {
    val __obj = js.Dynamic.literal(name = name)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[Anon_Data]
  }
}

