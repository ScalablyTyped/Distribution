package typings.rcSlider.anon

import org.scalablytyped.runtime.StringDictionary
import typings.rcSlider.createSliderWithTooltipMod.ComponentWrapperProps
import typings.rcSlider.createSliderWithTooltipMod.ComponentWrapperState
import typings.rcSlider.interfaceMod.GenericSliderProps
import typings.rcSlider.rcSliderStrings.visibles
import typings.react.mod.ErrorInfo
import typings.react.mod.ReactInstance
import typings.react.mod.global.JSX.Element
import typings.std.Error
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDidMount[Props /* <: GenericSliderProps */] extends StObject {
  
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var UNSAFE_componentWillReceiveProps: js.UndefOr[
    js.Function2[/* nextProps */ ComponentWrapperProps & Props, /* nextContext */ js.Any, Unit]
  ] = js.native
  
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ComponentWrapperProps & Props, 
      /* nextState */ ComponentWrapperState, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ ComponentWrapperProps & Props, 
      /* prevState */ ComponentWrapperState, 
      /* snapshot */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[
    js.Function2[/* nextProps */ ComponentWrapperProps & Props, /* nextContext */ js.Any, Unit]
  ] = js.native
  
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ComponentWrapperProps & Props, 
      /* nextState */ ComponentWrapperState, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var context: js.Any = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  var getSnapshotBeforeUpdate: js.UndefOr[
    js.Function2[
      /* prevProps */ ComponentWrapperProps & Props, 
      /* prevState */ ComponentWrapperState, 
      js.Any
    ]
  ] = js.native
  
  def handleTooltipVisibleChange(index: js.Any, visible: js.Any): Unit = js.native
  
  def handleWithTooltip(hasValueDraggingIndexDisabledRestProps: Dictx): Element = js.native
  
  val props: ComponentWrapperProps & Props & Children = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): Element = js.native
  
  def setState[K /* <: visibles */](
    state: js.Function2[
      /* prevState */ ComponentWrapperState, 
      /* props */ ComponentWrapperProps & Props, 
      ComponentWrapperState | (Pick[ComponentWrapperState, K])
    ]
  ): Unit = js.native
  def setState[K /* <: visibles */](
    state: js.Function2[
      /* prevState */ ComponentWrapperState, 
      /* props */ ComponentWrapperProps & Props, 
      ComponentWrapperState | (Pick[ComponentWrapperState, K])
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: visibles */](state: ComponentWrapperState): Unit = js.native
  def setState[K /* <: visibles */](state: ComponentWrapperState, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: visibles */](state: Pick[ComponentWrapperState, K]): Unit = js.native
  def setState[K /* <: visibles */](state: Pick[ComponentWrapperState, K], callback: js.Function0[Unit]): Unit = js.native
  
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ComponentWrapperProps & Props, 
      /* nextState */ ComponentWrapperState, 
      /* nextContext */ js.Any, 
      Boolean
    ]
  ] = js.native
  
  var state: Visibles = js.native
}
