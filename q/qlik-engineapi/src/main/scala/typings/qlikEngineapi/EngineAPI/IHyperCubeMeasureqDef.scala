package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HyperCubeMeasureqDef with extend of NxInlineMeasureDef
  */
trait IHyperCubeMeasureqDef
  extends StObject
     with INxInlineMeasureDef {
  
  var autoSort: js.UndefOr[Boolean] = js.undefined
  
  var cId: js.UndefOr[String] = js.undefined
  
  var numFormatFromTemplate: js.UndefOr[Boolean] = js.undefined
}
object IHyperCubeMeasureqDef {
  
  inline def apply(qDef: String): IHyperCubeMeasureqDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHyperCubeMeasureqDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHyperCubeMeasureqDef] (val x: Self) extends AnyVal {
    
    inline def setAutoSort(value: Boolean): Self = StObject.set(x, "autoSort", value.asInstanceOf[js.Any])
    
    inline def setAutoSortUndefined: Self = StObject.set(x, "autoSort", js.undefined)
    
    inline def setCId(value: String): Self = StObject.set(x, "cId", value.asInstanceOf[js.Any])
    
    inline def setCIdUndefined: Self = StObject.set(x, "cId", js.undefined)
    
    inline def setNumFormatFromTemplate(value: Boolean): Self = StObject.set(x, "numFormatFromTemplate", value.asInstanceOf[js.Any])
    
    inline def setNumFormatFromTemplateUndefined: Self = StObject.set(x, "numFormatFromTemplate", js.undefined)
  }
}
