package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'limitValues'> */
trait PickImpllimitValues extends StObject {
  
  var limitValues: Boolean
}
object PickImpllimitValues {
  
  @scala.inline
  def apply(limitValues: Boolean): PickImpllimitValues = {
    val __obj = js.Dynamic.literal(limitValues = limitValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllimitValues]
  }
  
  @scala.inline
  implicit class PickImpllimitValuesMutableBuilder[Self <: PickImpllimitValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimitValues(value: Boolean): Self = StObject.set(x, "limitValues", value.asInstanceOf[js.Any])
  }
}
