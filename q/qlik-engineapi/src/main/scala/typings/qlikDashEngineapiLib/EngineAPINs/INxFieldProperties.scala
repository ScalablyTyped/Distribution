package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxFieldProperties extends js.Object {
  var qOneAndOnlyOne: scala.Boolean
}

object INxFieldProperties {
  @scala.inline
  def apply(qOneAndOnlyOne: scala.Boolean): INxFieldProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qOneAndOnlyOne")(qOneAndOnlyOne)
    __obj.asInstanceOf[INxFieldProperties]
  }
}

