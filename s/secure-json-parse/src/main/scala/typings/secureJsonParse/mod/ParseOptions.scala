package typings.secureJsonParse.mod

import typings.secureJsonParse.secureJsonParseStrings.error
import typings.secureJsonParse.secureJsonParseStrings.ignore
import typings.secureJsonParse.secureJsonParseStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions extends js.Object {
  var constructorAction: js.UndefOr[error | remove] = js.native
  var protoAction: js.UndefOr[error | remove | ignore] = js.native
}

object ParseOptions {
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConstructorAction(value: error | remove): Self = this.set("constructorAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstructorAction: Self = this.set("constructorAction", js.undefined)
    @scala.inline
    def setProtoAction(value: error | remove | ignore): Self = this.set("protoAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtoAction: Self = this.set("protoAction", js.undefined)
  }
  
}

