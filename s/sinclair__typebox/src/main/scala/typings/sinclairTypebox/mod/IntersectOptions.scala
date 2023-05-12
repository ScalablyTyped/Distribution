package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntersectOptions
  extends StObject
     with SchemaOptions {
  
  var unevaluatedProperties: js.UndefOr[TUnevaluatedProperties] = js.undefined
}
object IntersectOptions {
  
  inline def apply(): IntersectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntersectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntersectOptions] (val x: Self) extends AnyVal {
    
    inline def setUnevaluatedProperties(value: TUnevaluatedProperties): Self = StObject.set(x, "unevaluatedProperties", value.asInstanceOf[js.Any])
    
    inline def setUnevaluatedPropertiesUndefined: Self = StObject.set(x, "unevaluatedProperties", js.undefined)
  }
}
