package typings.sentryUtils

import typings.sentryTypes.typesClientreportMod.Outcome
import typings.sentryTypes.typesEnvelopeMod.ClientReportEnvelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesClientreportMod {
  
  @JSImport("@sentry/utils/types/clientreport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClientReportEnvelope(discarded_events: js.Array[Outcome]): ClientReportEnvelope = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientReportEnvelope")(discarded_events.asInstanceOf[js.Any]).asInstanceOf[ClientReportEnvelope]
  inline def createClientReportEnvelope(discarded_events: js.Array[Outcome], dsn: String): ClientReportEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientReportEnvelope")(discarded_events.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[ClientReportEnvelope]
  inline def createClientReportEnvelope(discarded_events: js.Array[Outcome], dsn: String, timestamp: Double): ClientReportEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientReportEnvelope")(discarded_events.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[ClientReportEnvelope]
  inline def createClientReportEnvelope(discarded_events: js.Array[Outcome], dsn: Unit, timestamp: Double): ClientReportEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientReportEnvelope")(discarded_events.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[ClientReportEnvelope]
}
