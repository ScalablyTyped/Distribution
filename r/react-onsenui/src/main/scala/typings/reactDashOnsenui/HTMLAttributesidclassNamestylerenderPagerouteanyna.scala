package typings.reactDashOnsenui

import typings.react.reactMod.CSSProperties
import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashOnsenui.reactDashOnsenuiMod.AnimationOptions
import typings.reactDashOnsenui.reactDashOnsenuiMod.Navigator
import typings.reactDashOnsenui.reactDashOnsenuiMod.NavigatorAnimationTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {renderPage (route : any, navigator ? : react-onsenui.react-onsenui.Navigator): react.react._Global_.JSX.Element,   initialRouteStack ? :std.Array<string>,   initialRoute ? :any,   onPrePush ? :(): void,   onPostPush ? :(): void,   onPrePop ? :(): void,   onPostPop ? :(): void,   animation ? :react-onsenui.react-onsenui.NavigatorAnimationTypes,   animationOptions ? :react-onsenui.react-onsenui.AnimationOptions} */
@js.native
trait HTMLAttributesidclassNamestylerenderPagerouteanyna extends js.Object {
  var animation: js.UndefOr[NavigatorAnimationTypes] = js.native
  var animationOptions: js.UndefOr[AnimationOptions] = js.native
  var className: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var initialRoute: js.UndefOr[js.Any] = js.native
  var initialRouteStack: js.UndefOr[js.Array[String]] = js.native
  var onPostPop: js.UndefOr[js.Function0[Unit]] = js.native
  var onPostPush: js.UndefOr[js.Function0[Unit]] = js.native
  var onPrePop: js.UndefOr[js.Function0[Unit]] = js.native
  var onPrePush: js.UndefOr[js.Function0[Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  def renderPage(route: js.Any): Element = js.native
  def renderPage(route: js.Any, navigator: Navigator): Element = js.native
}

