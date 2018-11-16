package typings
package reactDashFacebookDashLoginLib.reactDashFacebookDashLoginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReactFacebookLoginProps extends js.Object {
  var appId: java.lang.String
  var autoLoad: js.UndefOr[scala.Boolean] = js.undefined
  var buttonStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var containerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var cookie: js.UndefOr[scala.Boolean] = js.undefined
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  var disableMobileRedirect: js.UndefOr[scala.Boolean] = js.undefined
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var isDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var isMobile: js.UndefOr[scala.Boolean] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onFailure: js.UndefOr[js.Function1[/* response */ ReactFacebookFailureResponse, scala.Unit]] = js.undefined
  var reAuthenticate: js.UndefOr[scala.Boolean] = js.undefined
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[
    reactDashFacebookDashLoginLib.reactDashFacebookDashLoginLibStrings.small | reactDashFacebookDashLoginLib.reactDashFacebookDashLoginLibStrings.medium | reactDashFacebookDashLoginLib.reactDashFacebookDashLoginLibStrings.metro
  ] = js.undefined
  var tag: js.UndefOr[stdLib.Node | (reactLib.reactMod.Component[_, js.Object, _])] = js.undefined
  var textButton: js.UndefOr[java.lang.String] = js.undefined
  var typeButton: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var xfbml: js.UndefOr[scala.Boolean] = js.undefined
  def callback(userInfo: ReactFacebookLoginInfo): scala.Unit
}

