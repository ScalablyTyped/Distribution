package typings.stormReactDiagrams.anon

import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import typings.stormReactDiagrams.baseModelMod.BaseModel
import typings.stormReactDiagrams.baseModelMod.BaseModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: typings.std.Element
  
  var model: BaseModel[BaseEntity[BaseListener[js.Any]], BaseModelListener]
}
object Element {
  
  @scala.inline
  def apply(
    element: typings.std.Element,
    model: BaseModel[BaseEntity[BaseListener[js.Any]], BaseModelListener]
  ): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: BaseModel[BaseEntity[BaseListener[js.Any]], BaseModelListener]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
