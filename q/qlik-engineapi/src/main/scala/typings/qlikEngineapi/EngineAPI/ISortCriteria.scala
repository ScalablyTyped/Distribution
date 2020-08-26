package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SortCriteria...
  */
@js.native
trait ISortCriteria extends js.Object {
  /**
    * Sort by expression.
    */
  var qExpression: js.UndefOr[IValueExpr] = js.native
  /**
    * Sorts the field by alphabetical order.
    */
  var qSortByAscii: js.UndefOr[TypeSortDirection] = js.native
  /**
    * Sorts the field by expression.
    */
  var qSortByExpression: js.UndefOr[TypeSortDirection] = js.native
  /**
    * Sorts the field values by frequency
    * (number of occurrences in the field).
    */
  var qSortByFrequency: js.UndefOr[TypeSortDirection] = js.native
  /**
    * no / empty docu
    */
  var qSortByGreyness: js.UndefOr[TypeSortDirection] = js.native
  /**
    * Sorts the field values by the initial load order.
    */
  var qSortByLoadOrder: js.UndefOr[TypeSortDirection] = js.native
  /**
    * Sorts the field values by numeric value.
    */
  var qSortByNumeric: js.UndefOr[TypeSortDirection] = js.native
  /**
    * Sorts the field values according to their logical state
    * (selected, optional, alternative or excluded).
    */
  var qSortByState: js.UndefOr[TypeSortDirection] = js.native
}

object ISortCriteria {
  @scala.inline
  def apply(): ISortCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISortCriteria]
  }
  @scala.inline
  implicit class ISortCriteriaOps[Self <: ISortCriteria] (val x: Self) extends AnyVal {
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
    def setQExpression(value: IValueExpr): Self = this.set("qExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQExpression: Self = this.set("qExpression", js.undefined)
    @scala.inline
    def setQSortByAscii(value: TypeSortDirection): Self = this.set("qSortByAscii", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQSortByAscii: Self = this.set("qSortByAscii", js.undefined)
    @scala.inline
    def setQSortByExpression(value: TypeSortDirection): Self = this.set("qSortByExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQSortByExpression: Self = this.set("qSortByExpression", js.undefined)
    @scala.inline
    def setQSortByFrequency(value: TypeSortDirection): Self = this.set("qSortByFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQSortByFrequency: Self = this.set("qSortByFrequency", js.undefined)
    @scala.inline
    def setQSortByGreyness(value: TypeSortDirection): Self = this.set("qSortByGreyness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQSortByGreyness: Self = this.set("qSortByGreyness", js.undefined)
    @scala.inline
    def setQSortByLoadOrder(value: TypeSortDirection): Self = this.set("qSortByLoadOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQSortByLoadOrder: Self = this.set("qSortByLoadOrder", js.undefined)
    @scala.inline
    def setQSortByNumeric(value: TypeSortDirection): Self = this.set("qSortByNumeric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQSortByNumeric: Self = this.set("qSortByNumeric", js.undefined)
    @scala.inline
    def setQSortByState(value: TypeSortDirection): Self = this.set("qSortByState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQSortByState: Self = this.set("qSortByState", js.undefined)
  }
  
}

