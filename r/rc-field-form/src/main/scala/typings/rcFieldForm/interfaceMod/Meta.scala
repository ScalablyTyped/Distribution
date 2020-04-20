package typings.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta extends js.Object {
  var errors: js.Array[String]
  var name: InternalNamePath
  var touched: Boolean
  var validating: Boolean
}

object Meta {
  @scala.inline
  def apply(errors: js.Array[String], name: InternalNamePath, touched: Boolean, validating: Boolean): Meta = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
}

