package typings.schemaUtils

import typings.schemaUtils.schemaUtilsStrings.Greaterthansign
import typings.schemaUtils.schemaUtilsStrings.GreaterthansignEqualssign
import typings.schemaUtils.schemaUtilsStrings.Lessthansign
import typings.schemaUtils.schemaUtilsStrings.LessthansignEqualssign
import typings.schemaUtils.schemaUtilsStrings.left
import typings.schemaUtils.schemaUtilsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationsUtilRangeMod {
  
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
  open class ^ ()
    extends StObject
       with Range
  @JSImport("schema-utils/declarations/util/Range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param {number} value
    * @param {boolean} logic is not logic applied
    * @param {boolean} exclusive is range exclusive
    * @returns {string}
    */
  /* static member */
  inline def formatLeft(value: Double, logic: Boolean, exclusive: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLeft")(value.asInstanceOf[js.Any], logic.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * @param {number} start left side value
    * @param {number} end right side value
    * @param {boolean} startExclusive is range exclusive from left side
    * @param {boolean} endExclusive is range exclusive from right side
    * @param {boolean} logic is not logic applied
    * @returns {string}
    */
  /* static member */
  inline def formatRange(start: Double, end: Double, startExclusive: Boolean, endExclusive: Boolean, logic: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRange")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], startExclusive.asInstanceOf[js.Any], endExclusive.asInstanceOf[js.Any], logic.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * @param {number} value
    * @param {boolean} logic is not logic applied
    * @param {boolean} exclusive is range exclusive
    * @returns {string}
    */
  /* static member */
  inline def formatRight(value: Double, logic: Boolean, exclusive: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRight")(value.asInstanceOf[js.Any], logic.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * @param {"left" | "right"} side
    * @param {boolean} exclusive
    * @returns {">" | ">=" | "<" | "<="}
    */
  /* static member */
  inline def getOperator(side: left | right, exclusive: Boolean): Greaterthansign | GreaterthansignEqualssign | Lessthansign | LessthansignEqualssign = (^.asInstanceOf[js.Dynamic].applyDynamic("getOperator")(side.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[Greaterthansign | GreaterthansignEqualssign | Lessthansign | LessthansignEqualssign]
  
  /**
    * @param {Array<RangeValue>} values
    * @param {boolean} logic is not logic applied
    * @return {RangeValue} computed value and it's exclusive flag
    */
  /* static member */
  inline def getRangeValue(values: js.Array[RangeValue], logic: Boolean): RangeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("getRangeValue")(values.asInstanceOf[js.Any], logic.asInstanceOf[js.Any])).asInstanceOf[RangeValue]
  
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
  
  type RangeValue = js.Tuple2[Double, Boolean]
  
  type RangeValueCallback = js.Function1[/* rangeValue */ RangeValue, Boolean]
}
