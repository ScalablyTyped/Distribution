package typings.reactRouter.mod

import org.scalablytyped.runtime.TopLevel
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteChildrenProps[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactRouter.reactRouterStrings.RouteChildrenProps with TopLevel[js.Any] */, S] extends js.Object {
  var history: History[LocationState] = js.native
  var location: Location[S] = js.native
  var `match`: typings.reactRouter.mod.`match`[Params] | Null = js.native
}

object RouteChildrenProps {
  @scala.inline
  def apply[/* <: / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    * / typings.reactRouter.reactRouterStrings.RouteChildrenProps with org.scalablytyped.runtime.TopLevel[js.Any] */ Params, S](history: History[LocationState], location: Location[S]): RouteChildrenProps[Params, S] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteChildrenProps[Params, S]]
  }
  @scala.inline
  implicit class RouteChildrenPropsOps[Self <: RouteChildrenProps[_, _], /* <: / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    * / typings.reactRouter.reactRouterStrings.RouteChildrenProps with org.scalablytyped.runtime.TopLevel[js.Any] */ Params, S] (val x: Self with (RouteChildrenProps[Params, S])) extends AnyVal {
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
    def setHistory(value: History[LocationState]): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location[S]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatch(value: `match`[Params]): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchNull: Self = this.set("match", null)
  }
  
}

