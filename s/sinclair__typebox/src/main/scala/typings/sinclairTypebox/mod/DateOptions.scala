package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateOptions
  extends StObject
     with SchemaOptions {
  
  var exclusiveMaximumTimestamp: js.UndefOr[Double] = js.undefined
  
  var exclusiveMinimumTimestamp: js.UndefOr[Double] = js.undefined
  
  var maximumTimestamp: js.UndefOr[Double] = js.undefined
  
  var minimumTimestamp: js.UndefOr[Double] = js.undefined
}
object DateOptions {
  
  inline def apply(): DateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateOptions] (val x: Self) extends AnyVal {
    
    inline def setExclusiveMaximumTimestamp(value: Double): Self = StObject.set(x, "exclusiveMaximumTimestamp", value.asInstanceOf[js.Any])
    
    inline def setExclusiveMaximumTimestampUndefined: Self = StObject.set(x, "exclusiveMaximumTimestamp", js.undefined)
    
    inline def setExclusiveMinimumTimestamp(value: Double): Self = StObject.set(x, "exclusiveMinimumTimestamp", value.asInstanceOf[js.Any])
    
    inline def setExclusiveMinimumTimestampUndefined: Self = StObject.set(x, "exclusiveMinimumTimestamp", js.undefined)
    
    inline def setMaximumTimestamp(value: Double): Self = StObject.set(x, "maximumTimestamp", value.asInstanceOf[js.Any])
    
    inline def setMaximumTimestampUndefined: Self = StObject.set(x, "maximumTimestamp", js.undefined)
    
    inline def setMinimumTimestamp(value: Double): Self = StObject.set(x, "minimumTimestamp", value.asInstanceOf[js.Any])
    
    inline def setMinimumTimestampUndefined: Self = StObject.set(x, "minimumTimestamp", js.undefined)
  }
}
