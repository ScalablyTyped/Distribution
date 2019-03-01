package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mids extends js.Object {
  var mids: java.lang.String
  var `type`: java.lang.String
}

object Anon_Mids {
  @scala.inline
  def apply(mids: java.lang.String, `type`: java.lang.String): Anon_Mids = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("mids")(mids)
    __obj.asInstanceOf[Anon_Mids]
  }
}

