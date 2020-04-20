package typings.reactRouter

import org.scalablytyped.runtime.TopLevel
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocation[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactRouter.reactRouterStrings.AnonLocation with TopLevel[js.Any] */] extends js.Object {
  var location: Location[LocationState]
  var `match`: typings.reactRouter.mod.`match`[Params]
}

object AnonLocation {
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.AnonLocation with TopLevel[js.Any] */](location: Location[LocationState], `match`: `match`[Params]): AnonLocation[Params] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocation[Params]]
  }
}

