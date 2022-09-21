package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SelectInfo...
  */
trait ISelectInfo extends StObject {
  
  /**
    * List of information about ranges for selections.
    */
  var qContinuousRangeInfo: js.Array[IRange]
  
  /**
    * Gives information about the formatting of the range.
    * This parameter is used when performing range selections or text searches in dimensions.
    */
  var qNumberFormat: IFieldAttributes
  
  /**
    * Highest value of the search range.
    * This parameter is used when performing range selections or text searches in dimensions.
    * Default is Null.
    */
  var qRangeHi: Double
  
  /**
    * This parameter is used when performing range selections or text searches in measures.
    * Gives information about the range of selections.
    * bool SoftLock = false;
    */
  var qRangeInfo: js.Array[INxRangeSelectInfo]
  
  /**
    * Lower value of the search range.
    * This parameter is used when performing range selections or text searches in dimensions.
    * Default is Null.
    */
  var qRangeLo: Double
  
  /**
    * Text search string.
    * Everything that matches the text is selected.
    * >> This parameter is optional.
    */
  var qTextSearch: js.UndefOr[String] = js.undefined
}
object ISelectInfo {
  
  inline def apply(
    qContinuousRangeInfo: js.Array[IRange],
    qNumberFormat: IFieldAttributes,
    qRangeHi: Double,
    qRangeInfo: js.Array[INxRangeSelectInfo],
    qRangeLo: Double
  ): ISelectInfo = {
    val __obj = js.Dynamic.literal(qContinuousRangeInfo = qContinuousRangeInfo.asInstanceOf[js.Any], qNumberFormat = qNumberFormat.asInstanceOf[js.Any], qRangeHi = qRangeHi.asInstanceOf[js.Any], qRangeInfo = qRangeInfo.asInstanceOf[js.Any], qRangeLo = qRangeLo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectInfo]
  }
  
  extension [Self <: ISelectInfo](x: Self) {
    
    inline def setQContinuousRangeInfo(value: js.Array[IRange]): Self = StObject.set(x, "qContinuousRangeInfo", value.asInstanceOf[js.Any])
    
    inline def setQContinuousRangeInfoVarargs(value: IRange*): Self = StObject.set(x, "qContinuousRangeInfo", js.Array(value*))
    
    inline def setQNumberFormat(value: IFieldAttributes): Self = StObject.set(x, "qNumberFormat", value.asInstanceOf[js.Any])
    
    inline def setQRangeHi(value: Double): Self = StObject.set(x, "qRangeHi", value.asInstanceOf[js.Any])
    
    inline def setQRangeInfo(value: js.Array[INxRangeSelectInfo]): Self = StObject.set(x, "qRangeInfo", value.asInstanceOf[js.Any])
    
    inline def setQRangeInfoVarargs(value: INxRangeSelectInfo*): Self = StObject.set(x, "qRangeInfo", js.Array(value*))
    
    inline def setQRangeLo(value: Double): Self = StObject.set(x, "qRangeLo", value.asInstanceOf[js.Any])
    
    inline def setQTextSearch(value: String): Self = StObject.set(x, "qTextSearch", value.asInstanceOf[js.Any])
    
    inline def setQTextSearchUndefined: Self = StObject.set(x, "qTextSearch", js.undefined)
  }
}
