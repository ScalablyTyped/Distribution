package typings.reactOnsenui.anon

import typings.react.mod.CSSProperties
import typings.react.mod.global.JSX.Element
import typings.reactOnsenui.mod.AnimationOptions
import typings.reactOnsenui.mod.Navigator
import typings.reactOnsenui.mod.NavigatorAnimationTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {renderPage (route : any, navigator : react-onsenui.react-onsenui.Navigator | undefined): react.react.<global>.JSX.Element,   initialRouteStack :std.Array<string> | undefined,   initialRoute :any | undefined,   onPrePush :(): void | undefined,   onPostPush :(): void | undefined,   onPrePop :(): void | undefined,   onPostPop :(): void | undefined,   animation :react-onsenui.react-onsenui.NavigatorAnimationTypes | undefined,   animationOptions :react-onsenui.react-onsenui.AnimationOptions | undefined} */
@js.native
trait HTMLAttributesidclassNameAnimationOptions extends js.Object {
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

