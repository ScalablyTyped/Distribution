package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericHyperCubeLayout width extend GenericObjectLayout
  */
@js.native
trait IGenericHyperCubeLayout extends IGenericObjectLayout {
  var qHyperCube: IHyperCube = js.native
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
    qStateName: String
  ): IGenericHyperCubeLayout = {
    val __obj = js.Dynamic.literal(qExtendsId = qExtendsId.asInstanceOf[js.Any], qHasSoftPatches = qHasSoftPatches.asInstanceOf[js.Any], qHyperCube = qHyperCube.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qSelectionInfo = qSelectionInfo.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericHyperCubeLayout]
  }
  @scala.inline
  implicit class IGenericHyperCubeLayoutOps[Self <: IGenericHyperCubeLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQHyperCube(value: IHyperCube): Self = this.set("qHyperCube", value.asInstanceOf[js.Any])
  }
  
}

