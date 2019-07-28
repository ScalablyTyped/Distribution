package typings.reactDashRouter.reactDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `match`[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactDashRouter.reactDashRouterStrings.`match` with js.Any */] extends js.Object {
  var isExact: Boolean
  var params: Params
  var path: String
  var url: String
}

object `match` {
  @scala.inline
  def apply[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactDashRouter.reactDashRouterStrings.`match` with js.Any */](isExact: Boolean, params: Params, path: String, url: String): `match`[Params] = {
    val __obj = js.Dynamic.literal(isExact = isExact, params = params.asInstanceOf[js.Any], path = path, url = url)
  
    __obj.asInstanceOf[`match`[Params]]
  }
}

