package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericDimensionListLayout width extend GenericBaseLayout
  */
trait IGenericDimensionListLayout extends IGenericBaseLayout {
  var qDimensionList: IDimensionList
}

object IGenericDimensionListLayout {
  @scala.inline
  def apply(qDimensionList: IDimensionList, qInfo: INxInfo, qMeta: INxMeta): IGenericDimensionListLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qDimensionList")(qDimensionList)
    __obj.updateDynamic("qInfo")(qInfo)
    __obj.updateDynamic("qMeta")(qMeta)
    __obj.asInstanceOf[IGenericDimensionListLayout]
  }
}

