package typings.schemaUtils

import typings.schemaUtils.schemaUtilsStrings.Greaterthansign
import typings.schemaUtils.schemaUtilsStrings.GreaterthansignEqualssign
import typings.schemaUtils.schemaUtilsStrings.Lessthansign
import typings.schemaUtils.schemaUtilsStrings.LessthansignEqualssign
import typings.schemaUtils.schemaUtilsStrings.left
import typings.schemaUtils.schemaUtilsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
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
  
  /**
    * @param {number} value
    * @param {boolean} logic is not logic applied
    * @param {boolean} exclusive is range exclusive
    * @returns {string}
    */
  /* static member */
  @JSImport("schema-utils/declarations/util/Range", "formatLeft")
  @js.native
  def formatLeft(value: Double, logic: Boolean, exclusive: Boolean): String = js.native
  
  /**
    * @param {number} start left side value
    * @param {number} end right side value
    * @param {boolean} startExclusive is range exclusive from left side
    * @param {boolean} endExclusive is range exclusive from right side
    * @param {boolean} logic is not logic applied
    * @returns {string}
    */
  /* static member */
  @JSImport("schema-utils/declarations/util/Range", "formatRange")
  @js.native
  def formatRange(start: Double, end: Double, startExclusive: Boolean, endExclusive: Boolean, logic: Boolean): String = js.native
  
  /**
    * @param {number} value
    * @param {boolean} logic is not logic applied
    * @param {boolean} exclusive is range exclusive
    * @returns {string}
    */
  /* static member */
  @JSImport("schema-utils/declarations/util/Range", "formatRight")
  @js.native
  def formatRight(value: Double, logic: Boolean, exclusive: Boolean): String = js.native
  
  /**
    * @param {"left" | "right"} side
    * @param {boolean} exclusive
    * @returns {">" | ">=" | "<" | "<="}
    */
  /* static member */
  @JSImport("schema-utils/declarations/util/Range", "getOperator")
  @js.native
  def getOperator_left(side: left, exclusive: Boolean): Greaterthansign | GreaterthansignEqualssign | Lessthansign | LessthansignEqualssign = js.native
  @JSImport("schema-utils/declarations/util/Range", "getOperator")
  @js.native
  def getOperator_right(side: right, exclusive: Boolean): Greaterthansign | GreaterthansignEqualssign | Lessthansign | LessthansignEqualssign = js.native
  
  /**
    * @param {Array<RangeValue>} values
    * @param {boolean} logic is not logic applied
    * @return {RangeValue} computed value and it's exclusive flag
    */
  /* static member */
  @JSImport("schema-utils/declarations/util/Range", "getRangeValue")
  @js.native
  def getRangeValue(values: js.Array[js.Tuple2[Double, Boolean]], logic: Boolean): js.Tuple2[Double, Boolean] = js.native
  
  /**
    * @typedef {[number, boolean]} RangeValue
    */
  /**
    * @callback RangeValueCallback
    * @param {RangeValue} rangeValue
    * @returns {boolean}
    */
  @js.native
  trait Range extends StObject {
    
    /** @type {Array<RangeValue>} */
    var _left: js.Array[js.Tuple2[Double, Boolean]] = js.native
    
    /** @type {Array<RangeValue>} */
    var _right: js.Array[js.Tuple2[Double, Boolean]] = js.native
    
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
  
  type RangeValue = js.Tuple2[Double, Boolean]
  
  type RangeValueCallback = js.Function1[/* rangeValue */ js.Tuple2[Double, Boolean], Boolean]
}
