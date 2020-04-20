package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IGenericMeasureListProperties
  */
trait IGenericMeasureListProperties extends IGenericProperties {
  @JSName("qInfo")
  var qInfo_IGenericMeasureListProperties: IGenericMeassureListNxInfo
  var qMeasureListDef: IMeasureListDef
}

object IGenericMeasureListProperties {
  @scala.inline
  def apply(qInfo: IGenericMeassureListNxInfo, qMeasureListDef: IMeasureListDef): IGenericMeasureListProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeasureListDef = qMeasureListDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericMeasureListProperties]
  }
}

