package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organization extends js.Object {
  // name of the company
  var company_name: js.UndefOr[java.lang.String] = js.undefined
  // ISO-8601 date
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  // name of the organization
  var display_name: js.UndefOr[java.lang.String] = js.undefined
  // unique identifier for the organization
  var id: js.UndefOr[java.lang.String] = js.undefined
  // number of QCUs
  var qcu: js.UndefOr[scala.Double] = js.undefined
  // org state
  var state: js.UndefOr[
    rocksetLib.rocksetLibStrings.ACTIVE | rocksetLib.rocksetLibStrings.TRIAL | rocksetLib.rocksetLibStrings.TRIAL_EXPIRED | rocksetLib.rocksetLibStrings.DELETED
  ] = js.undefined
  // pricing tier
  var tier: js.UndefOr[
    rocksetLib.rocksetLibStrings.FREE | rocksetLib.rocksetLibStrings.BASIC | rocksetLib.rocksetLibStrings.PRO | rocksetLib.rocksetLibStrings.ENTERPRISE
  ] = js.undefined
}

object Organization {
  @scala.inline
  def apply(
    company_name: java.lang.String = null,
    created_at: java.lang.String = null,
    display_name: java.lang.String = null,
    id: java.lang.String = null,
    qcu: scala.Int | scala.Double = null,
    state: rocksetLib.rocksetLibStrings.ACTIVE | rocksetLib.rocksetLibStrings.TRIAL | rocksetLib.rocksetLibStrings.TRIAL_EXPIRED | rocksetLib.rocksetLibStrings.DELETED = null,
    tier: rocksetLib.rocksetLibStrings.FREE | rocksetLib.rocksetLibStrings.BASIC | rocksetLib.rocksetLibStrings.PRO | rocksetLib.rocksetLibStrings.ENTERPRISE = null
  ): Organization = {
    val __obj = js.Dynamic.literal()
    if (company_name != null) __obj.updateDynamic("company_name")(company_name)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (display_name != null) __obj.updateDynamic("display_name")(display_name)
    if (id != null) __obj.updateDynamic("id")(id)
    if (qcu != null) __obj.updateDynamic("qcu")(qcu.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organization]
  }
}

