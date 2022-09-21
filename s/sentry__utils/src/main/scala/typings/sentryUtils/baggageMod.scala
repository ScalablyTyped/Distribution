package typings.sentryUtils

import typings.sentryUtils.anon.PartialDynamicSamplingCon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baggageMod {
  
  @JSImport("@sentry/utils/types/baggage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/utils/types/baggage", "BAGGAGE_HEADER_NAME")
  @js.native
  val BAGGAGE_HEADER_NAME: /* "baggage" */ String = js.native
  
  @JSImport("@sentry/utils/types/baggage", "MAX_BAGGAGE_STRING_LENGTH")
  @js.native
  val MAX_BAGGAGE_STRING_LENGTH: /* 8192 */ Double = js.native
  
  @JSImport("@sentry/utils/types/baggage", "SENTRY_BAGGAGE_KEY_PREFIX")
  @js.native
  val SENTRY_BAGGAGE_KEY_PREFIX: /* "sentry-" */ String = js.native
  
  @JSImport("@sentry/utils/types/baggage", "SENTRY_BAGGAGE_KEY_PREFIX_REGEX")
  @js.native
  val SENTRY_BAGGAGE_KEY_PREFIX_REGEX: js.RegExp = js.native
  
  inline def baggageHeaderToDynamicSamplingContext(): js.UndefOr[PartialDynamicSamplingCon] = ^.asInstanceOf[js.Dynamic].applyDynamic("baggageHeaderToDynamicSamplingContext")().asInstanceOf[js.UndefOr[PartialDynamicSamplingCon]]
  inline def baggageHeaderToDynamicSamplingContext(baggageHeader: String): js.UndefOr[PartialDynamicSamplingCon] = ^.asInstanceOf[js.Dynamic].applyDynamic("baggageHeaderToDynamicSamplingContext")(baggageHeader.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[PartialDynamicSamplingCon]]
  inline def baggageHeaderToDynamicSamplingContext(baggageHeader: js.Array[String]): js.UndefOr[PartialDynamicSamplingCon] = ^.asInstanceOf[js.Dynamic].applyDynamic("baggageHeaderToDynamicSamplingContext")(baggageHeader.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[PartialDynamicSamplingCon]]
  inline def baggageHeaderToDynamicSamplingContext(baggageHeader: Boolean): js.UndefOr[PartialDynamicSamplingCon] = ^.asInstanceOf[js.Dynamic].applyDynamic("baggageHeaderToDynamicSamplingContext")(baggageHeader.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[PartialDynamicSamplingCon]]
  inline def baggageHeaderToDynamicSamplingContext(baggageHeader: Double): js.UndefOr[PartialDynamicSamplingCon] = ^.asInstanceOf[js.Dynamic].applyDynamic("baggageHeaderToDynamicSamplingContext")(baggageHeader.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[PartialDynamicSamplingCon]]
  
  inline def dynamicSamplingContextToSentryBaggageHeader(dynamicSamplingContext: PartialDynamicSamplingCon): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("dynamicSamplingContextToSentryBaggageHeader")(dynamicSamplingContext.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
