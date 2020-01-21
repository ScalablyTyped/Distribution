package typings.secureJsonParse.mod

import typings.secureJsonParse.secureJsonParseStrings.error
import typings.secureJsonParse.secureJsonParseStrings.ignore
import typings.secureJsonParse.secureJsonParseStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var protoAction: error | remove | ignore
}

object ParseOptions {
  @scala.inline
  def apply(protoAction: error | remove | ignore): ParseOptions = {
    val __obj = js.Dynamic.literal(protoAction = protoAction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParseOptions]
  }
}

