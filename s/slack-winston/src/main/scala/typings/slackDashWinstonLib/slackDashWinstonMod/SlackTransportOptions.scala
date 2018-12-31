package typings
package slackDashWinstonLib.slackDashWinstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlackTransportOptions
  extends winstonDashTransportLib.winstonDashTransportMod.TransportStreamNs.TransportStreamOptions {
  var channel: java.lang.String
  var domain: java.lang.String
  var icon_emoji: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var queueDelay: js.UndefOr[scala.Double] = js.undefined
  var token: java.lang.String
  var username: js.UndefOr[java.lang.String] = js.undefined
  var webhook_url: java.lang.String
}

