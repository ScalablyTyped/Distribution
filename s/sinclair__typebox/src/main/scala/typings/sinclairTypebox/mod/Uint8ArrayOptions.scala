package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uint8ArrayOptions
  extends StObject
     with SchemaOptions {
  
  var maxByteLength: js.UndefOr[Double] = js.undefined
  
  var minByteLength: js.UndefOr[Double] = js.undefined
}
object Uint8ArrayOptions {
  
  inline def apply(): Uint8ArrayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Uint8ArrayOptions]
  }
  
  extension [Self <: Uint8ArrayOptions](x: Self) {
    
    inline def setMaxByteLength(value: Double): Self = StObject.set(x, "maxByteLength", value.asInstanceOf[js.Any])
    
    inline def setMaxByteLengthUndefined: Self = StObject.set(x, "maxByteLength", js.undefined)
    
    inline def setMinByteLength(value: Double): Self = StObject.set(x, "minByteLength", value.asInstanceOf[js.Any])
    
    inline def setMinByteLengthUndefined: Self = StObject.set(x, "minByteLength", js.undefined)
  }
}
