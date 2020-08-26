package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientObjectPropertyConditionalScope")
@js.native
class ClientObjectPropertyConditionalScope protected ()
  extends typings.sharepoint.SP.ConditionalScopeBase {
  def this(
    clientObject: typings.sharepoint.SP.ClientObject,
    propertyName: String,
    comparisonOperator: String,
    valueToCompare: js.Any
  ) = this()
  def this(
    clientObject: typings.sharepoint.SP.ClientObject,
    propertyName: String,
    comparisonOperator: String,
    valueToCompare: js.Any,
    allowAllActions: Boolean
  ) = this()
}

