package typings.reactRouter.mod

import org.scalablytyped.runtime.TopLevel
import typings.reactRouter.anon.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterChildContext[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactRouter.reactRouterStrings.RouterChildContext with TopLevel[js.Any] */] extends StObject {
  
  var router: History[Params] = js.native
}
object RouterChildContext {
  
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.RouterChildContext with TopLevel[js.Any] */](router: History[Params]): RouterChildContext[Params] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterChildContext[Params]]
  }
  
  @scala.inline
  implicit class RouterChildContextMutableBuilder[Self <: RouterChildContext[_], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.RouterChildContext with TopLevel[js.Any] */] (val x: Self with RouterChildContext[Params]) extends AnyVal {
    
    @scala.inline
    def setRouter(value: History[Params]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
  }
}
