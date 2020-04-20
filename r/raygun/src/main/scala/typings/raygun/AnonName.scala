package typings.raygun

import typings.raygun.raygunStrings.`raygun-node`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: `raygun-node`
  var version: String
}

object AnonName {
  @scala.inline
  def apply(name: `raygun-node`, version: String): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

