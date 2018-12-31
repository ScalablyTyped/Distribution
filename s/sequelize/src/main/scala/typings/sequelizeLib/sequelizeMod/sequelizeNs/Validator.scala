package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Validator
// ~~~~~~~~~~~
/**
  * Validator Interface
  */
@js.native
trait Validator
  extends validatorLib.ValidatorJSNs.ValidatorStatic {
  def contains(str: java.lang.String, element: js.Array[java.lang.String]): scala.Boolean = js.native
  def is(str: java.lang.String, pattern: java.lang.String, modifiers: java.lang.String): scala.Boolean = js.native
  def isIPv4(str: java.lang.String): scala.Boolean = js.native
  def isIPv6(str: java.lang.String): scala.Boolean = js.native
  def isUrl(str: java.lang.String): scala.Boolean = js.native
  def len(str: java.lang.String, min: scala.Double, max: scala.Double): scala.Boolean = js.native
  def max(str: java.lang.String, `val`: scala.Double): scala.Boolean = js.native
  def min(str: java.lang.String, `val`: scala.Double): scala.Boolean = js.native
  def not(str: java.lang.String, pattern: java.lang.String, modifiers: java.lang.String): scala.Boolean = js.native
  def notContains(str: java.lang.String, element: js.Array[java.lang.String]): scala.Boolean = js.native
  def notEmpty(str: java.lang.String): scala.Boolean = js.native
  def notIn(str: java.lang.String, values: js.Array[java.lang.String]): scala.Boolean = js.native
  def notRegex(str: java.lang.String, pattern: java.lang.String, modifiers: java.lang.String): scala.Boolean = js.native
  def regex(str: java.lang.String, pattern: java.lang.String, modifiers: java.lang.String): scala.Boolean = js.native
}

