package typings.rsocketTypes.anon

import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.rsocketTypesStrings.ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends ConnectionStatus {
  var error: typings.std.Error = js.native
  var kind: ERROR = js.native
}

object Error {
  @scala.inline
  def apply(error: typings.std.Error, kind: ERROR): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
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
    def setError(value: typings.std.Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ERROR): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

