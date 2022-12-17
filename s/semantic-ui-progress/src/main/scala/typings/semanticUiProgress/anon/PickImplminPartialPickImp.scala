package typings.semanticUiProgress.anon

import typings.semanticUiProgress.SemanticUI.Progress.RandomSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl, 'min'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl>> */
trait PickImplminPartialPickImp
  extends StObject
     with Param {
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: Double
}
object PickImplminPartialPickImp {
  
  inline def apply(min: Double): PickImplminPartialPickImp = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplminPartialPickImp]
  }
  
  extension [Self <: PickImplminPartialPickImp](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
