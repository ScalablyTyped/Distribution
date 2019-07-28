package typings.reactDashBootstrapDashTable

import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.EditValidatorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Msg extends js.Object {
  /**
  		 * A text message explaining the validation result.
  		 */
  var msg: String
  /**
  		 * A text title explaining the validation result.
  		 */
  var title: String
  /**
  		 * One of 'success' or 'error'
  		 */
  var `type`: EditValidatorType
}

object Anon_Msg {
  @scala.inline
  def apply(msg: String, title: String, `type`: EditValidatorType): Anon_Msg = {
    val __obj = js.Dynamic.literal(msg = msg, title = title)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Msg]
  }
}

