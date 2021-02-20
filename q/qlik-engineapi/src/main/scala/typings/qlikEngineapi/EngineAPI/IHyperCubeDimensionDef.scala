package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHyperCubeDimensionDef extends INxDimension {
  
  @JSName("qDef")
  var qDef_IHyperCubeDimensionDef: IHyperCubeDimensionqDef = js.native
}
object IHyperCubeDimensionDef {
  
  @scala.inline
  def apply(qDef: IHyperCubeDimensionqDef): IHyperCubeDimensionDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHyperCubeDimensionDef]
  }
  
  @scala.inline
  implicit class IHyperCubeDimensionDefMutableBuilder[Self <: IHyperCubeDimensionDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDef(value: IHyperCubeDimensionqDef): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
  }
}
