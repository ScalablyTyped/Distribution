package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHyperCubeDimensionDef
  extends StObject
     with INxDimension {
  
  @JSName("qDef")
  var qDef_IHyperCubeDimensionDef: IHyperCubeDimensionqDef
}
object IHyperCubeDimensionDef {
  
  inline def apply(qDef: IHyperCubeDimensionqDef): IHyperCubeDimensionDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHyperCubeDimensionDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHyperCubeDimensionDef] (val x: Self) extends AnyVal {
    
    inline def setQDef(value: IHyperCubeDimensionqDef): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
  }
}
