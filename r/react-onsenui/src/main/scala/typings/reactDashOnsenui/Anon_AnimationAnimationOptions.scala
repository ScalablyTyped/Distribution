package typings.reactDashOnsenui

import typings.react.reactMod.Global.JSX.Element
import typings.reactDashOnsenui.reactDashOnsenuiMod.AnimationOptions
import typings.reactDashOnsenui.reactDashOnsenuiMod.Navigator
import typings.reactDashOnsenui.reactDashOnsenuiMod.NavigatorAnimationTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AnimationAnimationOptions extends js.Object {
  var animation: js.UndefOr[NavigatorAnimationTypes] = js.native
  var animationOptions: js.UndefOr[AnimationOptions] = js.native
  var initialRoute: js.UndefOr[js.Any] = js.native
  var initialRouteStack: js.UndefOr[js.Array[String]] = js.native
  var onPostPop: js.UndefOr[js.Function0[Unit]] = js.native
  var onPostPush: js.UndefOr[js.Function0[Unit]] = js.native
  var onPrePop: js.UndefOr[js.Function0[Unit]] = js.native
  var onPrePush: js.UndefOr[js.Function0[Unit]] = js.native
  def renderPage(route: js.Any): Element = js.native
  def renderPage(route: js.Any, navigator: Navigator): Element = js.native
}

