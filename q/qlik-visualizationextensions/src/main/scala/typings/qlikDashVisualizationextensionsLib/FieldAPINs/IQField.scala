package typings
package qlikDashVisualizationextensionsLib.FieldAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQField extends js.Object {
  /**
    * Optional. Object with number of values in different states.
    * Only after getData() call. Introduced in 2.1.
    */
  var qStateCounts: js.Any = js.native
  /**
    * Optional. Number of different values. Only after getData() call. Introduced in 2.1.
    */
  var rowCount: scala.Double = js.native
  /**
    * Field values. You need to call getData() method to make this available. Introduced in 2.1.
    */
  var rows: js.Array[IQFieldValue] = js.native
  /**
    * Clears a field selection.
    * @return - A promise.
    */
  def clear(): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Clears all fields except the selected one.
    * @param [softlock] - Optional. If true, locked selections can be overridden.
    * @return - A promise.
    */
  def clearOther(): angularLib.angularMod.IPromise[_] = js.native
  def clearOther(softlock: scala.Boolean): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Gets field data. The values are available as QFieldValue in array
    * field.rows and will updated when the selection state changes.
    * Notification OnData will be triggered after each update.
    * @param [options] - Optional. Properties:
    * Name | Type | Description
    * rows | Number | Number of rows to fetch. Default: 200.
    * frequencyMode | String | Can be one of:
    *       # V=Absolute
    *       # P=Percent
    *       # R=Relative
    *       # N=No frequency
    *      |        | Default: V.
    * @return - The field object.
    */
  def getData(): IQField = js.native
  def getData(options: scala.Boolean): IQField = js.native
  /**
    * Gets more data for your field. Notification OnData is triggered when complete.
    * @return - The field object.
    */
  def getMoreData(): IQField = js.native
  /**
    * Locks a field selection.
    * @return - A promise.
    */
  def lock(): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Selects field values using indexes.
    * @param Array - Array of index values to select
    * @param [toggle] - Optional. If true, toggle selected state.
    * @param [softlock] - Optional. If true, locked selections can be overridden.
    * @return - A promise.
    */
  def select(Array: js.Array[scala.Double]): angularLib.angularMod.IPromise[_] = js.native
  def select(Array: js.Array[scala.Double], toggle: scala.Boolean): angularLib.angularMod.IPromise[_] = js.native
  def select(Array: js.Array[scala.Double], toggle: scala.Boolean, softlock: scala.Boolean): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Selects all values in a field.
    * @param [softlock] - Optional. If true, locked selections can be overridden.
    * @return - A promise.
    */
  def selectAll(): angularLib.angularMod.IPromise[_] = js.native
  def selectAll(softlock: scala.Boolean): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Selects alternative values in a field.
    * @param [softlock] - Optional. If true, locked selections can be overridden.
    * @return - A promise.
    */
  def selectAlternative(): angularLib.angularMod.IPromise[_] = js.native
  def selectAlternative(softlock: scala.Boolean): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Selects excluded values in a field.
    * @param [softlock] - Optional. If true, locked selections can be overridden.
    * @return - A promise.
    */
  def selectExcluded(): angularLib.angularMod.IPromise[_] = js.native
  def selectExcluded(softlock: scala.Boolean): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Selects matching field values.
    * @param match - Match string.
    * @param [softlock] - Optional. If true, locked selections can be overridden.
    * @return - A promise.
    */
  def selectMatch(`match`: java.lang.String): angularLib.angularMod.IPromise[_] = js.native
  def selectMatch(`match`: java.lang.String, softlock: scala.Boolean): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Selects possible values in a field.
    * @param [softlock] - Optional. If true, locked selections can be overridden.
    * @return - A promise.
    */
  def selectPossible(): angularLib.angularMod.IPromise[_] = js.native
  def selectPossible(softlock: scala.Boolean): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Selects specific values in a field.
    * @param array - Array of qFieldValues to select. A simplified syntax with
    *                         strings or numbers also works since version 1.1.
    * For a numeric field you need to provide the numeric value.
    * @param [toggle] - Optional. If true, toggle selected state.
    * @param [softlock] - Optional. If true, locked selections can be overridden.
    * @return - A promise.
    */
  def selectValues(array: js.Array[IQFieldValue]): angularLib.angularMod.IPromise[_] = js.native
  def selectValues(array: js.Array[IQFieldValue], toggle: scala.Boolean): angularLib.angularMod.IPromise[_] = js.native
  def selectValues(array: js.Array[IQFieldValue], toggle: scala.Boolean, softlock: scala.Boolean): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Toggles a field selection.
    * @param match - Match string.
    * @param [softlock] - Optional. If true, locked selections can be overridden.
    * @return - A promise.
    */
  def toggleSelect(`match`: java.lang.String): angularLib.angularMod.IPromise[_] = js.native
  def toggleSelect(`match`: java.lang.String, softlock: scala.Boolean): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Unlocks field selections.
    * @return - A promise.
    */
  def unlock(): angularLib.angularMod.IPromise[_] = js.native
}

