package typings.pulumiAws.inputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScriptDagNodeArg extends js.Object {
  /**
    * The name of the argument or property.
    */
  var name: String = js.native
  /**
    * Boolean if the value is used as a parameter. Defaults to `false`.
    */
  var param: js.UndefOr[Boolean] = js.native
  /**
    * The value of the argument or property.
    */
  var value: String = js.native
}

object GetScriptDagNodeArg {
  @scala.inline
  def apply(name: String, value: String, param: js.UndefOr[Boolean] = js.undefined): GetScriptDagNodeArg = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(param)) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptDagNodeArg]
  }
}

