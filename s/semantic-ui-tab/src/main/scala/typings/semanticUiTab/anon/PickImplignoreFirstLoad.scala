package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'ignoreFirstLoad'> */
trait PickImplignoreFirstLoad extends StObject {
  
  var ignoreFirstLoad: Boolean
}
object PickImplignoreFirstLoad {
  
  @scala.inline
  def apply(ignoreFirstLoad: Boolean): PickImplignoreFirstLoad = {
    val __obj = js.Dynamic.literal(ignoreFirstLoad = ignoreFirstLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplignoreFirstLoad]
  }
  
  @scala.inline
  implicit class PickImplignoreFirstLoadMutableBuilder[Self <: PickImplignoreFirstLoad] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreFirstLoad(value: Boolean): Self = StObject.set(x, "ignoreFirstLoad", value.asInstanceOf[js.Any])
  }
}
