package typings.reduxOptimisticUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  /**
    * Transaction id. Id should be unique for each optimistic action
    *
    * @type {number}
    */
  var id: Double
  /**
    * Type, BEGIN, COMMIT or REVERT
    *
    * @type {string}
    */
  var `type`: String
}

object AnonId {
  @scala.inline
  def apply(id: Double, `type`: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

