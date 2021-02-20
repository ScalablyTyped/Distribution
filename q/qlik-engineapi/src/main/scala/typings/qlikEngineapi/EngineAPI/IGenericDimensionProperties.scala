package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericDimensionProperties width extend GenericProperties
  */
@js.native
trait IGenericDimensionProperties extends IGenericProperties {
  
  var qDim: INxLibraryDimensionDef = js.native
}
object IGenericDimensionProperties {
  
  @scala.inline
  def apply(qDim: INxLibraryDimensionDef, qInfo: INxInfo): IGenericDimensionProperties = {
    val __obj = js.Dynamic.literal(qDim = qDim.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericDimensionProperties]
  }
  
  @scala.inline
  implicit class IGenericDimensionPropertiesMutableBuilder[Self <: IGenericDimensionProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDim(value: INxLibraryDimensionDef): Self = StObject.set(x, "qDim", value.asInstanceOf[js.Any])
  }
}
