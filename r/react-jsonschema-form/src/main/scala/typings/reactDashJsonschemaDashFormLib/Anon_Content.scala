package typings
package reactDashJsonschemaDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: reactLib.reactMod.ReactNs.ReactElement[_]
  var disabled: scala.Boolean
  var name: java.lang.String
  var readonly: scala.Boolean
}

object Anon_Content {
  @scala.inline
  def apply(
    content: reactLib.reactMod.ReactNs.ReactElement[_],
    disabled: scala.Boolean,
    name: java.lang.String,
    readonly: scala.Boolean
  ): Anon_Content = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("readonly")(readonly)
    __obj.asInstanceOf[Anon_Content]
  }
}

