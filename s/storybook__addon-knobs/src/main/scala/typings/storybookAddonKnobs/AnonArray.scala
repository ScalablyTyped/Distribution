package typings.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArray extends js.Object {
  var boolean: FunctionComponentBooleanT
  var button: FunctionComponentButtonTy
  var files: FunctionComponentFilesTyp
  var options: FunctionComponentOptionsT
  var select: FunctionComponentSelectTy
}

object AnonArray {
  @scala.inline
  def apply(
    boolean: FunctionComponentBooleanT,
    button: FunctionComponentButtonTy,
    files: FunctionComponentFilesTyp,
    options: FunctionComponentOptionsT,
    select: FunctionComponentSelectTy
  ): AnonArray = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArray]
  }
}

