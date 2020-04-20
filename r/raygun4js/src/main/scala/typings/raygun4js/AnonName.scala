package typings.raygun4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var Name: String
  var Version: String
}

object AnonName {
  @scala.inline
  def apply(Name: String, Version: String): AnonName = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

