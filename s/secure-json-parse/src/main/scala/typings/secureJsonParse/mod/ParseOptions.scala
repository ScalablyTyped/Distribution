package typings.secureJsonParse.mod

import typings.secureJsonParse.secureJsonParseStrings.error
import typings.secureJsonParse.secureJsonParseStrings.ignore
import typings.secureJsonParse.secureJsonParseStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var constructorAction: js.UndefOr[error | remove] = js.undefined
  var protoAction: js.UndefOr[error | remove | ignore] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(constructorAction: error | remove = null, protoAction: error | remove | ignore = null): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (constructorAction != null) __obj.updateDynamic("constructorAction")(constructorAction.asInstanceOf[js.Any])
    if (protoAction != null) __obj.updateDynamic("protoAction")(protoAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

