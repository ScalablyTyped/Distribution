package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationNavigateAction
import typings.reactNavigation.mod.NavigationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action[T /* <: NavigationParams */] extends js.Object {
  var action: js.UndefOr[NavigationNavigateAction] = js.native
  var key: js.UndefOr[String] = js.native
  var params: js.UndefOr[T] = js.native
  var routeName: String = js.native
}

object Action {
  @scala.inline
  def apply[/* <: typings.reactNavigation.mod.NavigationParams */ T](routeName: String): Action[T] = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[T]]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action[_], /* <: typings.reactNavigation.mod.NavigationParams */ T] (val x: Self with Action[T]) extends AnyVal {
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
    def setRouteName(value: String): Self = this.set("routeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: NavigationNavigateAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setParams(value: T): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

