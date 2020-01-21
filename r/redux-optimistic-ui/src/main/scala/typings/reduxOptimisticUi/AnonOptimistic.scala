package typings.reduxOptimisticUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptimistic extends js.Object {
  /**
    * Optimistic information
    */
  var optimistic: AnonId
}

object AnonOptimistic {
  @scala.inline
  def apply(optimistic: AnonId): AnonOptimistic = {
    val __obj = js.Dynamic.literal(optimistic = optimistic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOptimistic]
  }
}

