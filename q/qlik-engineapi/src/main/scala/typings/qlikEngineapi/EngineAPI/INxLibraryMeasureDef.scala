package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxLibraryMeasureDef...
  */
@js.native
trait INxLibraryMeasureDef extends StObject {
  
  /**
    * Index to the active expression in a measure.
    */
  var qActiveExpression: Double = js.native
  
  /**
    * Definition of the measure.
    */
  var qDef: String = js.native
  
  /**
    * Array of expressions.
    */
  var qExpressions: js.Array[String] = js.native
  
  /**
    * Used to define a cyclic group or drill-down group.
    * This parameter is optional.
    * Default value is no grouping.
    */
  var qGrouping: js.UndefOr[NxGrpType] = js.native
  
  /**
    * Label of the measure.
    */
  var qLabel: String = js.native
}
object INxLibraryMeasureDef {
  
  @scala.inline
  def apply(qActiveExpression: Double, qDef: String, qExpressions: js.Array[String], qLabel: String): INxLibraryMeasureDef = {
    val __obj = js.Dynamic.literal(qActiveExpression = qActiveExpression.asInstanceOf[js.Any], qDef = qDef.asInstanceOf[js.Any], qExpressions = qExpressions.asInstanceOf[js.Any], qLabel = qLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxLibraryMeasureDef]
  }
  
  @scala.inline
  implicit class INxLibraryMeasureDefMutableBuilder[Self <: INxLibraryMeasureDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQActiveExpression(value: Double): Self = StObject.set(x, "qActiveExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDef(value: String): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExpressions(value: js.Array[String]): Self = StObject.set(x, "qExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExpressionsVarargs(value: String*): Self = StObject.set(x, "qExpressions", js.Array(value :_*))
    
    @scala.inline
    def setQGrouping(value: NxGrpType): Self = StObject.set(x, "qGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQGroupingUndefined: Self = StObject.set(x, "qGrouping", js.undefined)
    
    @scala.inline
    def setQLabel(value: String): Self = StObject.set(x, "qLabel", value.asInstanceOf[js.Any])
  }
}
