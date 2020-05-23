package typings.recurlyRecurlyJs.mod.global

import typings.recurlyRecurlyJs.recurlyMod.Recurly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var recurly: Recurly
}

object Window {
  @scala.inline
  def apply(recurly: Recurly): Window = {
    val __obj = js.Dynamic.literal(recurly = recurly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

