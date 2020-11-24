package typings.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import typings.qlik.qlikStrings.A
import typings.qlik.qlikStrings.B
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QHeader extends js.Object {
  
  var col: Double = js.native
  
  var errorCode: js.UndefOr[Double] = js.native
  
  var errorMessage: js.UndefOr[Double] = js.native
  
  var isOrderedBy: Boolean = js.native
  
  def orderBy(): Unit = js.native
  
  var qCardinal: js.UndefOr[Double] = js.native
  
  var qFallbackTitle: String = js.native
  
  var qMax: js.UndefOr[Double] = js.native
  
  // field?: Field
  var qMin: js.UndefOr[Double] = js.native
  
  var qReverseSort: Boolean = js.native
  
  var qSortIndicator: A | B = js.native
  
  var qStateCounts: js.UndefOr[StringDictionary[Double]] = js.native
  
  def reverseOrder(): Unit = js.native
  
  def selectRange(min: Double, max: Double, inclMin: Boolean, inclMax: Boolean): js.Promise[_] = js.native
}
object QHeader {
  
  @scala.inline
  def apply(
    col: Double,
    isOrderedBy: Boolean,
    orderBy: () => Unit,
    qFallbackTitle: String,
    qReverseSort: Boolean,
    qSortIndicator: A | B,
    reverseOrder: () => Unit,
    selectRange: (Double, Double, Boolean, Boolean) => js.Promise[_]
  ): QHeader = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], isOrderedBy = isOrderedBy.asInstanceOf[js.Any], orderBy = js.Any.fromFunction0(orderBy), qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qSortIndicator = qSortIndicator.asInstanceOf[js.Any], reverseOrder = js.Any.fromFunction0(reverseOrder), selectRange = js.Any.fromFunction4(selectRange))
    __obj.asInstanceOf[QHeader]
  }
  
  @scala.inline
  implicit class QHeaderOps[Self <: QHeader] (val x: Self) extends AnyVal {
    
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
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOrderedBy(value: Boolean): Self = this.set("isOrderedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderBy(value: () => Unit): Self = this.set("orderBy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQFallbackTitle(value: String): Self = this.set("qFallbackTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQReverseSort(value: Boolean): Self = this.set("qReverseSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortIndicator(value: A | B): Self = this.set("qSortIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseOrder(value: () => Unit): Self = this.set("reverseOrder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectRange(value: (Double, Double, Boolean, Boolean) => js.Promise[_]): Self = this.set("selectRange", js.Any.fromFunction4(value))
    
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: Double): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setQCardinal(value: Double): Self = this.set("qCardinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQCardinal: Self = this.set("qCardinal", js.undefined)
    
    @scala.inline
    def setQMax(value: Double): Self = this.set("qMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQMax: Self = this.set("qMax", js.undefined)
    
    @scala.inline
    def setQMin(value: Double): Self = this.set("qMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQMin: Self = this.set("qMin", js.undefined)
    
    @scala.inline
    def setQStateCounts(value: StringDictionary[Double]): Self = this.set("qStateCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQStateCounts: Self = this.set("qStateCounts", js.undefined)
  }
}
