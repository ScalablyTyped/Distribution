package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseExpression extends js.Object {
  var distinct: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: java.lang.String
}

object BaseExpression {
  @scala.inline
  def apply(`type`: java.lang.String, distinct: js.UndefOr[scala.Boolean] = js.undefined): BaseExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct)
    __obj.asInstanceOf[BaseExpression]
  }
}

