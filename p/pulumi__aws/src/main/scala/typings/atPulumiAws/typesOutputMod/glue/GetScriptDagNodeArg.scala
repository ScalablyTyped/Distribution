package typings.atPulumiAws.typesOutputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScriptDagNodeArg extends js.Object {
  /**
    * The name of the argument or property.
    */
  var name: String
  /**
    * Boolean if the value is used as a parameter. Defaults to `false`.
    */
  var param: js.UndefOr[Boolean] = js.undefined
  /**
    * The value of the argument or property.
    */
  var value: String
}

object GetScriptDagNodeArg {
  @scala.inline
  def apply(name: String, value: String, param: js.UndefOr[Boolean] = js.undefined): GetScriptDagNodeArg = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (!js.isUndefined(param)) __obj.updateDynamic("param")(param)
    __obj.asInstanceOf[GetScriptDagNodeArg]
  }
}

