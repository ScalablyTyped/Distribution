package typings.qlikDashEngineapi.EngineAPINs

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
  var qEnd: Double
  /**
    * Start value.
    */
  var qStart: Double
  /**
    * Tick's label.
    */
  var qText: String
}

object INxTickCell {
  @scala.inline
  def apply(qEnd: Double, qStart: Double, qText: String): INxTickCell = {
    val __obj = js.Dynamic.literal(qEnd = qEnd, qStart = qStart, qText = qText)
  
    __obj.asInstanceOf[INxTickCell]
  }
}

