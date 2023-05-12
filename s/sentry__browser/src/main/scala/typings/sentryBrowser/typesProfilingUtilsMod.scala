package typings.sentryBrowser

import typings.sentryBrowser.anon.Profile
import typings.sentryBrowser.typesProfilingJsSelfProfilingMod.JSSelfProfile
import typings.sentryBrowser.typesProfilingJsSelfProfilingMod.RawThreadCpuProfile
import typings.sentryBrowser.typesProfilingJsSelfProfilingMod.ThreadCpuProfile
import typings.sentryTypes.typesDsnMod.DsnComponents
import typings.sentryTypes.typesEnvelopeMod.EventEnvelope
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesSdkmetadataMod.SdkMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProfilingUtilsMod {
  
  @JSImport("@sentry/browser/types/profiling/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertJSSelfProfileToSampledFormat(input: JSSelfProfile): ThreadCpuProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("convertJSSelfProfileToSampledFormat")(input.asInstanceOf[js.Any]).asInstanceOf[ThreadCpuProfile]
  
  inline def createProfilingEventEnvelope(event: ProfiledEvent, dsn: DsnComponents): EventEnvelope | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createProfilingEventEnvelope")(event.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[EventEnvelope | Null]
  inline def createProfilingEventEnvelope(event: ProfiledEvent, dsn: DsnComponents, metadata: Unit, tunnel: String): EventEnvelope | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createProfilingEventEnvelope")(event.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[EventEnvelope | Null]
  inline def createProfilingEventEnvelope(event: ProfiledEvent, dsn: DsnComponents, metadata: SdkMetadata): EventEnvelope | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createProfilingEventEnvelope")(event.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[EventEnvelope | Null]
  inline def createProfilingEventEnvelope(event: ProfiledEvent, dsn: DsnComponents, metadata: SdkMetadata, tunnel: String): EventEnvelope | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createProfilingEventEnvelope")(event.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[EventEnvelope | Null]
  
  inline def enrichWithThreadInformation(profile: RawThreadCpuProfile): ThreadCpuProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("enrichWithThreadInformation")(profile.asInstanceOf[js.Any]).asInstanceOf[ThreadCpuProfile]
  inline def enrichWithThreadInformation(profile: ThreadCpuProfile): ThreadCpuProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("enrichWithThreadInformation")(profile.asInstanceOf[js.Any]).asInstanceOf[ThreadCpuProfile]
  
  inline def isProfiledTransactionEvent(event: Event): /* is @sentry/browser.@sentry/browser/types/profiling/utils.ProfiledEvent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProfiledTransactionEvent")(event.asInstanceOf[js.Any]).asInstanceOf[/* is @sentry/browser.@sentry/browser/types/profiling/utils.ProfiledEvent */ Boolean]
  
  inline def maybeRemoveProfileFromSdkMetadata(event: ProfiledEvent): Event = ^.asInstanceOf[js.Dynamic].applyDynamic("maybeRemoveProfileFromSdkMetadata")(event.asInstanceOf[js.Any]).asInstanceOf[Event]
  inline def maybeRemoveProfileFromSdkMetadata(event: Event): Event = ^.asInstanceOf[js.Dynamic].applyDynamic("maybeRemoveProfileFromSdkMetadata")(event.asInstanceOf[js.Any]).asInstanceOf[Event]
  
  trait ProfiledEvent
    extends StObject
       with Event {
    
    @JSName("sdkProcessingMetadata")
    var sdkProcessingMetadata_ProfiledEvent: Profile
  }
  object ProfiledEvent {
    
    inline def apply(sdkProcessingMetadata: Profile): ProfiledEvent = {
      val __obj = js.Dynamic.literal(sdkProcessingMetadata = sdkProcessingMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfiledEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProfiledEvent] (val x: Self) extends AnyVal {
      
      inline def setSdkProcessingMetadata(value: Profile): Self = StObject.set(x, "sdkProcessingMetadata", value.asInstanceOf[js.Any])
    }
  }
}
