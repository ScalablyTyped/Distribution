package typings.reactNativeSquareInAppPayments

import typings.reactNativeSquareInAppPayments.mod.Brand
import typings.reactNativeSquareInAppPayments.mod.CardPrepaidType
import typings.reactNativeSquareInAppPayments.mod.CardType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeSquareInAppPaymentsStrings {
  
  @js.native
  sealed trait AMERICAN_EXPRESS
    extends StObject
       with Brand
  @scala.inline
  def AMERICAN_EXPRESS: AMERICAN_EXPRESS = "AMERICAN_EXPRESS".asInstanceOf[AMERICAN_EXPRESS]
  
  @js.native
  sealed trait CHINA_UNION_PAY
    extends StObject
       with Brand
  @scala.inline
  def CHINA_UNION_PAY: CHINA_UNION_PAY = "CHINA_UNION_PAY".asInstanceOf[CHINA_UNION_PAY]
  
  @js.native
  sealed trait CREDIT
    extends StObject
       with CardType
  @scala.inline
  def CREDIT: CREDIT = "CREDIT".asInstanceOf[CREDIT]
  
  @js.native
  sealed trait DEBIT
    extends StObject
       with CardType
  @scala.inline
  def DEBIT: DEBIT = "DEBIT".asInstanceOf[DEBIT]
  
  @js.native
  sealed trait DISCOVER
    extends StObject
       with Brand
  @scala.inline
  def DISCOVER: DISCOVER = "DISCOVER".asInstanceOf[DISCOVER]
  
  @js.native
  sealed trait DISCOVER_DINERS
    extends StObject
       with Brand
  @scala.inline
  def DISCOVER_DINERS: DISCOVER_DINERS = "DISCOVER_DINERS".asInstanceOf[DISCOVER_DINERS]
  
  @js.native
  sealed trait JCB
    extends StObject
       with Brand
  @scala.inline
  def JCB: JCB = "JCB".asInstanceOf[JCB]
  
  @js.native
  sealed trait Light extends StObject
  @scala.inline
  def Light: Light = "Light".asInstanceOf[Light]
  
  @js.native
  sealed trait MASTERCARD
    extends StObject
       with Brand
  @scala.inline
  def MASTERCARD: MASTERCARD = "MASTERCARD".asInstanceOf[MASTERCARD]
  
  @js.native
  sealed trait NOT_PREPAID
    extends StObject
       with CardPrepaidType
  @scala.inline
  def NOT_PREPAID: NOT_PREPAID = "NOT_PREPAID".asInstanceOf[NOT_PREPAID]
  
  @js.native
  sealed trait OTHER_BRAND
    extends StObject
       with Brand
  @scala.inline
  def OTHER_BRAND: OTHER_BRAND = "OTHER_BRAND".asInstanceOf[OTHER_BRAND]
  
  @js.native
  sealed trait PREPAID
    extends StObject
       with CardPrepaidType
  @scala.inline
  def PREPAID: PREPAID = "PREPAID".asInstanceOf[PREPAID]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with CardPrepaidType
       with CardType
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait VISA
    extends StObject
       with Brand
  @scala.inline
  def VISA: VISA = "VISA".asInstanceOf[VISA]
}
