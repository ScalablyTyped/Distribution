package typings.atStorybookReactDashNative

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ErrorInfo
import typings.react.reactMod.ReactInstance
import typings.react.reactMod._Global_.JSX.Element
import typings.std.Error
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallBack extends js.Object {
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  var UNSAFE_componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ js.Object, /* nextContext */ js.Any, Unit]] = js.native
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ js.Object, /* nextState */ js.Object, /* nextContext */ js.Any, Unit]
  ] = js.native
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ js.Object, 
      /* prevState */ js.Object, 
      /* snapshot */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ js.Object, /* nextContext */ js.Any, Unit]] = js.native
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ js.Object, /* nextState */ js.Object, /* nextContext */ js.Any, Unit]
  ] = js.native
  var context: js.Any = js.native
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ js.Object, /* prevState */ js.Object, _]] = js.native
  val props: js.Object with Anon_Children = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ js.Object, 
      /* nextState */ js.Object, 
      /* nextContext */ js.Any, 
      Boolean
    ]
  ] = js.native
  var state: js.Object = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[Unit]): Unit = js.native
  def render(): Element = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[/* prevState */ js.Object, /* props */ js.Object, js.Object | (Pick[js.Object, K])]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[/* prevState */ js.Object, /* props */ js.Object, js.Object | (Pick[js.Object, K])],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: Pick[js.Object, K]): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: Pick[js.Object, K], callback: js.Function0[Unit]): Unit = js.native
}

