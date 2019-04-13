package typings
package pubnubLib.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// whereNow
trait WhereNowParameters extends js.Object {
  var uuid: js.UndefOr[java.lang.String] = js.undefined
}

object WhereNowParameters {
  @scala.inline
  def apply(uuid: java.lang.String = null): WhereNowParameters = {
    val __obj = js.Dynamic.literal()
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[WhereNowParameters]
  }
}

