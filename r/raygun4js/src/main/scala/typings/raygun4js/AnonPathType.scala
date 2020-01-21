package typings.raygun4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPathType extends js.Object {
  var path: String
  var `type`: String
}

object AnonPathType {
  @scala.inline
  def apply(path: String, `type`: String): AnonPathType = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPathType]
  }
}

