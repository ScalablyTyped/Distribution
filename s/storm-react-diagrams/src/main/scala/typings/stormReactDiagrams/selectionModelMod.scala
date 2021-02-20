package typings.stormReactDiagrams

import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import typings.stormReactDiagrams.baseModelMod.BaseModel
import typings.stormReactDiagrams.baseModelMod.BaseModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionModelMod {
  
  @js.native
  trait SelectionModel extends StObject {
    
    var initialX: Double = js.native
    
    var initialY: Double = js.native
    
    var model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener] = js.native
  }
  object SelectionModel {
    
    @scala.inline
    def apply(
      initialX: Double,
      initialY: Double,
      model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]
    ): SelectionModel = {
      val __obj = js.Dynamic.literal(initialX = initialX.asInstanceOf[js.Any], initialY = initialY.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionModel]
    }
    
    @scala.inline
    implicit class SelectionModelMutableBuilder[Self <: SelectionModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialX(value: Double): Self = StObject.set(x, "initialX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialY(value: Double): Self = StObject.set(x, "initialY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    }
  }
}
