package typings.rcSlider.anon

import org.scalablytyped.runtime.StringDictionary
import typings.rcSlider.createSliderWithTooltipMod.ComponentWrapperState
import typings.rcSlider.rcSliderStrings.visibles
import typings.react.mod.ErrorInfo
import typings.react.mod.ReactInstance
import typings.react.mod.global.JSX.Element
import typings.std.Error
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentDidCatch extends js.Object {
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  var UNSAFE_componentWillReceiveProps: js.UndefOr[
    js.Function2[/* nextProps */ ReadonlyComponentWrapperP, /* nextContext */ js.Any, Unit]
  ] = js.native
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ReadonlyComponentWrapperP, 
      /* nextState */ ReadonlyComponentWrapperS, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ ReadonlyComponentWrapperP, 
      /* prevState */ ReadonlyComponentWrapperS, 
      /* snapshot */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillReceiveProps: js.UndefOr[
    js.Function2[/* nextProps */ ReadonlyComponentWrapperP, /* nextContext */ js.Any, Unit]
  ] = js.native
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ReadonlyComponentWrapperP, 
      /* nextState */ ReadonlyComponentWrapperS, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  var context: js.Any = js.native
  var getSnapshotBeforeUpdate: js.UndefOr[
    js.Function2[
      /* prevProps */ ReadonlyComponentWrapperP, 
      /* prevState */ ReadonlyComponentWrapperS, 
      _
    ]
  ] = js.native
  val props: ReadonlyComponentWrapperPChildren = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ ReadonlyComponentWrapperP, 
      /* nextState */ ReadonlyComponentWrapperS, 
      /* nextContext */ js.Any, 
      Boolean
    ]
  ] = js.native
  var state: Visibles = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  def handleTooltipVisibleChange(index: js.Any, visible: js.Any): Unit = js.native
  def handleWithTooltip(hasValueDraggingIndexDisabledRestProps: Disabled): Element = js.native
  def render(): Element = js.native
  def setState[K /* <: visibles */](
    state: js.Function2[
      /* prevState */ ReadonlyComponentWrapperS, 
      /* props */ ReadonlyComponentWrapperP, 
      ComponentWrapperState | (Pick[ComponentWrapperState, K])
    ]
  ): Unit = js.native
  def setState[K /* <: visibles */](
    state: js.Function2[
      /* prevState */ ReadonlyComponentWrapperS, 
      /* props */ ReadonlyComponentWrapperP, 
      ComponentWrapperState | (Pick[ComponentWrapperState, K])
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: visibles */](state: ComponentWrapperState): Unit = js.native
  def setState[K /* <: visibles */](state: ComponentWrapperState, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: visibles */](state: Pick[ComponentWrapperState, K]): Unit = js.native
  def setState[K /* <: visibles */](state: Pick[ComponentWrapperState, K], callback: js.Function0[Unit]): Unit = js.native
}

