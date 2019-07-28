package typings.qlikDashEngineapi.EngineAPINs

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
    val __obj = js.Dynamic.literal(qInfo = qInfo, qMeasure = qMeasure)
  
    __obj.asInstanceOf[IGenericMeasureProperties]
  }
}

