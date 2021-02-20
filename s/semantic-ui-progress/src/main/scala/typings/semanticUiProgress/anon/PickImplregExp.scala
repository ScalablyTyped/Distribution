package typings.semanticUiProgress.anon

import typings.semanticUiProgress.SemanticUI.Progress.RegExpSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'regExp'> */
@js.native
trait PickImplregExp extends StObject {
  
  var regExp: RegExpSettings = js.native
}
object PickImplregExp {
  
  @scala.inline
  def apply(regExp: RegExpSettings): PickImplregExp = {
    val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplregExp]
  }
  
  @scala.inline
  implicit class PickImplregExpMutableBuilder[Self <: PickImplregExp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
  }
}
