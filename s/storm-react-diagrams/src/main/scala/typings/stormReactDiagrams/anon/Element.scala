package typings.stormReactDiagrams.anon

import typings.stormReactDiagrams.distSrcBaseEntityMod.BaseEntity
import typings.stormReactDiagrams.distSrcBaseEntityMod.BaseListener
import typings.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModel
import typings.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: typings.std.Element
  
  var model: BaseModel[BaseEntity[BaseListener[Any]], BaseModelListener]
}
object Element {
  
  inline def apply(element: typings.std.Element, model: BaseModel[BaseEntity[BaseListener[Any]], BaseModelListener]): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setModel(value: BaseModel[BaseEntity[BaseListener[Any]], BaseModelListener]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
