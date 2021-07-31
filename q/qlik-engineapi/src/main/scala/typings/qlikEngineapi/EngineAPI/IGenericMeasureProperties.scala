package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericMeasureProperties width extend GenericProperties
  */
trait IGenericMeasureProperties
  extends StObject
     with IGenericProperties {
  
  var qMeasure: INxLibraryMeasureDef
}
object IGenericMeasureProperties {
  
  @scala.inline
  def apply(qInfo: INxInfo, qMeasure: INxLibraryMeasureDef): IGenericMeasureProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeasure = qMeasure.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericMeasureProperties]
  }
  
  @scala.inline
  implicit class IGenericMeasurePropertiesMutableBuilder[Self <: IGenericMeasureProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQMeasure(value: INxLibraryMeasureDef): Self = StObject.set(x, "qMeasure", value.asInstanceOf[js.Any])
  }
}
