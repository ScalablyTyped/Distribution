package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is the layout for GenericMeasureProperties extend of GenericBaseLayout
  */
trait IGenericMeasureLayout extends IGenericBaseLayout {
  /**
    * Information about the measure.
    */
  var qMeasure: INxLibraryMeasureDef
}

object IGenericMeasureLayout {
  @scala.inline
  def apply(qInfo: INxInfo, qMeasure: INxLibraryMeasureDef, qMeta: INxMeta): IGenericMeasureLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qInfo")(qInfo)
    __obj.updateDynamic("qMeasure")(qMeasure)
    __obj.updateDynamic("qMeta")(qMeta)
    __obj.asInstanceOf[IGenericMeasureLayout]
  }
}

