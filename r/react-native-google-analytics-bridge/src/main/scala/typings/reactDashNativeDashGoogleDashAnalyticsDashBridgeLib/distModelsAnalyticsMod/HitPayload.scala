package typings
package reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HitPayload extends js.Object {
  var customDimensions: js.UndefOr[
    reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsCustomMod.CustomDimensionsByIndex | reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsCustomMod.CustomDimensionsByField
  ] = js.undefined
  var customMetrics: js.UndefOr[
    reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsCustomMod.CustomMetrics
  ] = js.undefined
  var impressionList: js.UndefOr[java.lang.String] = js.undefined
  var impressionProducts: js.UndefOr[
    js.Array[reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.Product]
  ] = js.undefined
  var impressionSource: js.UndefOr[java.lang.String] = js.undefined
  var productAction: js.UndefOr[
    reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.ProductAction
  ] = js.undefined
  var products: js.UndefOr[
    js.Array[reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.Product]
  ] = js.undefined
  var session: js.UndefOr[SessionState] = js.undefined
  var utmCampaignUrl: js.UndefOr[java.lang.String] = js.undefined
}

