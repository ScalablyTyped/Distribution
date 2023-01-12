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
  
  inline def apply(): IHyperCubeDimensionqDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHyperCubeDimensionqDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHyperCubeDimensionqDef] (val x: Self) extends AnyVal {
    
    inline def setAutoSort(value: Boolean): Self = StObject.set(x, "autoSort", value.asInstanceOf[js.Any])
    
    inline def setAutoSortUndefined: Self = StObject.set(x, "autoSort", js.undefined)
    
    inline def setCId(value: String): Self = StObject.set(x, "cId", value.asInstanceOf[js.Any])
    
    inline def setCIdUndefined: Self = StObject.set(x, "cId", js.undefined)
    
    inline def setOthersLabel(value: IStringExpressionContainer): Self = StObject.set(x, "othersLabel", value.asInstanceOf[js.Any])
    
    inline def setOthersLabelUndefined: Self = StObject.set(x, "othersLabel", js.undefined)
  }
}
