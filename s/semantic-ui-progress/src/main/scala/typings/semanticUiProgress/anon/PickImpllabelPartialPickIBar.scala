package typings.semanticUiProgress.anon

import typings.semanticUiProgress.SemanticUI.Progress.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl, 'label'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl>> */
trait PickImpllabelPartialPickIBar
  extends StObject
     with Param {
  
  var bar: js.UndefOr[String] = js.undefined
  
  var label: String
  
  var progress: js.UndefOr[String] = js.undefined
}
object PickImpllabelPartialPickIBar {
  
  inline def apply(label: String): PickImpllabelPartialPickIBar = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllabelPartialPickIBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImpllabelPartialPickIBar] (val x: Self) extends AnyVal {
    
    inline def setBar(value: String): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
