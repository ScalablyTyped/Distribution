package typings.reduxPromiseMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var promiseTypeDelimiter: js.UndefOr[String] = js.native
  var promiseTypeSuffixes: js.UndefOr[js.Tuple3[PendingActionType, FulfilledActionType, RejectedActionType]] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setPromiseTypeDelimiter(value: String): Self = this.set("promiseTypeDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromiseTypeDelimiter: Self = this.set("promiseTypeDelimiter", js.undefined)
    @scala.inline
    def setPromiseTypeSuffixes(value: js.Tuple3[PendingActionType, FulfilledActionType, RejectedActionType]): Self = this.set("promiseTypeSuffixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromiseTypeSuffixes: Self = this.set("promiseTypeSuffixes", js.undefined)
  }
  
}

