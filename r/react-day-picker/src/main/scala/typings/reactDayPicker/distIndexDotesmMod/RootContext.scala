package typings.reactDayPicker.distIndexDotesmMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The props of {@link RootProvider}. */
trait RootContext
  extends StObject
     with DayPickerBase {
  
  var children: ReactNode
}
object RootContext {
  
  inline def apply(): RootContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootContext] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
