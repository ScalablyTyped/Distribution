package typings.sentryCore

import typings.sentryTypes.typesCheckinMod.SerializedCheckIn
import typings.sentryTypes.typesDsnMod.DsnComponents
import typings.sentryTypes.typesEnvelopeMod.CheckInEvelope
import typings.sentryTypes.typesSdkmetadataMod.SdkMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCheckinMod {
  
  @JSImport("@sentry/core/types/checkin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCheckInEnvelope(checkIn: SerializedCheckIn): CheckInEvelope = ^.asInstanceOf[js.Dynamic].applyDynamic("createCheckInEnvelope")(checkIn.asInstanceOf[js.Any]).asInstanceOf[CheckInEvelope]
  inline def createCheckInEnvelope(checkIn: SerializedCheckIn, metadata: Unit, tunnel: String): CheckInEvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckInEnvelope")(checkIn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[CheckInEvelope]
  inline def createCheckInEnvelope(checkIn: SerializedCheckIn, metadata: Unit, tunnel: String, dsn: DsnComponents): CheckInEvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckInEnvelope")(checkIn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[CheckInEvelope]
  inline def createCheckInEnvelope(checkIn: SerializedCheckIn, metadata: Unit, tunnel: Unit, dsn: DsnComponents): CheckInEvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckInEnvelope")(checkIn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[CheckInEvelope]
  inline def createCheckInEnvelope(checkIn: SerializedCheckIn, metadata: SdkMetadata): CheckInEvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckInEnvelope")(checkIn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[CheckInEvelope]
  inline def createCheckInEnvelope(checkIn: SerializedCheckIn, metadata: SdkMetadata, tunnel: String): CheckInEvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckInEnvelope")(checkIn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[CheckInEvelope]
  inline def createCheckInEnvelope(checkIn: SerializedCheckIn, metadata: SdkMetadata, tunnel: String, dsn: DsnComponents): CheckInEvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckInEnvelope")(checkIn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[CheckInEvelope]
  inline def createCheckInEnvelope(checkIn: SerializedCheckIn, metadata: SdkMetadata, tunnel: Unit, dsn: DsnComponents): CheckInEvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createCheckInEnvelope")(checkIn.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[CheckInEvelope]
}
