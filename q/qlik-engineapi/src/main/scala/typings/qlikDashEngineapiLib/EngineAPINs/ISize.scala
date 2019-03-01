package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Size...
  */
trait ISize extends js.Object {
  /**
    * Number of pixels on the x axis.
    */
  var qcx: scala.Double
  /**
    * Number of pixels on the y axis.
    */
  var qcy: scala.Double
}

object ISize {
  @scala.inline
  def apply(qcx: scala.Double, qcy: scala.Double): ISize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qcx")(qcx)
    __obj.updateDynamic("qcy")(qcy)
    __obj.asInstanceOf[ISize]
  }
}

