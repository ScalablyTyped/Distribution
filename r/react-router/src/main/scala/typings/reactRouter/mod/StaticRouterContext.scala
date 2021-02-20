package typings.reactRouter.mod

import typings.reactRouter.reactRouterStrings.PUSH
import typings.reactRouter.reactRouterStrings.REPLACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticRouterContext extends StaticContext {
  
  var action: js.UndefOr[PUSH | REPLACE] = js.native
  
  var location: js.UndefOr[js.Object] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object StaticRouterContext {
  
  @scala.inline
  def apply(): StaticRouterContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticRouterContext]
  }
  
  @scala.inline
  implicit class StaticRouterContextMutableBuilder[Self <: StaticRouterContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: PUSH | REPLACE): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setLocation(value: js.Object): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
