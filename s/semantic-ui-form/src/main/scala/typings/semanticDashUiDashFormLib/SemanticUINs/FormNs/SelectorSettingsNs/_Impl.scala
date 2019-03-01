package typings
package semanticDashUiDashFormLib.SemanticUINs.FormNs.SelectorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'input, textarea, select'
    */
  var field: java.lang.String
  /**
    * @default '.field'
    */
  var group: java.lang.String
  /**
    * @default 'input'
    */
  var input: java.lang.String
  /**
    * @default '.error.message'
    */
  var message: java.lang.String
  /**
    * @default '.prompt'
    */
  var prompt: java.lang.String
  /**
    * @default '.submit'
    */
  var submit: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    field: java.lang.String,
    group: java.lang.String,
    input: java.lang.String,
    message: java.lang.String,
    prompt: java.lang.String,
    submit: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("prompt")(prompt)
    __obj.updateDynamic("submit")(submit)
    __obj.asInstanceOf[_Impl]
  }
}

