package typings.slackMock.mod

import typings.nock.mod.ReplyHeaders
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.urlMod.Url
import typings.slackMock.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(): Instance_ = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Instance_]
inline def apply(config: ConfigOptions): Instance_ = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Instance_]

inline def instance: Instance_ = ^.asInstanceOf[js.Dynamic].selectDynamic("instance").asInstanceOf[Instance_]
inline def instance_=(x: Instance_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])

type EventHttpHeaders = IncomingHttpHeaders

// Events
type EventUrl = String | Url

type IncomingWebhookHttpHeaders = ReplyHeaders

// Incoming Webhooks
type IncomingWebhookUrl = String

type InteractiveButtonHttpHeaders = ReplyHeaders

// Interactive Buttons
type InteractiveButtonUrl = String | Url

type OutgoingWebhookHttpHeaders = IncomingHttpHeaders

// Outgoing Webhooks
type OutgoingWebhookUrl = String | Url

type SlashCommandHttpHeaders = IncomingHttpHeaders

// Slash Commands
type SlashCommandUrl = String | Url

type WebHttpHeaders = ReplyHeaders

// Web
type WebUrl = String
