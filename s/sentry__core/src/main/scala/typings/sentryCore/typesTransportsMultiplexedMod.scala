package typings.sentryCore

import typings.sentryTypes.typesEnvelopeMod.Envelope
import typings.sentryTypes.typesEnvelopeMod.EnvelopeItemType
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesTransportMod.BaseTransportOptions
import typings.sentryTypes.typesTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransportsMultiplexedMod {
  
  @JSImport("@sentry/core/types/transports/multiplexed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeMultiplexedTransport[TO /* <: BaseTransportOptions */](createTransport: js.Function1[/* options */ TO, Transport], matcher: Matcher): js.Function1[/* options */ TO, Transport] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMultiplexedTransport")(createTransport.asInstanceOf[js.Any], matcher.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* options */ TO, Transport]]
  
  @js.native
  trait MatchParam extends StObject {
    
    /** The envelope to be sent */
    var envelope: Envelope = js.native
    
    /**
      * A function that returns an event from the envelope if one exists. You can optionally pass an array of envelope item
      * types to filter by - only envelopes matching the given types will be multiplexed.
      * Allowed values are: 'event', 'transaction', 'profile', 'replay_event'
      *
      * @param types Defaults to ['event']
      */
    def getEvent(): js.UndefOr[Event] = js.native
    def getEvent(types: js.Array[EnvelopeItemType]): js.UndefOr[Event] = js.native
  }
  
  type Matcher = js.Function1[/* param */ MatchParam, js.Array[String]]
}
