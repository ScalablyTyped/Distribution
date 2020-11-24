package typings.regexpp.validatorMod

import typings.regexpp.validatorMod.RegExpValidator.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("regexpp/validator", "RegExpValidator")
@js.native
class RegExpValidator_ () extends js.Object {
  def this(options: Options) = this()
  
  def validateFlags(source: String): Unit = js.native
  def validateFlags(source: String, start: js.UndefOr[scala.Nothing], end: Double): Unit = js.native
  def validateFlags(source: String, start: Double): Unit = js.native
  def validateFlags(source: String, start: Double, end: Double): Unit = js.native
  
  def validateLiteral(source: String): Unit = js.native
  def validateLiteral(source: String, start: js.UndefOr[scala.Nothing], end: Double): Unit = js.native
  def validateLiteral(source: String, start: Double): Unit = js.native
  def validateLiteral(source: String, start: Double, end: Double): Unit = js.native
  
  def validatePattern(source: String): Unit = js.native
  def validatePattern(source: String, start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], uFlag: Boolean): Unit = js.native
  def validatePattern(source: String, start: js.UndefOr[scala.Nothing], end: Double): Unit = js.native
  def validatePattern(source: String, start: js.UndefOr[scala.Nothing], end: Double, uFlag: Boolean): Unit = js.native
  def validatePattern(source: String, start: Double): Unit = js.native
  def validatePattern(source: String, start: Double, end: js.UndefOr[scala.Nothing], uFlag: Boolean): Unit = js.native
  def validatePattern(source: String, start: Double, end: Double): Unit = js.native
  def validatePattern(source: String, start: Double, end: Double, uFlag: Boolean): Unit = js.native
}
