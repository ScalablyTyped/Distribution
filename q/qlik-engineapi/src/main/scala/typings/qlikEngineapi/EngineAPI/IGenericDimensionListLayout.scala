package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericDimensionListLayout width extend GenericBaseLayout
  */
trait IGenericDimensionListLayout
  extends StObject
     with IGenericBaseLayout {
  
  var qDimensionList: IDimensionList
}
object IGenericDimensionListLayout {
  
  inline def apply(qDimensionList: IDimensionList, qInfo: INxInfo, qMeta: INxMeta): IGenericDimensionListLayout = {
    val __obj = js.Dynamic.literal(qDimensionList = qDimensionList.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericDimensionListLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGenericDimensionListLayout] (val x: Self) extends AnyVal {
    
    inline def setQDimensionList(value: IDimensionList): Self = StObject.set(x, "qDimensionList", value.asInstanceOf[js.Any])
  }
}
