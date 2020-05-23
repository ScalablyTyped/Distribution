package typings.reduxOptimisticUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
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

object Id {
  @scala.inline
  def apply(id: Double, `type`: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

