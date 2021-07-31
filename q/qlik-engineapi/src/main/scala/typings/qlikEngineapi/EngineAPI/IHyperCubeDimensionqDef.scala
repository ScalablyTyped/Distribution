package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HyperCubeDimensionqDef width extend NxInlineDimensionDef
  */
trait IHyperCubeDimensionqDef
  extends StObject
     with INxInlineDimensionDef {
  
  var autoSort: js.UndefOr[Boolean] = js.undefined
  
  var cId: js.UndefOr[String] = js.undefined
  
  var othersLabel: js.UndefOr[IStringExpressionContainer] = js.undefined
}
object IHyperCubeDimensionqDef {
  
  @scala.inline
  def apply(): IHyperCubeDimensionqDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHyperCubeDimensionqDef]
  }
  
  @scala.inline
  implicit class IHyperCubeDimensionqDefMutableBuilder[Self <: IHyperCubeDimensionqDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSort(value: Boolean): Self = StObject.set(x, "autoSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSortUndefined: Self = StObject.set(x, "autoSort", js.undefined)
    
    @scala.inline
    def setCId(value: String): Self = StObject.set(x, "cId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCIdUndefined: Self = StObject.set(x, "cId", js.undefined)
    
    @scala.inline
    def setOthersLabel(value: IStringExpressionContainer): Self = StObject.set(x, "othersLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOthersLabelUndefined: Self = StObject.set(x, "othersLabel", js.undefined)
  }
}
