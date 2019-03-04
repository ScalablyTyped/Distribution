package typings
package riotLib.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiscUtil extends js.Object {
  /**
    * Check whether an array contains an item
    * @param arr - target array
    * @param item - item to test
    * @returns True if array contains item
    */
  def contains(arr: js.Array[_], item: js.Any): scala.Boolean
  /**
    * Helper function to set an immutable property
    * @param el - object where the new property will be set
    * @param key - object key where the new property will be stored
    * @param value - value of the new property
    * @param options - set the property overriding the default options
    * @returns The initial object
    */
  def defineProperty(el: js.Any, key: java.lang.String, value: js.Any, options: js.Any): js.Any
  /**
    * Specialized function for looping over array-like collections
    * @param list - collection of items
    * @param fn - callback applied to each item
    */
  def each(list: js.Any, fn: js.Function2[/* item */ js.Any, /* index */ scala.Double, scala.Unit]): scala.Unit
  /**
    * Extend any object with other properties
    * @param args - objects to merge
    * @returns The resulting extended object
    */
  def extend(args: js.Any*): js.Any
  /**
    * Check if string starts with specified value
    * @param str - source string
    * @param value - test string
    * @returns True if string starts with provided value
    */
  def startsWith(str: java.lang.String, value: java.lang.String): scala.Boolean
  /**
    * Convert a string containing dashes to camel case
    * @param str - input string
    * @returns my-string -> myString
    */
  def toCamel(str: java.lang.String): java.lang.String
}

object MiscUtil {
  @scala.inline
  def apply(
    contains: js.Function2[js.Array[_], js.Any, scala.Boolean],
    defineProperty: js.Function4[js.Any, java.lang.String, js.Any, js.Any, js.Any],
    each: js.Function2[
      js.Any, 
      js.Function2[/* item */ js.Any, /* index */ scala.Double, scala.Unit], 
      scala.Unit
    ],
    extend: js.Function1[/* repeated */ js.Any, js.Any],
    startsWith: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    toCamel: js.Function1[java.lang.String, java.lang.String]
  ): MiscUtil = {
    val __obj = js.Dynamic.literal(contains = contains, defineProperty = defineProperty, each = each, extend = extend, startsWith = startsWith, toCamel = toCamel)
  
    __obj.asInstanceOf[MiscUtil]
  }
}

