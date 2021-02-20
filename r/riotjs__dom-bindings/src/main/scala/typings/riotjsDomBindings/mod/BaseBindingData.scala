package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseBindingData extends StObject {
  
  var evaluate: js.UndefOr[js.Function1[/* scope */ js.Any, _]] = js.native
  
  var redundantAttribute: js.UndefOr[String] = js.native
  
  var selector: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[BindingType] = js.native
}
object BaseBindingData {
  
  @scala.inline
  def apply(): BaseBindingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseBindingData]
  }
  
  @scala.inline
  implicit class BaseBindingDataMutableBuilder[Self <: BaseBindingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluate(value: /* scope */ js.Any => _): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEvaluateUndefined: Self = StObject.set(x, "evaluate", js.undefined)
    
    @scala.inline
    def setRedundantAttribute(value: String): Self = StObject.set(x, "redundantAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedundantAttributeUndefined: Self = StObject.set(x, "redundantAttribute", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setType(value: BindingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
