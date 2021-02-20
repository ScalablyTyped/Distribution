package typings.semanticUiSite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-site.SemanticUI.SiteSettings._Impl, 'siteNamespace'> */
@js.native
trait PickImplsiteNamespace extends StObject {
  
  var siteNamespace: String = js.native
}
object PickImplsiteNamespace {
  
  @scala.inline
  def apply(siteNamespace: String): PickImplsiteNamespace = {
    val __obj = js.Dynamic.literal(siteNamespace = siteNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsiteNamespace]
  }
  
  @scala.inline
  implicit class PickImplsiteNamespaceMutableBuilder[Self <: PickImplsiteNamespace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSiteNamespace(value: String): Self = StObject.set(x, "siteNamespace", value.asInstanceOf[js.Any])
  }
}
