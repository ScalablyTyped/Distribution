package typings
package stripeDashV2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stripeNs {
  type StripeApplePayBillingContactField = stripeDashV2Lib.stripeDashV2LibStrings.postalAddress | stripeDashV2Lib.stripeDashV2LibStrings.name
  type StripeApplePayShipping = stripeDashV2Lib.stripeDashV2LibStrings.shipping | stripeDashV2Lib.stripeDashV2LibStrings.delivery | stripeDashV2Lib.stripeDashV2LibStrings.storePickup | stripeDashV2Lib.stripeDashV2LibStrings.servicePickup
  type StripeApplePayShippingContactField = StripeApplePayBillingContactField | stripeDashV2Lib.stripeDashV2LibStrings.phone | stripeDashV2Lib.stripeDashV2LibStrings.email
  type StripeCardDataBrand = stripeDashV2Lib.stripeDashV2LibStrings.Visa | (stripeDashV2Lib.stripeDashV2LibStrings.`American Express`) | stripeDashV2Lib.stripeDashV2LibStrings.MasterCard | stripeDashV2Lib.stripeDashV2LibStrings.Discover | stripeDashV2Lib.stripeDashV2LibStrings.JCB | (stripeDashV2Lib.stripeDashV2LibStrings.`Diners Club`) | stripeDashV2Lib.stripeDashV2LibStrings.Unknown
  type StripeCardDataFunding = stripeDashV2Lib.stripeDashV2LibStrings.credit | stripeDashV2Lib.stripeDashV2LibStrings.debit | stripeDashV2Lib.stripeDashV2LibStrings.prepaid | stripeDashV2Lib.stripeDashV2LibStrings.unknown
}
