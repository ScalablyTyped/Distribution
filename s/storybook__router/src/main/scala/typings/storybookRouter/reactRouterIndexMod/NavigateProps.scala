package typings.storybookRouter.reactRouterIndexMod

import typings.storybookRouter.reactRouterNodeModulesHistoryIndexMod.To
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateProps extends StObject {
  
  var replace: js.UndefOr[Boolean] = js.undefined
  
  var state: js.UndefOr[Any] = js.undefined
  
  var to: To
}
object NavigateProps {
  
  inline def apply(to: To): NavigateProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateProps]
  }
  
  extension [Self <: NavigateProps](x: Self) {
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTo(value: To): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
