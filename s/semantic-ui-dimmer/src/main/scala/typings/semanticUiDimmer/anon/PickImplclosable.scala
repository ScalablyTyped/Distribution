package typings.semanticUiDimmer.anon

import typings.semanticUiDimmer.semanticUiDimmerStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'closable'> */
trait PickImplclosable extends StObject {
  
  var closable: auto | Boolean
}
object PickImplclosable {
  
  @scala.inline
  def apply(closable: auto | Boolean): PickImplclosable = {
    val __obj = js.Dynamic.literal(closable = closable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplclosable]
  }
  
  @scala.inline
  implicit class PickImplclosableMutableBuilder[Self <: PickImplclosable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosable(value: auto | Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
  }
}
