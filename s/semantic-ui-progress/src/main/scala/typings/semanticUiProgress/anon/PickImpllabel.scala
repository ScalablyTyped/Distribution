package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressStrings.percent
import typings.semanticUiProgress.semanticUiProgressStrings.ratio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'label'> */
@js.native
trait PickImpllabel extends StObject {
  
  var label: percent | ratio = js.native
}
object PickImpllabel {
  
  @scala.inline
  def apply(label: percent | ratio): PickImpllabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllabel]
  }
  
  @scala.inline
  implicit class PickImpllabelMutableBuilder[Self <: PickImpllabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: percent | ratio): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
