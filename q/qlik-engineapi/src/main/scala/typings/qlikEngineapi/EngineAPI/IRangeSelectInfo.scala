package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RangeSelectInfo...
  */
@js.native
trait IRangeSelectInfo extends StObject {
  
  /* ToCheck!
    qRangeLo    Lowest value in the range.    Double
    qRangeHi    Highest value in the range.    Double
    qMeasure    Label of the measure.    String
    */
  /**
    * Range of values.
    */
  var qRange: IRange = js.native
}
object IRangeSelectInfo {
  
  @scala.inline
  def apply(qRange: IRange): IRangeSelectInfo = {
    val __obj = js.Dynamic.literal(qRange = qRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRangeSelectInfo]
  }
  
  @scala.inline
  implicit class IRangeSelectInfoMutableBuilder[Self <: IRangeSelectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQRange(value: IRange): Self = StObject.set(x, "qRange", value.asInstanceOf[js.Any])
  }
}
