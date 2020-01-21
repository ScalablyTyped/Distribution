package typings.reduxForm.fieldArrayMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericFieldArray[FieldValue, P]
  extends Component[BaseFieldArrayProps[P, FieldValue], js.Object, js.Any] {
  var name: String = js.native
  var valid: Boolean = js.native
  def getRenderedComponent(): Component[WrappedFieldArrayProps[FieldValue] with P, js.Object, _] = js.native
}

