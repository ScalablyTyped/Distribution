package typings.qlikDashEngineapi.EngineAPINs

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
    val __obj = js.Dynamic.literal(qInfo = qInfo, qMeassureListObject = qMeassureListObject, qMeta = qMeta)
  
    __obj.asInstanceOf[IGenericMeasureListLayout]
  }
}

