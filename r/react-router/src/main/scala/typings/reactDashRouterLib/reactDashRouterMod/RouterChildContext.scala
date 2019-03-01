package typings
package reactDashRouterLib.reactDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterChildContext[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ reactDashRouterLib.reactDashRouterLibStrings.RouterChildContext with js.Any */] extends js.Object {
  var router: reactDashRouterLib.Anon_History[Params]
}

object RouterChildContext {
  @scala.inline
  def apply[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterLib.reactDashRouterLibStrings.RouterChildContext with js.Any */](router: reactDashRouterLib.Anon_History[Params]): RouterChildContext[Params] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("router")(router)
    __obj.asInstanceOf[RouterChildContext[Params]]
  }
}

