package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Is the layout for GenericDimensionProperties.
  */
trait IGenericDimensionLayout
  extends StObject
     with IGenericBaseLayout {
  
  /**
    * Identifier and type of the dimension.
    */
  var qDim: INxLibraryDimensionDef
  
  /**
    * Cardinal and tags related to the dimension.
    * Length of the longest value in the field.
    */
  var qDimInfos: js.Array[IGenericDimensionInfo]
  
  /*add new member */
  /**
    * Information about publishing and permissions.
    */
  @JSName("qMeta")
  var qMeta_IGenericDimensionLayout: INxMetaTitleDescriptionTag
}
object IGenericDimensionLayout {
  
  inline def apply(
    qDim: INxLibraryDimensionDef,
    qDimInfos: js.Array[IGenericDimensionInfo],
    qInfo: INxInfo,
    qMeta: INxMetaTitleDescriptionTag
  ): IGenericDimensionLayout = {
    val __obj = js.Dynamic.literal(qDim = qDim.asInstanceOf[js.Any], qDimInfos = qDimInfos.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericDimensionLayout]
  }
  
  extension [Self <: IGenericDimensionLayout](x: Self) {
    
    inline def setQDim(value: INxLibraryDimensionDef): Self = StObject.set(x, "qDim", value.asInstanceOf[js.Any])
    
    inline def setQDimInfos(value: js.Array[IGenericDimensionInfo]): Self = StObject.set(x, "qDimInfos", value.asInstanceOf[js.Any])
    
    inline def setQDimInfosVarargs(value: IGenericDimensionInfo*): Self = StObject.set(x, "qDimInfos", js.Array(value :_*))
    
    inline def setQMeta(value: INxMetaTitleDescriptionTag): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
  }
}
