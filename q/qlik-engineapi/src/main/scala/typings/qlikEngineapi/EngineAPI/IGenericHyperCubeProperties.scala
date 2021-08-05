package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericHyperCubeProperties width extend GenericObjectProperties
  */
trait IGenericHyperCubeProperties
  extends StObject
     with IGenericObjectProperties {
  
  var qHyperCubeDef: IVisualizationHyperCubeDef
}
object IGenericHyperCubeProperties {
  
  inline def apply(qHyperCubeDef: IVisualizationHyperCubeDef, qInfo: INxInfo): IGenericHyperCubeProperties = {
    val __obj = js.Dynamic.literal(qHyperCubeDef = qHyperCubeDef.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericHyperCubeProperties]
  }
  
  extension [Self <: IGenericHyperCubeProperties](x: Self) {
    
    inline def setQHyperCubeDef(value: IVisualizationHyperCubeDef): Self = StObject.set(x, "qHyperCubeDef", value.asInstanceOf[js.Any])
  }
}
