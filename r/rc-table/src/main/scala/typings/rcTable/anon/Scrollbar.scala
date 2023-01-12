package typings.rcTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scrollbar extends StObject {
  
  var scrollbar: js.UndefOr[Boolean] = js.undefined
}
object Scrollbar {
  
  inline def apply(): Scrollbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scrollbar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scrollbar] (val x: Self) extends AnyVal {
    
    inline def setScrollbar(value: Boolean): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
  }
}
