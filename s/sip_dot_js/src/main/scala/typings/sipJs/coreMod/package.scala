package typings.sipJs.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def constructOutgoingResponse(
  message: typings.sipJs.incomingRequestMessageMod.IncomingRequestMessage,
  options: typings.sipJs.outgoingResponseMod.ResponseOptions
): typings.sipJs.outgoingResponseMod.OutgoingResponse = (typings.sipJs.coreMod.^.asInstanceOf[js.Dynamic].applyDynamic("constructOutgoingResponse")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.sipJs.outgoingResponseMod.OutgoingResponse]

inline def fromBodyLegacy(bodyLegacy: java.lang.String): typings.sipJs.bodyMod.Body = typings.sipJs.coreMod.^.asInstanceOf[js.Dynamic].applyDynamic("fromBodyLegacy")(bodyLegacy.asInstanceOf[js.Any]).asInstanceOf[typings.sipJs.bodyMod.Body]
inline def fromBodyLegacy(bodyLegacy: typings.sipJs.anon.Body): typings.sipJs.bodyMod.Body = typings.sipJs.coreMod.^.asInstanceOf[js.Dynamic].applyDynamic("fromBodyLegacy")(bodyLegacy.asInstanceOf[js.Any]).asInstanceOf[typings.sipJs.bodyMod.Body]

inline def getBody(message: typings.sipJs.bodyMod.Body): js.UndefOr[typings.sipJs.bodyMod.Body] = typings.sipJs.coreMod.^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.sipJs.bodyMod.Body]]
inline def getBody(message: typings.sipJs.incomingRequestMessageMod.IncomingRequestMessage): js.UndefOr[typings.sipJs.bodyMod.Body] = typings.sipJs.coreMod.^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.sipJs.bodyMod.Body]]
inline def getBody(message: typings.sipJs.incomingResponseMessageMod.IncomingResponseMessage): js.UndefOr[typings.sipJs.bodyMod.Body] = typings.sipJs.coreMod.^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.sipJs.bodyMod.Body]]
inline def getBody(message: typings.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage): js.UndefOr[typings.sipJs.bodyMod.Body] = typings.sipJs.coreMod.^.asInstanceOf[js.Dynamic].applyDynamic("getBody")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.sipJs.bodyMod.Body]]

inline def isBody(body: js.Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ scala.Boolean = typings.sipJs.coreMod.^.asInstanceOf[js.Dynamic].applyDynamic("isBody")(body.asInstanceOf[js.Any]).asInstanceOf[/* is sip.js.sip.js/lib/core/messages/body.Body */ scala.Boolean]
