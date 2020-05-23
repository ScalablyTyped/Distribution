package typings.reactRouter.mod

import org.scalablytyped.runtime.TopLevel
import typings.reactRouter.anon.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterChildContext[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactRouter.reactRouterStrings.RouterChildContext with TopLevel[js.Any] */] extends js.Object {
  var router: History[Params]
}

object RouterChildContext {
  @scala.inline
  def apply[Params](router: History[Params]): RouterChildContext[Params] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterChildContext[Params]]
  }
}

