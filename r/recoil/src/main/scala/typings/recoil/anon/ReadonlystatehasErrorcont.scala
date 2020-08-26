package typings.recoil.anon

import typings.recoil.mod.Loadable
import typings.recoil.recoilStrings.hasError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  state :'hasError',   contents :std.Error}> */
@js.native
trait ReadonlystatehasErrorcont
  extends Loadable[js.Any] {
  val contents: Error = js.native
  val state: hasError = js.native
}

object ReadonlystatehasErrorcont {
  @scala.inline
  def apply(contents: Error, state: hasError): ReadonlystatehasErrorcont = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlystatehasErrorcont]
  }
  @scala.inline
  implicit class ReadonlystatehasErrorcontOps[Self <: ReadonlystatehasErrorcont] (val x: Self) extends AnyVal {
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
    def setContents(value: Error): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: hasError): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

