package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericHyperCubeProperties width extend GenericObjectProperties
  */
trait IGenericHyperCubeProperties extends IGenericObjectProperties {
  var qHyperCubeDef: IVisualizationHyperCubeDef
}

object IGenericHyperCubeProperties {
  @scala.inline
  def apply(qHyperCubeDef: IVisualizationHyperCubeDef, qInfo: INxInfo, qExtendsId: String = null): IGenericHyperCubeProperties = {
    val __obj = js.Dynamic.literal(qHyperCubeDef = qHyperCubeDef.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
    if (qExtendsId != null) __obj.updateDynamic("qExtendsId")(qExtendsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericHyperCubeProperties]
  }
}

