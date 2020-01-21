package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SortCriteria...
  */
trait ISortCriteria extends js.Object {
  /**
    * Sort by expression.
    */
  var qExpression: js.UndefOr[IValueExpr] = js.undefined
  /**
    * Sorts the field by alphabetical order.
    */
  var qSortByAscii: js.UndefOr[TypeSortDirection] = js.undefined
  /**
    * Sorts the field by expression.
    */
  var qSortByExpression: js.UndefOr[TypeSortDirection] = js.undefined
  /**
    * Sorts the field values by frequency
    * (number of occurrences in the field).
    */
  var qSortByFrequency: js.UndefOr[TypeSortDirection] = js.undefined
  /**
    * no / empty docu
    */
  var qSortByGreyness: js.UndefOr[TypeSortDirection] = js.undefined
  /**
    * Sorts the field values by the initial load order.
    */
  var qSortByLoadOrder: js.UndefOr[TypeSortDirection] = js.undefined
  /**
    * Sorts the field values by numeric value.
    */
  var qSortByNumeric: js.UndefOr[TypeSortDirection] = js.undefined
  /**
    * Sorts the field values according to their logical state
    * (selected, optional, alternative or excluded).
    */
  var qSortByState: js.UndefOr[TypeSortDirection] = js.undefined
}

object ISortCriteria {
  @scala.inline
  def apply(
    qExpression: IValueExpr = null,
    qSortByAscii: TypeSortDirection = null,
    qSortByExpression: TypeSortDirection = null,
    qSortByFrequency: TypeSortDirection = null,
    qSortByGreyness: TypeSortDirection = null,
    qSortByLoadOrder: TypeSortDirection = null,
    qSortByNumeric: TypeSortDirection = null,
    qSortByState: TypeSortDirection = null
  ): ISortCriteria = {
    val __obj = js.Dynamic.literal()
    if (qExpression != null) __obj.updateDynamic("qExpression")(qExpression.asInstanceOf[js.Any])
    if (qSortByAscii != null) __obj.updateDynamic("qSortByAscii")(qSortByAscii.asInstanceOf[js.Any])
    if (qSortByExpression != null) __obj.updateDynamic("qSortByExpression")(qSortByExpression.asInstanceOf[js.Any])
    if (qSortByFrequency != null) __obj.updateDynamic("qSortByFrequency")(qSortByFrequency.asInstanceOf[js.Any])
    if (qSortByGreyness != null) __obj.updateDynamic("qSortByGreyness")(qSortByGreyness.asInstanceOf[js.Any])
    if (qSortByLoadOrder != null) __obj.updateDynamic("qSortByLoadOrder")(qSortByLoadOrder.asInstanceOf[js.Any])
    if (qSortByNumeric != null) __obj.updateDynamic("qSortByNumeric")(qSortByNumeric.asInstanceOf[js.Any])
    if (qSortByState != null) __obj.updateDynamic("qSortByState")(qSortByState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISortCriteria]
  }
}

