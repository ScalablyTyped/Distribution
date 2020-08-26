package typings.rax.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Unfortunately, we have no way of declaring that the component constructor must implement this
@js.native
trait StaticLifecycle[P, S] extends js.Object {
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[P, S]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[P, S]] = js.native
}

object StaticLifecycle {
  @scala.inline
  def apply[P, S](): StaticLifecycle[P, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticLifecycle[P, S]]
  }
  @scala.inline
  implicit class StaticLifecycleOps[Self <: StaticLifecycle[_, _], P, S] (val x: Self with (StaticLifecycle[P, S])) extends AnyVal {
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
    def setGetDerivedStateFromError(value: /* error */ js.Any => Partial[S] | Null): Self = this.set("getDerivedStateFromError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetDerivedStateFromError: Self = this.set("getDerivedStateFromError", js.undefined)
    @scala.inline
    def setGetDerivedStateFromProps(value: (P, S) => Partial[S] | Null): Self = this.set("getDerivedStateFromProps", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetDerivedStateFromProps: Self = this.set("getDerivedStateFromProps", js.undefined)
  }
  
}

