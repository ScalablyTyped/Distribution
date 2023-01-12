package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HyperCubeMeasureDef width extend NxMeasure
  */
trait IHyperCubeMeasureDef
  extends StObject
     with INxMeasure {
  
  @JSName("qDef")
  var qDef_IHyperCubeMeasureDef: IHyperCubeMeasureqDef
}
object IHyperCubeMeasureDef {
  
  inline def apply(qDef: IHyperCubeMeasureqDef): IHyperCubeMeasureDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHyperCubeMeasureDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHyperCubeMeasureDef] (val x: Self) extends AnyVal {
    
    inline def setQDef(value: IHyperCubeMeasureqDef): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
  }
}
