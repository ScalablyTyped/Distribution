package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericDimensionsListProperties width extend GenericProperties
  */
@js.native
trait IGenericDimensionsListProperties extends IGenericProperties {
  
  var qDimensionListDef: IDimensionListDef = js.native
  
  @JSName("qInfo")
  var qInfo_IGenericDimensionsListProperties: IGenericDimensionListNxInfo = js.native
}
object IGenericDimensionsListProperties {
  
  @scala.inline
  def apply(qDimensionListDef: IDimensionListDef, qInfo: IGenericDimensionListNxInfo): IGenericDimensionsListProperties = {
    val __obj = js.Dynamic.literal(qDimensionListDef = qDimensionListDef.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericDimensionsListProperties]
  }
  
  @scala.inline
  implicit class IGenericDimensionsListPropertiesMutableBuilder[Self <: IGenericDimensionsListProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDimensionListDef(value: IDimensionListDef): Self = StObject.set(x, "qDimensionListDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInfo(value: IGenericDimensionListNxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
  }
}
