package typings.rrc.mod

import org.scalablytyped.runtime.StringDictionary
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactRouter.mod.RouteChildrenProps
import typings.reactRouter.mod.RouteComponentProps
import typings.reactRouter.mod.StaticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-router-dom.react-router-dom.RouteProps & {  inject :{[key: string] : any} | undefined} */
@js.native
trait RouteConfiguration extends js.Object {
  var children: js.UndefOr[
    (js.Function1[/* props */ RouteChildrenProps[_, LocationState], ReactNode]) | ReactNode
  ] = js.native
  var component: js.UndefOr[ComponentType[_ | (RouteComponentProps[_, StaticContext, LocationState])]] = js.native
  var exact: js.UndefOr[Boolean] = js.native
  var inject: js.UndefOr[StringDictionary[js.Any]] = js.native
  var location: js.UndefOr[Location[LocationState]] = js.native
  var path: js.UndefOr[String | js.Array[String]] = js.native
  var render: js.UndefOr[
    js.Function1[/* props */ RouteComponentProps[_, StaticContext, LocationState], ReactNode]
  ] = js.native
  var sensitive: js.UndefOr[Boolean] = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object RouteConfiguration {
  @scala.inline
  def apply(): RouteConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteConfiguration]
  }
  @scala.inline
  implicit class RouteConfigurationOps[Self <: RouteConfiguration] (val x: Self) extends AnyVal {
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
    def setChildrenFunction1(value: /* props */ RouteChildrenProps[_, LocationState] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: (js.Function1[/* props */ RouteChildrenProps[_, LocationState], ReactNode]) | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setComponent(value: ComponentType[_ | (RouteComponentProps[_, StaticContext, LocationState])]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    @scala.inline
    def setInject(value: StringDictionary[js.Any]): Self = this.set("inject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
    @scala.inline
    def setLocation(value: Location[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: String | js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setRender(value: /* props */ RouteComponentProps[_, StaticContext, LocationState] => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setSensitive(value: Boolean): Self = this.set("sensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensitive: Self = this.set("sensitive", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

