package typings
package sccDashBrokerDashClientLib.clientDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientPoolOptions extends js.Object {
  var authKey: js.UndefOr[jsonwebtokenLib.jsonwebtokenMod.Secret] = js.undefined
  var clientCount: js.UndefOr[scala.Double] = js.undefined
  var targetURI: java.lang.String
}

object ClientPoolOptions {
  @scala.inline
  def apply(
    targetURI: java.lang.String,
    authKey: jsonwebtokenLib.jsonwebtokenMod.Secret = null,
    clientCount: scala.Int | scala.Double = null
  ): ClientPoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("targetURI")(targetURI)
    if (authKey != null) __obj.updateDynamic("authKey")(authKey.asInstanceOf[js.Any])
    if (clientCount != null) __obj.updateDynamic("clientCount")(clientCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPoolOptions]
  }
}

