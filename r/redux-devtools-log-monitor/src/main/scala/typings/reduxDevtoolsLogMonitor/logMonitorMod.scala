package typings.reduxDevtoolsLogMonitor

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import typings.base16.mod.Base16Theme
import typings.redux.mod.Action
import typings.redux.mod.Dispatch
import typings.reduxDevtoolsInstrument.anon.Error
import typings.reduxDevtoolsInstrument.mod.LiftedAction
import typings.reduxDevtoolsInstrument.mod.LiftedState
import typings.reduxDevtoolsInstrument.mod.PerformAction
import typings.reduxDevtoolsLogMonitor.actionsMod.LogMonitorAction
import typings.reduxDevtoolsLogMonitor.anon.ComponentClassExternalPro
import typings.reduxDevtoolsLogMonitor.anon.FunctionComponentExternal
import typings.reduxDevtoolsLogMonitor.reducersMod.LogMonitorState
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

object logMonitorMod extends Shortcut {
  
  @JSImport("redux-devtools-log-monitor/lib/LogMonitor", JSImport.Default)
  @js.native
  val default: ComponentClassExternalPro | FunctionComponentExternal = js.native
  
  trait DefaultProps[S] extends StObject {
    
    var expandActionRoot: Boolean
    
    var expandStateRoot: Boolean
    
    var markStateDiff: Boolean
    
    var preserveScrollTop: Boolean
    
    def select(state: Any): Any
    
    var theme: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | Base16Theme
  }
  object DefaultProps {
    
    inline def apply[S](
      expandActionRoot: Boolean,
      expandStateRoot: Boolean,
      markStateDiff: Boolean,
      preserveScrollTop: Boolean,
      select: Any => Any,
      theme: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | Base16Theme
    ): DefaultProps[S] = {
      val __obj = js.Dynamic.literal(expandActionRoot = expandActionRoot.asInstanceOf[js.Any], expandStateRoot = expandStateRoot.asInstanceOf[js.Any], markStateDiff = markStateDiff.asInstanceOf[js.Any], preserveScrollTop = preserveScrollTop.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps[S]]
    }
    
    extension [Self <: DefaultProps[?], S](x: Self & DefaultProps[S]) {
      
      inline def setExpandActionRoot(value: Boolean): Self = StObject.set(x, "expandActionRoot", value.asInstanceOf[js.Any])
      
      inline def setExpandStateRoot(value: Boolean): Self = StObject.set(x, "expandStateRoot", value.asInstanceOf[js.Any])
      
      inline def setMarkStateDiff(value: Boolean): Self = StObject.set(x, "markStateDiff", value.asInstanceOf[js.Any])
      
      inline def setPreserveScrollTop(value: Boolean): Self = StObject.set(x, "preserveScrollTop", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: Any => Any): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setTheme(
        value: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | Base16Theme
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExternalProps[S, A /* <: Action[Any] */] extends StObject {
    
    var dispatch: Dispatch[LogMonitorAction | (LiftedAction[S, A, LogMonitorState])]
    
    var expandActionRoot: Boolean
    
    var expandStateRoot: Boolean
    
    var hideMainButtons: js.UndefOr[Boolean] = js.undefined
    
    var markStateDiff: Boolean
    
    var preserveScrollTop: Boolean
    
    def select(state: S): Any
    
    var theme: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | Base16Theme
  }
  object ExternalProps {
    
    inline def apply[S, A /* <: Action[Any] */](
      dispatch: LogMonitorAction | (LiftedAction[S, A, LogMonitorState]) => LogMonitorAction | (LiftedAction[S, A, LogMonitorState]),
      expandActionRoot: Boolean,
      expandStateRoot: Boolean,
      markStateDiff: Boolean,
      preserveScrollTop: Boolean,
      select: S => Any,
      theme: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | Base16Theme
    ): ExternalProps[S, A] = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), expandActionRoot = expandActionRoot.asInstanceOf[js.Any], expandStateRoot = expandStateRoot.asInstanceOf[js.Any], markStateDiff = markStateDiff.asInstanceOf[js.Any], preserveScrollTop = preserveScrollTop.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalProps[S, A]]
    }
    
    extension [Self <: ExternalProps[?, ?], S, A /* <: Action[Any] */](x: Self & (ExternalProps[S, A])) {
      
      inline def setDispatch(
        value: LogMonitorAction | (LiftedAction[S, A, LogMonitorState]) => LogMonitorAction | (LiftedAction[S, A, LogMonitorState])
      ): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setExpandActionRoot(value: Boolean): Self = StObject.set(x, "expandActionRoot", value.asInstanceOf[js.Any])
      
      inline def setExpandStateRoot(value: Boolean): Self = StObject.set(x, "expandStateRoot", value.asInstanceOf[js.Any])
      
      inline def setHideMainButtons(value: Boolean): Self = StObject.set(x, "hideMainButtons", value.asInstanceOf[js.Any])
      
      inline def setHideMainButtonsUndefined: Self = StObject.set(x, "hideMainButtons", js.undefined)
      
      inline def setMarkStateDiff(value: Boolean): Self = StObject.set(x, "markStateDiff", value.asInstanceOf[js.Any])
      
      inline def setPreserveScrollTop(value: Boolean): Self = StObject.set(x, "preserveScrollTop", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: S => Any): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setTheme(
        value: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | Base16Theme
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogMonitorProps[S, A /* <: Action[Any] */]
    extends StObject
       with LiftedState[S, A, LogMonitorState] {
    
    var dispatch: Dispatch[LogMonitorAction | (LiftedAction[S, A, LogMonitorState])]
    
    var expandActionRoot: Boolean
    
    var expandStateRoot: Boolean
    
    var hideMainButtons: js.UndefOr[Boolean] = js.undefined
    
    var markStateDiff: Boolean
    
    var preserveScrollTop: Boolean
    
    def select(state: S): Any
    
    var theme: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | Base16Theme
  }
  object LogMonitorProps {
    
    inline def apply[S, A /* <: Action[Any] */](
      actionsById: NumberDictionary[PerformAction[A]],
      committedState: S,
      computedStates: js.Array[Error[S]],
      currentStateIndex: Double,
      dispatch: LogMonitorAction | (LiftedAction[S, A, LogMonitorState]) => LogMonitorAction | (LiftedAction[S, A, LogMonitorState]),
      expandActionRoot: Boolean,
      expandStateRoot: Boolean,
      isLocked: Boolean,
      isPaused: Boolean,
      markStateDiff: Boolean,
      monitorState: LogMonitorState,
      nextActionId: Double,
      preserveScrollTop: Boolean,
      select: S => Any,
      skippedActionIds: js.Array[Double],
      stagedActionIds: js.Array[Double],
      theme: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | Base16Theme
    ): LogMonitorProps[S, A] = {
      val __obj = js.Dynamic.literal(actionsById = actionsById.asInstanceOf[js.Any], committedState = committedState.asInstanceOf[js.Any], computedStates = computedStates.asInstanceOf[js.Any], currentStateIndex = currentStateIndex.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), expandActionRoot = expandActionRoot.asInstanceOf[js.Any], expandStateRoot = expandStateRoot.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], markStateDiff = markStateDiff.asInstanceOf[js.Any], monitorState = monitorState.asInstanceOf[js.Any], nextActionId = nextActionId.asInstanceOf[js.Any], preserveScrollTop = preserveScrollTop.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), skippedActionIds = skippedActionIds.asInstanceOf[js.Any], stagedActionIds = stagedActionIds.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogMonitorProps[S, A]]
    }
    
    extension [Self <: LogMonitorProps[?, ?], S, A /* <: Action[Any] */](x: Self & (LogMonitorProps[S, A])) {
      
      inline def setDispatch(
        value: LogMonitorAction | (LiftedAction[S, A, LogMonitorState]) => LogMonitorAction | (LiftedAction[S, A, LogMonitorState])
      ): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setExpandActionRoot(value: Boolean): Self = StObject.set(x, "expandActionRoot", value.asInstanceOf[js.Any])
      
      inline def setExpandStateRoot(value: Boolean): Self = StObject.set(x, "expandStateRoot", value.asInstanceOf[js.Any])
      
      inline def setHideMainButtons(value: Boolean): Self = StObject.set(x, "hideMainButtons", value.asInstanceOf[js.Any])
      
      inline def setHideMainButtonsUndefined: Self = StObject.set(x, "hideMainButtons", js.undefined)
      
      inline def setMarkStateDiff(value: Boolean): Self = StObject.set(x, "markStateDiff", value.asInstanceOf[js.Any])
      
      inline def setPreserveScrollTop(value: Boolean): Self = StObject.set(x, "preserveScrollTop", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: S => Any): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setTheme(
        value: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | Base16Theme
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentClassExternalPro | FunctionComponentExternal
  
  /* This means you don't have to write `default`, but can instead just say `logMonitorMod.foo` */
  override def _to: ComponentClassExternalPro | FunctionComponentExternal = default
}
