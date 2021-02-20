package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IGenericMeasureListProperties
  */
@js.native
trait IGenericMeasureListProperties extends IGenericProperties {
  
  @JSName("qInfo")
  var qInfo_IGenericMeasureListProperties: IGenericMeassureListNxInfo = js.native
  
  var qMeasureListDef: IMeasureListDef = js.native
}
object IGenericMeasureListProperties {
  
  @scala.inline
  def apply(qInfo: IGenericMeassureListNxInfo, qMeasureListDef: IMeasureListDef): IGenericMeasureListProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeasureListDef = qMeasureListDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericMeasureListProperties]
  }
  
  @scala.inline
  implicit class IGenericMeasureListPropertiesMutableBuilder[Self <: IGenericMeasureListProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQInfo(value: IGenericMeassureListNxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeasureListDef(value: IMeasureListDef): Self = StObject.set(x, "qMeasureListDef", value.asInstanceOf[js.Any])
  }
}
