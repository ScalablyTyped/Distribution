package typings.qlikEngineapi.EngineAPI

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
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeasure = qMeasure.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGenericMeasureProperties]
  }
}

