package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericDimensionProperties width extend GenericProperties
  */
trait IGenericDimensionProperties
  extends StObject
     with IGenericProperties {
  
  var qDim: INxLibraryDimensionDef
}
object IGenericDimensionProperties {
  
  inline def apply(qDim: INxLibraryDimensionDef, qInfo: INxInfo): IGenericDimensionProperties = {
    val __obj = js.Dynamic.literal(qDim = qDim.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericDimensionProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGenericDimensionProperties] (val x: Self) extends AnyVal {
    
    inline def setQDim(value: INxLibraryDimensionDef): Self = StObject.set(x, "qDim", value.asInstanceOf[js.Any])
  }
}
