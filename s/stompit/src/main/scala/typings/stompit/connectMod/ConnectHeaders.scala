package typings.stompit.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectHeaders extends js.Object {
  var `accept-version`: js.UndefOr[String] = js.undefined
  var `heart-beat`: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var login: js.UndefOr[String] = js.undefined
  var passcode: js.UndefOr[String] = js.undefined
}

object ConnectHeaders {
  @scala.inline
  def apply(
    `accept-version`: String = null,
    `heart-beat`: String = null,
    host: String = null,
    login: String = null,
    passcode: String = null
  ): ConnectHeaders = {
    val __obj = js.Dynamic.literal()
    if (`accept-version` != null) __obj.updateDynamic("accept-version")(`accept-version`.asInstanceOf[js.Any])
    if (`heart-beat` != null) __obj.updateDynamic("heart-beat")(`heart-beat`.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (login != null) __obj.updateDynamic("login")(login.asInstanceOf[js.Any])
    if (passcode != null) __obj.updateDynamic("passcode")(passcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectHeaders]
  }
}

