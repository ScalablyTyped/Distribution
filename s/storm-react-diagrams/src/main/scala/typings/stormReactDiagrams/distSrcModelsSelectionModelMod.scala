package typings.stormReactDiagrams

import typings.stormReactDiagrams.distSrcBaseEntityMod.BaseEntity
import typings.stormReactDiagrams.distSrcBaseEntityMod.BaseListener
import typings.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModel
import typings.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModelsSelectionModelMod {
  
  trait SelectionModel extends StObject {
    
    var initialX: Double
    
    var initialY: Double
    
    var model: BaseModel[BaseEntity[BaseListener[Any]], BaseModelListener]
  }
  object SelectionModel {
    
    inline def apply(
      initialX: Double,
      initialY: Double,
      model: BaseModel[BaseEntity[BaseListener[Any]], BaseModelListener]
    ): SelectionModel = {
      val __obj = js.Dynamic.literal(initialX = initialX.asInstanceOf[js.Any], initialY = initialY.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionModel]
    }
    
    extension [Self <: SelectionModel](x: Self) {
      
      inline def setInitialX(value: Double): Self = StObject.set(x, "initialX", value.asInstanceOf[js.Any])
      
      inline def setInitialY(value: Double): Self = StObject.set(x, "initialY", value.asInstanceOf[js.Any])
      
      inline def setModel(value: BaseModel[BaseEntity[BaseListener[Any]], BaseModelListener]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    }
  }
}
