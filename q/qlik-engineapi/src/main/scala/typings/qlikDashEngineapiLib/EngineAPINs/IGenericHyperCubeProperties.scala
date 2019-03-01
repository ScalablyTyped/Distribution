package typings
package qlikDashEngineapiLib.EngineAPINs

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
  def apply(qHyperCubeDef: IVisualizationHyperCubeDef, qInfo: INxInfo, qExtendsId: java.lang.String = null): IGenericHyperCubeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qHyperCubeDef")(qHyperCubeDef)
    __obj.updateDynamic("qInfo")(qInfo)
    if (qExtendsId != null) __obj.updateDynamic("qExtendsId")(qExtendsId)
    __obj.asInstanceOf[IGenericHyperCubeProperties]
  }
}

