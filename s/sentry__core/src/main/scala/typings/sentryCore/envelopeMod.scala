package typings.sentryCore

import typings.sentryTypes.dsnMod.DsnComponents
import typings.sentryTypes.envelopeMod.EventEnvelope
import typings.sentryTypes.envelopeMod.SessionEnvelope
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.sdkmetadataMod.SdkMetadata
import typings.sentryTypes.sessionMod.Session
import typings.sentryTypes.sessionMod.SessionAggregates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object envelopeMod {
  
  @JSImport("@sentry/core/types/envelope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEventEnvelope(event: Event, dsn: DsnComponents): EventEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventEnvelope")(event.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[EventEnvelope]
  inline def createEventEnvelope(event: Event, dsn: DsnComponents, metadata: Unit, tunnel: String): EventEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventEnvelope")(event.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[EventEnvelope]
  inline def createEventEnvelope(event: Event, dsn: DsnComponents, metadata: SdkMetadata): EventEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventEnvelope")(event.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[EventEnvelope]
  inline def createEventEnvelope(event: Event, dsn: DsnComponents, metadata: SdkMetadata, tunnel: String): EventEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventEnvelope")(event.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[EventEnvelope]
  
  inline def createSessionEnvelope(session: SessionAggregates, dsn: DsnComponents): SessionEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionEnvelope")(session.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[SessionEnvelope]
  inline def createSessionEnvelope(session: SessionAggregates, dsn: DsnComponents, metadata: Unit, tunnel: String): SessionEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionEnvelope")(session.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[SessionEnvelope]
  inline def createSessionEnvelope(session: SessionAggregates, dsn: DsnComponents, metadata: SdkMetadata): SessionEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionEnvelope")(session.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[SessionEnvelope]
  inline def createSessionEnvelope(session: SessionAggregates, dsn: DsnComponents, metadata: SdkMetadata, tunnel: String): SessionEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionEnvelope")(session.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[SessionEnvelope]
  inline def createSessionEnvelope(session: Session, dsn: DsnComponents): SessionEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionEnvelope")(session.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[SessionEnvelope]
  inline def createSessionEnvelope(session: Session, dsn: DsnComponents, metadata: Unit, tunnel: String): SessionEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionEnvelope")(session.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[SessionEnvelope]
  inline def createSessionEnvelope(session: Session, dsn: DsnComponents, metadata: SdkMetadata): SessionEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionEnvelope")(session.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[SessionEnvelope]
  inline def createSessionEnvelope(session: Session, dsn: DsnComponents, metadata: SdkMetadata, tunnel: String): SessionEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionEnvelope")(session.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[SessionEnvelope]
}
