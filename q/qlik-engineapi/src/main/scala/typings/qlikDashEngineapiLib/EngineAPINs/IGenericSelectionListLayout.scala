package typings
package qlikDashEngineapiLib.EngineAPINs

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
    qExtendsId: java.lang.String,
    qHasSoftPatches: scala.Boolean,
    qInfo: INxInfo,
    qMeta: INxMeta,
    qSelectionInfo: INxSelectionInfo,
    qSelectionObject: ISelectionListObject,
    qStateName: java.lang.String,
    qError: INxLayoutErrors = null
  ): IGenericSelectionListLayout = {
    val __obj = js.Dynamic.literal(qExtendsId = qExtendsId, qHasSoftPatches = qHasSoftPatches, qInfo = qInfo, qMeta = qMeta, qSelectionInfo = qSelectionInfo, qSelectionObject = qSelectionObject, qStateName = qStateName)
    if (qError != null) __obj.updateDynamic("qError")(qError)
    __obj.asInstanceOf[IGenericSelectionListLayout]
  }
}

