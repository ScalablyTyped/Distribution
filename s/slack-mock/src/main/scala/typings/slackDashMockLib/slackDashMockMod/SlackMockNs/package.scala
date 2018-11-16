package typings
package slackDashMockLib.slackDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SlackMockNs {
  type EventHttpHeaders = nodeLib.httpMod.IncomingHttpHeaders
  // Events
  type EventUrl = java.lang.String | nodeLib.urlMod.Url
  type IncomingWebhookHttpHeaders = nockLib.nockMod.nockNs.HttpHeaders
  // Incoming Webhooks
  type IncomingWebhookUrl = java.lang.String
  type InteractiveButtonHttpHeaders = nockLib.nockMod.nockNs.HttpHeaders
  // Interactive Buttons
  type InteractiveButtonUrl = java.lang.String | nodeLib.urlMod.Url
  type OutgoingWebhookHttpHeaders = nodeLib.httpMod.IncomingHttpHeaders
  // Outgoing Webhooks
  type OutgoingWebhookUrl = java.lang.String | nodeLib.urlMod.Url
  type SlashCommandHttpHeaders = nodeLib.httpMod.IncomingHttpHeaders
  // Slash Commands
  type SlashCommandUrl = java.lang.String | nodeLib.urlMod.Url
  type WebHttpHeaders = nockLib.nockMod.nockNs.HttpHeaders
  // Web
  type WebUrl = java.lang.String
}
