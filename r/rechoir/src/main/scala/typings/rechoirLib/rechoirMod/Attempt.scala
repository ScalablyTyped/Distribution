package typings
package rechoirLib.rechoirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attempt extends js.Object {
  var error: nodeLib.Error | scala.Null
  var module: js.Any
  var moduleName: java.lang.String
}

object Attempt {
  @scala.inline
  def apply(module: js.Any, moduleName: java.lang.String, error: nodeLib.Error = null): Attempt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("module")(module)
    __obj.updateDynamic("moduleName")(moduleName)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Attempt]
  }
}

