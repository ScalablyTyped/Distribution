package typings.reduxDevtoolsLogMonitor

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.base16.mod.Base16Theme
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.reduxDevtoolsDockMonitor.libActionsMod.DockMonitorAction
import typings.reduxDevtoolsDockMonitor.libReducersMod.DockMonitorState
import typings.reduxDevtoolsInstrument.mod.LiftedAction
import typings.reduxDevtoolsLogMonitor.libActionsMod.LogMonitorAction
import typings.reduxDevtoolsLogMonitor.libLogMonitorMod.ExternalProps
import typings.reduxDevtoolsLogMonitor.libReducersMod.LogMonitorState
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.apathy
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.ashes
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.atelierDune
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.atelierForest
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.atelierHeath
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.atelierLakeside
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.atelierSeaside
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.bespin
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.brewer
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.bright
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.chalk
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.codeschool
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.colors
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.eighties
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.embers
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.flat
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.google
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.grayscale
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.greenscreen
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.harmonic
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.hopscotch
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.isotope
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.marrakesh
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.mocha
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.monokai
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.nicinabox
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.ocean
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.paraiso
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.pop
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.railscasts
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.shapeshifter
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.solarized
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.summerfruit
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.threezerotwofour
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.tomorrow
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.tube
import typings.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.twilight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action extends StObject {
    
    var action: Validator[js.Object]
    
    var actionId: Validator[Double]
    
    var collapsed: Requireable[Boolean]
    
    var error: Requireable[String]
    
    var expandActionRoot: Requireable[Boolean]
    
    var expandStateRoot: Requireable[Boolean]
    
    var inFuture: Requireable[Boolean]
    
    var onActionClick: Validator[js.Function1[/* repeated */ Any, Any]]
    
    var onActionShiftClick: Validator[js.Function1[/* repeated */ Any, Any]]
    
    var previousState: Requireable[js.Object]
    
    var select: Validator[js.Function1[/* repeated */ Any, Any]]
    
    var selected: Requireable[Boolean]
    
    var state: Validator[js.Object]
  }
  object Action {
    
    inline def apply(
      action: Validator[js.Object],
      actionId: Validator[Double],
      collapsed: Requireable[Boolean],
      error: Requireable[String],
      expandActionRoot: Requireable[Boolean],
      expandStateRoot: Requireable[Boolean],
      inFuture: Requireable[Boolean],
      onActionClick: Validator[js.Function1[/* repeated */ Any, Any]],
      onActionShiftClick: Validator[js.Function1[/* repeated */ Any, Any]],
      previousState: Requireable[js.Object],
      select: Validator[js.Function1[/* repeated */ Any, Any]],
      selected: Requireable[Boolean],
      state: Validator[js.Object]
    ): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], actionId = actionId.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expandActionRoot = expandActionRoot.asInstanceOf[js.Any], expandStateRoot = expandStateRoot.asInstanceOf[js.Any], inFuture = inFuture.asInstanceOf[js.Any], onActionClick = onActionClick.asInstanceOf[js.Any], onActionShiftClick = onActionShiftClick.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      inline def setAction(value: Validator[js.Object]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionId(value: Validator[Double]): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
      
      inline def setCollapsed(value: Requireable[Boolean]): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setError(value: Requireable[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setExpandActionRoot(value: Requireable[Boolean]): Self = StObject.set(x, "expandActionRoot", value.asInstanceOf[js.Any])
      
      inline def setExpandStateRoot(value: Requireable[Boolean]): Self = StObject.set(x, "expandStateRoot", value.asInstanceOf[js.Any])
      
      inline def setInFuture(value: Requireable[Boolean]): Self = StObject.set(x, "inFuture", value.asInstanceOf[js.Any])
      
      inline def setOnActionClick(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onActionClick", value.asInstanceOf[js.Any])
      
      inline def setOnActionShiftClick(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onActionShiftClick", value.asInstanceOf[js.Any])
      
      inline def setPreviousState(value: Requireable[js.Object]): Self = StObject.set(x, "previousState", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Requireable[Boolean]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setState(value: Validator[js.Object]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait ActionsById extends StObject {
    
    var actionsById: Requireable[js.Object]
    
    var computedStates: Requireable[js.Array[Any]]
    
    var consecutiveToggleStartId: Requireable[Double]
    
    var currentStateIndex: Requireable[Double]
    
    var expandActionRoot: Requireable[Boolean]
    
    var expandStateRoot: Requireable[Boolean]
    
    var onActionClick: Validator[js.Function1[/* repeated */ Any, Any]]
    
    var select: Validator[js.Function1[/* repeated */ Any, Any]]
    
    var skippedActionIds: Requireable[js.Array[Any]]
    
    var stagedActionIds: Requireable[js.Array[Any]]
    
    var theme: Requireable[String | js.Object]
  }
  object ActionsById {
    
    inline def apply(
      actionsById: Requireable[js.Object],
      computedStates: Requireable[js.Array[Any]],
      consecutiveToggleStartId: Requireable[Double],
      currentStateIndex: Requireable[Double],
      expandActionRoot: Requireable[Boolean],
      expandStateRoot: Requireable[Boolean],
      onActionClick: Validator[js.Function1[/* repeated */ Any, Any]],
      select: Validator[js.Function1[/* repeated */ Any, Any]],
      skippedActionIds: Requireable[js.Array[Any]],
      stagedActionIds: Requireable[js.Array[Any]],
      theme: Requireable[String | js.Object]
    ): ActionsById = {
      val __obj = js.Dynamic.literal(actionsById = actionsById.asInstanceOf[js.Any], computedStates = computedStates.asInstanceOf[js.Any], consecutiveToggleStartId = consecutiveToggleStartId.asInstanceOf[js.Any], currentStateIndex = currentStateIndex.asInstanceOf[js.Any], expandActionRoot = expandActionRoot.asInstanceOf[js.Any], expandStateRoot = expandStateRoot.asInstanceOf[js.Any], onActionClick = onActionClick.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], skippedActionIds = skippedActionIds.asInstanceOf[js.Any], stagedActionIds = stagedActionIds.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionsById]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionsById] (val x: Self) extends AnyVal {
      
      inline def setActionsById(value: Requireable[js.Object]): Self = StObject.set(x, "actionsById", value.asInstanceOf[js.Any])
      
      inline def setComputedStates(value: Requireable[js.Array[Any]]): Self = StObject.set(x, "computedStates", value.asInstanceOf[js.Any])
      
      inline def setConsecutiveToggleStartId(value: Requireable[Double]): Self = StObject.set(x, "consecutiveToggleStartId", value.asInstanceOf[js.Any])
      
      inline def setCurrentStateIndex(value: Requireable[Double]): Self = StObject.set(x, "currentStateIndex", value.asInstanceOf[js.Any])
      
      inline def setExpandActionRoot(value: Requireable[Boolean]): Self = StObject.set(x, "expandActionRoot", value.asInstanceOf[js.Any])
      
      inline def setExpandStateRoot(value: Requireable[Boolean]): Self = StObject.set(x, "expandStateRoot", value.asInstanceOf[js.Any])
      
      inline def setOnActionClick(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onActionClick", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSkippedActionIds(value: Requireable[js.Array[Any]]): Self = StObject.set(x, "skippedActionIds", value.asInstanceOf[js.Any])
      
      inline def setStagedActionIds(value: Requireable[js.Array[Any]]): Self = StObject.set(x, "stagedActionIds", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Requireable[String | js.Object]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.ComponentClass<redux-devtools-log-monitor.redux-devtools-log-monitor/lib/LogMonitor.ExternalProps<unknown, redux.redux.Action<unknown>>, any> & {update (monitorProps : redux-devtools-log-monitor.redux-devtools-log-monitor/lib/LogMonitor.ExternalProps<unknown, redux.redux.Action<unknown>>, state : redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/reducers.DockMonitorState | undefined, action : redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/actions.DockMonitorAction): redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/reducers.DockMonitorState,   defaultProps :redux-devtools-log-monitor.redux-devtools-log-monitor/lib/LogMonitor.DefaultProps<unknown>} */
  @js.native
  trait ComponentClassExternalPro
    extends StObject
       with Instantiable1[
          /* props */ ExternalProps[Any, typings.redux.mod.Action[Any]], 
          Component[ExternalProps[Any, typings.redux.mod.Action[Any]], Any, Any]
        ]
       with Instantiable2[
          /* props */ ExternalProps[Any, typings.redux.mod.Action[Any]], 
          /* context */ Any, 
          Component[ExternalProps[Any, typings.redux.mod.Action[Any]], Any, Any]
        ] {
    
    var childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    
    var contextType: js.UndefOr[Context[Any]] = js.native
    
    var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    
    var defaultProps: js.UndefOr[PartialExternalPropsunkno] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[ExternalProps[Any, typings.redux.mod.Action[Any]], Any]] = js.native
    
    var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[ExternalProps[Any, typings.redux.mod.Action[Any]], Any]] = js.native
    
    var propTypes: js.UndefOr[WeakValidationMapExternal] = js.native
    
    def update(
      monitorProps: ExternalProps[Any, typings.redux.mod.Action[Any]],
      state: Unit,
      action: DockMonitorAction
    ): DockMonitorState = js.native
    def update(
      monitorProps: ExternalProps[Any, typings.redux.mod.Action[Any]],
      state: DockMonitorState,
      action: DockMonitorAction
    ): DockMonitorState = js.native
  }
  
  trait Dispatch extends StObject {
    
    var dispatch: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var theme: Requireable[js.Object]
  }
  object Dispatch {
    
    inline def apply(dispatch: Requireable[js.Function1[/* repeated */ Any, Any]], theme: Requireable[js.Object]): Dispatch = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dispatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dispatch] (val x: Self) extends AnyVal {
      
      inline def setDispatch(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Requireable[js.Object]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error[?], S] (val x: Self & Error[S]) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setState(value: S): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.FunctionComponent<redux-devtools-log-monitor.redux-devtools-log-monitor/lib/LogMonitor.ExternalProps<unknown, redux.redux.Action<unknown>>> & {update (monitorProps : redux-devtools-log-monitor.redux-devtools-log-monitor/lib/LogMonitor.ExternalProps<unknown, redux.redux.Action<unknown>>, state : redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/reducers.DockMonitorState | undefined, action : redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/actions.DockMonitorAction): redux-devtools-dock-monitor.redux-devtools-dock-monitor/lib/reducers.DockMonitorState,   defaultProps :redux-devtools-log-monitor.redux-devtools-log-monitor/lib/LogMonitor.DefaultProps<unknown>} */
  @js.native
  trait FunctionComponentExternal extends StObject {
    
    def apply(props: ExternalProps[Any, typings.redux.mod.Action[Any]]): ReactElement | Null = js.native
    def apply(props: ExternalProps[Any, typings.redux.mod.Action[Any]], context: Any): ReactElement | Null = js.native
    
    var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    
    var defaultProps: js.UndefOr[PartialExternalPropsunkno] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var propTypes: js.UndefOr[WeakValidationMapExternal] = js.native
    
    def update(
      monitorProps: ExternalProps[Any, typings.redux.mod.Action[Any]],
      state: Unit,
      action: DockMonitorAction
    ): DockMonitorState = js.native
    def update(
      monitorProps: ExternalProps[Any, typings.redux.mod.Action[Any]],
      state: DockMonitorState,
      action: DockMonitorAction
    ): DockMonitorState = js.native
  }
  
  /* Inlined std.Partial<redux-devtools-log-monitor.redux-devtools-log-monitor/lib/LogMonitor.ExternalProps<unknown, redux.redux.Action<unknown>>> */
  trait PartialExternalPropsunkno extends StObject {
    
    var dispatch: js.UndefOr[
        typings.redux.mod.Dispatch[
          LogMonitorAction | (LiftedAction[Any, typings.redux.mod.Action[Any], LogMonitorState])
        ]
      ] = js.undefined
    
    var expandActionRoot: js.UndefOr[Boolean] = js.undefined
    
    var expandStateRoot: js.UndefOr[Boolean] = js.undefined
    
    var hideMainButtons: js.UndefOr[Boolean] = js.undefined
    
    var markStateDiff: js.UndefOr[Boolean] = js.undefined
    
    var preserveScrollTop: js.UndefOr[Boolean] = js.undefined
    
    var select: js.UndefOr[js.Function1[/* state */ Any, Any]] = js.undefined
    
    var theme: js.UndefOr[
        pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | Base16Theme
      ] = js.undefined
  }
  object PartialExternalPropsunkno {
    
    inline def apply(): PartialExternalPropsunkno = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialExternalPropsunkno]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialExternalPropsunkno] (val x: Self) extends AnyVal {
      
      inline def setDispatch(
        value: LogMonitorAction | (LiftedAction[Any, typings.redux.mod.Action[Any], LogMonitorState]) => LogMonitorAction | (LiftedAction[Any, typings.redux.mod.Action[Any], LogMonitorState])
      ): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      inline def setExpandActionRoot(value: Boolean): Self = StObject.set(x, "expandActionRoot", value.asInstanceOf[js.Any])
      
      inline def setExpandActionRootUndefined: Self = StObject.set(x, "expandActionRoot", js.undefined)
      
      inline def setExpandStateRoot(value: Boolean): Self = StObject.set(x, "expandStateRoot", value.asInstanceOf[js.Any])
      
      inline def setExpandStateRootUndefined: Self = StObject.set(x, "expandStateRoot", js.undefined)
      
      inline def setHideMainButtons(value: Boolean): Self = StObject.set(x, "hideMainButtons", value.asInstanceOf[js.Any])
      
      inline def setHideMainButtonsUndefined: Self = StObject.set(x, "hideMainButtons", js.undefined)
      
      inline def setMarkStateDiff(value: Boolean): Self = StObject.set(x, "markStateDiff", value.asInstanceOf[js.Any])
      
      inline def setMarkStateDiffUndefined: Self = StObject.set(x, "markStateDiff", js.undefined)
      
      inline def setPreserveScrollTop(value: Boolean): Self = StObject.set(x, "preserveScrollTop", value.asInstanceOf[js.Any])
      
      inline def setPreserveScrollTopUndefined: Self = StObject.set(x, "preserveScrollTop", js.undefined)
      
      inline def setSelect(value: /* state */ Any => Any): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setTheme(
        value: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | Base16Theme
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Inlined std.Partial<redux-devtools-log-monitor.redux-devtools-log-monitor/lib/reducers.LogMonitorState> */
  trait PartialLogMonitorState extends StObject {
    
    var consecutiveToggleStartId: js.UndefOr[Double | Null] = js.undefined
    
    var initialScrollTop: js.UndefOr[Double] = js.undefined
  }
  object PartialLogMonitorState {
    
    inline def apply(): PartialLogMonitorState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLogMonitorState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialLogMonitorState] (val x: Self) extends AnyVal {
      
      inline def setConsecutiveToggleStartId(value: Double): Self = StObject.set(x, "consecutiveToggleStartId", value.asInstanceOf[js.Any])
      
      inline def setConsecutiveToggleStartIdNull: Self = StObject.set(x, "consecutiveToggleStartId", null)
      
      inline def setConsecutiveToggleStartIdUndefined: Self = StObject.set(x, "consecutiveToggleStartId", js.undefined)
      
      inline def setInitialScrollTop(value: Double): Self = StObject.set(x, "initialScrollTop", value.asInstanceOf[js.Any])
      
      inline def setInitialScrollTopUndefined: Self = StObject.set(x, "initialScrollTop", js.undefined)
    }
  }
  
  trait Typeofthemes extends StObject {
    
    val apathy: Base16Theme
    
    val ashes: Base16Theme
    
    val atelierDune: Base16Theme
    
    val atelierForest: Base16Theme
    
    val atelierHeath: Base16Theme
    
    val atelierLakeside: Base16Theme
    
    val atelierSeaside: Base16Theme
    
    val bespin: Base16Theme
    
    val brewer: Base16Theme
    
    val bright: Base16Theme
    
    val chalk: Base16Theme
    
    val codeschool: Base16Theme
    
    val colors: Base16Theme
    
    val eighties: Base16Theme
    
    val embers: Base16Theme
    
    val flat: Base16Theme
    
    val google: Base16Theme
    
    val grayscale: Base16Theme
    
    val greenscreen: Base16Theme
    
    val harmonic: Base16Theme
    
    val hopscotch: Base16Theme
    
    val isotope: Base16Theme
    
    val marrakesh: Base16Theme
    
    val mocha: Base16Theme
    
    val monokai: Base16Theme
    
    val nicinabox: Base16Theme
    
    val ocean: Base16Theme
    
    val paraiso: Base16Theme
    
    val pop: Base16Theme
    
    val railscasts: Base16Theme
    
    val shapeshifter: Base16Theme
    
    val solarized: Base16Theme
    
    val summerfruit: Base16Theme
    
    val threezerotwofour: Base16Theme
    
    val tomorrow: Base16Theme
    
    val tube: Base16Theme
    
    val twilight: Base16Theme
  }
  object Typeofthemes {
    
    inline def apply(
      apathy: Base16Theme,
      ashes: Base16Theme,
      atelierDune: Base16Theme,
      atelierForest: Base16Theme,
      atelierHeath: Base16Theme,
      atelierLakeside: Base16Theme,
      atelierSeaside: Base16Theme,
      bespin: Base16Theme,
      brewer: Base16Theme,
      bright: Base16Theme,
      chalk: Base16Theme,
      codeschool: Base16Theme,
      colors: Base16Theme,
      eighties: Base16Theme,
      embers: Base16Theme,
      flat: Base16Theme,
      google: Base16Theme,
      grayscale: Base16Theme,
      greenscreen: Base16Theme,
      harmonic: Base16Theme,
      hopscotch: Base16Theme,
      isotope: Base16Theme,
      marrakesh: Base16Theme,
      mocha: Base16Theme,
      monokai: Base16Theme,
      nicinabox: Base16Theme,
      ocean: Base16Theme,
      paraiso: Base16Theme,
      pop: Base16Theme,
      railscasts: Base16Theme,
      shapeshifter: Base16Theme,
      solarized: Base16Theme,
      summerfruit: Base16Theme,
      threezerotwofour: Base16Theme,
      tomorrow: Base16Theme,
      tube: Base16Theme,
      twilight: Base16Theme
    ): Typeofthemes = {
      val __obj = js.Dynamic.literal(apathy = apathy.asInstanceOf[js.Any], ashes = ashes.asInstanceOf[js.Any], atelierDune = atelierDune.asInstanceOf[js.Any], atelierForest = atelierForest.asInstanceOf[js.Any], atelierHeath = atelierHeath.asInstanceOf[js.Any], atelierLakeside = atelierLakeside.asInstanceOf[js.Any], atelierSeaside = atelierSeaside.asInstanceOf[js.Any], bespin = bespin.asInstanceOf[js.Any], brewer = brewer.asInstanceOf[js.Any], bright = bright.asInstanceOf[js.Any], chalk = chalk.asInstanceOf[js.Any], codeschool = codeschool.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], eighties = eighties.asInstanceOf[js.Any], embers = embers.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any], google = google.asInstanceOf[js.Any], grayscale = grayscale.asInstanceOf[js.Any], greenscreen = greenscreen.asInstanceOf[js.Any], harmonic = harmonic.asInstanceOf[js.Any], hopscotch = hopscotch.asInstanceOf[js.Any], isotope = isotope.asInstanceOf[js.Any], marrakesh = marrakesh.asInstanceOf[js.Any], mocha = mocha.asInstanceOf[js.Any], monokai = monokai.asInstanceOf[js.Any], nicinabox = nicinabox.asInstanceOf[js.Any], ocean = ocean.asInstanceOf[js.Any], paraiso = paraiso.asInstanceOf[js.Any], pop = pop.asInstanceOf[js.Any], railscasts = railscasts.asInstanceOf[js.Any], shapeshifter = shapeshifter.asInstanceOf[js.Any], solarized = solarized.asInstanceOf[js.Any], summerfruit = summerfruit.asInstanceOf[js.Any], threezerotwofour = threezerotwofour.asInstanceOf[js.Any], tomorrow = tomorrow.asInstanceOf[js.Any], tube = tube.asInstanceOf[js.Any], twilight = twilight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofthemes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Typeofthemes] (val x: Self) extends AnyVal {
      
      inline def setApathy(value: Base16Theme): Self = StObject.set(x, "apathy", value.asInstanceOf[js.Any])
      
      inline def setAshes(value: Base16Theme): Self = StObject.set(x, "ashes", value.asInstanceOf[js.Any])
      
      inline def setAtelierDune(value: Base16Theme): Self = StObject.set(x, "atelierDune", value.asInstanceOf[js.Any])
      
      inline def setAtelierForest(value: Base16Theme): Self = StObject.set(x, "atelierForest", value.asInstanceOf[js.Any])
      
      inline def setAtelierHeath(value: Base16Theme): Self = StObject.set(x, "atelierHeath", value.asInstanceOf[js.Any])
      
      inline def setAtelierLakeside(value: Base16Theme): Self = StObject.set(x, "atelierLakeside", value.asInstanceOf[js.Any])
      
      inline def setAtelierSeaside(value: Base16Theme): Self = StObject.set(x, "atelierSeaside", value.asInstanceOf[js.Any])
      
      inline def setBespin(value: Base16Theme): Self = StObject.set(x, "bespin", value.asInstanceOf[js.Any])
      
      inline def setBrewer(value: Base16Theme): Self = StObject.set(x, "brewer", value.asInstanceOf[js.Any])
      
      inline def setBright(value: Base16Theme): Self = StObject.set(x, "bright", value.asInstanceOf[js.Any])
      
      inline def setChalk(value: Base16Theme): Self = StObject.set(x, "chalk", value.asInstanceOf[js.Any])
      
      inline def setCodeschool(value: Base16Theme): Self = StObject.set(x, "codeschool", value.asInstanceOf[js.Any])
      
      inline def setColors(value: Base16Theme): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setEighties(value: Base16Theme): Self = StObject.set(x, "eighties", value.asInstanceOf[js.Any])
      
      inline def setEmbers(value: Base16Theme): Self = StObject.set(x, "embers", value.asInstanceOf[js.Any])
      
      inline def setFlat(value: Base16Theme): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setGoogle(value: Base16Theme): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
      
      inline def setGrayscale(value: Base16Theme): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
      
      inline def setGreenscreen(value: Base16Theme): Self = StObject.set(x, "greenscreen", value.asInstanceOf[js.Any])
      
      inline def setHarmonic(value: Base16Theme): Self = StObject.set(x, "harmonic", value.asInstanceOf[js.Any])
      
      inline def setHopscotch(value: Base16Theme): Self = StObject.set(x, "hopscotch", value.asInstanceOf[js.Any])
      
      inline def setIsotope(value: Base16Theme): Self = StObject.set(x, "isotope", value.asInstanceOf[js.Any])
      
      inline def setMarrakesh(value: Base16Theme): Self = StObject.set(x, "marrakesh", value.asInstanceOf[js.Any])
      
      inline def setMocha(value: Base16Theme): Self = StObject.set(x, "mocha", value.asInstanceOf[js.Any])
      
      inline def setMonokai(value: Base16Theme): Self = StObject.set(x, "monokai", value.asInstanceOf[js.Any])
      
      inline def setNicinabox(value: Base16Theme): Self = StObject.set(x, "nicinabox", value.asInstanceOf[js.Any])
      
      inline def setOcean(value: Base16Theme): Self = StObject.set(x, "ocean", value.asInstanceOf[js.Any])
      
      inline def setParaiso(value: Base16Theme): Self = StObject.set(x, "paraiso", value.asInstanceOf[js.Any])
      
      inline def setPop(value: Base16Theme): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
      
      inline def setRailscasts(value: Base16Theme): Self = StObject.set(x, "railscasts", value.asInstanceOf[js.Any])
      
      inline def setShapeshifter(value: Base16Theme): Self = StObject.set(x, "shapeshifter", value.asInstanceOf[js.Any])
      
      inline def setSolarized(value: Base16Theme): Self = StObject.set(x, "solarized", value.asInstanceOf[js.Any])
      
      inline def setSummerfruit(value: Base16Theme): Self = StObject.set(x, "summerfruit", value.asInstanceOf[js.Any])
      
      inline def setThreezerotwofour(value: Base16Theme): Self = StObject.set(x, "threezerotwofour", value.asInstanceOf[js.Any])
      
      inline def setTomorrow(value: Base16Theme): Self = StObject.set(x, "tomorrow", value.asInstanceOf[js.Any])
      
      inline def setTube(value: Base16Theme): Self = StObject.set(x, "tube", value.asInstanceOf[js.Any])
      
      inline def setTwilight(value: Base16Theme): Self = StObject.set(x, "twilight", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.WeakValidationMap<redux-devtools-log-monitor.redux-devtools-log-monitor/lib/LogMonitor.ExternalProps<unknown, redux.redux.Action<unknown>>> */
  trait WeakValidationMapExternal extends StObject {
    
    var dispatch: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends redux.redux.Dispatch<redux-devtools-log-monitor.redux-devtools-log-monitor/lib/actions.LogMonitorAction | redux-devtools-instrument.redux-devtools-instrument.LiftedAction<unknown, redux.redux.Action<unknown>, redux-devtools-log-monitor.redux-devtools-log-monitor/lib/reducers.LogMonitorState>> ? react.react.Validator<redux.redux.Dispatch<redux-devtools-log-monitor.redux-devtools-log-monitor/lib/actions.LogMonitorAction | redux-devtools-instrument.redux-devtools-instrument.LiftedAction<unknown, redux.redux.Action<unknown>, redux-devtools-log-monitor.redux-devtools-log-monitor/lib/reducers.LogMonitorState>> | null | undefined> : undefined extends redux.redux.Dispatch<redux-devtools-log-monitor.redux-devtools-log-monitor/lib/actions.LogMonitorAction | redux-devtools-instrument.redux-devtools-instrument.LiftedAction<unknown, redux.redux.Action<unknown>, redux-devtools-log-monitor.redux-devtools-log-monitor/lib/reducers.LogMonitorState>> ? react.react.Validator<redux.redux.Dispatch<redux-devtools-log-monitor.redux-devtools-log-monitor/lib/actions.LogMonitorAction | redux-devtools-instrument.redux-devtools-instrument.LiftedAction<unknown, redux.redux.Action<unknown>, redux-devtools-log-monitor.redux-devtools-log-monitor/lib/reducers.LogMonitorState>> | null | undefined> : react.react.Validator<redux.redux.Dispatch<redux-devtools-log-monitor.redux-devtools-log-monitor/lib/actions.LogMonitorAction | redux-devtools-instrument.redux-devtools-instrument.LiftedAction<unknown, redux.redux.Action<unknown>, redux-devtools-log-monitor.redux-devtools-log-monitor/lib/reducers.LogMonitorState>>> */ js.Any
      ] = js.undefined
    
    var expandActionRoot: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean ? react.react.Validator<boolean | null | undefined> : undefined extends boolean ? react.react.Validator<boolean | null | undefined> : react.react.Validator<boolean> */ js.Any
      ] = js.undefined
    
    var expandStateRoot: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean ? react.react.Validator<boolean | null | undefined> : undefined extends boolean ? react.react.Validator<boolean | null | undefined> : react.react.Validator<boolean> */ js.Any
      ] = js.undefined
    
    var hideMainButtons: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ] = js.undefined
    
    var markStateDiff: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean ? react.react.Validator<boolean | null | undefined> : undefined extends boolean ? react.react.Validator<boolean | null | undefined> : react.react.Validator<boolean> */ js.Any
      ] = js.undefined
    
    var preserveScrollTop: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean ? react.react.Validator<boolean | null | undefined> : undefined extends boolean ? react.react.Validator<boolean | null | undefined> : react.react.Validator<boolean> */ js.Any
      ] = js.undefined
    
    var select: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends (state : unknown): unknown ? react.react.Validator<(state : unknown): unknown | null | undefined> : undefined extends (state : unknown): unknown ? react.react.Validator<(state : unknown): unknown | null | undefined> : react.react.Validator<(state : unknown): unknown> */ js.Any
      ] = js.undefined
    
    var theme: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends keyof { readonly pop :base16.base16.Base16Theme,  readonly atelierForest :base16.base16.Base16Theme,  readonly bespin :base16.base16.Base16Theme,  readonly embers :base16.base16.Base16Theme,  readonly tube :base16.base16.Base16Theme,  readonly bright :base16.base16.Base16Theme,  readonly mocha :base16.base16.Base16Theme,  readonly greenscreen :base16.base16.Base16Theme,  readonly grayscale :base16.base16.Base16Theme,  readonly shapeshifter :base16.base16.Base16Theme,  readonly harmonic :base16.base16.Base16Theme,  readonly chalk :base16.base16.Base16Theme,  readonly paraiso :base16.base16.Base16Theme,  readonly google :base16.base16.Base16Theme,  readonly isotope :base16.base16.Base16Theme,  readonly atelierLakeside :base16.base16.Base16Theme,  readonly twilight :base16.base16.Base16Theme,  readonly eighties :base16.base16.Base16Theme,  readonly nicinabox :base16.base16.Base16Theme,  readonly monokai :base16.base16.Base16Theme,  readonly atelierHeath :base16.base16.Base16Theme,  readonly apathy :base16.base16.Base16Theme,  readonly solarized :base16.base16.Base16Theme,  readonly summerfruit :base16.base16.Base16Theme,  readonly colors :base16.base16.Base16Theme,  readonly atelierSeaside :base16.base16.Base16Theme,  readonly brewer :base16.base16.Base16Theme,  readonly codeschool :base16.base16.Base16Theme,  readonly railscasts :base16.base16.Base16Theme,  readonly threezerotwofour :base16.base16.Base16Theme,  readonly atelierDune :base16.base16.Base16Theme,  readonly tomorrow :base16.base16.Base16Theme,  readonly ocean :base16.base16.Base16Theme,  readonly marrakesh :base16.base16.Base16Theme,  readonly hopscotch :base16.base16.Base16Theme,  readonly flat :base16.base16.Base16Theme,  readonly ashes :base16.base16.Base16Theme} | base16.base16.Base16Theme ? react.react.Validator<keyof { readonly pop :base16.base16.Base16Theme,  readonly atelierForest :base16.base16.Base16Theme,  readonly bespin :base16.base16.Base16Theme,  readonly embers :base16.base16.Base16Theme,  readonly tube :base16.base16.Base16Theme,  readonly bright :base16.base16.Base16Theme,  readonly mocha :base16.base16.Base16Theme,  readonly greenscreen :base16.base16.Base16Theme,  readonly grayscale :base16.base16.Base16Theme,  readonly shapeshifter :base16.base16.Base16Theme,  readonly harmonic :base16.base16.Base16Theme,  readonly chalk :base16.base16.Base16Theme,  readonly paraiso :base16.base16.Base16Theme,  readonly google :base16.base16.Base16Theme,  readonly isotope :base16.base16.Base16Theme,  readonly atelierLakeside :base16.base16.Base16Theme,  readonly twilight :base16.base16.Base16Theme,  readonly eighties :base16.base16.Base16Theme,  readonly nicinabox :base16.base16.Base16Theme,  readonly monokai :base16.base16.Base16Theme,  readonly atelierHeath :base16.base16.Base16Theme,  readonly apathy :base16.base16.Base16Theme,  readonly solarized :base16.base16.Base16Theme,  readonly summerfruit :base16.base16.Base16Theme,  readonly colors :base16.base16.Base16Theme,  readonly atelierSeaside :base16.base16.Base16Theme,  readonly brewer :base16.base16.Base16Theme,  readonly codeschool :base16.base16.Base16Theme,  readonly railscasts :base16.base16.Base16Theme,  readonly threezerotwofour :base16.base16.Base16Theme,  readonly atelierDune :base16.base16.Base16Theme,  readonly tomorrow :base16.base16.Base16Theme,  readonly ocean :base16.base16.Base16Theme,  readonly marrakesh :base16.base16.Base16Theme,  readonly hopscotch :base16.base16.Base16Theme,  readonly flat :base16.base16.Base16Theme,  readonly ashes :base16.base16.Base16Theme} | base16.base16.Base16Theme | null | undefined> : undefined extends keyof { readonly pop :base16.base16.Base16Theme,  readonly atelierForest :base16.base16.Base16Theme,  readonly bespin :base16.base16.Base16Theme,  readonly embers :base16.base16.Base16Theme,  readonly tube :base16.base16.Base16Theme,  readonly bright :base16.base16.Base16Theme,  readonly mocha :base16.base16.Base16Theme,  readonly greenscreen :base16.base16.Base16Theme,  readonly grayscale :base16.base16.Base16Theme,  readonly shapeshifter :base16.base16.Base16Theme,  readonly harmonic :base16.base16.Base16Theme,  readonly chalk :base16.base16.Base16Theme,  readonly paraiso :base16.base16.Base16Theme,  readonly google :base16.base16.Base16Theme,  readonly isotope :base16.base16.Base16Theme,  readonly atelierLakeside :base16.base16.Base16Theme,  readonly twilight :base16.base16.Base16Theme,  readonly eighties :base16.base16.Base16Theme,  readonly nicinabox :base16.base16.Base16Theme,  readonly monokai :base16.base16.Base16Theme,  readonly atelierHeath :base16.base16.Base16Theme,  readonly apathy :base16.base16.Base16Theme,  readonly solarized :base16.base16.Base16Theme,  readonly summerfruit :base16.base16.Base16Theme,  readonly colors :base16.base16.Base16Theme,  readonly atelierSeaside :base16.base16.Base16Theme,  readonly brewer :base16.base16.Base16Theme,  readonly codeschool :base16.base16.Base16Theme,  readonly railscasts :base16.base16.Base16Theme,  readonly threezerotwofour :base16.base16.Base16Theme,  readonly atelierDune :base16.base16.Base16Theme,  readonly tomorrow :base16.base16.Base16Theme,  readonly ocean :base16.base16.Base16Theme,  readonly marrakesh :base16.base16.Base16Theme,  readonly hopscotch :base16.base16.Base16Theme,  readonly flat :base16.base16.Base16Theme,  readonly ashes :base16.base16.Base16Theme} | base16.base16.Base16Theme ? react.react.Validator<keyof { readonly pop :base16.base16.Base16Theme,  readonly atelierForest :base16.base16.Base16Theme,  readonly bespin :base16.base16.Base16Theme,  readonly embers :base16.base16.Base16Theme,  readonly tube :base16.base16.Base16Theme,  readonly bright :base16.base16.Base16Theme,  readonly mocha :base16.base16.Base16Theme,  readonly greenscreen :base16.base16.Base16Theme,  readonly grayscale :base16.base16.Base16Theme,  readonly shapeshifter :base16.base16.Base16Theme,  readonly harmonic :base16.base16.Base16Theme,  readonly chalk :base16.base16.Base16Theme,  readonly paraiso :base16.base16.Base16Theme,  readonly google :base16.base16.Base16Theme,  readonly isotope :base16.base16.Base16Theme,  readonly atelierLakeside :base16.base16.Base16Theme,  readonly twilight :base16.base16.Base16Theme,  readonly eighties :base16.base16.Base16Theme,  readonly nicinabox :base16.base16.Base16Theme,  readonly monokai :base16.base16.Base16Theme,  readonly atelierHeath :base16.base16.Base16Theme,  readonly apathy :base16.base16.Base16Theme,  readonly solarized :base16.base16.Base16Theme,  readonly summerfruit :base16.base16.Base16Theme,  readonly colors :base16.base16.Base16Theme,  readonly atelierSeaside :base16.base16.Base16Theme,  readonly brewer :base16.base16.Base16Theme,  readonly codeschool :base16.base16.Base16Theme,  readonly railscasts :base16.base16.Base16Theme,  readonly threezerotwofour :base16.base16.Base16Theme,  readonly atelierDune :base16.base16.Base16Theme,  readonly tomorrow :base16.base16.Base16Theme,  readonly ocean :base16.base16.Base16Theme,  readonly marrakesh :base16.base16.Base16Theme,  readonly hopscotch :base16.base16.Base16Theme,  readonly flat :base16.base16.Base16Theme,  readonly ashes :base16.base16.Base16Theme} | base16.base16.Base16Theme | null | undefined> : react.react.Validator<keyof { readonly pop :base16.base16.Base16Theme,  readonly atelierForest :base16.base16.Base16Theme,  readonly bespin :base16.base16.Base16Theme,  readonly embers :base16.base16.Base16Theme,  readonly tube :base16.base16.Base16Theme,  readonly bright :base16.base16.Base16Theme,  readonly mocha :base16.base16.Base16Theme,  readonly greenscreen :base16.base16.Base16Theme,  readonly grayscale :base16.base16.Base16Theme,  readonly shapeshifter :base16.base16.Base16Theme,  readonly harmonic :base16.base16.Base16Theme,  readonly chalk :base16.base16.Base16Theme,  readonly paraiso :base16.base16.Base16Theme,  readonly google :base16.base16.Base16Theme,  readonly isotope :base16.base16.Base16Theme,  readonly atelierLakeside :base16.base16.Base16Theme,  readonly twilight :base16.base16.Base16Theme,  readonly eighties :base16.base16.Base16Theme,  readonly nicinabox :base16.base16.Base16Theme,  readonly monokai :base16.base16.Base16Theme,  readonly atelierHeath :base16.base16.Base16Theme,  readonly apathy :base16.base16.Base16Theme,  readonly solarized :base16.base16.Base16Theme,  readonly summerfruit :base16.base16.Base16Theme,  readonly colors :base16.base16.Base16Theme,  readonly atelierSeaside :base16.base16.Base16Theme,  readonly brewer :base16.base16.Base16Theme,  readonly codeschool :base16.base16.Base16Theme,  readonly railscasts :base16.base16.Base16Theme,  readonly threezerotwofour :base16.base16.Base16Theme,  readonly atelierDune :base16.base16.Base16Theme,  readonly tomorrow :base16.base16.Base16Theme,  readonly ocean :base16.base16.Base16Theme,  readonly marrakesh :base16.base16.Base16Theme,  readonly hopscotch :base16.base16.Base16Theme,  readonly flat :base16.base16.Base16Theme,  readonly ashes :base16.base16.Base16Theme} | base16.base16.Base16Theme> */ js.Any
      ] = js.undefined
  }
  object WeakValidationMapExternal {
    
    inline def apply(): WeakValidationMapExternal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WeakValidationMapExternal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WeakValidationMapExternal] (val x: Self) extends AnyVal {
      
      inline def setDispatch(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends redux.redux.Dispatch<redux-devtools-log-monitor.redux-devtools-log-monitor/lib/actions.LogMonitorAction | redux-devtools-instrument.redux-devtools-instrument.LiftedAction<unknown, redux.redux.Action<unknown>, redux-devtools-log-monitor.redux-devtools-log-monitor/lib/reducers.LogMonitorState>> ? react.react.Validator<redux.redux.Dispatch<redux-devtools-log-monitor.redux-devtools-log-monitor/lib/actions.LogMonitorAction | redux-devtools-instrument.redux-devtools-instrument.LiftedAction<unknown, redux.redux.Action<unknown>, redux-devtools-log-monitor.redux-devtools-log-monitor/lib/reducers.LogMonitorState>> | null | undefined> : undefined extends redux.redux.Dispatch<redux-devtools-log-monitor.redux-devtools-log-monitor/lib/actions.LogMonitorAction | redux-devtools-instrument.redux-devtools-instrument.LiftedAction<unknown, redux.redux.Action<unknown>, redux-devtools-log-monitor.redux-devtools-log-monitor/lib/reducers.LogMonitorState>> ? react.react.Validator<redux.redux.Dispatch<redux-devtools-log-monitor.redux-devtools-log-monitor/lib/actions.LogMonitorAction | redux-devtools-instrument.redux-devtools-instrument.LiftedAction<unknown, redux.redux.Action<unknown>, redux-devtools-log-monitor.redux-devtools-log-monitor/lib/reducers.LogMonitorState>> | null | undefined> : react.react.Validator<redux.redux.Dispatch<redux-devtools-log-monitor.redux-devtools-log-monitor/lib/actions.LogMonitorAction | redux-devtools-instrument.redux-devtools-instrument.LiftedAction<unknown, redux.redux.Action<unknown>, redux-devtools-log-monitor.redux-devtools-log-monitor/lib/reducers.LogMonitorState>>> */ js.Any
      ): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
      
      inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      inline def setExpandActionRoot(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean ? react.react.Validator<boolean | null | undefined> : undefined extends boolean ? react.react.Validator<boolean | null | undefined> : react.react.Validator<boolean> */ js.Any
      ): Self = StObject.set(x, "expandActionRoot", value.asInstanceOf[js.Any])
      
      inline def setExpandActionRootUndefined: Self = StObject.set(x, "expandActionRoot", js.undefined)
      
      inline def setExpandStateRoot(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean ? react.react.Validator<boolean | null | undefined> : undefined extends boolean ? react.react.Validator<boolean | null | undefined> : react.react.Validator<boolean> */ js.Any
      ): Self = StObject.set(x, "expandStateRoot", value.asInstanceOf[js.Any])
      
      inline def setExpandStateRootUndefined: Self = StObject.set(x, "expandStateRoot", js.undefined)
      
      inline def setHideMainButtons(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "hideMainButtons", value.asInstanceOf[js.Any])
      
      inline def setHideMainButtonsUndefined: Self = StObject.set(x, "hideMainButtons", js.undefined)
      
      inline def setMarkStateDiff(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean ? react.react.Validator<boolean | null | undefined> : undefined extends boolean ? react.react.Validator<boolean | null | undefined> : react.react.Validator<boolean> */ js.Any
      ): Self = StObject.set(x, "markStateDiff", value.asInstanceOf[js.Any])
      
      inline def setMarkStateDiffUndefined: Self = StObject.set(x, "markStateDiff", js.undefined)
      
      inline def setPreserveScrollTop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean ? react.react.Validator<boolean | null | undefined> : undefined extends boolean ? react.react.Validator<boolean | null | undefined> : react.react.Validator<boolean> */ js.Any
      ): Self = StObject.set(x, "preserveScrollTop", value.asInstanceOf[js.Any])
      
      inline def setPreserveScrollTopUndefined: Self = StObject.set(x, "preserveScrollTop", js.undefined)
      
      inline def setSelect(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends (state : unknown): unknown ? react.react.Validator<(state : unknown): unknown | null | undefined> : undefined extends (state : unknown): unknown ? react.react.Validator<(state : unknown): unknown | null | undefined> : react.react.Validator<(state : unknown): unknown> */ js.Any
      ): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setTheme(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends keyof { readonly pop :base16.base16.Base16Theme,  readonly atelierForest :base16.base16.Base16Theme,  readonly bespin :base16.base16.Base16Theme,  readonly embers :base16.base16.Base16Theme,  readonly tube :base16.base16.Base16Theme,  readonly bright :base16.base16.Base16Theme,  readonly mocha :base16.base16.Base16Theme,  readonly greenscreen :base16.base16.Base16Theme,  readonly grayscale :base16.base16.Base16Theme,  readonly shapeshifter :base16.base16.Base16Theme,  readonly harmonic :base16.base16.Base16Theme,  readonly chalk :base16.base16.Base16Theme,  readonly paraiso :base16.base16.Base16Theme,  readonly google :base16.base16.Base16Theme,  readonly isotope :base16.base16.Base16Theme,  readonly atelierLakeside :base16.base16.Base16Theme,  readonly twilight :base16.base16.Base16Theme,  readonly eighties :base16.base16.Base16Theme,  readonly nicinabox :base16.base16.Base16Theme,  readonly monokai :base16.base16.Base16Theme,  readonly atelierHeath :base16.base16.Base16Theme,  readonly apathy :base16.base16.Base16Theme,  readonly solarized :base16.base16.Base16Theme,  readonly summerfruit :base16.base16.Base16Theme,  readonly colors :base16.base16.Base16Theme,  readonly atelierSeaside :base16.base16.Base16Theme,  readonly brewer :base16.base16.Base16Theme,  readonly codeschool :base16.base16.Base16Theme,  readonly railscasts :base16.base16.Base16Theme,  readonly threezerotwofour :base16.base16.Base16Theme,  readonly atelierDune :base16.base16.Base16Theme,  readonly tomorrow :base16.base16.Base16Theme,  readonly ocean :base16.base16.Base16Theme,  readonly marrakesh :base16.base16.Base16Theme,  readonly hopscotch :base16.base16.Base16Theme,  readonly flat :base16.base16.Base16Theme,  readonly ashes :base16.base16.Base16Theme} | base16.base16.Base16Theme ? react.react.Validator<keyof { readonly pop :base16.base16.Base16Theme,  readonly atelierForest :base16.base16.Base16Theme,  readonly bespin :base16.base16.Base16Theme,  readonly embers :base16.base16.Base16Theme,  readonly tube :base16.base16.Base16Theme,  readonly bright :base16.base16.Base16Theme,  readonly mocha :base16.base16.Base16Theme,  readonly greenscreen :base16.base16.Base16Theme,  readonly grayscale :base16.base16.Base16Theme,  readonly shapeshifter :base16.base16.Base16Theme,  readonly harmonic :base16.base16.Base16Theme,  readonly chalk :base16.base16.Base16Theme,  readonly paraiso :base16.base16.Base16Theme,  readonly google :base16.base16.Base16Theme,  readonly isotope :base16.base16.Base16Theme,  readonly atelierLakeside :base16.base16.Base16Theme,  readonly twilight :base16.base16.Base16Theme,  readonly eighties :base16.base16.Base16Theme,  readonly nicinabox :base16.base16.Base16Theme,  readonly monokai :base16.base16.Base16Theme,  readonly atelierHeath :base16.base16.Base16Theme,  readonly apathy :base16.base16.Base16Theme,  readonly solarized :base16.base16.Base16Theme,  readonly summerfruit :base16.base16.Base16Theme,  readonly colors :base16.base16.Base16Theme,  readonly atelierSeaside :base16.base16.Base16Theme,  readonly brewer :base16.base16.Base16Theme,  readonly codeschool :base16.base16.Base16Theme,  readonly railscasts :base16.base16.Base16Theme,  readonly threezerotwofour :base16.base16.Base16Theme,  readonly atelierDune :base16.base16.Base16Theme,  readonly tomorrow :base16.base16.Base16Theme,  readonly ocean :base16.base16.Base16Theme,  readonly marrakesh :base16.base16.Base16Theme,  readonly hopscotch :base16.base16.Base16Theme,  readonly flat :base16.base16.Base16Theme,  readonly ashes :base16.base16.Base16Theme} | base16.base16.Base16Theme | null | undefined> : undefined extends keyof { readonly pop :base16.base16.Base16Theme,  readonly atelierForest :base16.base16.Base16Theme,  readonly bespin :base16.base16.Base16Theme,  readonly embers :base16.base16.Base16Theme,  readonly tube :base16.base16.Base16Theme,  readonly bright :base16.base16.Base16Theme,  readonly mocha :base16.base16.Base16Theme,  readonly greenscreen :base16.base16.Base16Theme,  readonly grayscale :base16.base16.Base16Theme,  readonly shapeshifter :base16.base16.Base16Theme,  readonly harmonic :base16.base16.Base16Theme,  readonly chalk :base16.base16.Base16Theme,  readonly paraiso :base16.base16.Base16Theme,  readonly google :base16.base16.Base16Theme,  readonly isotope :base16.base16.Base16Theme,  readonly atelierLakeside :base16.base16.Base16Theme,  readonly twilight :base16.base16.Base16Theme,  readonly eighties :base16.base16.Base16Theme,  readonly nicinabox :base16.base16.Base16Theme,  readonly monokai :base16.base16.Base16Theme,  readonly atelierHeath :base16.base16.Base16Theme,  readonly apathy :base16.base16.Base16Theme,  readonly solarized :base16.base16.Base16Theme,  readonly summerfruit :base16.base16.Base16Theme,  readonly colors :base16.base16.Base16Theme,  readonly atelierSeaside :base16.base16.Base16Theme,  readonly brewer :base16.base16.Base16Theme,  readonly codeschool :base16.base16.Base16Theme,  readonly railscasts :base16.base16.Base16Theme,  readonly threezerotwofour :base16.base16.Base16Theme,  readonly atelierDune :base16.base16.Base16Theme,  readonly tomorrow :base16.base16.Base16Theme,  readonly ocean :base16.base16.Base16Theme,  readonly marrakesh :base16.base16.Base16Theme,  readonly hopscotch :base16.base16.Base16Theme,  readonly flat :base16.base16.Base16Theme,  readonly ashes :base16.base16.Base16Theme} | base16.base16.Base16Theme ? react.react.Validator<keyof { readonly pop :base16.base16.Base16Theme,  readonly atelierForest :base16.base16.Base16Theme,  readonly bespin :base16.base16.Base16Theme,  readonly embers :base16.base16.Base16Theme,  readonly tube :base16.base16.Base16Theme,  readonly bright :base16.base16.Base16Theme,  readonly mocha :base16.base16.Base16Theme,  readonly greenscreen :base16.base16.Base16Theme,  readonly grayscale :base16.base16.Base16Theme,  readonly shapeshifter :base16.base16.Base16Theme,  readonly harmonic :base16.base16.Base16Theme,  readonly chalk :base16.base16.Base16Theme,  readonly paraiso :base16.base16.Base16Theme,  readonly google :base16.base16.Base16Theme,  readonly isotope :base16.base16.Base16Theme,  readonly atelierLakeside :base16.base16.Base16Theme,  readonly twilight :base16.base16.Base16Theme,  readonly eighties :base16.base16.Base16Theme,  readonly nicinabox :base16.base16.Base16Theme,  readonly monokai :base16.base16.Base16Theme,  readonly atelierHeath :base16.base16.Base16Theme,  readonly apathy :base16.base16.Base16Theme,  readonly solarized :base16.base16.Base16Theme,  readonly summerfruit :base16.base16.Base16Theme,  readonly colors :base16.base16.Base16Theme,  readonly atelierSeaside :base16.base16.Base16Theme,  readonly brewer :base16.base16.Base16Theme,  readonly codeschool :base16.base16.Base16Theme,  readonly railscasts :base16.base16.Base16Theme,  readonly threezerotwofour :base16.base16.Base16Theme,  readonly atelierDune :base16.base16.Base16Theme,  readonly tomorrow :base16.base16.Base16Theme,  readonly ocean :base16.base16.Base16Theme,  readonly marrakesh :base16.base16.Base16Theme,  readonly hopscotch :base16.base16.Base16Theme,  readonly flat :base16.base16.Base16Theme,  readonly ashes :base16.base16.Base16Theme} | base16.base16.Base16Theme | null | undefined> : react.react.Validator<keyof { readonly pop :base16.base16.Base16Theme,  readonly atelierForest :base16.base16.Base16Theme,  readonly bespin :base16.base16.Base16Theme,  readonly embers :base16.base16.Base16Theme,  readonly tube :base16.base16.Base16Theme,  readonly bright :base16.base16.Base16Theme,  readonly mocha :base16.base16.Base16Theme,  readonly greenscreen :base16.base16.Base16Theme,  readonly grayscale :base16.base16.Base16Theme,  readonly shapeshifter :base16.base16.Base16Theme,  readonly harmonic :base16.base16.Base16Theme,  readonly chalk :base16.base16.Base16Theme,  readonly paraiso :base16.base16.Base16Theme,  readonly google :base16.base16.Base16Theme,  readonly isotope :base16.base16.Base16Theme,  readonly atelierLakeside :base16.base16.Base16Theme,  readonly twilight :base16.base16.Base16Theme,  readonly eighties :base16.base16.Base16Theme,  readonly nicinabox :base16.base16.Base16Theme,  readonly monokai :base16.base16.Base16Theme,  readonly atelierHeath :base16.base16.Base16Theme,  readonly apathy :base16.base16.Base16Theme,  readonly solarized :base16.base16.Base16Theme,  readonly summerfruit :base16.base16.Base16Theme,  readonly colors :base16.base16.Base16Theme,  readonly atelierSeaside :base16.base16.Base16Theme,  readonly brewer :base16.base16.Base16Theme,  readonly codeschool :base16.base16.Base16Theme,  readonly railscasts :base16.base16.Base16Theme,  readonly threezerotwofour :base16.base16.Base16Theme,  readonly atelierDune :base16.base16.Base16Theme,  readonly tomorrow :base16.base16.Base16Theme,  readonly ocean :base16.base16.Base16Theme,  readonly marrakesh :base16.base16.Base16Theme,  readonly hopscotch :base16.base16.Base16Theme,  readonly flat :base16.base16.Base16Theme,  readonly ashes :base16.base16.Base16Theme} | base16.base16.Base16Theme> */ js.Any
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
