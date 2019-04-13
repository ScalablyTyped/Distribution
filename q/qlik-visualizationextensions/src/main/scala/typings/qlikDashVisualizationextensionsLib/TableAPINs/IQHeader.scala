package typings
package qlikDashVisualizationextensionsLib.TableAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQHeader extends js.Object {
  /**
    * Column number.
    */
  var col: scala.Double = js.native
  /**
    * Optional. Error code for this column.
    * Only if column has an error. Introduced in version 2.2.
    */
  var errorCode: js.UndefOr[scala.Double] = js.native
  /**
    * Error message for this column.
    * Only if column has an error. Introduced in version 2.2.
    */
  var errorMessage: scala.Double = js.native
  /**
    * Optional. Field object with methods to manipulate the underlying field.
    * Only used for dimensions.
    */
  var field: js.UndefOr[js.Any] = js.native
  /**
    * True indicates if this is the first column for sorting.
    */
  var isOrderedBy: scala.Boolean = js.native
  /**
    * Optional. Number of different values. Only used for dimensions.
    */
  var qCardinal: js.UndefOr[scala.Double] = js.native
  /**
    * Column title.
    */
  var qFallbackTitle: java.lang.String = js.native
  /**
    * Optional. Maximum value. Only used for measures.
    */
  var qMax: js.UndefOr[scala.Double] = js.native
  /**
    * Optional. Minimum value. Only used for measures.
    */
  var qMin: js.UndefOr[scala.Double] = js.native
  /**
    * True indicates if the sort order is reversed for this column.
    */
  var qReverseSort: scala.Boolean = js.native
  /**
    * Can be:
    *       # A: ascending
    *       # D: descending
    */
  var qSortIndicator: java.lang.String = js.native
  /**
    * Optional. Object with number of values in different states.
    * Only used for dimensions.
    */
  var qStateCounts: js.UndefOr[js.Any] = js.native
  /**
    * Sets this column to be the first in the sort order.
    */
  def orderBy(): scala.Unit = js.native
  /**
    * Reverses the sort order for this column.
    */
  def reverseOrder(): scala.Unit = js.native
  /**
    * Select a range in this measure.
    * @param min - Sets the minimum value of the range.
    * @param max - Sets the maximum value of the range.
    * @param [inclMin] - Optional. Set to true to include minimum value.
    * @param [inclMax] - Optional. Set to true to include maximum value.
    * @return - A promise.
    */
  def selectRange(min: scala.Double, max: scala.Double): angularLib.angularMod.IPromise[_] = js.native
  def selectRange(min: scala.Double, max: scala.Double, inclMin: scala.Boolean): angularLib.angularMod.IPromise[_] = js.native
  def selectRange(min: scala.Double, max: scala.Double, inclMin: scala.Boolean, inclMax: scala.Boolean): angularLib.angularMod.IPromise[_] = js.native
}

