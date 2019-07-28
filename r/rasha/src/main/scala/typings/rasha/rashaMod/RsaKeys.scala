package typings.rasha.rashaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaKeys extends js.Object {
  var `private`: String
  var public: String
}

object RsaKeys {
  @scala.inline
  def apply(`private`: String, public: String): RsaKeys = {
    val __obj = js.Dynamic.literal(public = public)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[RsaKeys]
  }
}

