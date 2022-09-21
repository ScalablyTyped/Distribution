package typings.slateReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLineBreak extends StObject {
  
  var isLineBreak: js.UndefOr[Boolean] = js.undefined
  
  var isMarkPlaceholder: js.UndefOr[Boolean] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
}
object IsLineBreak {
  
  inline def apply(): IsLineBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsLineBreak]
  }
  
  extension [Self <: IsLineBreak](x: Self) {
    
    inline def setIsLineBreak(value: Boolean): Self = StObject.set(x, "isLineBreak", value.asInstanceOf[js.Any])
    
    inline def setIsLineBreakUndefined: Self = StObject.set(x, "isLineBreak", js.undefined)
    
    inline def setIsMarkPlaceholder(value: Boolean): Self = StObject.set(x, "isMarkPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setIsMarkPlaceholderUndefined: Self = StObject.set(x, "isMarkPlaceholder", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}
