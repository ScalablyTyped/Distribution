package typings.reactRouterNavigationCore.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.reactRouter.mod.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteProps extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ RouterProps, ReactNode]) | ReactNode] = js.native
  var component: js.UndefOr[ComponentClass[RouterProps, ComponentState]] = js.native
  var exact: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
  var render: js.UndefOr[js.Function1[/* props */ RouterProps, ReactNode]] = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object RouteProps {
  @scala.inline
  def apply(): RouteProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteProps]
  }
  @scala.inline
  implicit class RoutePropsOps[Self <: RouteProps] (val x: Self) extends AnyVal {
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
    def setChildrenFunction1(value: /* props */ RouterProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: (js.Function1[/* props */ RouterProps, ReactNode]) | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setComponent(value: ComponentClass[RouterProps, ComponentState]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setRender(value: /* props */ RouterProps => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

