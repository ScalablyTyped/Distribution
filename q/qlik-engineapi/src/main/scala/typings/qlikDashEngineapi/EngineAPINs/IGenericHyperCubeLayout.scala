package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericHyperCubeLayout width extend GenericObjectLayout
  */
trait IGenericHyperCubeLayout extends IGenericObjectLayout {
  var qHyperCube: IHyperCube
}

object IGenericHyperCubeLayout {
  @scala.inline
  def apply(
    qExtendsId: String,
    qHasSoftPatches: Boolean,
    qHyperCube: IHyperCube,
    qInfo: INxInfo,
    qMeta: INxMeta,
    qSelectionInfo: INxSelectionInfo,
    qStateName: String,
    qError: INxLayoutErrors = null
  ): IGenericHyperCubeLayout = {
    val __obj = js.Dynamic.literal(qExtendsId = qExtendsId, qHasSoftPatches = qHasSoftPatches, qHyperCube = qHyperCube, qInfo = qInfo, qMeta = qMeta, qSelectionInfo = qSelectionInfo, qStateName = qStateName)
    if (qError != null) __obj.updateDynamic("qError")(qError)
    __obj.asInstanceOf[IGenericHyperCubeLayout]
  }
}

