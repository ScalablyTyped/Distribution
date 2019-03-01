package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IGenericMeasureListLayout
  */
trait IGenericMeasureListLayout extends IGenericBaseLayout {
  var qMeassureListObject: IMeassureList
}

object IGenericMeasureListLayout {
  @scala.inline
  def apply(qInfo: INxInfo, qMeassureListObject: IMeassureList, qMeta: INxMeta): IGenericMeasureListLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qInfo")(qInfo)
    __obj.updateDynamic("qMeassureListObject")(qMeassureListObject)
    __obj.updateDynamic("qMeta")(qMeta)
    __obj.asInstanceOf[IGenericMeasureListLayout]
  }
}

