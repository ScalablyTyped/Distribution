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

object StateBlock {
  @scala.inline
  def apply(
    bMarks: js.Array[scala.Double],
    blkIndent: scala.Double,
    ddIndent: scala.Double,
    eMarks: js.Array[scala.Double],
    env: Env,
    getLines: js.Function4[scala.Double, scala.Double, scala.Double, scala.Boolean, java.lang.String],
    isEmpty: js.Function1[scala.Double, scala.Boolean],
    level: scala.Double,
    line: scala.Double,
    lineMax: scala.Double,
    options: Options,
    parentType: remarkableLib.remarkableLibStrings.root | remarkableLib.remarkableLibStrings.list,
    parser: remarkableLib.libMod.ParserBlock,
    result: java.lang.String,
    skipChars: js.Function2[scala.Double, scala.Double, scala.Double],
    skipEmptyLines: js.Function1[scala.Double, scala.Double],
    skipSpaces: js.Function1[scala.Double, scala.Double],
    src: java.lang.String,
    tShift: js.Array[scala.Double],
    tight: scala.Boolean,
    tokens: js.Array[ContentToken]
  ): StateBlock = {
    val __obj = js.Dynamic.literal(bMarks = bMarks, blkIndent = blkIndent, ddIndent = ddIndent, eMarks = eMarks, env = env, getLines = getLines, isEmpty = isEmpty, level = level, line = line, lineMax = lineMax, options = options, parentType = parentType.asInstanceOf[js.Any], parser = parser, result = result, skipChars = skipChars, skipEmptyLines = skipEmptyLines, skipSpaces = skipSpaces, src = src, tShift = tShift, tight = tight, tokens = tokens)
  
    __obj.asInstanceOf[StateBlock]
  }
}

