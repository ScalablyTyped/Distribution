package typings
package reduxDashOrmLib.reduxDashOrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationalFieldOpts extends js.Object {
  var relatedName: js.UndefOr[java.lang.String] = js.undefined
  var through: js.UndefOr[java.lang.String] = js.undefined
  var throughFields: js.UndefOr[reduxDashOrmLib.Anon_From] = js.undefined
  var to: java.lang.String
}

object RelationalFieldOpts {
  @scala.inline
  def apply(
    to: java.lang.String,
    relatedName: java.lang.String = null,
    through: java.lang.String = null,
    throughFields: reduxDashOrmLib.Anon_From = null
  ): RelationalFieldOpts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("to")(to)
    if (relatedName != null) __obj.updateDynamic("relatedName")(relatedName)
    if (through != null) __obj.updateDynamic("through")(through)
    if (throughFields != null) __obj.updateDynamic("throughFields")(throughFields)
    __obj.asInstanceOf[RelationalFieldOpts]
  }
}

