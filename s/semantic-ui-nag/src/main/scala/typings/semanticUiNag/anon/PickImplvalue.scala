package typings.semanticUiNag.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'value'> */
trait PickImplvalue extends StObject {
  
  var value: js.Any
}
object PickImplvalue {
  
  @scala.inline
  def apply(value: js.Any): PickImplvalue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvalue]
  }
  
  @scala.inline
  implicit class PickImplvalueMutableBuilder[Self <: PickImplvalue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
