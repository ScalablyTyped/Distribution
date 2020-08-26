package typings.reduxFirstRouter.anon

import typings.redux.mod.Dispatch
import typings.reduxFirstRouter.mod.ConfirmLeave
import typings.reduxFirstRouter.mod.Meta
import typings.reduxFirstRouter.mod.Nullable
import typings.reduxFirstRouter.mod.RouteThunk
import typings.reduxFirstRouter.mod.StateGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapitalizedWords[TState] extends js.Object {
  var capitalizedWords: js.UndefOr[Boolean] = js.native
  var coerceNumbers: js.UndefOr[Boolean] = js.native
  var confirmLeave: js.UndefOr[ConfirmLeave] = js.native
  var fromPath: js.UndefOr[js.Function2[/* path */ String, /* key */ js.UndefOr[String], String]] = js.native
  var meta: js.UndefOr[Meta] = js.native
  var navKey: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var thunk: js.UndefOr[RouteThunk[TState]] = js.native
  var toPath: js.UndefOr[js.Function2[/* param */ String, /* key */ js.UndefOr[String], String]] = js.native
}

object CapitalizedWords {
  @scala.inline
  def apply[TState](): CapitalizedWords[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapitalizedWords[TState]]
  }
  @scala.inline
  implicit class CapitalizedWordsOps[Self <: CapitalizedWords[_], TState] (val x: Self with CapitalizedWords[TState]) extends AnyVal {
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
    def setCapitalizedWords(value: Boolean): Self = this.set("capitalizedWords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapitalizedWords: Self = this.set("capitalizedWords", js.undefined)
    @scala.inline
    def setCoerceNumbers(value: Boolean): Self = this.set("coerceNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoerceNumbers: Self = this.set("coerceNumbers", js.undefined)
    @scala.inline
    def setConfirmLeave(value: (/* state */ js.Object, /* action */ js.Object) => Nullable[String]): Self = this.set("confirmLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteConfirmLeave: Self = this.set("confirmLeave", js.undefined)
    @scala.inline
    def setFromPath(value: (/* path */ String, /* key */ js.UndefOr[String]) => String): Self = this.set("fromPath", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFromPath: Self = this.set("fromPath", js.undefined)
    @scala.inline
    def setMeta(value: Meta): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setNavKey(value: String): Self = this.set("navKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavKey: Self = this.set("navKey", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setThunk(
      value: (/* dispatch */ Dispatch[js.Any], /* getState */ StateGetter[TState]) => js.Any | js.Promise[js.Any]
    ): Self = this.set("thunk", js.Any.fromFunction2(value))
    @scala.inline
    def deleteThunk: Self = this.set("thunk", js.undefined)
    @scala.inline
    def setToPath(value: (/* param */ String, /* key */ js.UndefOr[String]) => String): Self = this.set("toPath", js.Any.fromFunction2(value))
    @scala.inline
    def deleteToPath: Self = this.set("toPath", js.undefined)
  }
  
}

