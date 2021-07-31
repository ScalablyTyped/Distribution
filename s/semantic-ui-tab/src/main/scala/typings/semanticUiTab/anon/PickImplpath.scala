package typings.semanticUiTab.anon

import typings.semanticUiTab.semanticUiTabBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'path'> */
trait PickImplpath extends StObject {
  
  var path: `false` | String
}
object PickImplpath {
  
  @scala.inline
  def apply(path: `false` | String): PickImplpath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpath]
  }
  
  @scala.inline
  implicit class PickImplpathMutableBuilder[Self <: PickImplpath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: `false` | String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
