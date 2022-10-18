package typings.reduxDevtoolsDockMonitor

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import typings.redux.mod.Action
import typings.redux.mod.Dispatch
import typings.reduxDevtools.libCreateDevToolsMod.Monitor
import typings.reduxDevtoolsDockMonitor.anon.ComponentClassExternalPro
import typings.reduxDevtoolsDockMonitor.anon.FunctionComponentExternal
import typings.reduxDevtoolsDockMonitor.libActionsMod.DockMonitorAction
import typings.reduxDevtoolsDockMonitor.libReducersMod.DockMonitorState
import typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.bottom
import typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.left
import typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.right
import typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.top
import typings.reduxDevtoolsInstrument.anon.Error
import typings.reduxDevtoolsInstrument.mod.LiftedState
import typings.reduxDevtoolsInstrument.mod.PerformAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDockMonitorMod extends Shortcut {
  
  @JSImport("redux-devtools-dock-monitor/lib/DockMonitor", JSImport.Default)
  @js.native
  val default: ComponentClassExternalPro | FunctionComponentExternal = js.native
  
  trait DefaultProps extends StObject {
    
    var defaultIsVisible: Boolean
    
    var defaultPosition: left | top | right | bottom
    
    var defaultSize: Double
    
    var fluid: Boolean
  }
  object DefaultProps {
    
    inline def apply(
      defaultIsVisible: Boolean,
      defaultPosition: left | top | right | bottom,
      defaultSize: Double,
      fluid: Boolean
    ): DefaultProps = {
      val __obj = js.Dynamic.literal(defaultIsVisible = defaultIsVisible.asInstanceOf[js.Any], defaultPosition = defaultPosition.asInstanceOf[js.Any], defaultSize = defaultSize.asInstanceOf[js.Any], fluid = fluid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps]
    }
    
    extension [Self <: DefaultProps](x: Self) {
      
      inline def setDefaultIsVisible(value: Boolean): Self = StObject.set(x, "defaultIsVisible", value.asInstanceOf[js.Any])
      
      inline def setDefaultPosition(value: left | top | right | bottom): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      inline def setDefaultSize(value: Double): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
    }
  }
  
  trait DockMonitorProps[S, A /* <: Action[Any] */]
    extends StObject
       with LiftedState[S, A, DockMonitorState] {
    
    var changeMonitorKey: js.UndefOr[String] = js.undefined
    
    var changePositionKey: String
    
    var children: (Monitor[S, A, LiftedState[S, A, Any], Any, Action[Any]]) | (js.Array[Monitor[S, A, LiftedState[S, A, Any], Any, Action[Any]]])
    
    var defaultIsVisible: Boolean
    
    var defaultPosition: left | top | right | bottom
    
    var defaultSize: Double
    
    var dispatch: Dispatch[DockMonitorAction]
    
    var fluid: Boolean
    
    var toggleVisibilityKey: String
  }
  object DockMonitorProps {
    
    inline def apply[S, A /* <: Action[Any] */](
      actionsById: NumberDictionary[PerformAction[A]],
      changePositionKey: String,
      children: (Monitor[S, A, LiftedState[S, A, Any], Any, Action[Any]]) | (js.Array[Monitor[S, A, LiftedState[S, A, Any], Any, Action[Any]]]),
      committedState: S,
      computedStates: js.Array[Error[S]],
      currentStateIndex: Double,
      defaultIsVisible: Boolean,
      defaultPosition: left | top | right | bottom,
      defaultSize: Double,
      dispatch: DockMonitorAction => DockMonitorAction,
      fluid: Boolean,
      isLocked: Boolean,
      isPaused: Boolean,
      monitorState: DockMonitorState,
      nextActionId: Double,
      skippedActionIds: js.Array[Double],
      stagedActionIds: js.Array[Double],
      toggleVisibilityKey: String
    ): DockMonitorProps[S, A] = {
      val __obj = js.Dynamic.literal(actionsById = actionsById.asInstanceOf[js.Any], changePositionKey = changePositionKey.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], committedState = committedState.asInstanceOf[js.Any], computedStates = computedStates.asInstanceOf[js.Any], currentStateIndex = currentStateIndex.asInstanceOf[js.Any], defaultIsVisible = defaultIsVisible.asInstanceOf[js.Any], defaultPosition = defaultPosition.asInstanceOf[js.Any], defaultSize = defaultSize.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), fluid = fluid.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], monitorState = monitorState.asInstanceOf[js.Any], nextActionId = nextActionId.asInstanceOf[js.Any], skippedActionIds = skippedActionIds.asInstanceOf[js.Any], stagedActionIds = stagedActionIds.asInstanceOf[js.Any], toggleVisibilityKey = toggleVisibilityKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[DockMonitorProps[S, A]]
    }
    
    extension [Self <: DockMonitorProps[?, ?], S, A /* <: Action[Any] */](x: Self & (DockMonitorProps[S, A])) {
      
      inline def setChangeMonitorKey(value: String): Self = StObject.set(x, "changeMonitorKey", value.asInstanceOf[js.Any])
      
      inline def setChangeMonitorKeyUndefined: Self = StObject.set(x, "changeMonitorKey", js.undefined)
      
      inline def setChangePositionKey(value: String): Self = StObject.set(x, "changePositionKey", value.asInstanceOf[js.Any])
      
      inline def setChildren(
        value: (Monitor[S, A, LiftedState[S, A, Any], Any, Action[Any]]) | (js.Array[Monitor[S, A, LiftedState[S, A, Any], Any, Action[Any]]])
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (Monitor[S, A, LiftedState[S, A, Any], Any, Action[Any]])*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDefaultIsVisible(value: Boolean): Self = StObject.set(x, "defaultIsVisible", value.asInstanceOf[js.Any])
      
      inline def setDefaultPosition(value: left | top | right | bottom): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      inline def setDefaultSize(value: Double): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      inline def setDispatch(value: DockMonitorAction => DockMonitorAction): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setToggleVisibilityKey(value: String): Self = StObject.set(x, "toggleVisibilityKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExternalProps[S, A /* <: Action[Any] */] extends StObject {
    
    var changeMonitorKey: js.UndefOr[String] = js.undefined
    
    var changePositionKey: String
    
    var children: (Monitor[S, A, LiftedState[S, A, Any], Any, Action[Any]]) | (js.Array[Monitor[S, A, LiftedState[S, A, Any], Any, Action[Any]]])
    
    var defaultIsVisible: Boolean
    
    var defaultPosition: left | top | right | bottom
    
    var defaultSize: Double
    
    var dispatch: Dispatch[DockMonitorAction]
    
    var fluid: Boolean
    
    var toggleVisibilityKey: String
  }
  object ExternalProps {
    
    inline def apply[S, A /* <: Action[Any] */](
      changePositionKey: String,
      children: (Monitor[S, A, LiftedState[S, A, Any], Any, Action[Any]]) | (js.Array[Monitor[S, A, LiftedState[S, A, Any], Any, Action[Any]]]),
      defaultIsVisible: Boolean,
      defaultPosition: left | top | right | bottom,
      defaultSize: Double,
      dispatch: DockMonitorAction => DockMonitorAction,
      fluid: Boolean,
      toggleVisibilityKey: String
    ): ExternalProps[S, A] = {
      val __obj = js.Dynamic.literal(changePositionKey = changePositionKey.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], defaultIsVisible = defaultIsVisible.asInstanceOf[js.Any], defaultPosition = defaultPosition.asInstanceOf[js.Any], defaultSize = defaultSize.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), fluid = fluid.asInstanceOf[js.Any], toggleVisibilityKey = toggleVisibilityKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalProps[S, A]]
    }
    
    extension [Self <: ExternalProps[?, ?], S, A /* <: Action[Any] */](x: Self & (ExternalProps[S, A])) {
      
      inline def setChangeMonitorKey(value: String): Self = StObject.set(x, "changeMonitorKey", value.asInstanceOf[js.Any])
      
      inline def setChangeMonitorKeyUndefined: Self = StObject.set(x, "changeMonitorKey", js.undefined)
      
      inline def setChangePositionKey(value: String): Self = StObject.set(x, "changePositionKey", value.asInstanceOf[js.Any])
      
      inline def setChildren(
        value: (Monitor[S, A, LiftedState[S, A, Any], Any, Action[Any]]) | (js.Array[Monitor[S, A, LiftedState[S, A, Any], Any, Action[Any]]])
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (Monitor[S, A, LiftedState[S, A, Any], Any, Action[Any]])*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDefaultIsVisible(value: Boolean): Self = StObject.set(x, "defaultIsVisible", value.asInstanceOf[js.Any])
      
      inline def setDefaultPosition(value: left | top | right | bottom): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      inline def setDefaultSize(value: Double): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      inline def setDispatch(value: DockMonitorAction => DockMonitorAction): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setToggleVisibilityKey(value: String): Self = StObject.set(x, "toggleVisibilityKey", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentClassExternalPro | FunctionComponentExternal
  
  /* This means you don't have to write `default`, but can instead just say `libDockMonitorMod.foo` */
  override def _to: ComponentClassExternalPro | FunctionComponentExternal = default
}
