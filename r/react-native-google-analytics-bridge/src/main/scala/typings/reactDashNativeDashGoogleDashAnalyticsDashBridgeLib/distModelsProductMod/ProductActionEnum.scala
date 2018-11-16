package typings
package reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProductActionEnum extends js.Object

@JSImport("react-native-google-analytics-bridge/dist/models/Product", "ProductActionEnum")
@js.native
object ProductActionEnum extends js.Object {
  @js.native
  sealed trait Add
    extends reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.ProductActionEnum
  
  @js.native
  sealed trait Checkout
    extends reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.ProductActionEnum
  
  @js.native
  sealed trait CheckoutOption
    extends reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.ProductActionEnum
  
  @js.native
  sealed trait Click
    extends reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.ProductActionEnum
  
  @js.native
  sealed trait Detail
    extends reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.ProductActionEnum
  
  @js.native
  sealed trait Purchase
    extends reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.ProductActionEnum
  
  @js.native
  sealed trait Refund
    extends reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.ProductActionEnum
  
  @js.native
  sealed trait Remove
    extends reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.ProductActionEnum
  
  /* 3 */ val Add: Add with scala.Double = js.native
  /* 5 */ val Checkout: Checkout with scala.Double = js.native
  /* 6 */ val CheckoutOption: CheckoutOption with scala.Double = js.native
  /* 2 */ val Click: Click with scala.Double = js.native
  /* 1 */ val Detail: Detail with scala.Double = js.native
  /* 7 */ val Purchase: Purchase with scala.Double = js.native
  /* 8 */ val Refund: Refund with scala.Double = js.native
  /* 4 */ val Remove: Remove with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod.ProductActionEnum with scala.Double
  ] = js.native
}

