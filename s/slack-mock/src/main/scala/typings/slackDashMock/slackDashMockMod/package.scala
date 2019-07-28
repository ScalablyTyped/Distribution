package typings.slackDashMock

import typings.nock.nockMod.HttpHeaders
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object slackDashMockMod {
  type EventHttpHeaders = IncomingHttpHeaders
  // Events
  type EventUrl = String | Url
  type IncomingWebhookHttpHeaders = HttpHeaders
  // Incoming Webhooks
  type IncomingWebhookUrl = String
  type InteractiveButtonHttpHeaders = HttpHeaders
  // Interactive Buttons
  type InteractiveButtonUrl = String | Url
  type OutgoingWebhookHttpHeaders = IncomingHttpHeaders
  // Outgoing Webhooks
  type OutgoingWebhookUrl = String | Url
  type SlashCommandHttpHeaders = IncomingHttpHeaders
  // Slash Commands
  type SlashCommandUrl = String | Url
  type WebHttpHeaders = HttpHeaders
  // Web
  type WebUrl = String
}
