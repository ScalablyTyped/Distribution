package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CharRange...
  */
trait ICharRange extends js.Object {
  /*
    * Number of occurrences found
    */
  var qCharCount: scala.Double
  /**
    * Position of the first search occurrence
    */
  var qCharPos: scala.Double
}

object ICharRange {
  @scala.inline
  def apply(qCharCount: scala.Double, qCharPos: scala.Double): ICharRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qCharCount")(qCharCount)
    __obj.updateDynamic("qCharPos")(qCharPos)
    __obj.asInstanceOf[ICharRange]
  }
}

