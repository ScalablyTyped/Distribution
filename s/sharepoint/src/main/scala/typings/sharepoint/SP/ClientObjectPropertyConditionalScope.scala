package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientObjectPropertyConditionalScope")
@js.native
class ClientObjectPropertyConditionalScope protected () extends ConditionalScopeBase {
  def this(
    clientObject: ClientObject,
    propertyName: String,
    comparisonOperator: String,
    valueToCompare: js.Any
  ) = this()
  def this(
    clientObject: ClientObject,
    propertyName: String,
    comparisonOperator: String,
    valueToCompare: js.Any,
    allowAllActions: Boolean
  ) = this()
}

