package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'loadOnce'> */
trait PickImplloadOnce extends StObject {
  
  var loadOnce: Boolean
}
object PickImplloadOnce {
  
  @scala.inline
  def apply(loadOnce: Boolean): PickImplloadOnce = {
    val __obj = js.Dynamic.literal(loadOnce = loadOnce.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplloadOnce]
  }
  
  @scala.inline
  implicit class PickImplloadOnceMutableBuilder[Self <: PickImplloadOnce] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadOnce(value: Boolean): Self = StObject.set(x, "loadOnce", value.asInstanceOf[js.Any])
  }
}
