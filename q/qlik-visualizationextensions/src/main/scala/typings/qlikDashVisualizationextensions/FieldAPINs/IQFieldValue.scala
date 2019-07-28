package typings.qlikDashVisualizationextensions.FieldAPINs

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQFieldValue extends js.Object {
  /**
    * Cell value index.
    */
  var qElemNumber: Double = js.native
  /**
    * Optional. Frequency, if calculated by the Qlik engine.
    */
  var qFrequency: js.UndefOr[String] = js.native
  /**
    * Optional. Cell numeric value, if cell is numeric.
    */
  var qNum: js.UndefOr[Double] = js.native
  /**
    * Cell state.
    */
  var qState: js.Any = js.native
  /**
    * Cell value formatted as set up in properties.
    */
  var qText: String = js.native
  /**
    * Selects a field value.
    * @param [toggle] - Optional. If true, toggle selected state.
    * @param [softlock] - Optional. If true, locked selections can be overridden.
    * @return - A promise.
    */
  def select(): IPromise[_] = js.native
  def select(toggle: Boolean): IPromise[_] = js.native
  def select(toggle: Boolean, softlock: Boolean): IPromise[_] = js.native
}

