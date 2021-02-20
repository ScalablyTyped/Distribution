package typings.reachRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectProps[TState] extends StObject {
  
  var from: js.UndefOr[String] = js.native
  
  var noThrow: js.UndefOr[Boolean] = js.native
  
  var replace: js.UndefOr[Boolean] = js.native
  
  var state: js.UndefOr[TState] = js.native
  
  var to: String = js.native
}
object RedirectProps {
  
  @scala.inline
  def apply[TState](to: String): RedirectProps[TState] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectProps[TState]]
  }
  
  @scala.inline
  implicit class RedirectPropsMutableBuilder[Self <: RedirectProps[_], TState] (val x: Self with RedirectProps[TState]) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setNoThrow(value: Boolean): Self = StObject.set(x, "noThrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoThrowUndefined: Self = StObject.set(x, "noThrow", js.undefined)
    
    @scala.inline
    def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setState(value: TState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
