package typings.sentryCore

import typings.sentryTypes.typesDsnMod.DsnComponents
import typings.sentryTypes.typesEnvelopeMod.EventEnvelope
import typings.sentryTypes.typesEnvelopeMod.SessionEnvelope
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesSdkmetadataMod.SdkMetadata
import typings.sentryTypes.typesSessionMod.Session
import typings.sentryTypes.typesSessionMod.SessionAggregates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEnvelopeMod {
  
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
