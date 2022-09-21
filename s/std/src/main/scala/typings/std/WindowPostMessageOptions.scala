package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowPostMessageOptions
  extends StObject
     with StructuredSerializeOptions {
  
  /* standard dom */
  var targetOrigin: js.UndefOr[java.lang.String] = js.undefined
}
object WindowPostMessageOptions {
  
  inline def apply(): WindowPostMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowPostMessageOptions]
  }
  
  extension [Self <: WindowPostMessageOptions](x: Self) {
    
    inline def setTargetOrigin(value: java.lang.String): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
    
    inline def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
  }
}
