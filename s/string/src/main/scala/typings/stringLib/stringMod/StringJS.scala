package typings
package stringLib.stringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringJS extends js.Object {
  var length: scala.Double = js.native
  var s: java.lang.String = js.native
  def between(left: java.lang.String): StringJS = js.native
  def between(left: java.lang.String, right: java.lang.String): StringJS = js.native
  def camelize(): StringJS = js.native
  def capitalize(): StringJS = js.native
  def chompLeft(prefix: java.lang.String): StringJS = js.native
  def chompRight(suffix: java.lang.String): StringJS = js.native
  def collapseWhitespace(): StringJS = js.native
  def contains(ss: java.lang.String): scala.Boolean = js.native
  def count(substring: java.lang.String): scala.Double = js.native
  def dasherize(): StringJS = js.native
  def decodeHTMLEntities(): StringJS = js.native
  def endsWith(ss: java.lang.String): scala.Boolean = js.native
  def ensureLeft(prefix: java.lang.String): StringJS = js.native
  def ensureRight(suffix: java.lang.String): StringJS = js.native
  def escapeHTML(): StringJS = js.native
  def humanize(): StringJS = js.native
  def include(ss: java.lang.String): scala.Boolean = js.native
  def isAlpha(): scala.Boolean = js.native
  def isAlphaNumeric(): scala.Boolean = js.native
  def isEmpty(): scala.Boolean = js.native
  def isLower(): scala.Boolean = js.native
  def isNumeric(): scala.Boolean = js.native
  def isUpper(): scala.Boolean = js.native
  def latinise(): StringJS = js.native
  def left(n: scala.Double): StringJS = js.native
  def lines(): js.Array[java.lang.String] = js.native
  def pad(len: scala.Double): StringJS = js.native
  def pad(len: scala.Double, char: java.lang.String): StringJS = js.native
  def pad(len: scala.Double, char: scala.Double): StringJS = js.native
  def padLeft(len: scala.Double): StringJS = js.native
  def padLeft(len: scala.Double, char: java.lang.String): StringJS = js.native
  def padLeft(len: scala.Double, char: scala.Double): StringJS = js.native
  def padRight(len: scala.Double): StringJS = js.native
  def padRight(len: scala.Double, char: java.lang.String): StringJS = js.native
  def padRight(len: scala.Double, char: scala.Double): StringJS = js.native
  def parseCSV(): js.Array[java.lang.String] = js.native
  def parseCSV(delimiter: java.lang.String): js.Array[java.lang.String] = js.native
  def parseCSV(delimiter: java.lang.String, qualifier: java.lang.String): js.Array[java.lang.String] = js.native
  def parseCSV(delimiter: java.lang.String, qualifier: java.lang.String, escape: java.lang.String): js.Array[java.lang.String] = js.native
  def parseCSV(
    delimiter: java.lang.String,
    qualifier: java.lang.String,
    escape: java.lang.String,
    lineDelimiter: java.lang.String
  ): js.Array[java.lang.String] = js.native
  def repeat(n: scala.Double): StringJS = js.native
  def replaceAll(ss: java.lang.String, newStr: java.lang.String): StringJS = js.native
  def right(n: scala.Double): StringJS = js.native
  def setValue(string: js.Any): StringJS = js.native
  def slugify(): StringJS = js.native
  def startsWith(prefix: java.lang.String): scala.Boolean = js.native
  def strip(strings: java.lang.String*): StringJS = js.native
  def stripLeft(strings: java.lang.String*): StringJS = js.native
  def stripPunctuation(): StringJS = js.native
  def stripRight(strings: java.lang.String*): StringJS = js.native
  def stripTags(tags: java.lang.String*): StringJS = js.native
  def template(values: js.Object): StringJS = js.native
  def template(values: js.Object, open: java.lang.String): StringJS = js.native
  def template(values: js.Object, open: java.lang.String, close: java.lang.String): StringJS = js.native
  def times(n: scala.Double): StringJS = js.native
  def titleCase(): StringJS = js.native
  def toBoolean(): scala.Boolean = js.native
  def toCSV(): StringJS = js.native
  def toCSV(delimiter: java.lang.String): StringJS = js.native
  def toCSV(delimiter: java.lang.String, qualifier: java.lang.String): StringJS = js.native
  def toCSV(options: stringLib.Anon_Qualifier): StringJS = js.native
  def toFloat(): scala.Double = js.native
  def toFloat(precision: scala.Double): scala.Double = js.native
  def toInt(): scala.Double = js.native
  def toInteger(): scala.Double = js.native
  def trim(): StringJS = js.native
  def trimLeft(): StringJS = js.native
  def trimRight(): StringJS = js.native
  def truncate(length: scala.Double): StringJS = js.native
  def truncate(length: scala.Double, chars: java.lang.String): StringJS = js.native
  def underscore(): StringJS = js.native
  def unescapeHTML(): StringJS = js.native
  def wrapHTML(): StringJS = js.native
  def wrapHTML(element: java.lang.String): StringJS = js.native
  def wrapHTML(element: java.lang.String, attributes: js.Object): StringJS = js.native
}

