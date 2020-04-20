package typings.qlikEngineapi.EngineAPI

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
    val __obj = js.Dynamic.literal(qDimensionList = qDimensionList.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericDimensionListLayout]
  }
}

