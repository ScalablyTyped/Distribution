package typings.selectize

import typings.selectize.Selectize.IApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLElement extends StObject {
  
  var selectize: IApi[js.Any, js.Any]
}
object HTMLElement {
  
  @scala.inline
  def apply(selectize: IApi[js.Any, js.Any]): HTMLElement = {
    val __obj = js.Dynamic.literal(selectize = selectize.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElement]
  }
  
  @scala.inline
  implicit class HTMLElementMutableBuilder[Self <: HTMLElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectize(value: IApi[js.Any, js.Any]): Self = StObject.set(x, "selectize", value.asInstanceOf[js.Any])
  }
}
