package typings
package stompitLib.libConnectMod.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectHeaders extends js.Object {
  var `accept-version`: js.UndefOr[java.lang.String] = js.undefined
  var `heart-beat`: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var login: js.UndefOr[java.lang.String] = js.undefined
  var passcode: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectHeaders {
  @scala.inline
  def apply(
    `accept-version`: java.lang.String = null,
    `heart-beat`: java.lang.String = null,
    host: java.lang.String = null,
    login: java.lang.String = null,
    passcode: java.lang.String = null
  ): ConnectHeaders = {
    val __obj = js.Dynamic.literal()
    if (`accept-version` != null) __obj.updateDynamic("accept-version")(`accept-version`)
    if (`heart-beat` != null) __obj.updateDynamic("heart-beat")(`heart-beat`)
    if (host != null) __obj.updateDynamic("host")(host)
    if (login != null) __obj.updateDynamic("login")(login)
    if (passcode != null) __obj.updateDynamic("passcode")(passcode)
    __obj.asInstanceOf[ConnectHeaders]
  }
}

