package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxLibraryMeasureDef...
  */
trait INxLibraryMeasureDef extends StObject {
  
  /**
    * Index to the active expression in a measure.
    */
  var qActiveExpression: Double
  
  /**
    * Definition of the measure.
    */
  var qDef: String
  
  /**
    * Array of expressions.
    */
  var qExpressions: js.Array[String]
  
  /**
    * Used to define a cyclic group or drill-down group.
    * This parameter is optional.
    * Default value is no grouping.
    */
  var qGrouping: js.UndefOr[NxGrpType] = js.undefined
  
  /**
    * Label of the measure.
    */
  var qLabel: String
}
object INxLibraryMeasureDef {
  
  inline def apply(qActiveExpression: Double, qDef: String, qExpressions: js.Array[String], qLabel: String): INxLibraryMeasureDef = {
    val __obj = js.Dynamic.literal(qActiveExpression = qActiveExpression.asInstanceOf[js.Any], qDef = qDef.asInstanceOf[js.Any], qExpressions = qExpressions.asInstanceOf[js.Any], qLabel = qLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxLibraryMeasureDef]
  }
  
  extension [Self <: INxLibraryMeasureDef](x: Self) {
    
    inline def setQActiveExpression(value: Double): Self = StObject.set(x, "qActiveExpression", value.asInstanceOf[js.Any])
    
    inline def setQDef(value: String): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
    
    inline def setQExpressions(value: js.Array[String]): Self = StObject.set(x, "qExpressions", value.asInstanceOf[js.Any])
    
    inline def setQExpressionsVarargs(value: String*): Self = StObject.set(x, "qExpressions", js.Array(value*))
    
    inline def setQGrouping(value: NxGrpType): Self = StObject.set(x, "qGrouping", value.asInstanceOf[js.Any])
    
    inline def setQGroupingUndefined: Self = StObject.set(x, "qGrouping", js.undefined)
    
    inline def setQLabel(value: String): Self = StObject.set(x, "qLabel", value.asInstanceOf[js.Any])
  }
}
