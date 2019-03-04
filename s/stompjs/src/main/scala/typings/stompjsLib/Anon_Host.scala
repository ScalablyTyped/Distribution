package typings
package stompjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: js.UndefOr[java.lang.String] = js.undefined
  var login: java.lang.String
  var passcode: java.lang.String
}

object Anon_Host {
  @scala.inline
  def apply(login: java.lang.String, passcode: java.lang.String, host: java.lang.String = null): Anon_Host = {
    val __obj = js.Dynamic.literal(login = login, passcode = passcode)
    if (host != null) __obj.updateDynamic("host")(host)
    __obj.asInstanceOf[Anon_Host]
  }
}

