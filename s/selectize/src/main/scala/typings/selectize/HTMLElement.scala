package typings.selectize

import typings.selectize.Selectize.IApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLElement extends StObject {
  
  var selectize: IApi[Any, Any]
}
object HTMLElement {
  
  inline def apply(selectize: IApi[Any, Any]): HTMLElement = {
    val __obj = js.Dynamic.literal(selectize = selectize.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLElement] (val x: Self) extends AnyVal {
    
    inline def setSelectize(value: IApi[Any, Any]): Self = StObject.set(x, "selectize", value.asInstanceOf[js.Any])
  }
}
