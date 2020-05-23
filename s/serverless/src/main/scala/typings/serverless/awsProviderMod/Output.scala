package typings.serverless.awsProviderMod

import typings.serverless.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  var Condition: js.UndefOr[js.Any] = js.undefined
  var Description: js.UndefOr[String] = js.undefined
  var Export: js.UndefOr[Name] = js.undefined
  var Value: js.Any
}

object Output {
  @scala.inline
  def apply(Value: js.Any, Condition: js.Any = null, Description: String = null, Export: Name = null): Output = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    if (Condition != null) __obj.updateDynamic("Condition")(Condition.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Export != null) __obj.updateDynamic("Export")(Export.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
}

