package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsExpanded extends StObject {
  
  var isExpanded: Boolean = js.native
}
object IsExpanded {
  
  @scala.inline
  def apply(isExpanded: Boolean): IsExpanded = {
    val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsExpanded]
  }
  
  @scala.inline
  implicit class IsExpandedMutableBuilder[Self <: IsExpanded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
  }
}
