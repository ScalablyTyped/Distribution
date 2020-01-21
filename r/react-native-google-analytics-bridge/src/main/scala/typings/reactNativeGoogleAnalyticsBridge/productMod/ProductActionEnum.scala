package typings.reactNativeGoogleAnalyticsBridge.productMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProductActionEnum extends js.Object

@JSImport("react-native-google-analytics-bridge/dist/models/Product", "ProductActionEnum")
@js.native
object ProductActionEnum extends js.Object {
  @js.native
  sealed trait Add extends ProductActionEnum
  
  @js.native
  sealed trait Checkout extends ProductActionEnum
  
  @js.native
  sealed trait CheckoutOption extends ProductActionEnum
  
  @js.native
  sealed trait Click extends ProductActionEnum
  
  @js.native
  sealed trait Detail extends ProductActionEnum
  
  @js.native
  sealed trait Purchase extends ProductActionEnum
  
  @js.native
  sealed trait Refund extends ProductActionEnum
  
  @js.native
  sealed trait Remove extends ProductActionEnum
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProductActionEnum with Double] = js.native
  /* 3 */ @js.native
  object Add extends TopLevel[Add with Double]
  
  /* 5 */ @js.native
  object Checkout extends TopLevel[Checkout with Double]
  
  /* 6 */ @js.native
  object CheckoutOption extends TopLevel[CheckoutOption with Double]
  
  /* 2 */ @js.native
  object Click extends TopLevel[Click with Double]
  
  /* 1 */ @js.native
  object Detail extends TopLevel[Detail with Double]
  
  /* 7 */ @js.native
  object Purchase extends TopLevel[Purchase with Double]
  
  /* 8 */ @js.native
  object Refund extends TopLevel[Refund with Double]
  
  /* 4 */ @js.native
  object Remove extends TopLevel[Remove with Double]
  
}

