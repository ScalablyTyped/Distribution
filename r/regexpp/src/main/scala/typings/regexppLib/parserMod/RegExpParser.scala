package typings
package regexppLib.parserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("regexpp/parser", "RegExpParser")
@js.native
class RegExpParser () extends js.Object {
  def this(options: regexppLib.parserMod.RegExpParserNs.Options) = this()
  def parseFlags(source: java.lang.String): regexppLib.astMod.Flags = js.native
  def parseFlags(source: java.lang.String, start: scala.Double): regexppLib.astMod.Flags = js.native
  def parseFlags(source: java.lang.String, start: scala.Double, end: scala.Double): regexppLib.astMod.Flags = js.native
  def parseLiteral(source: java.lang.String): regexppLib.astMod.RegExpLiteral = js.native
  def parseLiteral(source: java.lang.String, start: scala.Double): regexppLib.astMod.RegExpLiteral = js.native
  def parseLiteral(source: java.lang.String, start: scala.Double, end: scala.Double): regexppLib.astMod.RegExpLiteral = js.native
  def parsePattern(source: java.lang.String): regexppLib.astMod.Pattern = js.native
  def parsePattern(source: java.lang.String, start: scala.Double): regexppLib.astMod.Pattern = js.native
  def parsePattern(source: java.lang.String, start: scala.Double, end: scala.Double): regexppLib.astMod.Pattern = js.native
  def parsePattern(source: java.lang.String, start: scala.Double, end: scala.Double, uFlag: scala.Boolean): regexppLib.astMod.Pattern = js.native
}

