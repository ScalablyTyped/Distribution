package typings.reduxForm.fieldsMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericFields[P]
  extends Component[BaseFieldsProps[P] with P, js.Object, js.Any] {
  
  var dirty: Boolean = js.native
  
  def getRenderedComponent(): Component[BaseFieldsProps[js.Object] with WrappedFieldsProps with P, js.Object, _] = js.native
  
  var names: js.Array[String] = js.native
  
  var pristine: Boolean = js.native
  
  var values: StringDictionary[js.Any] = js.native
}
