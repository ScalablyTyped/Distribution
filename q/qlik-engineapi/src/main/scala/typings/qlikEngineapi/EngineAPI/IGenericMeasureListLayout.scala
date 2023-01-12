package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IGenericMeasureListLayout
  */
trait IGenericMeasureListLayout
  extends StObject
     with IGenericBaseLayout {
  
  var qMeassureListObject: IMeassureList
}
object IGenericMeasureListLayout {
  
  inline def apply(qInfo: INxInfo, qMeassureListObject: IMeassureList, qMeta: INxMeta): IGenericMeasureListLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeassureListObject = qMeassureListObject.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericMeasureListLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGenericMeasureListLayout] (val x: Self) extends AnyVal {
    
    inline def setQMeassureListObject(value: IMeassureList): Self = StObject.set(x, "qMeassureListObject", value.asInstanceOf[js.Any])
  }
}
