package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressStrings.percent
import typings.semanticUiProgress.semanticUiProgressStrings.ratio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'label'> */
trait PickImpllabel extends StObject {
  
  var label: percent | ratio
}
object PickImpllabel {
  
  inline def apply(label: percent | ratio): PickImpllabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllabel]
  }
  
  extension [Self <: PickImpllabel](x: Self) {
    
    inline def setLabel(value: percent | ratio): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
