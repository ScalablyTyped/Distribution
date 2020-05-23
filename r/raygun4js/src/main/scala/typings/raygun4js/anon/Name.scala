package typings.raygun4js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var Name: String
  var Version: String
}

object Name {
  @scala.inline
  def apply(Name: String, Version: String): Name = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

