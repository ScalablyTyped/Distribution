package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.InternalNamePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.Array[String]
  var name: InternalNamePath
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[String], name: InternalNamePath): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

