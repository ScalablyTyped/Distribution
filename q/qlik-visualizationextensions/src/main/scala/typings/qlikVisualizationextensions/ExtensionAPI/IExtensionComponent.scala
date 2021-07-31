package typings.qlikVisualizationextensions.ExtensionAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExtensionComponent extends StObject {
  
  var model: IExtensionModel
}
object IExtensionComponent {
  
  @scala.inline
  def apply(model: IExtensionModel): IExtensionComponent = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtensionComponent]
  }
  
  @scala.inline
  implicit class IExtensionComponentMutableBuilder[Self <: IExtensionComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: IExtensionModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
