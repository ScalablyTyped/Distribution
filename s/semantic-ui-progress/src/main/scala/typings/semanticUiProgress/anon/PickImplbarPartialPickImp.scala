package typings.semanticUiProgress.anon

import typings.semanticUiProgress.SemanticUI.Progress.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl, 'bar'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl>> */
trait PickImplbarPartialPickImp
  extends StObject
     with Param {
  
  var bar: String
  
  var label: js.UndefOr[String] = js.undefined
  
  var progress: js.UndefOr[String] = js.undefined
}
object PickImplbarPartialPickImp {
  
  inline def apply(bar: String): PickImplbarPartialPickImp = {
    val __obj = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbarPartialPickImp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplbarPartialPickImp] (val x: Self) extends AnyVal {
    
    inline def setBar(value: String): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
