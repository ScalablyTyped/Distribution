package typings.reduxImmutableStateInvariant.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait immutableStateInvariantMiddlewareOptions extends js.Object {
  var ignore: js.UndefOr[js.Array[String]] = js.native
  var isImmutable: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.native
}

object immutableStateInvariantMiddlewareOptions {
  @scala.inline
  def apply(): immutableStateInvariantMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[immutableStateInvariantMiddlewareOptions]
  }
  @scala.inline
  implicit class immutableStateInvariantMiddlewareOptionsOps[Self <: immutableStateInvariantMiddlewareOptions] (val x: Self) extends AnyVal {
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
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setIsImmutable(value: /* value */ js.Any => Boolean): Self = this.set("isImmutable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsImmutable: Self = this.set("isImmutable", js.undefined)
  }
  
}

