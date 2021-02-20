package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HyperCubeMeasureqDef with extend of NxInlineMeasureDef
  */
@js.native
trait IHyperCubeMeasureqDef extends INxInlineMeasureDef {
  
  var autoSort: js.UndefOr[Boolean] = js.native
  
  var cId: js.UndefOr[String] = js.native
  
  var numFormatFromTemplate: js.UndefOr[Boolean] = js.native
}
object IHyperCubeMeasureqDef {
  
  @scala.inline
  def apply(qDef: String): IHyperCubeMeasureqDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHyperCubeMeasureqDef]
  }
  
  @scala.inline
  implicit class IHyperCubeMeasureqDefMutableBuilder[Self <: IHyperCubeMeasureqDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSort(value: Boolean): Self = StObject.set(x, "autoSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSortUndefined: Self = StObject.set(x, "autoSort", js.undefined)
    
    @scala.inline
    def setCId(value: String): Self = StObject.set(x, "cId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCIdUndefined: Self = StObject.set(x, "cId", js.undefined)
    
    @scala.inline
    def setNumFormatFromTemplate(value: Boolean): Self = StObject.set(x, "numFormatFromTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFormatFromTemplateUndefined: Self = StObject.set(x, "numFormatFromTemplate", js.undefined)
  }
}
