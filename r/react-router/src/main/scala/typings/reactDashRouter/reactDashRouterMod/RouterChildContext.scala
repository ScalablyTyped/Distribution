package typings.reactDashRouter.reactDashRouterMod

import typings.reactDashRouter.Anon_History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterChildContext[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactDashRouter.reactDashRouterStrings.RouterChildContext with js.Any */] extends js.Object {
  var router: Anon_History[Params]
}

object RouterChildContext {
  @scala.inline
  def apply[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactDashRouter.reactDashRouterStrings.RouterChildContext with js.Any */](router: Anon_History[Params]): RouterChildContext[Params] = {
    val __obj = js.Dynamic.literal(router = router)
  
    __obj.asInstanceOf[RouterChildContext[Params]]
  }
}

