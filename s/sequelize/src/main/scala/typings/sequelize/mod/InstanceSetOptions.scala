package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used for Instance.set method
  */
trait InstanceSetOptions extends StObject {
  
  /**
    * If set to true, field and virtual setters will be ignored
    */
  var raw: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Clear all previously set data values
    */
  var reset: js.UndefOr[Boolean] = js.undefined
}
object InstanceSetOptions {
  
  inline def apply(): InstanceSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSetOptions]
  }
  
  extension [Self <: InstanceSetOptions](x: Self) {
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
  }
}
