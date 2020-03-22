package typings.reactRouter

import typings.history.mod.History
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHistory[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactRouter.reactRouterStrings.AnonHistory with js.Any */] extends js.Object {
  var history: History[LocationState]
  var route: AnonLocation[Params]
}

object AnonHistory {
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.AnonHistory with js.Any */](history: History[LocationState], route: AnonLocation[Params]): AnonHistory[Params] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHistory[Params]]
  }
}

