package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl, 'value'> */
trait PickImplvalueValue extends StObject {
  
  var value: String
}
object PickImplvalueValue {
  
  @scala.inline
  def apply(value: String): PickImplvalueValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvalueValue]
  }
  
  @scala.inline
  implicit class PickImplvalueValueMutableBuilder[Self <: PickImplvalueValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
