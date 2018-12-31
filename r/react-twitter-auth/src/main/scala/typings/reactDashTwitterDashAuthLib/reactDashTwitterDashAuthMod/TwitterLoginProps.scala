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

