package typings.reduxDevtoolsInstrument.mod

import typings.redux.mod.Action
import typings.reduxDevtoolsInstrument.reduxDevtoolsInstrumentStrings.IMPORT_STATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportStateAction[S, A /* <: Action[Any] */, MonitorState]
  extends StObject
     with LiftedAction[S, A, MonitorState] {
  
  var nextLiftedState: (LiftedState[S, A, MonitorState]) | js.Array[A]
  
  var noRecompute: js.UndefOr[Boolean] = js.undefined
  
  var preloadedState: js.UndefOr[S] = js.undefined
  
  var `type`: IMPORT_STATE
}
object ImportStateAction {
  
  inline def apply[S, A /* <: Action[Any] */, MonitorState](nextLiftedState: (LiftedState[S, A, MonitorState]) | js.Array[A]): ImportStateAction[S, A, MonitorState] = {
    val __obj = js.Dynamic.literal(nextLiftedState = nextLiftedState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IMPORT_STATE")
    __obj.asInstanceOf[ImportStateAction[S, A, MonitorState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportStateAction[?, ?, ?], S, A /* <: Action[Any] */, MonitorState] (val x: Self & (ImportStateAction[S, A, MonitorState])) extends AnyVal {
    
    inline def setNextLiftedState(value: (LiftedState[S, A, MonitorState]) | js.Array[A]): Self = StObject.set(x, "nextLiftedState", value.asInstanceOf[js.Any])
    
    inline def setNextLiftedStateVarargs(value: A*): Self = StObject.set(x, "nextLiftedState", js.Array(value*))
    
    inline def setNoRecompute(value: Boolean): Self = StObject.set(x, "noRecompute", value.asInstanceOf[js.Any])
    
    inline def setNoRecomputeUndefined: Self = StObject.set(x, "noRecompute", js.undefined)
    
    inline def setPreloadedState(value: S): Self = StObject.set(x, "preloadedState", value.asInstanceOf[js.Any])
    
    inline def setPreloadedStateUndefined: Self = StObject.set(x, "preloadedState", js.undefined)
    
    inline def setType(value: IMPORT_STATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
