package typings.semanticUiSite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl, 'section'> */
trait PickImplsection extends StObject {
  
  var section: js.Any
}
object PickImplsection {
  
  @scala.inline
  def apply(section: js.Any): PickImplsection = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsection]
  }
  
  @scala.inline
  implicit class PickImplsectionMutableBuilder[Self <: PickImplsection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSection(value: js.Any): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
  }
}
