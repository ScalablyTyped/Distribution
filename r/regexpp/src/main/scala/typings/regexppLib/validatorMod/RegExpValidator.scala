package typings
package regexppLib.validatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("regexpp/validator", "RegExpValidator")
@js.native
class RegExpValidator () extends js.Object {
  def this(options: regexppLib.validatorMod.RegExpValidatorNs.Options) = this()
  def validateFlags(source: java.lang.String): scala.Unit = js.native
  def validateFlags(source: java.lang.String, start: scala.Double): scala.Unit = js.native
  def validateFlags(source: java.lang.String, start: scala.Double, end: scala.Double): scala.Unit = js.native
  def validateLiteral(source: java.lang.String): scala.Unit = js.native
  def validateLiteral(source: java.lang.String, start: scala.Double): scala.Unit = js.native
  def validateLiteral(source: java.lang.String, start: scala.Double, end: scala.Double): scala.Unit = js.native
  def validatePattern(source: java.lang.String): scala.Unit = js.native
  def validatePattern(source: java.lang.String, start: scala.Double): scala.Unit = js.native
  def validatePattern(source: java.lang.String, start: scala.Double, end: scala.Double): scala.Unit = js.native
  def validatePattern(source: java.lang.String, start: scala.Double, end: scala.Double, uFlag: scala.Boolean): scala.Unit = js.native
}

