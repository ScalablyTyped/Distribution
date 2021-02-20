package typings.semanticUiSearch.anon

import typings.semanticUiSearch.semanticUiSearchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'source'> */
@js.native
trait PickImplsource extends StObject {
  
  var source: `false` | js.Any = js.native
}
object PickImplsource {
  
  @scala.inline
  def apply(source: `false` | js.Any): PickImplsource = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsource]
  }
  
  @scala.inline
  implicit class PickImplsourceMutableBuilder[Self <: PickImplsource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: `false` | js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
