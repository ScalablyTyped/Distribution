package typings
package reactDashBootstrapDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Msg extends js.Object {
  /**
  		 * A text message explaining the validation result.
  		 */
  var msg: java.lang.String
  /**
  		 * A text title explaining the validation result.
  		 */
  var title: java.lang.String
  /**
  		 * One of 'success' or 'error'
  		 */
  var `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.EditValidatorType
}

object Anon_Msg {
  @scala.inline
  def apply(
    msg: java.lang.String,
    title: java.lang.String,
    `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.EditValidatorType
  ): Anon_Msg = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("msg")(msg)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Msg]
  }
}

