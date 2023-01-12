package typings.semanticUiProgress.anon

import typings.semanticUiProgress.SemanticUI.Progress.RandomSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl, 'max'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl>> */
trait PickImplmaxPartialPickImp
  extends StObject
     with Param {
  
  var max: Double
  
  var min: js.UndefOr[Double] = js.undefined
}
object PickImplmaxPartialPickImp {
  
  inline def apply(max: Double): PickImplmaxPartialPickImp = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxPartialPickImp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplmaxPartialPickImp] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
