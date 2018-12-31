package typings
package remarkableLib.libMod.RemarkableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateBlock extends js.Object {
  var bMarks: js.Array[scala.Double]
  /** required block content indent */
  var blkIndent: scala.Double
  /** Indent of the current dd block, -1 if there isn't any */
  var ddIndent: scala.Double
  var eMarks: js.Array[scala.Double]
  var env: Env
  var level: scala.Double
  /** line index in src */
  var line: scala.Double
  /** lines count */
  var lineMax: scala.Double
  var options: Options
  /** If `list`, block parser stops on two newlines */
  var parentType: remarkableLib.remarkableLibStrings.root | remarkableLib.remarkableLibStrings.list
  /** Shortcuts to simplify nested calls */
  var parser: remarkableLib.libMod.ParserBlock
  var result: java.lang.String
  var src: java.lang.String
  var tShift: js.Array[scala.Double]
  /** loose/tight mode for lists */
  var tight: scala.Boolean
  var tokens: js.Array[ContentToken]
  def getLines(begin: scala.Double, end: scala.Double, indent: scala.Double, keepLastLF: scala.Boolean): java.lang.String
  def isEmpty(line: scala.Double): scala.Boolean
  def skipChars(pos: scala.Double, code: scala.Double): scala.Double
  def skipEmptyLines(from: scala.Double): scala.Double
  def skipSpaces(pos: scala.Double): scala.Double
}

