package typings.schemaUtils.rangeMod

import typings.schemaUtils.schemaUtilsStrings.Greaterthansign
import typings.schemaUtils.schemaUtilsStrings.GreaterthansignEqualssign
import typings.schemaUtils.schemaUtilsStrings.Lessthansign
import typings.schemaUtils.schemaUtilsStrings.LessthansignEqualssign
import typings.schemaUtils.schemaUtilsStrings.left
import typings.schemaUtils.schemaUtilsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @typedef {[number, boolean]} RangeValue
  */
/**
  * @callback RangeValueCallback
  * @param {RangeValue} rangeValue
  * @returns {boolean}
  */
@JSImport("schema-utils/declarations/util/Range", JSImport.Namespace)
@js.native
class ^ () extends Range
@JSImport("schema-utils/declarations/util/Range", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * @param {number} value
    * @param {boolean} logic is not logic applied
    * @param {boolean} exclusive is range exclusive
    * @returns {string}
    */
  def formatLeft(value: Double, logic: Boolean, exclusive: Boolean): String = js.native
  
  /**
    * @param {number} start left side value
    * @param {number} end right side value
    * @param {boolean} startExclusive is range exclusive from left side
    * @param {boolean} endExclusive is range exclusive from right side
    * @param {boolean} logic is not logic applied
    * @returns {string}
    */
  def formatRange(start: Double, end: Double, startExclusive: Boolean, endExclusive: Boolean, logic: Boolean): String = js.native
  
  /**
    * @param {number} value
    * @param {boolean} logic is not logic applied
    * @param {boolean} exclusive is range exclusive
    * @returns {string}
    */
  def formatRight(value: Double, logic: Boolean, exclusive: Boolean): String = js.native
  
  /**
    * @param {"left" | "right"} side
    * @param {boolean} exclusive
    * @returns {">" | ">=" | "<" | "<="}
    */
  @JSName("getOperator")
  def getOperator_left(side: left, exclusive: Boolean): Greaterthansign | GreaterthansignEqualssign | Lessthansign | LessthansignEqualssign = js.native
  @JSName("getOperator")
  def getOperator_right(side: right, exclusive: Boolean): Greaterthansign | GreaterthansignEqualssign | Lessthansign | LessthansignEqualssign = js.native
  
  /**
    * @param {Array<RangeValue>} values
    * @param {boolean} logic is not logic applied
    * @return {RangeValue} computed value and it's exclusive flag
    */
  def getRangeValue(values: js.Array[js.Tuple2[Double, Boolean]], logic: Boolean): js.Tuple2[Double, Boolean] = js.native
}
