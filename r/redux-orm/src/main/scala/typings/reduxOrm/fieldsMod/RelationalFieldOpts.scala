package typings.reduxOrm.fieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationalFieldOpts extends js.Object {
  var as: js.UndefOr[String] = js.undefined
  var relatedName: js.UndefOr[String] = js.undefined
  var through: js.UndefOr[String] = js.undefined
  var throughFields: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var to: String
}

object RelationalFieldOpts {
  @scala.inline
  def apply(
    to: String,
    as: String = null,
    relatedName: String = null,
    through: String = null,
    throughFields: js.Tuple2[String, String] = null
  ): RelationalFieldOpts = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (relatedName != null) __obj.updateDynamic("relatedName")(relatedName.asInstanceOf[js.Any])
    if (through != null) __obj.updateDynamic("through")(through.asInstanceOf[js.Any])
    if (throughFields != null) __obj.updateDynamic("throughFields")(throughFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalFieldOpts]
  }
}

