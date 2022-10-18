package typings.reduxDevtoolsInstrument

import typings.redux.mod.Store
import typings.reduxDevtoolsInstrument.mod.LiftedAction
import typings.reduxDevtoolsInstrument.mod.LiftedState
import typings.reduxDevtoolsInstrument.reduxDevtoolsInstrumentStrings.PERFORM_ACTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action[A /* <: typings.redux.mod.Action[Any] */] extends StObject {
    
    var action: A
    
    var stack: js.UndefOr[String] = js.undefined
    
    var timestamp: Double
    
    var `type`: PERFORM_ACTION
  }
  object Action {
    
    inline def apply[A /* <: typings.redux.mod.Action[Any] */](action: A, timestamp: Double): Action[A] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("PERFORM_ACTION")
      __obj.asInstanceOf[Action[A]]
    }
    
    extension [Self <: Action[?], A /* <: typings.redux.mod.Action[Any] */](x: Self & Action[A]) {
      
      inline def setAction(value: A): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: PERFORM_ACTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error[S] extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var state: S
  }
  object Error {
    
    inline def apply[S](state: S): Error[S] = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error[S]]
    }
    
    extension [Self <: Error[?], S](x: Self & Error[S]) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setState(value: S): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait LiftedStore[S, A /* <: typings.redux.mod.Action[Any] */, MonitorState, NextStateExt] extends StObject {
    
    var liftedStore: Store[(LiftedState[S, A, MonitorState]) & NextStateExt, LiftedAction[S, A, MonitorState]]
  }
  object LiftedStore {
    
    inline def apply[S, A /* <: typings.redux.mod.Action[Any] */, MonitorState, NextStateExt](
      liftedStore: Store[(LiftedState[S, A, MonitorState]) & NextStateExt, LiftedAction[S, A, MonitorState]]
    ): LiftedStore[S, A, MonitorState, NextStateExt] = {
      val __obj = js.Dynamic.literal(liftedStore = liftedStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiftedStore[S, A, MonitorState, NextStateExt]]
    }
    
    extension [Self <: LiftedStore[?, ?, ?, ?], S, A /* <: typings.redux.mod.Action[Any] */, MonitorState, NextStateExt](x: Self & (LiftedStore[S, A, MonitorState, NextStateExt])) {
      
      inline def setLiftedStore(value: Store[(LiftedState[S, A, MonitorState]) & NextStateExt, LiftedAction[S, A, MonitorState]]): Self = StObject.set(x, "liftedStore", value.asInstanceOf[js.Any])
    }
  }
}
