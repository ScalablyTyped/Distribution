package typings
package slackDashMockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object slackDashMockMod {
  type EventHttpHeaders = nodeLib.httpMod.IncomingHttpHeaders
  // Events
  type EventUrl = java.lang.String | nodeLib.urlMod.Url
  type IncomingWebhookHttpHeaders = nockLib.nockMod.HttpHeaders
  // Incoming Webhooks
  type IncomingWebhookUrl = java.lang.String
  type InteractiveButtonHttpHeaders = nockLib.nockMod.HttpHeaders
  // Interactive Buttons
  type InteractiveButtonUrl = java.lang.String | nodeLib.urlMod.Url
  type OutgoingWebhookHttpHeaders = nodeLib.httpMod.IncomingHttpHeaders
  // Outgoing Webhooks
  type OutgoingWebhookUrl = java.lang.String | nodeLib.urlMod.Url
  type SlashCommandHttpHeaders = nodeLib.httpMod.IncomingHttpHeaders
  // Slash Commands
  type SlashCommandUrl = java.lang.String | nodeLib.urlMod.Url
  type WebHttpHeaders = nockLib.nockMod.HttpHeaders
  // Web
  type WebUrl = java.lang.String
}
