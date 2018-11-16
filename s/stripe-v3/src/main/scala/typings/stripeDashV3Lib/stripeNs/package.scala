package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stripeNs {
  type brandType = stripeDashV3Lib.stripeDashV3LibStrings.Visa | (stripeDashV3Lib.stripeDashV3LibStrings.`American Express`) | stripeDashV3Lib.stripeDashV3LibStrings.MasterCard | stripeDashV3Lib.stripeDashV3LibStrings.Discover | stripeDashV3Lib.stripeDashV3LibStrings.JCB | (stripeDashV3Lib.stripeDashV3LibStrings.`Diners Club`) | stripeDashV3Lib.stripeDashV3LibStrings.Unknown
  type checkType = stripeDashV3Lib.stripeDashV3LibStrings.pass | stripeDashV3Lib.stripeDashV3LibStrings.fail | stripeDashV3Lib.stripeDashV3LibStrings.unavailable | stripeDashV3Lib.stripeDashV3LibStrings.unchecked
  type fundingType = stripeDashV3Lib.stripeDashV3LibStrings.credit | stripeDashV3Lib.stripeDashV3LibStrings.debit | stripeDashV3Lib.stripeDashV3LibStrings.prepaid | stripeDashV3Lib.stripeDashV3LibStrings.unknown
  type statusType = stripeDashV3Lib.stripeDashV3LibStrings.`new` | stripeDashV3Lib.stripeDashV3LibStrings.validated | stripeDashV3Lib.stripeDashV3LibStrings.verified | stripeDashV3Lib.stripeDashV3LibStrings.verification_failed | stripeDashV3Lib.stripeDashV3LibStrings.errored
  type tokenizationType = stripeDashV3Lib.stripeDashV3LibStrings.apple_pay | stripeDashV3Lib.stripeDashV3LibStrings.android_pay
}
