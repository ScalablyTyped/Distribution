package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxInlineMeasureDef...
  */
trait INxInlineMeasureDef extends StObject {
  
  /**
    * - 0 means no accumulation
    * - 1 means full accumulation (each y-value accumulates all previous y-values of the expression)
    * - = 2 means accumulate as many steps as the qAccumulate value
    * >> This parameter is optional.
    * >> Default is 0.
    */
  var qAccumulate: js.UndefOr[Double] = js.undefined
  
  /**
    * Index of the active expression in a cyclic measure. The indexing starts from 0.
    * This parameter is optional.
    * >> The default value is 0.
    */
  var qActiveExpression: js.UndefOr[Double] = js.undefined
  
  /**
    * Aggregate function.
    * For more information on the aggregate function syntax, see the section Working with Qlik Sense
    * on the online help portal.
    * The default value is 0 (Sum of rows)
    * >> This parameter is optional.
    */
  var qAggrFunc: js.UndefOr[String] = js.undefined
  
  /**
    * If set to true, the sum of rows total should be used rather than real expression total.
    * This parameter is optional and applies to straight tables.
    * If using the Qlik Sense interface, it means that the total mode is set to Expression Total.
    * >> Default is false.
    */
  var qBrutalSum: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Definition of the expression in the measure.
    * Example: Sum (OrderTotal)
    * >> This parameter is mandatory.
    */
  var qDef: String
  
  /**
    * Description of the measure.
    * >> This parameter is optional.
    * An empty string is returned as a default value.
    */
  var qDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Array of expressions. This parameter is used in case of cyclic measures (qGrouping is C).
    * List of the expressions in the cyclic group.
    */
  var qExpressions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Default value is no grouping.
    * >> This parameter is optional.
    */
  var qGrouping: js.UndefOr[NxGrpType] = js.undefined
  
  /**
    * Name of the measure.
    * >> This parameter is optional.
    * An empty string is returned as a default value.
    */
  var qLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Label expression.
    * >> This parameter is optional.
    * An empty string is returned as a default value.
    */
  var qLabelExpression: js.UndefOr[String] = js.undefined
  
  /**
    * Format of the field.
    * >> This parameter is optional.
    */
  var qNumFormat: js.UndefOr[IFieldAttributes] = js.undefined
  
  /**
    * If set to true, percentage values are returned instead of absolute numbers.
    * >> This parameter is optional.
    * >> Default is false.
    */
  var qRelative: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, it inverts the sort criteria in the field.
    */
  var qReverseSort: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name connected to the measure that is used for search purposes.
    * >> This parameter is optional.
    * A measure can have several tags.
    */
  var qTags: js.UndefOr[js.Array[String]] = js.undefined
}
object INxInlineMeasureDef {
  
  inline def apply(qDef: String): INxInlineMeasureDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxInlineMeasureDef]
  }
  
  extension [Self <: INxInlineMeasureDef](x: Self) {
    
    inline def setQAccumulate(value: Double): Self = StObject.set(x, "qAccumulate", value.asInstanceOf[js.Any])
    
    inline def setQAccumulateUndefined: Self = StObject.set(x, "qAccumulate", js.undefined)
    
    inline def setQActiveExpression(value: Double): Self = StObject.set(x, "qActiveExpression", value.asInstanceOf[js.Any])
    
    inline def setQActiveExpressionUndefined: Self = StObject.set(x, "qActiveExpression", js.undefined)
    
    inline def setQAggrFunc(value: String): Self = StObject.set(x, "qAggrFunc", value.asInstanceOf[js.Any])
    
    inline def setQAggrFuncUndefined: Self = StObject.set(x, "qAggrFunc", js.undefined)
    
    inline def setQBrutalSum(value: Boolean): Self = StObject.set(x, "qBrutalSum", value.asInstanceOf[js.Any])
    
    inline def setQBrutalSumUndefined: Self = StObject.set(x, "qBrutalSum", js.undefined)
    
    inline def setQDef(value: String): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
    
    inline def setQDescription(value: String): Self = StObject.set(x, "qDescription", value.asInstanceOf[js.Any])
    
    inline def setQDescriptionUndefined: Self = StObject.set(x, "qDescription", js.undefined)
    
    inline def setQExpressions(value: js.Array[String]): Self = StObject.set(x, "qExpressions", value.asInstanceOf[js.Any])
    
    inline def setQExpressionsUndefined: Self = StObject.set(x, "qExpressions", js.undefined)
    
    inline def setQExpressionsVarargs(value: String*): Self = StObject.set(x, "qExpressions", js.Array(value :_*))
    
    inline def setQGrouping(value: NxGrpType): Self = StObject.set(x, "qGrouping", value.asInstanceOf[js.Any])
    
    inline def setQGroupingUndefined: Self = StObject.set(x, "qGrouping", js.undefined)
    
    inline def setQLabel(value: String): Self = StObject.set(x, "qLabel", value.asInstanceOf[js.Any])
    
    inline def setQLabelExpression(value: String): Self = StObject.set(x, "qLabelExpression", value.asInstanceOf[js.Any])
    
    inline def setQLabelExpressionUndefined: Self = StObject.set(x, "qLabelExpression", js.undefined)
    
    inline def setQLabelUndefined: Self = StObject.set(x, "qLabel", js.undefined)
    
    inline def setQNumFormat(value: IFieldAttributes): Self = StObject.set(x, "qNumFormat", value.asInstanceOf[js.Any])
    
    inline def setQNumFormatUndefined: Self = StObject.set(x, "qNumFormat", js.undefined)
    
    inline def setQRelative(value: Boolean): Self = StObject.set(x, "qRelative", value.asInstanceOf[js.Any])
    
    inline def setQRelativeUndefined: Self = StObject.set(x, "qRelative", js.undefined)
    
    inline def setQReverseSort(value: Boolean): Self = StObject.set(x, "qReverseSort", value.asInstanceOf[js.Any])
    
    inline def setQReverseSortUndefined: Self = StObject.set(x, "qReverseSort", js.undefined)
    
    inline def setQTags(value: js.Array[String]): Self = StObject.set(x, "qTags", value.asInstanceOf[js.Any])
    
    inline def setQTagsUndefined: Self = StObject.set(x, "qTags", js.undefined)
    
    inline def setQTagsVarargs(value: String*): Self = StObject.set(x, "qTags", js.Array(value :_*))
  }
}
