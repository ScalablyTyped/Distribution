package typings.sipJs.mod.Core

import typings.sipJs.libCoreMessagesBodyMod.Body
import typings.sipJs.libCoreMessagesOutgoingResponseMod.OutgoingResponse
import typings.sipJs.libCoreMessagesOutgoingResponseMod.ResponseOptions
import typings.sipJs.mod.Core.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def constructOutgoingResponse(
  message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage,
  options: ResponseOptions
): OutgoingResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("constructOutgoingResponse")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OutgoingResponse]

inline def equivalentURI(a: typings.sipJs.libGrammarUriMod.URI, b: typings.sipJs.libGrammarUriMod.URI): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equivalentURI")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def fromBodyLegacy(bodyLegacy: String): Body = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBodyLegacy")(bodyLegacy.asInstanceOf[js.Any]).asInstanceOf[Body]
inline def fromBodyLegacy(bodyLegacy: typings.sipJs.anon.Body): Body = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBodyLegacy")(bodyLegacy.asInstanceOf[js.Any]).asInstanceOf[Body]

inline def getBody(message: Body): js.UndefOr[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Body]]
inline def getBody(message: typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage): js.UndefOr[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Body]]
inline def getBody(message: typings.sipJs.libCoreMessagesIncomingResponseMessageMod.IncomingResponseMessage): js.UndefOr[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Body]]
inline def getBody(message: typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessage): js.UndefOr[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Body]]

inline def isBody(body: Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBody")(body.asInstanceOf[js.Any]).asInstanceOf[/* is sip.js.sip.js/lib/core/messages/body.Body */ Boolean]
