package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'value'> */
trait PickImplvalue extends StObject {
  
  var value: `false` | Double
}
object PickImplvalue {
  
  @scala.inline
  def apply(value: `false` | Double): PickImplvalue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvalue]
  }
  
  @scala.inline
  implicit class PickImplvalueMutableBuilder[Self <: PickImplvalue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: `false` | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
