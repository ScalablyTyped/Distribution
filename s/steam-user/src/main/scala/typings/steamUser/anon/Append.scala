package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Append extends StObject {
  
  var append: js.UndefOr[String] = js.undefined
  
  var commas: js.UndefOr[Boolean] = js.undefined
  
  var prepend: js.UndefOr[String] = js.undefined
  
  var whole: js.UndefOr[Boolean] = js.undefined
}
object Append {
  
  inline def apply(): Append = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Append]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Append] (val x: Self) extends AnyVal {
    
    inline def setAppend(value: String): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    inline def setCommas(value: Boolean): Self = StObject.set(x, "commas", value.asInstanceOf[js.Any])
    
    inline def setCommasUndefined: Self = StObject.set(x, "commas", js.undefined)
    
    inline def setPrepend(value: String): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
    
    inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
    
    inline def setWhole(value: Boolean): Self = StObject.set(x, "whole", value.asInstanceOf[js.Any])
    
    inline def setWholeUndefined: Self = StObject.set(x, "whole", js.undefined)
  }
}
