package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SelectInfo...
  */
@js.native
trait ISelectInfo extends js.Object {
  
  /**
    * List of information about ranges for selections.
    */
  var qContinuousRangeInfo: js.Array[IRange] = js.native
  
  /**
    * Gives information about the formatting of the range.
    * This parameter is used when performing range selections or text searches in dimensions.
    */
  var qNumberFormat: IFieldAttributes = js.native
  
  /**
    * Highest value of the search range.
    * This parameter is used when performing range selections or text searches in dimensions.
    * Default is Null.
    */
  var qRangeHi: Double = js.native
  
  /**
    * This parameter is used when performing range selections or text searches in measures.
    * Gives information about the range of selections.
    * bool SoftLock = false;
    */
  var qRangeInfo: js.Array[INxRangeSelectInfo] = js.native
  
  /**
    * Lower value of the search range.
    * This parameter is used when performing range selections or text searches in dimensions.
    * Default is Null.
    */
  var qRangeLo: Double = js.native
  
  /**
    * Text search string.
    * Everything that matches the text is selected.
    * >> This parameter is optional.
    */
  var qTextSearch: js.UndefOr[String] = js.native
}
object ISelectInfo {
  
  @scala.inline
  def apply(
    qContinuousRangeInfo: js.Array[IRange],
    qNumberFormat: IFieldAttributes,
    qRangeHi: Double,
    qRangeInfo: js.Array[INxRangeSelectInfo],
    qRangeLo: Double
  ): ISelectInfo = {
    val __obj = js.Dynamic.literal(qContinuousRangeInfo = qContinuousRangeInfo.asInstanceOf[js.Any], qNumberFormat = qNumberFormat.asInstanceOf[js.Any], qRangeHi = qRangeHi.asInstanceOf[js.Any], qRangeInfo = qRangeInfo.asInstanceOf[js.Any], qRangeLo = qRangeLo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectInfo]
  }
  
  @scala.inline
  implicit class ISelectInfoOps[Self <: ISelectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQContinuousRangeInfoVarargs(value: IRange*): Self = this.set("qContinuousRangeInfo", js.Array(value :_*))
    
    @scala.inline
    def setQContinuousRangeInfo(value: js.Array[IRange]): Self = this.set("qContinuousRangeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNumberFormat(value: IFieldAttributes): Self = this.set("qNumberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRangeHi(value: Double): Self = this.set("qRangeHi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRangeInfoVarargs(value: INxRangeSelectInfo*): Self = this.set("qRangeInfo", js.Array(value :_*))
    
    @scala.inline
    def setQRangeInfo(value: js.Array[INxRangeSelectInfo]): Self = this.set("qRangeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRangeLo(value: Double): Self = this.set("qRangeLo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTextSearch(value: String): Self = this.set("qTextSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQTextSearch: Self = this.set("qTextSearch", js.undefined)
  }
}
