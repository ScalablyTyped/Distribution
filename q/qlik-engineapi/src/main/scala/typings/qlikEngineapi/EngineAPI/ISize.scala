package typings.qlikEngineapi.EngineAPI

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
  var qcx: Double
  /**
    * Number of pixels on the y axis.
    */
  var qcy: Double
}

object ISize {
  @scala.inline
  def apply(qcx: Double, qcy: Double): ISize = {
    val __obj = js.Dynamic.literal(qcx = qcx.asInstanceOf[js.Any], qcy = qcy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISize]
  }
}

