package typings.qlikEngineapi.EngineAPI

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
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeasure = qMeasure.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericMeasureLayout]
  }
}

