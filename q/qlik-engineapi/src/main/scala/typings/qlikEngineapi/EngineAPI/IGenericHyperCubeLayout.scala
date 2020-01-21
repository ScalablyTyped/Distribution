package typings.qlikEngineapi.EngineAPI

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
    val __obj = js.Dynamic.literal(qExtendsId = qExtendsId.asInstanceOf[js.Any], qHasSoftPatches = qHasSoftPatches.asInstanceOf[js.Any], qHyperCube = qHyperCube.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qSelectionInfo = qSelectionInfo.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    if (qError != null) __obj.updateDynamic("qError")(qError.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericHyperCubeLayout]
  }
}

