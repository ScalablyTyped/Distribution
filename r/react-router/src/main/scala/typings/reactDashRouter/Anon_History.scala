package typings.reactDashRouter

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_History[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactDashRouter.reactDashRouterStrings.Anon_History with js.Any */] extends js.Object {
  var history: History[LocationState]
  var route: Anon_Location[Params]
}

object Anon_History {
  @scala.inline
  def apply[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactDashRouter.reactDashRouterStrings.Anon_History with js.Any */](history: History[LocationState], route: Anon_Location[Params]): Anon_History[Params] = {
    val __obj = js.Dynamic.literal(history = history, route = route)
  
    __obj.asInstanceOf[Anon_History[Params]]
  }
}

