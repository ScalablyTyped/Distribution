package typings.semanticUiTab.anon

import typings.semanticUiTab.semanticUiTabStrings.DOM
import typings.semanticUiTab.semanticUiTabStrings.html
import typings.semanticUiTab.semanticUiTabStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'cacheType'> */
@js.native
trait PickImplcacheType extends StObject {
  
  var cacheType: response | DOM | html = js.native
}
object PickImplcacheType {
  
  @scala.inline
  def apply(cacheType: response | DOM | html): PickImplcacheType = {
    val __obj = js.Dynamic.literal(cacheType = cacheType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcacheType]
  }
  
  @scala.inline
  implicit class PickImplcacheTypeMutableBuilder[Self <: PickImplcacheType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheType(value: response | DOM | html): Self = StObject.set(x, "cacheType", value.asInstanceOf[js.Any])
  }
}
