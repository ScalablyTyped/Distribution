package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Owner extends js.Object {
  /**
    * The name of the owner user.
    */
  var username: java.lang.String
}

object Owner {
  @scala.inline
  def apply(username: java.lang.String): Owner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Owner]
  }
}

