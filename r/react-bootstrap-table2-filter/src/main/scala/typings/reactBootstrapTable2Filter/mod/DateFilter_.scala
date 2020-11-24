package typings.reactBootstrapTable2Filter.mod

import typings.react.mod.CSSProperties
import typings.reactBootstrapTable2Filter.anon.Date
import typings.reactBootstrapTableNext.mod.TableColumnFilterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateFilter_[T /* <: js.Object */]
  extends TableColumnFilterProps[TableColumnFilterProps[js.Any, js.Any], T] {
  
  var comparator: js.UndefOr[js.Array[Comparator]] = js.native
  
  var comparatorClassName: js.UndefOr[String] = js.native
  
  var comparatorStyle: js.UndefOr[CSSProperties] = js.native
  
  var dateClassName: js.UndefOr[String] = js.native
  
  var dateStyle: js.UndefOr[CSSProperties] = js.native
  
  @JSName("defaultValue")
  var defaultValue_DateFilter_ : js.UndefOr[Date] = js.native
  
  var withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.native
}
object DateFilter_ {
  
  @scala.inline
  def apply[T /* <: js.Object */](): DateFilter_[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFilter_[T]]
  }
  
  @scala.inline
  implicit class DateFilter_Ops[Self <: DateFilter_[_], T /* <: js.Object */] (val x: Self with DateFilter_[T]) extends AnyVal {
    
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
    def setComparatorVarargs(value: Comparator*): Self = this.set("comparator", js.Array(value :_*))
    
    @scala.inline
    def setComparator(value: js.Array[Comparator]): Self = this.set("comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    
    @scala.inline
    def setComparatorClassName(value: String): Self = this.set("comparatorClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparatorClassName: Self = this.set("comparatorClassName", js.undefined)
    
    @scala.inline
    def setComparatorStyle(value: CSSProperties): Self = this.set("comparatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparatorStyle: Self = this.set("comparatorStyle", js.undefined)
    
    @scala.inline
    def setDateClassName(value: String): Self = this.set("dateClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateClassName: Self = this.set("dateClassName", js.undefined)
    
    @scala.inline
    def setDateStyle(value: CSSProperties): Self = this.set("dateStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateStyle: Self = this.set("dateStyle", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Date): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setWithoutEmptyComparatorOption(value: Boolean): Self = this.set("withoutEmptyComparatorOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithoutEmptyComparatorOption: Self = this.set("withoutEmptyComparatorOption", js.undefined)
  }
}
