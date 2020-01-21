package typings.ssbKeys.mod

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
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keys]
  }
}

