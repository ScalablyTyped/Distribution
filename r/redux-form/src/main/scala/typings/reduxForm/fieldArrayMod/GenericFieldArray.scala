package typings.reduxForm.fieldArrayMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericFieldArray[FieldValue, P]
  extends Component[BaseFieldArrayProps[P, FieldValue], js.Object, js.Any] {
  
  def getRenderedComponent(): Component[WrappedFieldArrayProps[FieldValue] with P, js.Object, _] = js.native
  
  var name: String = js.native
  
  var valid: Boolean = js.native
}
