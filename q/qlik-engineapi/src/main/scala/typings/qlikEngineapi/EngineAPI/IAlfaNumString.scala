package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AlfaNumString...
  */
trait IAlfaNumString extends js.Object {
  /**
    * Is set to true if the value is a numeric.
    */
  var qIsNum: Boolean
  /**
    * Calculated value.
    */
  var qString: String
}

object IAlfaNumString {
  @scala.inline
  def apply(qIsNum: Boolean, qString: String): IAlfaNumString = {
    val __obj = js.Dynamic.literal(qIsNum = qIsNum.asInstanceOf[js.Any], qString = qString.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlfaNumString]
  }
}

