package typings.reactInstantsearchDom.mod

import typings.reactInstantsearchCore.mod.DynamicWidgetsExposed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicWidgetsProps
  extends StObject
     with DynamicWidgetsExposed {
  
  var className: js.UndefOr[String] = js.undefined
}
object DynamicWidgetsProps {
  
  inline def apply(): DynamicWidgetsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicWidgetsProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynamicWidgetsProps] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
