package typings.reduxForm.fieldMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-form/lib/Field", "Field")
@js.native
class Field[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] ()
  extends Component[P, js.Object, js.Any] {
  
  var dirty: Boolean = js.native
  
  def getRenderedComponent(): Component[WrappedFieldProps with P, js.Object, _] = js.native
  
  var name: String = js.native
  
  var pristine: Boolean = js.native
  
  var value: js.Any = js.native
}
