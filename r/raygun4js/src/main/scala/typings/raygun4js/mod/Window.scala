package typings.raygun4js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Raygun: RaygunStatic
}

object Window {
  @scala.inline
  def apply(Raygun: RaygunStatic): Window = {
    val __obj = js.Dynamic.literal(Raygun = Raygun.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

