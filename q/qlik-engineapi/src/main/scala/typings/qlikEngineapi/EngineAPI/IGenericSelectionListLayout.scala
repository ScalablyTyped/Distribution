package typings.qlikEngineapi.EngineAPI

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
    val __obj = js.Dynamic.literal(qExtendsId = qExtendsId.asInstanceOf[js.Any], qHasSoftPatches = qHasSoftPatches.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qSelectionInfo = qSelectionInfo.asInstanceOf[js.Any], qSelectionObject = qSelectionObject.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    if (qError != null) __obj.updateDynamic("qError")(qError.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericSelectionListLayout]
  }
}

