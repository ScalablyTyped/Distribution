package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxCell...
  */
trait INxCell extends StObject {
  
  /**
    * Attribute dimensions values.
    */
  var qAttrDims: INxAttributeExpressionValues
  
  /**
    * Attribute expression values.
    */
  var qAttrExps: INxAttributeExpressionValues
  
  /**
    * Rank number of the value, starting from 0.
    * If the element number is a negative number, it means that the returned value is not an element number.
    *
    * You can get the following negative values:
    *
    * - 1: the cell is a Total cell. It shows a total.
    * - 2: the cell is collapsed. Applies to pivot tables.
    * - 3: the cell belongs to the group Others.
    * - 4: the cell is empty. Applies to pivot tables.
    */
  var qElemNumber: Double
  
  /**
    * Frequency of the value.
    * This parameter is optional.
    */
  var qFrequency: js.UndefOr[String] = js.undefined
  
  /**
    * Search hits.
    * The search hits are highlighted.
    * This parameter is optional.
    */
  var qHighlightRanges: js.UndefOr[INxHighlightRanges] = js.undefined
  
  /**
    * Is set to true, if qText and qNum are empty.
    * This parameter is optional. The default value is false.
    */
  var qIsEmpty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Is set to true if the value is Null.
    */
  var qIsNull: Boolean
  
  /**
    * Is set to true if the cell belongs to the group Others.
    * Dimension values can be set as Others depending on what has been defined in OtherTotalSpecProp.
    * This parameter is optional. The default value is false.
    * Not applicable to list objects.
    */
  var qIsOtherCell: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Is set to true if a total is displayed in the cell.
    * This parameter is optional. The default value is false.
    * Not applicable to list objects.
    */
  var qIsTotalCell: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value.
    * This parameter is optional.
    */
  var qNum: js.UndefOr[Double] = js.undefined
  
  /**
    * State of the value.
    * default state for a measure is "L".
    *
    * One of:
    *               L for Locked
    *               S for Selected
    *               O for Optional
    *               D for Deselected
    *               A for Alternative
    *               X for eXcluded
    *               XS for eXcluded Selected
    *               XL for eXcluded Locked
    */
  var qState: NxCellStateType
  
  /**
    * Some text.
    * This parameter is optional.
    */
  var qText: js.UndefOr[String] = js.undefined
}
object INxCell {
  
  inline def apply(
    qAttrDims: INxAttributeExpressionValues,
    qAttrExps: INxAttributeExpressionValues,
    qElemNumber: Double,
    qIsNull: Boolean,
    qState: NxCellStateType
  ): INxCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qElemNumber = qElemNumber.asInstanceOf[js.Any], qIsNull = qIsNull.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxCell]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INxCell] (val x: Self) extends AnyVal {
    
    inline def setQAttrDims(value: INxAttributeExpressionValues): Self = StObject.set(x, "qAttrDims", value.asInstanceOf[js.Any])
    
    inline def setQAttrExps(value: INxAttributeExpressionValues): Self = StObject.set(x, "qAttrExps", value.asInstanceOf[js.Any])
    
    inline def setQElemNumber(value: Double): Self = StObject.set(x, "qElemNumber", value.asInstanceOf[js.Any])
    
    inline def setQFrequency(value: String): Self = StObject.set(x, "qFrequency", value.asInstanceOf[js.Any])
    
    inline def setQFrequencyUndefined: Self = StObject.set(x, "qFrequency", js.undefined)
    
    inline def setQHighlightRanges(value: INxHighlightRanges): Self = StObject.set(x, "qHighlightRanges", value.asInstanceOf[js.Any])
    
    inline def setQHighlightRangesUndefined: Self = StObject.set(x, "qHighlightRanges", js.undefined)
    
    inline def setQIsEmpty(value: Boolean): Self = StObject.set(x, "qIsEmpty", value.asInstanceOf[js.Any])
    
    inline def setQIsEmptyUndefined: Self = StObject.set(x, "qIsEmpty", js.undefined)
    
    inline def setQIsNull(value: Boolean): Self = StObject.set(x, "qIsNull", value.asInstanceOf[js.Any])
    
    inline def setQIsOtherCell(value: Boolean): Self = StObject.set(x, "qIsOtherCell", value.asInstanceOf[js.Any])
    
    inline def setQIsOtherCellUndefined: Self = StObject.set(x, "qIsOtherCell", js.undefined)
    
    inline def setQIsTotalCell(value: Boolean): Self = StObject.set(x, "qIsTotalCell", value.asInstanceOf[js.Any])
    
    inline def setQIsTotalCellUndefined: Self = StObject.set(x, "qIsTotalCell", js.undefined)
    
    inline def setQNum(value: Double): Self = StObject.set(x, "qNum", value.asInstanceOf[js.Any])
    
    inline def setQNumUndefined: Self = StObject.set(x, "qNum", js.undefined)
    
    inline def setQState(value: NxCellStateType): Self = StObject.set(x, "qState", value.asInstanceOf[js.Any])
    
    inline def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    inline def setQTextUndefined: Self = StObject.set(x, "qText", js.undefined)
  }
}
