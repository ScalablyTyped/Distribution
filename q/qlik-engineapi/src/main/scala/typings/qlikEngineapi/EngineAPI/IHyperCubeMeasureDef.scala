package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HyperCubeMeasureDef width extend NxMeasure
  */
@js.native
trait IHyperCubeMeasureDef extends INxMeasure {
  
  @JSName("qDef")
  var qDef_IHyperCubeMeasureDef: IHyperCubeMeasureqDef = js.native
}
object IHyperCubeMeasureDef {
  
  @scala.inline
  def apply(qDef: IHyperCubeMeasureqDef): IHyperCubeMeasureDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHyperCubeMeasureDef]
  }
  
  @scala.inline
  implicit class IHyperCubeMeasureDefMutableBuilder[Self <: IHyperCubeMeasureDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDef(value: IHyperCubeMeasureqDef): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
  }
}
