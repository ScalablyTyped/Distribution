package typings.schemaDashUtils.declarationsUtilRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @typedef {[number, boolean]} RangeValue
  */
/**
  * @callback RangeValueCallback
  * @param {RangeValue} rangeValue
  * @returns {boolean}
  */
@js.native
trait Range extends js.Object {
  /** @type {Array<RangeValue>} */
  var _left: js.Array[RangeValue] = js.native
  /** @type {Array<RangeValue>} */
  var _right: js.Array[RangeValue] = js.native
  /**
    * @param {boolean} logic is not logic applied
    * @return {string} "smart" range string representation
    */
  def format(): String = js.native
  def format(logic: Boolean): String = js.native
  /**
    * @param {number} value
    * @param {boolean=} exclusive
    */
  def left(value: Double): Unit = js.native
  def left(value: Double, exclusive: Boolean): Unit = js.native
  /**
    * @param {number} value
    * @param {boolean=} exclusive
    */
  def right(value: Double): Unit = js.native
  def right(value: Double, exclusive: Boolean): Unit = js.native
}

