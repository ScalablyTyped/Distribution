package typings.recast.linesMod

import typings.astTypes.namedTypesMod.namedTypes.Position
import typings.recast.anon.Column
import typings.recast.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recast/lib/lines", "Lines")
@js.native
class Lines protected () extends js.Object {
  def this(infos: js.Array[LineInfo]) = this()
  def this(infos: js.Array[LineInfo], sourceFileName: String) = this()
  
  def bootstrapCharAt(pos: Pos): String = js.native
  
  def bootstrapSlice(start: Pos, end: Pos): Lines = js.native
  
  def bootstrapSliceString(start: Pos, end: Pos): String = js.native
  def bootstrapSliceString(start: Pos, end: Pos, options: Options): String = js.native
  
  var cachedSourceMap: js.Any = js.native
  
  var cachedTabWidth: js.Any = js.native
  
  def charAt(pos: Pos): String = js.native
  
  def concat(args: (String | Lines)*): Lines = js.native
  
  def eachPos(callback: js.Function1[/* pos */ Pos, _]): Unit = js.native
  def eachPos(callback: js.Function1[/* pos */ Pos, _], startPos: js.UndefOr[scala.Nothing], skipSpaces: Boolean): Unit = js.native
  def eachPos(callback: js.Function1[/* pos */ Pos, _], startPos: Pos): Unit = js.native
  def eachPos(callback: js.Function1[/* pos */ Pos, _], startPos: Pos, skipSpaces: Boolean): Unit = js.native
  
  def firstPos(): Column = js.native
  
  def getIndentAt(line: Double): Double = js.native
  
  def getLineLength(line: Double): Double = js.native
  
  def getSourceMap(sourceMapName: String): js.Any = js.native
  def getSourceMap(sourceMapName: String, sourceRoot: String): js.Any = js.native
  
  def guessTabWidth(): Double = js.native
  
  def indent(by: Double): Lines = js.native
  
  def indentTail(by: Double): Lines = js.native
  
  var infos: js.Any = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isOnlyWhitespace(): Boolean = js.native
  
  def isPrecededOnlyByWhitespace(pos: Pos): Boolean = js.native
  
  def join(elements: js.Array[String | Lines]): Lines = js.native
  
  def lastPos(): Column = js.native
  
  val length: Double = js.native
  
  def lockIndentTail(): Lines = js.native
  
  var mappings: js.Any = js.native
  
  val name: String | Null = js.native
  
  def nextPos(pos: Pos): Boolean = js.native
  def nextPos(pos: Pos, skipSpaces: Boolean): Boolean = js.native
  
  def prevPos(pos: Pos): Boolean = js.native
  def prevPos(pos: Pos, skipSpaces: Boolean): Boolean = js.native
  
  def skipSpaces(pos: Pos): Position | Null = js.native
  def skipSpaces(pos: Pos, backward: js.UndefOr[scala.Nothing], modifyInPlace: Boolean): Position | Null = js.native
  def skipSpaces(pos: Pos, backward: Boolean): Position | Null = js.native
  def skipSpaces(pos: Pos, backward: Boolean, modifyInPlace: Boolean): Position | Null = js.native
  
  def slice(): Lines = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Pos): Lines = js.native
  def slice(start: Pos): Lines = js.native
  def slice(start: Pos, end: Pos): Lines = js.native
  
  def sliceString(): String = js.native
  def sliceString(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], options: Options): String = js.native
  def sliceString(start: js.UndefOr[scala.Nothing], end: Pos): String = js.native
  def sliceString(start: js.UndefOr[scala.Nothing], end: Pos, options: Options): String = js.native
  def sliceString(start: Pos): String = js.native
  def sliceString(start: Pos, end: js.UndefOr[scala.Nothing], options: Options): String = js.native
  def sliceString(start: Pos, end: Pos): String = js.native
  def sliceString(start: Pos, end: Pos, options: Options): String = js.native
  
  def startsWithComment(): Boolean = js.native
  
  def stripMargin(width: Double, skipFirstLine: Boolean): Lines = js.native
  
  def toString(options: Options): String = js.native
  
  def trim(): Lines = js.native
  
  def trimLeft(): Lines = js.native
  
  def trimRight(): Lines = js.native
}
