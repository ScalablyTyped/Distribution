package typings.qlikDashEngineapi.EngineAPINs

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
    val __obj = js.Dynamic.literal(qDimensionList = qDimensionList, qInfo = qInfo, qMeta = qMeta)
  
    __obj.asInstanceOf[IGenericDimensionListLayout]
  }
}

