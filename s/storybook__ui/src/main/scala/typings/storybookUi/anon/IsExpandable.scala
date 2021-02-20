package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsExpandable extends StObject {
  
  var isExpandable: js.UndefOr[Boolean] = js.native
  
  var isExpanded: js.UndefOr[Boolean] = js.native
}
object IsExpandable {
  
  @scala.inline
  def apply(): IsExpandable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsExpandable]
  }
  
  @scala.inline
  implicit class IsExpandableMutableBuilder[Self <: IsExpandable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsExpandable(value: Boolean): Self = StObject.set(x, "isExpandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpandableUndefined: Self = StObject.set(x, "isExpandable", js.undefined)
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
  }
}
