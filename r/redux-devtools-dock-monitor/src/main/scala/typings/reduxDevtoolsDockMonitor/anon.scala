package typings.reduxDevtoolsDockMonitor

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.redux.mod.Action
import typings.redux.mod.Dispatch
import typings.reduxDevtools.libCreateDevToolsMod.Monitor
import typings.reduxDevtoolsDockMonitor.libActionsMod.DockMonitorAction
import typings.reduxDevtoolsDockMonitor.libDockMonitorMod.ExternalProps
import typings.reduxDevtoolsDockMonitor.libReducersMod.DockMonitorState
import typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.bottom
import typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.left
import typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.right
import typings.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.top
import typings.reduxDevtoolsInstrument.mod.LiftedState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined react.react.ComponentClass<redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/DockMonitor.ExternalProps<unknown, redux.redux.Action<unknown>>, any> & {update (monitorProps : redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/DockMonitor.ExternalProps<unknown, redux.redux.Action<unknown>>, state : redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/reducers.DockMonitorState | undefined, action : redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/actions.DockMonitorAction): redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/reducers.DockMonitorState,   defaultProps :redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/DockMonitor.DefaultProps} */
  @js.native
  trait ComponentClassExternalPro
    extends StObject
       with Instantiable1[
          /* props */ ExternalProps[Any, Action[Any]], 
          Component[ExternalProps[Any, Action[Any]], Any, Any]
        ]
       with Instantiable2[
          /* props */ ExternalProps[Any, Action[Any]], 
          /* context */ Any, 
          Component[ExternalProps[Any, Action[Any]], Any, Any]
        ] {
    
    var childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    
    var contextType: js.UndefOr[Context[Any]] = js.native
    
    var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    
    var defaultProps: js.UndefOr[PartialExternalPropsunkno] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[ExternalProps[Any, Action[Any]], Any]] = js.native
    
    var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[ExternalProps[Any, Action[Any]], Any]] = js.native
    
    var propTypes: js.UndefOr[WeakValidationMapExternal] = js.native
    
    def update(monitorProps: ExternalProps[Any, Action[Any]], state: Unit, action: DockMonitorAction): DockMonitorState = js.native
    def update(monitorProps: ExternalProps[Any, Action[Any]], state: DockMonitorState, action: DockMonitorAction): DockMonitorState = js.native
  }
  
  /* Inlined react.react.FunctionComponent<redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/DockMonitor.ExternalProps<unknown, redux.redux.Action<unknown>>> & {update (monitorProps : redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/DockMonitor.ExternalProps<unknown, redux.redux.Action<unknown>>, state : redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/reducers.DockMonitorState | undefined, action : redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/actions.DockMonitorAction): redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/reducers.DockMonitorState,   defaultProps :redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/DockMonitor.DefaultProps} */
  @js.native
  trait FunctionComponentExternal extends StObject {
    
    def apply(props: ExternalProps[Any, Action[Any]]): ReactElement | Null = js.native
    def apply(props: ExternalProps[Any, Action[Any]], context: Any): ReactElement | Null = js.native
    
    var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    
    var defaultProps: js.UndefOr[PartialExternalPropsunkno] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var propTypes: js.UndefOr[WeakValidationMapExternal] = js.native
    
    def update(monitorProps: ExternalProps[Any, Action[Any]], state: Unit, action: DockMonitorAction): DockMonitorState = js.native
    def update(monitorProps: ExternalProps[Any, Action[Any]], state: DockMonitorState, action: DockMonitorAction): DockMonitorState = js.native
  }
  
  /* Inlined std.Partial<redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/reducers.DockMonitorState> */
  trait PartialDockMonitorState extends StObject {
    
    var childMonitorIndex: js.UndefOr[Double] = js.undefined
    
    var childMonitorStates: js.UndefOr[js.Array[Any]] = js.undefined
    
    var isVisible: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[left | top | right | bottom] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object PartialDockMonitorState {
    
    inline def apply(): PartialDockMonitorState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDockMonitorState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialDockMonitorState] (val x: Self) extends AnyVal {
      
      inline def setChildMonitorIndex(value: Double): Self = StObject.set(x, "childMonitorIndex", value.asInstanceOf[js.Any])
      
      inline def setChildMonitorIndexUndefined: Self = StObject.set(x, "childMonitorIndex", js.undefined)
      
      inline def setChildMonitorStates(value: js.Array[Any]): Self = StObject.set(x, "childMonitorStates", value.asInstanceOf[js.Any])
      
      inline def setChildMonitorStatesUndefined: Self = StObject.set(x, "childMonitorStates", js.undefined)
      
      inline def setChildMonitorStatesVarargs(value: Any*): Self = StObject.set(x, "childMonitorStates", js.Array(value*))
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      inline def setPosition(value: left | top | right | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Inlined std.Partial<redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/DockMonitor.ExternalProps<unknown, redux.redux.Action<unknown>>> */
  trait PartialExternalPropsunkno extends StObject {
    
    var changeMonitorKey: js.UndefOr[String] = js.undefined
    
    var changePositionKey: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[
        (Monitor[Any, Action[Any], LiftedState[Any, Action[Any], Any], Any, Action[Any]]) | (js.Array[Monitor[Any, Action[Any], LiftedState[Any, Action[Any], Any], Any, Action[Any]]])
      ] = js.undefined
    
    var defaultIsVisible: js.UndefOr[Boolean] = js.undefined
    
    var defaultPosition: js.UndefOr[left | top | right | bottom] = js.undefined
    
    var defaultSize: js.UndefOr[Double] = js.undefined
    
    var dispatch: js.UndefOr[Dispatch[DockMonitorAction]] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var toggleVisibilityKey: js.UndefOr[String] = js.undefined
  }
  object PartialExternalPropsunkno {
    
    inline def apply(): PartialExternalPropsunkno = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialExternalPropsunkno]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialExternalPropsunkno] (val x: Self) extends AnyVal {
      
      inline def setChangeMonitorKey(value: String): Self = StObject.set(x, "changeMonitorKey", value.asInstanceOf[js.Any])
      
      inline def setChangeMonitorKeyUndefined: Self = StObject.set(x, "changeMonitorKey", js.undefined)
      
      inline def setChangePositionKey(value: String): Self = StObject.set(x, "changePositionKey", value.asInstanceOf[js.Any])
      
      inline def setChangePositionKeyUndefined: Self = StObject.set(x, "changePositionKey", js.undefined)
      
      inline def setChildren(
        value: (Monitor[Any, Action[Any], LiftedState[Any, Action[Any], Any], Any, Action[Any]]) | (js.Array[Monitor[Any, Action[Any], LiftedState[Any, Action[Any], Any], Any, Action[Any]]])
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Monitor[Any, Action[Any], LiftedState[Any, Action[Any], Any], Any, Action[Any]])*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDefaultIsVisible(value: Boolean): Self = StObject.set(x, "defaultIsVisible", value.asInstanceOf[js.Any])
      
      inline def setDefaultIsVisibleUndefined: Self = StObject.set(x, "defaultIsVisible", js.undefined)
      
      inline def setDefaultPosition(value: left | top | right | bottom): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      inline def setDefaultPositionUndefined: Self = StObject.set(x, "defaultPosition", js.undefined)
      
      inline def setDefaultSize(value: Double): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      inline def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      inline def setDispatch(value: DockMonitorAction => DockMonitorAction): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setToggleVisibilityKey(value: String): Self = StObject.set(x, "toggleVisibilityKey", value.asInstanceOf[js.Any])
      
      inline def setToggleVisibilityKeyUndefined: Self = StObject.set(x, "toggleVisibilityKey", js.undefined)
    }
  }
  
  /* Inlined react.react.WeakValidationMap<redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/DockMonitor.ExternalProps<unknown, redux.redux.Action<unknown>>> */
  trait WeakValidationMapExternal extends StObject {
    
    var changeMonitorKey: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ] = js.undefined
    
    var changePositionKey: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string ? react.react.Validator<string | null | undefined> : undefined extends string ? react.react.Validator<string | null | undefined> : react.react.Validator<string> */ js.Any
      ] = js.undefined
    
    var children: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>> | std.Array<redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>>> ? react.react.Validator<redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>> | std.Array<redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>>> | null | undefined> : undefined extends redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>> | std.Array<redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>>> ? react.react.Validator<redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>> | std.Array<redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>>> | null | undefined> : react.react.Validator<redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>> | std.Array<redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>>>> */ js.Any
      ] = js.undefined
    
    var defaultIsVisible: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean ? react.react.Validator<boolean | null | undefined> : undefined extends boolean ? react.react.Validator<boolean | null | undefined> : react.react.Validator<boolean> */ js.Any
      ] = js.undefined
    
    var defaultPosition: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends 'left' | 'top' | 'right' | 'bottom' ? react.react.Validator<'left' | 'top' | 'right' | 'bottom' | null | undefined> : undefined extends 'left' | 'top' | 'right' | 'bottom' ? react.react.Validator<'left' | 'top' | 'right' | 'bottom' | null | undefined> : react.react.Validator<'left' | 'top' | 'right' | 'bottom'> */ js.Any
      ] = js.undefined
    
    var defaultSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends number ? react.react.Validator<number | null | undefined> : undefined extends number ? react.react.Validator<number | null | undefined> : react.react.Validator<number> */ js.Any
      ] = js.undefined
    
    var dispatch: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends redux.redux.Dispatch<redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/actions.DockMonitorAction> ? react.react.Validator<redux.redux.Dispatch<redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/actions.DockMonitorAction> | null | undefined> : undefined extends redux.redux.Dispatch<redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/actions.DockMonitorAction> ? react.react.Validator<redux.redux.Dispatch<redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/actions.DockMonitorAction> | null | undefined> : react.react.Validator<redux.redux.Dispatch<redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/actions.DockMonitorAction>> */ js.Any
      ] = js.undefined
    
    var fluid: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean ? react.react.Validator<boolean | null | undefined> : undefined extends boolean ? react.react.Validator<boolean | null | undefined> : react.react.Validator<boolean> */ js.Any
      ] = js.undefined
    
    var toggleVisibilityKey: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends string ? react.react.Validator<string | null | undefined> : undefined extends string ? react.react.Validator<string | null | undefined> : react.react.Validator<string> */ js.Any
      ] = js.undefined
  }
  object WeakValidationMapExternal {
    
    inline def apply(): WeakValidationMapExternal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WeakValidationMapExternal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WeakValidationMapExternal] (val x: Self) extends AnyVal {
      
      inline def setChangeMonitorKey(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
      ): Self = StObject.set(x, "changeMonitorKey", value.asInstanceOf[js.Any])
      
      inline def setChangeMonitorKeyUndefined: Self = StObject.set(x, "changeMonitorKey", js.undefined)
      
      inline def setChangePositionKey(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string ? react.react.Validator<string | null | undefined> : undefined extends string ? react.react.Validator<string | null | undefined> : react.react.Validator<string> */ js.Any
      ): Self = StObject.set(x, "changePositionKey", value.asInstanceOf[js.Any])
      
      inline def setChangePositionKeyUndefined: Self = StObject.set(x, "changePositionKey", js.undefined)
      
      inline def setChildren(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>> | std.Array<redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>>> ? react.react.Validator<redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>> | std.Array<redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>>> | null | undefined> : undefined extends redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>> | std.Array<redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>>> ? react.react.Validator<redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>> | std.Array<redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>>> | null | undefined> : react.react.Validator<redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>> | std.Array<redux-devtools.redux-devtools/lib/createDevTools.Monitor<unknown, redux.redux.Action<unknown>, redux-devtools-instrument.redux-devtools-instrument.LiftedState<unknown, redux.redux.Action<unknown>, unknown>, unknown, redux.redux.Action<unknown>>>> */ js.Any
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultIsVisible(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean ? react.react.Validator<boolean | null | undefined> : undefined extends boolean ? react.react.Validator<boolean | null | undefined> : react.react.Validator<boolean> */ js.Any
      ): Self = StObject.set(x, "defaultIsVisible", value.asInstanceOf[js.Any])
      
      inline def setDefaultIsVisibleUndefined: Self = StObject.set(x, "defaultIsVisible", js.undefined)
      
      inline def setDefaultPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends 'left' | 'top' | 'right' | 'bottom' ? react.react.Validator<'left' | 'top' | 'right' | 'bottom' | null | undefined> : undefined extends 'left' | 'top' | 'right' | 'bottom' ? react.react.Validator<'left' | 'top' | 'right' | 'bottom' | null | undefined> : react.react.Validator<'left' | 'top' | 'right' | 'bottom'> */ js.Any
      ): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      inline def setDefaultPositionUndefined: Self = StObject.set(x, "defaultPosition", js.undefined)
      
      inline def setDefaultSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends number ? react.react.Validator<number | null | undefined> : undefined extends number ? react.react.Validator<number | null | undefined> : react.react.Validator<number> */ js.Any
      ): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      inline def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      inline def setDispatch(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends redux.redux.Dispatch<redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/actions.DockMonitorAction> ? react.react.Validator<redux.redux.Dispatch<redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/actions.DockMonitorAction> | null | undefined> : undefined extends redux.redux.Dispatch<redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/actions.DockMonitorAction> ? react.react.Validator<redux.redux.Dispatch<redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/actions.DockMonitorAction> | null | undefined> : react.react.Validator<redux.redux.Dispatch<redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/actions.DockMonitorAction>> */ js.Any
      ): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
      
      inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      inline def setFluid(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean ? react.react.Validator<boolean | null | undefined> : undefined extends boolean ? react.react.Validator<boolean | null | undefined> : react.react.Validator<boolean> */ js.Any
      ): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setToggleVisibilityKey(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string ? react.react.Validator<string | null | undefined> : undefined extends string ? react.react.Validator<string | null | undefined> : react.react.Validator<string> */ js.Any
      ): Self = StObject.set(x, "toggleVisibilityKey", value.asInstanceOf[js.Any])
      
      inline def setToggleVisibilityKeyUndefined: Self = StObject.set(x, "toggleVisibilityKey", js.undefined)
    }
  }
}
