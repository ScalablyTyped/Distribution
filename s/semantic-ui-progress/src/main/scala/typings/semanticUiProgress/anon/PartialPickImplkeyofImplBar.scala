package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplBar extends StObject {
  
  var bar: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var progress: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplBar {
  
  inline def apply(): PartialPickImplkeyofImplBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplBar]
  }
  
  extension [Self <: PartialPickImplkeyofImplBar](x: Self) {
    
    inline def setBar(value: String): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
