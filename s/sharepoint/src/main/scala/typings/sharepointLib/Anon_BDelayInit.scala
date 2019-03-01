package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BDelayInit extends js.Object {
  var bDelayInit: scala.Boolean
  var separatorChar: java.lang.String
  var singleValuePropTypeID: java.lang.String
}

object Anon_BDelayInit {
  @scala.inline
  def apply(
    bDelayInit: scala.Boolean,
    separatorChar: java.lang.String,
    singleValuePropTypeID: java.lang.String
  ): Anon_BDelayInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bDelayInit")(bDelayInit)
    __obj.updateDynamic("separatorChar")(separatorChar)
    __obj.updateDynamic("singleValuePropTypeID")(singleValuePropTypeID)
    __obj.asInstanceOf[Anon_BDelayInit]
  }
}

