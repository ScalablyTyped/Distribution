package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextViewStateChangeInfo extends StObject {
  
  var interactionState: ExtraState
  
  var newViewState: ViewportProps
  
  var viewState: ViewportProps
}
object ContextViewStateChangeInfo {
  
  @scala.inline
  def apply(interactionState: ExtraState, newViewState: ViewportProps, viewState: ViewportProps): ContextViewStateChangeInfo = {
    val __obj = js.Dynamic.literal(interactionState = interactionState.asInstanceOf[js.Any], newViewState = newViewState.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextViewStateChangeInfo]
  }
  
  @scala.inline
  implicit class ContextViewStateChangeInfoMutableBuilder[Self <: ContextViewStateChangeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteractionState(value: ExtraState): Self = StObject.set(x, "interactionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewViewState(value: ViewportProps): Self = StObject.set(x, "newViewState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewState(value: ViewportProps): Self = StObject.set(x, "viewState", value.asInstanceOf[js.Any])
  }
}
