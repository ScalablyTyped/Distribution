package typings.qlikDashEngineapi.EngineAPI

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
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeassureListObject = qMeassureListObject.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGenericMeasureListLayout]
  }
}

