package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheDataEncryptedCacheTtlInSeconds extends js.Object {
  var cacheDataEncrypted: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var cacheTtlInSeconds: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var cachingEnabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var dataTraceEnabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var loggingLevel: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var metricsEnabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var requireAuthorizationForCacheControl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var throttlingBurstLimit: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var throttlingRateLimit: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var unauthorizedCacheControlHeaderStrategy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_CacheDataEncryptedCacheTtlInSeconds {
  @scala.inline
  def apply(
    cacheDataEncrypted: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    cacheTtlInSeconds: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    cachingEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    dataTraceEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    loggingLevel: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    metricsEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    requireAuthorizationForCacheControl: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    throttlingBurstLimit: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    throttlingRateLimit: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    unauthorizedCacheControlHeaderStrategy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_CacheDataEncryptedCacheTtlInSeconds = {
    val __obj = js.Dynamic.literal()
    if (cacheDataEncrypted != null) __obj.updateDynamic("cacheDataEncrypted")(cacheDataEncrypted.asInstanceOf[js.Any])
    if (cacheTtlInSeconds != null) __obj.updateDynamic("cacheTtlInSeconds")(cacheTtlInSeconds.asInstanceOf[js.Any])
    if (cachingEnabled != null) __obj.updateDynamic("cachingEnabled")(cachingEnabled.asInstanceOf[js.Any])
    if (dataTraceEnabled != null) __obj.updateDynamic("dataTraceEnabled")(dataTraceEnabled.asInstanceOf[js.Any])
    if (loggingLevel != null) __obj.updateDynamic("loggingLevel")(loggingLevel.asInstanceOf[js.Any])
    if (metricsEnabled != null) __obj.updateDynamic("metricsEnabled")(metricsEnabled.asInstanceOf[js.Any])
    if (requireAuthorizationForCacheControl != null) __obj.updateDynamic("requireAuthorizationForCacheControl")(requireAuthorizationForCacheControl.asInstanceOf[js.Any])
    if (throttlingBurstLimit != null) __obj.updateDynamic("throttlingBurstLimit")(throttlingBurstLimit.asInstanceOf[js.Any])
    if (throttlingRateLimit != null) __obj.updateDynamic("throttlingRateLimit")(throttlingRateLimit.asInstanceOf[js.Any])
    if (unauthorizedCacheControlHeaderStrategy != null) __obj.updateDynamic("unauthorizedCacheControlHeaderStrategy")(unauthorizedCacheControlHeaderStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CacheDataEncryptedCacheTtlInSeconds]
  }
}

