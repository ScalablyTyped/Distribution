package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl>> */
trait PartialPickImplkeyofImplMax extends StObject {
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
}
object PartialPickImplkeyofImplMax {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplMax]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplMaxMutableBuilder[Self <: PartialPickImplkeyofImplMax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
