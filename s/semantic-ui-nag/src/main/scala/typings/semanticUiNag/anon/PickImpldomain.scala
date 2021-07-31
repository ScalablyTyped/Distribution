package typings.semanticUiNag.anon

import typings.semanticUiNag.semanticUiNagBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'domain'> */
trait PickImpldomain extends StObject {
  
  var domain: `false` | String
}
object PickImpldomain {
  
  @scala.inline
  def apply(domain: `false` | String): PickImpldomain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldomain]
  }
  
  @scala.inline
  implicit class PickImpldomainMutableBuilder[Self <: PickImpldomain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: `false` | String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
  }
}
