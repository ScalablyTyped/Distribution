package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fraudulent extends js.Object {
  /**
    * Assessments from Stripe have the key stripe_report and, if set, the value "fraudulent".
    */
  var stripe_report: js.UndefOr[stripeDashV3Lib.stripeDashV3LibStrings.fraudulent] = js.undefined
  /**
    * Assessments reported by you have the key user_report and, if set, possible values of "safe" and "fraudulent".
    */
  var user_report: js.UndefOr[
    stripeDashV3Lib.stripeDashV3LibStrings.fraudulent | stripeDashV3Lib.stripeDashV3LibStrings.safe
  ] = js.undefined
}

object Anon_Fraudulent {
  @scala.inline
  def apply(
    stripe_report: stripeDashV3Lib.stripeDashV3LibStrings.fraudulent = null,
    user_report: stripeDashV3Lib.stripeDashV3LibStrings.fraudulent | stripeDashV3Lib.stripeDashV3LibStrings.safe = null
  ): Anon_Fraudulent = {
    val __obj = js.Dynamic.literal()
    if (stripe_report != null) __obj.updateDynamic("stripe_report")(stripe_report)
    if (user_report != null) __obj.updateDynamic("user_report")(user_report.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Fraudulent]
  }
}

