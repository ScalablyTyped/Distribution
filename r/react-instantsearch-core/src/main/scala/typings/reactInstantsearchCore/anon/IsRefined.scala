package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsRefined extends StObject {
  
  var isRefined: Boolean = js.native
  
  var label: String = js.native
  
  var noRefinement: Boolean = js.native
  
  var value: String = js.native
}
object IsRefined {
  
  @scala.inline
  def apply(isRefined: Boolean, label: String, noRefinement: Boolean, value: String): IsRefined = {
    val __obj = js.Dynamic.literal(isRefined = isRefined.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], noRefinement = noRefinement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRefined]
  }
  
  @scala.inline
  implicit class IsRefinedMutableBuilder[Self <: IsRefined] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRefined(value: Boolean): Self = StObject.set(x, "isRefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoRefinement(value: Boolean): Self = StObject.set(x, "noRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
