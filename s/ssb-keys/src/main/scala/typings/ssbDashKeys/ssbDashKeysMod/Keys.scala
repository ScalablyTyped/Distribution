package typings.ssbDashKeys.ssbDashKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keys extends js.Object {
  var curve: String
  var id: String
  var `private`: String
  var public: String
}

object Keys {
  @scala.inline
  def apply(curve: String, id: String, `private`: String, public: String): Keys = {
    val __obj = js.Dynamic.literal(curve = curve, id = id, public = public)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[Keys]
  }
}

