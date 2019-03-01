package typings
package reactDashTwitterDashAuthLib.reactDashTwitterDashAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterLoginProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var credentials: js.UndefOr[
    reactDashTwitterDashAuthLib.reactDashTwitterDashAuthLibStrings.omit | reactDashTwitterDashAuthLib.reactDashTwitterDashAuthLibStrings.`same-origin` | reactDashTwitterDashAuthLib.reactDashTwitterDashAuthLibStrings.include
  ] = js.undefined
  var customHeaders: js.UndefOr[stdLib.HeadersInit] = js.undefined
  var dialogHeight: js.UndefOr[scala.Double] = js.undefined
  var dialogWidth: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var forceLogin: js.UndefOr[scala.Boolean] = js.undefined
  var loginUrl: java.lang.String
  var requestTokenUrl: java.lang.String
  var showIcon: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  def onFailure(msg: java.lang.String): scala.Unit
  def onSuccess(response: java.lang.String): scala.Unit
}

object TwitterLoginProps {
  @scala.inline
  def apply(
    loginUrl: java.lang.String,
    onFailure: js.Function1[java.lang.String, scala.Unit],
    onSuccess: js.Function1[java.lang.String, scala.Unit],
    requestTokenUrl: java.lang.String,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    credentials: reactDashTwitterDashAuthLib.reactDashTwitterDashAuthLibStrings.omit | reactDashTwitterDashAuthLib.reactDashTwitterDashAuthLibStrings.`same-origin` | reactDashTwitterDashAuthLib.reactDashTwitterDashAuthLibStrings.include = null,
    customHeaders: stdLib.HeadersInit = null,
    dialogHeight: scala.Int | scala.Double = null,
    dialogWidth: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    forceLogin: js.UndefOr[scala.Boolean] = js.undefined,
    showIcon: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null,
    text: java.lang.String = null
  ): TwitterLoginProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loginUrl")(loginUrl)
    __obj.updateDynamic("onFailure")(onFailure)
    __obj.updateDynamic("onSuccess")(onSuccess)
    __obj.updateDynamic("requestTokenUrl")(requestTokenUrl)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (dialogHeight != null) __obj.updateDynamic("dialogHeight")(dialogHeight.asInstanceOf[js.Any])
    if (dialogWidth != null) __obj.updateDynamic("dialogWidth")(dialogWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(forceLogin)) __obj.updateDynamic("forceLogin")(forceLogin)
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TwitterLoginProps]
  }
}

