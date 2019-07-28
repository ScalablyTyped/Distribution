package typings.reduxDashOptimisticDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
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

object Anon_Id {
  @scala.inline
  def apply(id: Double, `type`: String): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Id]
  }
}

