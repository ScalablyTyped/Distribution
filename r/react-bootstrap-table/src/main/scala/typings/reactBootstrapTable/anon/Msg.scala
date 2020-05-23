package typings.reactBootstrapTable.anon

import typings.reactBootstrapTable.mod.EditValidatorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Msg extends js.Object {
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

object Msg {
  @scala.inline
  def apply(msg: String, title: String, `type`: EditValidatorType): Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
}

