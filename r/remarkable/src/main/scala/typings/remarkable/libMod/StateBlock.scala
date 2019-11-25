package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.list
import typings.remarkable.remarkableStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateBlock extends js.Object {
  var bMarks: js.Array[Double]
  /** required block content indent */
  var blkIndent: Double
  /** Indent of the current dd block, -1 if there isn't any */
  var ddIndent: Double
  var eMarks: js.Array[Double]
  var env: Env
  var level: Double
  /** line index in src */
  var line: Double
  /** lines count */
  var lineMax: Double
  var options: Options
  /** If `list`, block parser stops on two newlines */
  var parentType: root | list
  /** Shortcuts to simplify nested calls */
  var parser: ParserBlock
  var result: String
  var src: String
  var tShift: js.Array[Double]
  /** loose/tight mode for lists */
  var tight: Boolean
  var tokens: js.Array[BlockContentToken]
  def getLines(begin: Double, end: Double, indent: Double, keepLastLF: Boolean): String
  def isEmpty(line: Double): Boolean
  def skipChars(pos: Double, code: Double): Double
  def skipEmptyLines(from: Double): Double
  def skipSpaces(pos: Double): Double
}

object StateBlock {
  @scala.inline
  def apply(
    bMarks: js.Array[Double],
    blkIndent: Double,
    ddIndent: Double,
    eMarks: js.Array[Double],
    env: Env,
    getLines: (Double, Double, Double, Boolean) => String,
    isEmpty: Double => Boolean,
    level: Double,
    line: Double,
    lineMax: Double,
    options: Options,
    parentType: root | list,
    parser: ParserBlock,
    result: String,
    skipChars: (Double, Double) => Double,
    skipEmptyLines: Double => Double,
    skipSpaces: Double => Double,
    src: String,
    tShift: js.Array[Double],
    tight: Boolean,
    tokens: js.Array[BlockContentToken]
  ): StateBlock = {
    val __obj = js.Dynamic.literal(bMarks = bMarks.asInstanceOf[js.Any], blkIndent = blkIndent.asInstanceOf[js.Any], ddIndent = ddIndent.asInstanceOf[js.Any], eMarks = eMarks.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], getLines = js.Any.fromFunction4(getLines), isEmpty = js.Any.fromFunction1(isEmpty), level = level.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineMax = lineMax.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], skipChars = js.Any.fromFunction2(skipChars), skipEmptyLines = js.Any.fromFunction1(skipEmptyLines), skipSpaces = js.Any.fromFunction1(skipSpaces), src = src.asInstanceOf[js.Any], tShift = tShift.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StateBlock]
  }
}

