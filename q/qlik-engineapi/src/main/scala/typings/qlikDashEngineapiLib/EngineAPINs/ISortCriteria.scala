package typings
package qlikDashEngineapiLib.EngineAPINs

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

