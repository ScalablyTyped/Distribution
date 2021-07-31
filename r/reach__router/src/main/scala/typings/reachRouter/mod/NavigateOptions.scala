package typings.reachRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateOptions[TState] extends StObject {
  
  var replace: js.UndefOr[Boolean] = js.undefined
  
  var state: js.UndefOr[TState] = js.undefined
}
object NavigateOptions {
  
  @scala.inline
  def apply[TState](): NavigateOptions[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateOptions[TState]]
  }
  
  @scala.inline
  implicit class NavigateOptionsMutableBuilder[Self <: NavigateOptions[?], TState] (val x: Self & NavigateOptions[TState]) extends AnyVal {
    
    @scala.inline
    def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setState(value: TState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
