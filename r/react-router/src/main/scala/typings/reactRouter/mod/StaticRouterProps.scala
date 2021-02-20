package typings.reactRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticRouterProps extends StObject {
  
  var basename: js.UndefOr[String] = js.native
  
  var context: js.UndefOr[StaticRouterContext] = js.native
  
  var location: js.UndefOr[String | js.Object] = js.native
}
object StaticRouterProps {
  
  @scala.inline
  def apply(): StaticRouterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticRouterProps]
  }
  
  @scala.inline
  implicit class StaticRouterPropsMutableBuilder[Self <: StaticRouterProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
    
    @scala.inline
    def setContext(value: StaticRouterContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setLocation(value: String | js.Object): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
