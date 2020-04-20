package typings.reactRouterConfig.mod

import org.scalablytyped.runtime.TopLevel
import typings.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchedRoute[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactRouterConfig.reactRouterConfigStrings.MatchedRoute with TopLevel[js.Any] */] extends js.Object {
  var `match`: typings.reactRouter.mod.`match`[Params]
  var route: RouteConfig
}

object MatchedRoute {
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterConfig.reactRouterConfigStrings.MatchedRoute with TopLevel[js.Any] */](`match`: `match`[Params], route: RouteConfig): MatchedRoute[Params] = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedRoute[Params]]
  }
}

