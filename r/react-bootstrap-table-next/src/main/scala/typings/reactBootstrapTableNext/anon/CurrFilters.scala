package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrFilters extends StObject {
  
  var currFilters: js.Any = js.native
}
object CurrFilters {
  
  @scala.inline
  def apply(currFilters: js.Any): CurrFilters = {
    val __obj = js.Dynamic.literal(currFilters = currFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrFilters]
  }
  
  @scala.inline
  implicit class CurrFiltersMutableBuilder[Self <: CurrFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrFilters(value: js.Any): Self = StObject.set(x, "currFilters", value.asInstanceOf[js.Any])
  }
}
