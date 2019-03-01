package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericMeasureProperties width extend GenericProperties
  */
trait IGenericMeasureProperties extends IGenericProperties {
  var qMeasure: INxLibraryMeasureDef
}

object IGenericMeasureProperties {
  @scala.inline
  def apply(qInfo: INxInfo, qMeasure: INxLibraryMeasureDef): IGenericMeasureProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qInfo")(qInfo)
    __obj.updateDynamic("qMeasure")(qMeasure)
    __obj.asInstanceOf[IGenericMeasureProperties]
  }
}

