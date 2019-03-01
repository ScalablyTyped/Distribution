package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container for the dynamic properties of an attribute expression.
  */
trait INxTickCell extends js.Object {
  /*
    * End value.
    */
  var qEnd: scala.Double
  /**
    * Start value.
    */
  var qStart: scala.Double
  /**
    * Tick's label.
    */
  var qText: java.lang.String
}

object INxTickCell {
  @scala.inline
  def apply(qEnd: scala.Double, qStart: scala.Double, qText: java.lang.String): INxTickCell = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qEnd")(qEnd)
    __obj.updateDynamic("qStart")(qStart)
    __obj.updateDynamic("qText")(qText)
    __obj.asInstanceOf[INxTickCell]
  }
}

