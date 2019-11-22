package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Validator Interface
  */
@js.native
trait Validator extends ValidatorJSType {
  def contains(str: String, element: js.Array[String]): Boolean = js.native
  def is(str: String, pattern: String, modifiers: String): Boolean = js.native
  def isIPv4(str: String): Boolean = js.native
  def isIPv6(str: String): Boolean = js.native
  def isUrl(str: String): Boolean = js.native
  def len(str: String, min: Double, max: Double): Boolean = js.native
  def max(str: String, `val`: Double): Boolean = js.native
  def min(str: String, `val`: Double): Boolean = js.native
  def not(str: String, pattern: String, modifiers: String): Boolean = js.native
  def notContains(str: String, element: js.Array[String]): Boolean = js.native
  def notEmpty(str: String): Boolean = js.native
  def notIn(str: String, values: js.Array[String]): Boolean = js.native
  def notRegex(str: String, pattern: String, modifiers: String): Boolean = js.native
  def regex(str: String, pattern: String, modifiers: String): Boolean = js.native
}

