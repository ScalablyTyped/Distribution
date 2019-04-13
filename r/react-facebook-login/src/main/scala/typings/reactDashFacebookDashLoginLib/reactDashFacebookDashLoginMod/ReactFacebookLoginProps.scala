package typings
package reactDashFacebookDashLoginLib.reactDashFacebookDashLoginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactFacebookLoginProps extends js.Object {
  var appId: java.lang.String
  var authType: js.UndefOr[java.lang.String] = js.undefined
  var autoLoad: js.UndefOr[scala.Boolean] = js.undefined
  var buttonStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var containerStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var cookie: js.UndefOr[scala.Boolean] = js.undefined
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  var disableMobileRedirect: js.UndefOr[scala.Boolean] = js.undefined
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var isDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var isMobile: js.UndefOr[scala.Boolean] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onFailure: js.UndefOr[js.Function1[/* response */ ReactFacebookFailureResponse, scala.Unit]] = js.undefined
  var reAuthenticate: js.UndefOr[scala.Boolean] = js.undefined
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  var returnScopes: js.UndefOr[scala.Boolean] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[
    reactDashFacebookDashLoginLib.reactDashFacebookDashLoginLibStrings.small | reactDashFacebookDashLoginLib.reactDashFacebookDashLoginLibStrings.medium | reactDashFacebookDashLoginLib.reactDashFacebookDashLoginLibStrings.metro
  ] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[stdLib.Node | (reactLib.reactMod.Component[_, js.Object, _])] = js.undefined
  var textButton: js.UndefOr[java.lang.String] = js.undefined
  var typeButton: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var xfbml: js.UndefOr[scala.Boolean] = js.undefined
  def callback(userInfo: ReactFacebookLoginInfo): scala.Unit
}

object ReactFacebookLoginProps {
  @scala.inline
  def apply(
    appId: java.lang.String,
    callback: ReactFacebookLoginInfo => scala.Unit,
    authType: java.lang.String = null,
    autoLoad: js.UndefOr[scala.Boolean] = js.undefined,
    buttonStyle: reactLib.reactMod.CSSProperties = null,
    containerStyle: reactLib.reactMod.CSSProperties = null,
    cookie: js.UndefOr[scala.Boolean] = js.undefined,
    cssClass: java.lang.String = null,
    disableMobileRedirect: js.UndefOr[scala.Boolean] = js.undefined,
    fields: java.lang.String = null,
    icon: reactLib.reactMod.ReactNode = null,
    isDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    isMobile: js.UndefOr[scala.Boolean] = js.undefined,
    language: java.lang.String = null,
    onClick: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onFailure: /* response */ ReactFacebookFailureResponse => scala.Unit = null,
    reAuthenticate: js.UndefOr[scala.Boolean] = js.undefined,
    redirectUri: java.lang.String = null,
    responseType: java.lang.String = null,
    returnScopes: js.UndefOr[scala.Boolean] = js.undefined,
    scope: java.lang.String = null,
    size: reactDashFacebookDashLoginLib.reactDashFacebookDashLoginLibStrings.small | reactDashFacebookDashLoginLib.reactDashFacebookDashLoginLibStrings.medium | reactDashFacebookDashLoginLib.reactDashFacebookDashLoginLibStrings.metro = null,
    state: java.lang.String = null,
    tag: stdLib.Node | (reactLib.reactMod.Component[_, js.Object, _]) = null,
    textButton: java.lang.String = null,
    typeButton: java.lang.String = null,
    version: java.lang.String = null,
    xfbml: js.UndefOr[scala.Boolean] = js.undefined
  ): ReactFacebookLoginProps = {
    val __obj = js.Dynamic.literal(appId = appId, callback = js.Any.fromFunction1(callback))
    if (authType != null) __obj.updateDynamic("authType")(authType)
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad)
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle)
    if (!js.isUndefined(cookie)) __obj.updateDynamic("cookie")(cookie)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (!js.isUndefined(disableMobileRedirect)) __obj.updateDynamic("disableMobileRedirect")(disableMobileRedirect)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled)
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile)
    if (language != null) __obj.updateDynamic("language")(language)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (!js.isUndefined(reAuthenticate)) __obj.updateDynamic("reAuthenticate")(reAuthenticate)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (!js.isUndefined(returnScopes)) __obj.updateDynamic("returnScopes")(returnScopes)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (textButton != null) __obj.updateDynamic("textButton")(textButton)
    if (typeButton != null) __obj.updateDynamic("typeButton")(typeButton)
    if (version != null) __obj.updateDynamic("version")(version)
    if (!js.isUndefined(xfbml)) __obj.updateDynamic("xfbml")(xfbml)
    __obj.asInstanceOf[ReactFacebookLoginProps]
  }
}

