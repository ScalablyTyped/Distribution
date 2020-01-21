package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericDimensionsListProperties width extend GenericProperties
  */
trait IGenericDimensionsListProperties extends IGenericProperties {
  var qDimensionListDef: IDimensionListDef
  @JSName("qInfo")
  var qInfo_IGenericDimensionsListProperties: IGenericDimensionListNxInfo
}

object IGenericDimensionsListProperties {
  @scala.inline
  def apply(qDimensionListDef: IDimensionListDef, qInfo: IGenericDimensionListNxInfo): IGenericDimensionsListProperties = {
    val __obj = js.Dynamic.literal(qDimensionListDef = qDimensionListDef.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGenericDimensionsListProperties]
  }
}

