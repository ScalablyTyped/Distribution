package typings.slackMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EventHttpHeaders = typings.node.httpMod.IncomingHttpHeaders
  
  // Events
  type EventUrl = java.lang.String | typings.node.urlMod.Url
  
  type IncomingWebhookHttpHeaders = typings.nock.mod.ReplyHeaders
  
  // Incoming Webhooks
  type IncomingWebhookUrl = java.lang.String
  
  type InteractiveButtonHttpHeaders = typings.nock.mod.ReplyHeaders
  
  // Interactive Buttons
  type InteractiveButtonUrl = java.lang.String | typings.node.urlMod.Url
  
  type OutgoingWebhookHttpHeaders = typings.node.httpMod.IncomingHttpHeaders
  
  // Outgoing Webhooks
  type OutgoingWebhookUrl = java.lang.String | typings.node.urlMod.Url
  
  type SlashCommandHttpHeaders = typings.node.httpMod.IncomingHttpHeaders
  
  // Slash Commands
  type SlashCommandUrl = java.lang.String | typings.node.urlMod.Url
  
  type WebHttpHeaders = typings.nock.mod.ReplyHeaders
  
  // Web
  type WebUrl = java.lang.String
}
