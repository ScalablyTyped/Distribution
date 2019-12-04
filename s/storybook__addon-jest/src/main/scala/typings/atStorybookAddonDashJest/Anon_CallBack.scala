package typings.atStorybookAddonDashJest

import org.scalablytyped.runtime.StringDictionary
import typings.atStorybookAddonDashJest.atStorybookAddonDashJestStrings.kind
import typings.atStorybookAddonDashJest.atStorybookAddonDashJestStrings.storyName
import typings.atStorybookAddonDashJest.atStorybookAddonDashJestStrings.tests
import typings.atStorybookAddonDashJest.distHocProvideJestResultMod.HocProps
import typings.atStorybookAddonDashJest.distHocProvideJestResultMod.HocState
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
  var UNSAFE_componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ HocProps, /* nextContext */ js.Any, Unit]] = js.native
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ HocProps, /* nextState */ HocState, /* nextContext */ js.Any, Unit]
  ] = js.native
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ HocProps, 
      /* prevState */ HocState, 
      /* snapshot */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ HocProps, /* nextContext */ js.Any, Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ HocProps, /* nextState */ HocState, /* nextContext */ js.Any, Unit]
  ] = js.native
  var context: js.Any = js.native
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ HocProps, /* prevState */ HocState, _]] = js.native
  var mounted: Boolean = js.native
  val props: HocProps with Anon_Children = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[/* nextProps */ HocProps, /* nextState */ HocState, /* nextContext */ js.Any, Boolean]
  ] = js.native
  var state: HocState = js.native
  def componentDidMount(): Unit = js.native
  def componentWillUnmount(): Unit = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[Unit]): Unit = js.native
  def onAddTests(hasKindStoryNameTests: HocState): Unit = js.native
  def render(): Element = js.native
  def setState[K /* <: kind | storyName | tests */](
    state: js.Function2[/* prevState */ HocState, /* props */ HocProps, HocState | (Pick[HocState, K])]
  ): Unit = js.native
  def setState[K /* <: kind | storyName | tests */](
    state: js.Function2[/* prevState */ HocState, /* props */ HocProps, HocState | (Pick[HocState, K])],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: kind | storyName | tests */](state: HocState): Unit = js.native
  def setState[K /* <: kind | storyName | tests */](state: HocState, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: kind | storyName | tests */](state: Pick[HocState, K]): Unit = js.native
  def setState[K /* <: kind | storyName | tests */](state: Pick[HocState, K], callback: js.Function0[Unit]): Unit = js.native
  def stopListeningOnStory(): Unit = js.native
}

