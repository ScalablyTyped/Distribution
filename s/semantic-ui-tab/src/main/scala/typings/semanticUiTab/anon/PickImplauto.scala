package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'auto'> */
@js.native
trait PickImplauto extends StObject {
  
  var auto: Boolean = js.native
}
object PickImplauto {
  
  @scala.inline
  def apply(auto: Boolean): PickImplauto = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplauto]
  }
  
  @scala.inline
  implicit class PickImplautoMutableBuilder[Self <: PickImplauto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
  }
}
