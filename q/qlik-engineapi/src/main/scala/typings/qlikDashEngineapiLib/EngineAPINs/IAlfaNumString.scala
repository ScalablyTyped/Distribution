package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qIsNum: scala.Boolean
  /**
    * Calculated value.
    */
  var qString: java.lang.String
}

object IAlfaNumString {
  @scala.inline
  def apply(qIsNum: scala.Boolean, qString: java.lang.String): IAlfaNumString = {
    val __obj = js.Dynamic.literal(qIsNum = qIsNum, qString = qString)
  
    __obj.asInstanceOf[IAlfaNumString]
  }
}

