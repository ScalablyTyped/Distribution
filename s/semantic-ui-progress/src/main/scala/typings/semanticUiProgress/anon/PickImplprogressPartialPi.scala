package typings.semanticUiProgress.anon

import typings.semanticUiProgress.SemanticUI.Progress.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl, 'progress'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl>> */
trait PickImplprogressPartialPi
  extends StObject
     with Param {
  
  var bar: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var progress: String
}
object PickImplprogressPartialPi {
  
  inline def apply(progress: String): PickImplprogressPartialPi = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplprogressPartialPi]
  }
  
  extension [Self <: PickImplprogressPartialPi](x: Self) {
    
    inline def setBar(value: String): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
