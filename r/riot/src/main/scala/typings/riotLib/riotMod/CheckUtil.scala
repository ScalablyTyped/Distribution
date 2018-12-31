package typings
package riotLib.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckUtil extends js.Object {
  /**
    * Check if provided value is an array
    * @param value - reference to check
    * @returns True if provided value is an array
    */
  def isArray(value: js.Any): scala.Boolean
  /**
    * Check if provided value is empty. Different from falsy, because 0 or false are not considered to be blank
    * @param value - value to check
    * @returns True if provided value is undefined, null or empty string
    */
  def isBlank(value: js.Any): scala.Boolean
  /**
    * Check if provided value is name of boolean attribute
    * @param value - name to check
    * @returns True if value is name of boolean attribute
    */
  def isBoolAttr(value: java.lang.String): scala.Boolean
  /**
    * Check if provided value is a function
    * @param value - reference to check
    * @returns True if provided value is a function
    */
  def isFunction(value: js.Any): scala.Boolean
  /**
    * Check if provided value is an object (null excluded)
    * @param value - reference to check
    * @returns True if provided value is an object
    */
  def isObject(value: js.Any): scala.Boolean
  /**
    * Check if provided string is a reserved name for Riot tag instances
    * @param value - name to check
    * @returns True if provided string is a reserved name
    */
  def isReservedName(value: java.lang.String): scala.Boolean
  /**
    * Check if provided value is a string
    * @param value - reference to check
    * @returns True if provided value is a string
    */
  def isString(value: js.Any): /* is string */ scala.Boolean
  /**
    * Check if provided value is undefined
    * @param value - reference to check
    * @returns True if provided value is undefined
    */
  def isUndefined(value: js.Any): scala.Boolean
  /**
    * Check whether object's property could be overridden
    * @param obj - source object
    * @param key - object property
    * @returns True if value for specified key can be overridden
    */
  def isWritable(obj: js.Any, key: java.lang.String): scala.Boolean
}

