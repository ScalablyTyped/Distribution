package typings.reactRouter.mod

import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectProps extends StObject {
  
  var exact: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var push: js.UndefOr[Boolean] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var to: LocationDescriptor[LocationState]
}
object RedirectProps {
  
  @scala.inline
  def apply(to: LocationDescriptor[LocationState]): RedirectProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectProps]
  }
  
  @scala.inline
  implicit class RedirectPropsMutableBuilder[Self <: RedirectProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    @scala.inline
    def setTo(value: LocationDescriptor[LocationState]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
