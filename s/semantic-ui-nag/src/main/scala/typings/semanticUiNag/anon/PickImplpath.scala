package typings.semanticUiNag.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'path'> */
trait PickImplpath extends StObject {
  
  var path: String
}
object PickImplpath {
  
  @scala.inline
  def apply(path: String): PickImplpath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpath]
  }
  
  @scala.inline
  implicit class PickImplpathMutableBuilder[Self <: PickImplpath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
