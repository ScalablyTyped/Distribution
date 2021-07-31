package typings.semanticUiSite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl, 'sections'> */
trait PickImplsections extends StObject {
  
  var sections: js.Any
}
object PickImplsections {
  
  @scala.inline
  def apply(sections: js.Any): PickImplsections = {
    val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsections]
  }
  
  @scala.inline
  implicit class PickImplsectionsMutableBuilder[Self <: PickImplsections] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSections(value: js.Any): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
  }
}
