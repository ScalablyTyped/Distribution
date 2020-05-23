package typings.reduxOptimisticUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optimistic extends js.Object {
  /**
    * Optimistic information
    */
  var optimistic: Id
}

object Optimistic {
  @scala.inline
  def apply(optimistic: Id): Optimistic = {
    val __obj = js.Dynamic.literal(optimistic = optimistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optimistic]
  }
}

