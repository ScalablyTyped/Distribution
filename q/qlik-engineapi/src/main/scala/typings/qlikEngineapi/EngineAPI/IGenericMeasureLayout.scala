package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Is the layout for GenericMeasureProperties extend of GenericBaseLayout
  */
trait IGenericMeasureLayout
  extends StObject
     with IGenericBaseLayout {
  
  /**
    * Information about the measure.
    */
  var qMeasure: INxLibraryMeasureDef
}
object IGenericMeasureLayout {
  
  inline def apply(qInfo: INxInfo, qMeasure: INxLibraryMeasureDef, qMeta: INxMeta): IGenericMeasureLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeasure = qMeasure.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericMeasureLayout]
  }
  
  extension [Self <: IGenericMeasureLayout](x: Self) {
    
    inline def setQMeasure(value: INxLibraryMeasureDef): Self = StObject.set(x, "qMeasure", value.asInstanceOf[js.Any])
  }
}
