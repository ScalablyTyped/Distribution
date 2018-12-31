package typings
package qlikDashVisualizationextensionsLib.FieldAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQFieldValue extends js.Object {
  /**
    * Cell value index.
    */
  var qElemNumber: scala.Double = js.native
  /**
    * Optional. Frequency, if calculated by the Qlik engine.
    */
  var qFrequency: js.UndefOr[java.lang.String] = js.native
  /**
    * Optional. Cell numeric value, if cell is numeric.
    */
  var qNum: js.UndefOr[scala.Double] = js.native
  /**
    * Cell state.
    */
  var qState: js.Any = js.native
  /**
    * Cell value formatted as set up in properties.
    */
  var qText: java.lang.String = js.native
  /**
    * Selects a field value.
    * @param [toggle] - Optional. If true, toggle selected state.
    * @param [softlock] - Optional. If true, locked selections can be overridden.
    * @return - A promise.
    */
  def select(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def select(toggle: scala.Boolean): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def select(toggle: scala.Boolean, softlock: scala.Boolean): angularLib.angularMod.angularNs.IPromise[_] = js.native
}

