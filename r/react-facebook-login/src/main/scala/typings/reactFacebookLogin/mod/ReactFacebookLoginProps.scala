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

trait ReactFacebookLoginProps extends js.Object {
  var appId: String
  var authType: js.UndefOr[String] = js.undefined
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  var buttonStyle: js.UndefOr[CSSProperties] = js.undefined
  var containerStyle: js.UndefOr[CSSProperties] = js.undefined
  var cookie: js.UndefOr[Boolean] = js.undefined
  var cssClass: js.UndefOr[String] = js.undefined
  var disableMobileRedirect: js.UndefOr[Boolean] = js.undefined
  var fields: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  var isMobile: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
  var onFailure: js.UndefOr[js.Function1[/* response */ ReactFacebookFailureResponse, Unit]] = js.undefined
  var reAuthenticate: js.UndefOr[Boolean] = js.undefined
  var redirectUri: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var returnScopes: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[small | medium | metro] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[Node | (Component[_, js.Object, _])] = js.undefined
  var textButton: js.UndefOr[String] = js.undefined
  var typeButton: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var xfbml: js.UndefOr[Boolean] = js.undefined
  def callback(userInfo: ReactFacebookLoginInfo): Unit
}

object ReactFacebookLoginProps {
  @scala.inline
  def apply(
    appId: String,
    callback: ReactFacebookLoginInfo => Unit,
    authType: String = null,
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    buttonStyle: CSSProperties = null,
    containerStyle: CSSProperties = null,
    cookie: js.UndefOr[Boolean] = js.undefined,
    cssClass: String = null,
    disableMobileRedirect: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    icon: ReactNode = null,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    onClick: /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onFailure: /* response */ ReactFacebookFailureResponse => Unit = null,
    reAuthenticate: js.UndefOr[Boolean] = js.undefined,
    redirectUri: String = null,
    responseType: String = null,
    returnScopes: js.UndefOr[Boolean] = js.undefined,
    scope: String = null,
    size: small | medium | metro = null,
    state: String = null,
    tag: Node | (Component[_, js.Object, _]) = null,
    textButton: String = null,
    typeButton: String = null,
    version: String = null,
    xfbml: js.UndefOr[Boolean] = js.undefined
  ): ReactFacebookLoginProps = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], callback = js.Any.fromFunction1(callback))
    if (authType != null) __obj.updateDynamic("authType")(authType.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.get.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(cookie)) __obj.updateDynamic("cookie")(cookie.get.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMobileRedirect)) __obj.updateDynamic("disableMobileRedirect")(disableMobileRedirect.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (!js.isUndefined(reAuthenticate)) __obj.updateDynamic("reAuthenticate")(reAuthenticate.get.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(returnScopes)) __obj.updateDynamic("returnScopes")(returnScopes.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (textButton != null) __obj.updateDynamic("textButton")(textButton.asInstanceOf[js.Any])
    if (typeButton != null) __obj.updateDynamic("typeButton")(typeButton.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(xfbml)) __obj.updateDynamic("xfbml")(xfbml.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactFacebookLoginProps]
  }
}

