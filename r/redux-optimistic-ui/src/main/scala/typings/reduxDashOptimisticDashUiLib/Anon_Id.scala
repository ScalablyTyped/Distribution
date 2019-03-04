package typings
package reduxDashOptimisticDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  /**
    * Transaction id. Id should be unique for each optimistic action
    *
    * @type {number}
    */
  var id: scala.Double
  /**
    * Type, BEGIN, COMMIT or REVERT
    *
    * @type {string}
    */
  var `type`: java.lang.String
}

object Anon_Id {
  @scala.inline
  def apply(id: scala.Double, `type`: java.lang.String): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Id]
  }
}

