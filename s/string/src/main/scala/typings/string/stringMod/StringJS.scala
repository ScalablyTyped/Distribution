package typings.string.stringMod

import typings.string.Anon_Delimiter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringJS extends js.Object {
  var length: Double = js.native
  var s: String = js.native
  def between(left: String): StringJS = js.native
  def between(left: String, right: String): StringJS = js.native
  def camelize(): StringJS = js.native
  def capitalize(): StringJS = js.native
  def chompLeft(prefix: String): StringJS = js.native
  def chompRight(suffix: String): StringJS = js.native
  def collapseWhitespace(): StringJS = js.native
  def contains(ss: String): Boolean = js.native
  def count(substring: String): Double = js.native
  def dasherize(): StringJS = js.native
  def decodeHTMLEntities(): StringJS = js.native
  def endsWith(ss: String): Boolean = js.native
  def ensureLeft(prefix: String): StringJS = js.native
  def ensureRight(suffix: String): StringJS = js.native
  def escapeHTML(): StringJS = js.native
  def humanize(): StringJS = js.native
  def include(ss: String): Boolean = js.native
  def isAlpha(): Boolean = js.native
  def isAlphaNumeric(): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def isLower(): Boolean = js.native
  def isNumeric(): Boolean = js.native
  def isUpper(): Boolean = js.native
  def latinise(): StringJS = js.native
  def left(n: Double): StringJS = js.native
  def lines(): js.Array[String] = js.native
  def pad(len: Double): StringJS = js.native
  def pad(len: Double, char: String): StringJS = js.native
  def pad(len: Double, char: Double): StringJS = js.native
  def padLeft(len: Double): StringJS = js.native
  def padLeft(len: Double, char: String): StringJS = js.native
  def padLeft(len: Double, char: Double): StringJS = js.native
  def padRight(len: Double): StringJS = js.native
  def padRight(len: Double, char: String): StringJS = js.native
  def padRight(len: Double, char: Double): StringJS = js.native
  def parseCSV(): js.Array[String] = js.native
  def parseCSV(delimiter: String): js.Array[String] = js.native
  def parseCSV(delimiter: String, qualifier: String): js.Array[String] = js.native
  def parseCSV(delimiter: String, qualifier: String, escape: String): js.Array[String] = js.native
  def parseCSV(delimiter: String, qualifier: String, escape: String, lineDelimiter: String): js.Array[String] = js.native
  def repeat(n: Double): StringJS = js.native
  def replaceAll(ss: String, newStr: String): StringJS = js.native
  def right(n: Double): StringJS = js.native
  def setValue(string: js.Any): StringJS = js.native
  def slugify(): StringJS = js.native
  def startsWith(prefix: String): Boolean = js.native
  def strip(strings: String*): StringJS = js.native
  def stripLeft(strings: String*): StringJS = js.native
  def stripPunctuation(): StringJS = js.native
  def stripRight(strings: String*): StringJS = js.native
  def stripTags(tags: String*): StringJS = js.native
  def template(values: js.Object): StringJS = js.native
  def template(values: js.Object, open: String): StringJS = js.native
  def template(values: js.Object, open: String, close: String): StringJS = js.native
  def times(n: Double): StringJS = js.native
  def titleCase(): StringJS = js.native
  def toBoolean(): Boolean = js.native
  def toCSV(): StringJS = js.native
  def toCSV(delimiter: String): StringJS = js.native
  def toCSV(delimiter: String, qualifier: String): StringJS = js.native
  def toCSV(options: Anon_Delimiter): StringJS = js.native
  def toFloat(): Double = js.native
  def toFloat(precision: Double): Double = js.native
  def toInt(): Double = js.native
  def toInteger(): Double = js.native
  def trim(): StringJS = js.native
  def trimLeft(): StringJS = js.native
  def trimRight(): StringJS = js.native
  def truncate(length: Double): StringJS = js.native
  def truncate(length: Double, chars: String): StringJS = js.native
  def underscore(): StringJS = js.native
  def unescapeHTML(): StringJS = js.native
  def wrapHTML(): StringJS = js.native
  def wrapHTML(element: String): StringJS = js.native
  def wrapHTML(element: String, attributes: js.Object): StringJS = js.native
}

