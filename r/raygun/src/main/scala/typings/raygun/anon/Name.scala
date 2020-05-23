package typings.raygun.anon

import typings.raygun.raygunStrings.`raygun-node`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: `raygun-node`
  var version: String
}

object Name {
  @scala.inline
  def apply(name: `raygun-node`, version: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

