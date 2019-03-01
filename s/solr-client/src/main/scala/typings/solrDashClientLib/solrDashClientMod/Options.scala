package typings
package solrDashClientLib.solrDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var agent: js.UndefOr[java.lang.String] = js.undefined
  var bigint: js.UndefOr[java.lang.String] = js.undefined
  var core: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var secure: js.UndefOr[java.lang.String] = js.undefined
  var solrVersion: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    agent: java.lang.String = null,
    bigint: java.lang.String = null,
    core: java.lang.String = null,
    host: java.lang.String = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    secure: java.lang.String = null,
    solrVersion: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (bigint != null) __obj.updateDynamic("bigint")(bigint)
    if (core != null) __obj.updateDynamic("core")(core)
    if (host != null) __obj.updateDynamic("host")(host)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure)
    if (solrVersion != null) __obj.updateDynamic("solrVersion")(solrVersion)
    __obj.asInstanceOf[Options]
  }
}

