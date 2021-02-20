package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'maxDepth'> */
@js.native
trait PickImplmaxDepth extends StObject {
  
  var maxDepth: Double = js.native
}
object PickImplmaxDepth {
  
  @scala.inline
  def apply(maxDepth: Double): PickImplmaxDepth = {
    val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxDepth]
  }
  
  @scala.inline
  implicit class PickImplmaxDepthMutableBuilder[Self <: PickImplmaxDepth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
  }
}
