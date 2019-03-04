package typings
package raygun4jsLib.raygun4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Raygun: RaygunStatic
}

object Window {
  @scala.inline
  def apply(Raygun: RaygunStatic): Window = {
    val __obj = js.Dynamic.literal(Raygun = Raygun)
  
    __obj.asInstanceOf[Window]
  }
}

