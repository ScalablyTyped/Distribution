package typings.rechoir.rechoirMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attempt extends js.Object {
  var error: Error | Null
  var module: js.Any
  var moduleName: String
}

object Attempt {
  @scala.inline
  def apply(module: js.Any, moduleName: String, error: Error = null): Attempt = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attempt]
  }
}

