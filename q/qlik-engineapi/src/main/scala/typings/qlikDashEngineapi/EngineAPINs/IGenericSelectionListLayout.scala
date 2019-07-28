package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericSelectionListLayout width extend GenericObjectLayout
  */
trait IGenericSelectionListLayout extends IGenericObjectLayout {
  var qSelectionObject: ISelectionListObject
}

object IGenericSelectionListLayout {
  @scala.inline
  def apply(
    qExtendsId: String,
    qHasSoftPatches: Boolean,
    qInfo: INxInfo,
    qMeta: INxMeta,
    qSelectionInfo: INxSelectionInfo,
    qSelectionObject: ISelectionListObject,
    qStateName: String,
    qError: INxLayoutErrors = null
  ): IGenericSelectionListLayout = {
    val __obj = js.Dynamic.literal(qExtendsId = qExtendsId, qHasSoftPatches = qHasSoftPatches, qInfo = qInfo, qMeta = qMeta, qSelectionInfo = qSelectionInfo, qSelectionObject = qSelectionObject, qStateName = qStateName)
    if (qError != null) __obj.updateDynamic("qError")(qError)
    __obj.asInstanceOf[IGenericSelectionListLayout]
  }
}

