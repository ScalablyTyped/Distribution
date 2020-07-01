package typings.reactFacebookLogin.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactFacebookLogin.reactFacebookLoginStrings.medium
import typings.reactFacebookLogin.reactFacebookLoginStrings.metro
import typings.reactFacebookLogin.reactFacebookLoginStrings.small
import typings.std.HTMLDivElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactFacebookLoginProps extends js.Object {
  var appId: String = js.native
  var authType: js.UndefOr[String] = js.native
  var autoLoad: js.UndefOr[Boolean] = js.native
  var buttonStyle: js.UndefOr[CSSProperties] = js.native
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  var cookie: js.UndefOr[Boolean] = js.native
  var cssClass: js.UndefOr[String] = js.native
  var disableMobileRedirect: js.UndefOr[Boolean] = js.native
  var fields: js.UndefOr[String] = js.native
  var icon: js.UndefOr[ReactNode] = js.native
  var isDisabled: js.UndefOr[Boolean] = js.native
  var isMobile: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.native
  var onFailure: js.UndefOr[js.Function1[/* response */ ReactFacebookFailureResponse, Unit]] = js.native
  var reAuthenticate: js.UndefOr[Boolean] = js.native
  var redirectUri: js.UndefOr[String] = js.native
  var responseType: js.UndefOr[String] = js.native
  var returnScopes: js.UndefOr[Boolean] = js.native
  var scope: js.UndefOr[String] = js.native
  var size: js.UndefOr[small | medium | metro] = js.native
  var state: js.UndefOr[String] = js.native
  var tag: js.UndefOr[Node | (Component[_, js.Object, _])] = js.native
  var textButton: js.UndefOr[String] = js.native
  var typeButton: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
  var xfbml: js.UndefOr[Boolean] = js.native
  def callback(userInfo: ReactFacebookFailureResponse): Unit = js.native
  def callback(userInfo: ReactFacebookLoginInfo): Unit = js.native
}

