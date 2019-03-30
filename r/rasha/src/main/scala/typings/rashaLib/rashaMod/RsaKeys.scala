package typings
package rashaLib.rashaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaKeys extends js.Object {
  var `private`: java.lang.String
  var public: java.lang.String
}

object RsaKeys {
  @scala.inline
  def apply(`private`: java.lang.String, public: java.lang.String): RsaKeys = {
    val __obj = js.Dynamic.literal(public = public)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[RsaKeys]
  }
}

