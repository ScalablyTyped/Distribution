package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRootNodeOptions extends StObject {
  
  var composed: js.UndefOr[scala.Boolean] = js.undefined
}
object GetRootNodeOptions {
  
  inline def apply(): GetRootNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRootNodeOptions]
  }
  
  extension [Self <: GetRootNodeOptions](x: Self) {
    
    inline def setComposed(value: scala.Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    inline def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
  }
}
