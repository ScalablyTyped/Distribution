package typings
package reactDashRouterLib.reactDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `match`[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ reactDashRouterLib.reactDashRouterLibStrings.`match` with js.Any */] extends js.Object {
  var isExact: scala.Boolean
  var params: Params
  var path: java.lang.String
  var url: java.lang.String
}

object `match` {
  @scala.inline
  def apply[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterLib.reactDashRouterLibStrings.`match` with js.Any */](isExact: scala.Boolean, params: Params, path: java.lang.String, url: java.lang.String): `match`[Params] = {
    val __obj = js.Dynamic.literal(isExact = isExact, params = params.asInstanceOf[js.Any], path = path, url = url)
  
    __obj.asInstanceOf[`match`[Params]]
  }
}

