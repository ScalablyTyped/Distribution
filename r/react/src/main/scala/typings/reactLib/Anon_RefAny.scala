package typings
package reactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RefAny extends js.Object {
  var ref: js.UndefOr[stdLib.Exclude[_, java.lang.String]] = js.undefined
}

object Anon_RefAny {
  @scala.inline
  def apply(ref: stdLib.Exclude[_, java.lang.String] = null): Anon_RefAny = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RefAny]
  }
}

