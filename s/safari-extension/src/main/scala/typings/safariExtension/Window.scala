package typings.safariExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var safari: Typeofsafari
}

object Window {
  @scala.inline
  def apply(safari: Typeofsafari): Window = {
    val __obj = js.Dynamic.literal(safari = safari.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

