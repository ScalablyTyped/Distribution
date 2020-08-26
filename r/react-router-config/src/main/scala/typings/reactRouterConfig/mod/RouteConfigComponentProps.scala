package typings.reactRouterConfig.mod

import org.scalablytyped.runtime.TopLevel
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.reactRouter.mod.RouteComponentProps
import typings.reactRouter.mod.StaticContext
import typings.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteConfigComponentProps[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactRouterConfig.reactRouterConfigStrings.RouteConfigComponentProps with TopLevel[js.Any] */] extends RouteComponentProps[Params, StaticContext, LocationState] {
  var route: js.UndefOr[RouteConfig] = js.native
}

object RouteConfigComponentProps {
  @scala.inline
  def apply[/* <: / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    * / typings.reactRouterConfig.reactRouterConfigStrings.RouteConfigComponentProps with org.scalablytyped.runtime.TopLevel[js.Any] */ Params](history: History[LocationState], location: Location[LocationState], `match`: `match`[Params]): RouteConfigComponentProps[Params] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfigComponentProps[Params]]
  }
  @scala.inline
  implicit class RouteConfigComponentPropsOps[Self <: RouteConfigComponentProps[_], /* <: / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    * / typings.reactRouterConfig.reactRouterConfigStrings.RouteConfigComponentProps with org.scalablytyped.runtime.TopLevel[js.Any] */ Params] (val x: Self with RouteConfigComponentProps[Params]) extends AnyVal {
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
    def setRoute(value: RouteConfig): Self = this.set("route", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
  }
  
}

