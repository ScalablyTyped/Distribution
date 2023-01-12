package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollIntoViewOptions
  extends StObject
     with ScrollOptions {
  
  /* standard dom */
  var block: js.UndefOr[ScrollLogicalPosition] = js.undefined
  
  /* standard dom */
  var `inline`: js.UndefOr[ScrollLogicalPosition] = js.undefined
}
object ScrollIntoViewOptions {
  
  inline def apply(): ScrollIntoViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollIntoViewOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollIntoViewOptions] (val x: Self) extends AnyVal {
    
    inline def setBlock(value: ScrollLogicalPosition): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    inline def setInline(value: ScrollLogicalPosition): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
  }
}
