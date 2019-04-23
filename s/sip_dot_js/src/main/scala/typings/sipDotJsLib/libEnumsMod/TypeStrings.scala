package typings
package sipDotJsLib.libEnumsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TypeStrings extends js.Object

@JSImport("sip.js/lib/Enums", "TypeStrings")
@js.native
object TypeStrings extends js.Object {
  @js.native
  sealed trait ClientContext
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait ConfigurationError
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait DTMF
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait Dialog
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait DigestAuthentication
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait IncomingMessage
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait IncomingRequest
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait IncomingResponse
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait InvalidStateError
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait InviteClientContext
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait InviteServerContext
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait Logger
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait LoggerFactory
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait MethodParameterError
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait NameAddrHeader
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait NotSupportedError
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait OutgoingRequest
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait Parameters
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait PublishContext
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait ReferClientContext
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait ReferServerContext
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait RegisterContext
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait RenegotiationError
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait RequestSender
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait ServerContext
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait Session
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait SessionDescriptionHandler
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait SessionDescriptionHandlerError
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait SessionDescriptionHandlerObserver
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait Subscription
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait Transport
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait UA
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  @js.native
  sealed trait URI
    extends sipDotJsLib.libEnumsMod.TypeStrings
  
  /* 0 */ val ClientContext: ClientContext with scala.Double = js.native
  /* 1 */ val ConfigurationError: ConfigurationError with scala.Double = js.native
  /* 4 */ val DTMF: DTMF with scala.Double = js.native
  /* 2 */ val Dialog: Dialog with scala.Double = js.native
  /* 3 */ val DigestAuthentication: DigestAuthentication with scala.Double = js.native
  /* 5 */ val IncomingMessage: IncomingMessage with scala.Double = js.native
  /* 6 */ val IncomingRequest: IncomingRequest with scala.Double = js.native
  /* 7 */ val IncomingResponse: IncomingResponse with scala.Double = js.native
  /* 8 */ val InvalidStateError: InvalidStateError with scala.Double = js.native
  /* 9 */ val InviteClientContext: InviteClientContext with scala.Double = js.native
  /* 10 */ val InviteServerContext: InviteServerContext with scala.Double = js.native
  /* 11 */ val Logger: Logger with scala.Double = js.native
  /* 12 */ val LoggerFactory: LoggerFactory with scala.Double = js.native
  /* 13 */ val MethodParameterError: MethodParameterError with scala.Double = js.native
  /* 14 */ val NameAddrHeader: NameAddrHeader with scala.Double = js.native
  /* 15 */ val NotSupportedError: NotSupportedError with scala.Double = js.native
  /* 16 */ val OutgoingRequest: OutgoingRequest with scala.Double = js.native
  /* 17 */ val Parameters: Parameters with scala.Double = js.native
  /* 18 */ val PublishContext: PublishContext with scala.Double = js.native
  /* 19 */ val ReferClientContext: ReferClientContext with scala.Double = js.native
  /* 20 */ val ReferServerContext: ReferServerContext with scala.Double = js.native
  /* 21 */ val RegisterContext: RegisterContext with scala.Double = js.native
  /* 22 */ val RenegotiationError: RenegotiationError with scala.Double = js.native
  /* 23 */ val RequestSender: RequestSender with scala.Double = js.native
  /* 24 */ val ServerContext: ServerContext with scala.Double = js.native
  /* 25 */ val Session: Session with scala.Double = js.native
  /* 26 */ val SessionDescriptionHandler: SessionDescriptionHandler with scala.Double = js.native
  /* 27 */ val SessionDescriptionHandlerError: SessionDescriptionHandlerError with scala.Double = js.native
  /* 28 */ val SessionDescriptionHandlerObserver: SessionDescriptionHandlerObserver with scala.Double = js.native
  /* 29 */ val Subscription: Subscription with scala.Double = js.native
  /* 30 */ val Transport: Transport with scala.Double = js.native
  /* 31 */ val UA: UA with scala.Double = js.native
  /* 32 */ val URI: URI with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sipDotJsLib.libEnumsMod.TypeStrings with scala.Double] = js.native
}

