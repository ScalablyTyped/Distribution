package typings.reactNativeSquareInAppPayments

import typings.reactNativeSquareInAppPayments.mod.Brand
import typings.reactNativeSquareInAppPayments.mod.CardPrepaidType
import typings.reactNativeSquareInAppPayments.mod.CardType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeSquareInAppPaymentsStrings {
  
  @scala.inline
  def AMERICAN_EXPRESS: AMERICAN_EXPRESS = "AMERICAN_EXPRESS".asInstanceOf[AMERICAN_EXPRESS]
  
  @scala.inline
  def CHINA_UNION_PAY: CHINA_UNION_PAY = "CHINA_UNION_PAY".asInstanceOf[CHINA_UNION_PAY]
  
  @scala.inline
  def CREDIT: CREDIT = "CREDIT".asInstanceOf[CREDIT]
  
  @scala.inline
  def DEBIT: DEBIT = "DEBIT".asInstanceOf[DEBIT]
  
  @scala.inline
  def DISCOVER: DISCOVER = "DISCOVER".asInstanceOf[DISCOVER]
  
  @scala.inline
  def DISCOVER_DINERS: DISCOVER_DINERS = "DISCOVER_DINERS".asInstanceOf[DISCOVER_DINERS]
  
  @scala.inline
  def JCB: JCB = "JCB".asInstanceOf[JCB]
  
  @scala.inline
  def Light: Light = "Light".asInstanceOf[Light]
  
  @scala.inline
  def MASTERCARD: MASTERCARD = "MASTERCARD".asInstanceOf[MASTERCARD]
  
  @scala.inline
  def NOT_PREPAID: NOT_PREPAID = "NOT_PREPAID".asInstanceOf[NOT_PREPAID]
  
  @scala.inline
  def OTHER_BRAND: OTHER_BRAND = "OTHER_BRAND".asInstanceOf[OTHER_BRAND]
  
  @scala.inline
  def PREPAID: PREPAID = "PREPAID".asInstanceOf[PREPAID]
  
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @scala.inline
  def VISA: VISA = "VISA".asInstanceOf[VISA]
  
  @js.native
  sealed trait AMERICAN_EXPRESS extends Brand
  
  @js.native
  sealed trait CHINA_UNION_PAY extends Brand
  
  @js.native
  sealed trait CREDIT extends CardType
  
  @js.native
  sealed trait DEBIT extends CardType
  
  @js.native
  sealed trait DISCOVER extends Brand
  
  @js.native
  sealed trait DISCOVER_DINERS extends Brand
  
  @js.native
  sealed trait JCB extends Brand
  
  @js.native
  sealed trait Light extends js.Object
  
  @js.native
  sealed trait MASTERCARD extends Brand
  
  @js.native
  sealed trait NOT_PREPAID extends CardPrepaidType
  
  @js.native
  sealed trait OTHER_BRAND extends Brand
  
  @js.native
  sealed trait PREPAID extends CardPrepaidType
  
  @js.native
  sealed trait UNKNOWN
    extends CardPrepaidType
       with CardType
  
  @js.native
  sealed trait VISA extends Brand
}
