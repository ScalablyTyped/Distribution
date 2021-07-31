package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl>> */
trait PartialPickImplkeyofImplPercent extends StObject {
  
  var percent: js.UndefOr[String] = js.undefined
  
  var total: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplPercent {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplPercent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplPercent]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplPercentMutableBuilder[Self <: PartialPickImplkeyofImplPercent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPercent(value: String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    @scala.inline
    def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
