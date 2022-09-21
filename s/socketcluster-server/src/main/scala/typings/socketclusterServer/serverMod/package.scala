package typings.socketclusterServer.serverMod

import typings.socketclusterServer.actionMod.AGActionAuthenticate
import typings.socketclusterServer.actionMod.AGActionHandshakeSC
import typings.socketclusterServer.actionMod.AGActionHandshakeWS
import typings.socketclusterServer.actionMod.AGActionInvoke
import typings.socketclusterServer.actionMod.AGActionMessage
import typings.socketclusterServer.actionMod.AGActionPublishIn
import typings.socketclusterServer.actionMod.AGActionPublishOut
import typings.socketclusterServer.actionMod.AGActionSubscribe
import typings.socketclusterServer.actionMod.AGActionTransmit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Middlewares = /* "handshake" */ String

type handshakeMiddlewareFunction = js.Function1[
/* stream */ typings.writableConsumableStream.mod.^[AGActionHandshakeWS | AGActionHandshakeSC], 
Unit]

type inboundMiddlewareFunction = js.Function1[
/* stream */ typings.writableConsumableStream.mod.^[
  AGActionTransmit | AGActionInvoke | AGActionSubscribe | AGActionPublishIn | AGActionAuthenticate
], 
Unit]

type inboundRawMiddlewareFunction = js.Function1[/* stream */ typings.writableConsumableStream.mod.^[AGActionMessage], Unit]

type outboundMiddlewareFunction = js.Function1[/* stream */ typings.writableConsumableStream.mod.^[AGActionPublishOut], Unit]
