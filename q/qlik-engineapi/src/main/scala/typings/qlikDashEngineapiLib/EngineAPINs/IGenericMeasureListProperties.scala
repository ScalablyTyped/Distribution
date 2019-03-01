package typings
package qlikDashEngineapiLib.EngineAPINs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qInfo")(qInfo)
    __obj.updateDynamic("qMeasureListDef")(qMeasureListDef)
    __obj.asInstanceOf[IGenericMeasureListProperties]
  }
}

