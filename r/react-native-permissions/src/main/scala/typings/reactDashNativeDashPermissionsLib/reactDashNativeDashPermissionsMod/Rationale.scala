package typings
package reactDashNativeDashPermissionsLib.reactDashNativeDashPermissionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rationale extends js.Object {
  var message: java.lang.String
  var title: java.lang.String
}

object Rationale {
  @scala.inline
  def apply(message: java.lang.String, title: java.lang.String): Rationale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Rationale]
  }
}

