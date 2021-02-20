package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filters extends StObject {
  
  var filters: js.UndefOr[Variables] = js.native
  
  var key: String = js.native
  
  var rangeBehavior: String = js.native
}
object Filters {
  
  @scala.inline
  def apply(key: String, rangeBehavior: String): Filters = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], rangeBehavior = rangeBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
  
  @scala.inline
  implicit class FiltersMutableBuilder[Self <: Filters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: Variables): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeBehavior(value: String): Self = StObject.set(x, "rangeBehavior", value.asInstanceOf[js.Any])
  }
}
