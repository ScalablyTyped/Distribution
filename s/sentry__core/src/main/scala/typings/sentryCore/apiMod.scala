package typings.sentryCore

import typings.sentryCore.anon.Dictkey
import typings.sentryTypes.dsnMod.DsnComponents
import typings.sentryTypes.dsnMod.DsnLike
import typings.sentryTypes.optionsMod.ClientOptions
import typings.sentryTypes.transportMod.BaseTransportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("@sentry/core/types/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEnvelopeEndpointWithUrlEncodedAuth(dsn: DsnComponents): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvelopeEndpointWithUrlEncodedAuth")(dsn.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getEnvelopeEndpointWithUrlEncodedAuth(dsn: DsnComponents, tunnelOrOptions: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getEnvelopeEndpointWithUrlEncodedAuth")(dsn.asInstanceOf[js.Any], tunnelOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getEnvelopeEndpointWithUrlEncodedAuth(dsn: DsnComponents, tunnelOrOptions: ClientOptions[BaseTransportOptions]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getEnvelopeEndpointWithUrlEncodedAuth")(dsn.asInstanceOf[js.Any], tunnelOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getReportDialogEndpoint(dsnLike: DsnLike, dialogOptions: Dictkey): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getReportDialogEndpoint")(dsnLike.asInstanceOf[js.Any], dialogOptions.asInstanceOf[js.Any])).asInstanceOf[String]
}
