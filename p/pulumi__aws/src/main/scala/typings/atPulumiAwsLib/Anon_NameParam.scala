package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameParam extends js.Object {
  var name: java.lang.String
  var param: js.UndefOr[scala.Boolean] = js.undefined
  var value: java.lang.String
}

object Anon_NameParam {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String, param: js.UndefOr[scala.Boolean] = js.undefined): Anon_NameParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    if (!js.isUndefined(param)) __obj.updateDynamic("param")(param)
    __obj.asInstanceOf[Anon_NameParam]
  }
}

