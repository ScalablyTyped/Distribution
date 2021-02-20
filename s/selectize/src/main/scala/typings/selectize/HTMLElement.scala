package typings.selectize

import typings.selectize.Selectize.IApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLElement extends StObject {
  
  var selectize: IApi[_, _] = js.native
}
object HTMLElement {
  
  @scala.inline
  def apply(selectize: IApi[_, _]): HTMLElement = {
    val __obj = js.Dynamic.literal(selectize = selectize.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElement]
  }
  
  @scala.inline
  implicit class HTMLElementMutableBuilder[Self <: HTMLElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectize(value: IApi[_, _]): Self = StObject.set(x, "selectize", value.asInstanceOf[js.Any])
  }
}
