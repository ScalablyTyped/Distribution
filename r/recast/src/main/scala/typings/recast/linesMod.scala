package typings.recast

import typings.astTypes.namedTypesMod.namedTypes.Position
import typings.recast.anon.Column
import typings.recast.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linesMod {
  
  @JSImport("recast/lib/lines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("recast/lib/lines", "Lines")
  @js.native
  class Lines protected () extends StObject {
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
    
    def eachPos(callback: js.Function1[/* pos */ Pos, js.Any]): Unit = js.native
    def eachPos(callback: js.Function1[/* pos */ Pos, js.Any], startPos: Unit, skipSpaces: Boolean): Unit = js.native
    def eachPos(callback: js.Function1[/* pos */ Pos, js.Any], startPos: Pos): Unit = js.native
    def eachPos(callback: js.Function1[/* pos */ Pos, js.Any], startPos: Pos, skipSpaces: Boolean): Unit = js.native
    
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
    def skipSpaces(pos: Pos, backward: Boolean): Position | Null = js.native
    def skipSpaces(pos: Pos, backward: Boolean, modifyInPlace: Boolean): Position | Null = js.native
    def skipSpaces(pos: Pos, backward: Unit, modifyInPlace: Boolean): Position | Null = js.native
    
    def slice(): Lines = js.native
    def slice(start: Unit, end: Pos): Lines = js.native
    def slice(start: Pos): Lines = js.native
    def slice(start: Pos, end: Pos): Lines = js.native
    
    def sliceString(): String = js.native
    def sliceString(start: Unit, end: Unit, options: Options): String = js.native
    def sliceString(start: Unit, end: Pos): String = js.native
    def sliceString(start: Unit, end: Pos, options: Options): String = js.native
    def sliceString(start: Pos): String = js.native
    def sliceString(start: Pos, end: Unit, options: Options): String = js.native
    def sliceString(start: Pos, end: Pos): String = js.native
    def sliceString(start: Pos, end: Pos, options: Options): String = js.native
    
    def startsWithComment(): Boolean = js.native
    
    def stripMargin(width: Double, skipFirstLine: Boolean): Lines = js.native
    
    def toString(options: Options): String = js.native
    
    def trim(): Lines = js.native
    
    def trimLeft(): Lines = js.native
    
    def trimRight(): Lines = js.native
  }
  
  @scala.inline
  def concat(elements: js.Any): Lines = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(elements.asInstanceOf[js.Any]).asInstanceOf[Lines]
  
  @scala.inline
  def countSpaces(spaces: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countSpaces")(spaces.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def countSpaces(spaces: js.Any, tabWidth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countSpaces")(spaces.asInstanceOf[js.Any], tabWidth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def fromString(string: String): Lines = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(string.asInstanceOf[js.Any]).asInstanceOf[Lines]
  @scala.inline
  def fromString(string: String, options: Options): Lines = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Lines]
  @scala.inline
  def fromString(string: Lines): Lines = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(string.asInstanceOf[js.Any]).asInstanceOf[Lines]
  @scala.inline
  def fromString(string: Lines, options: Options): Lines = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Lines]
  
  trait LineInfo extends StObject {
    
    val indent: Double
    
    val line: String
    
    val locked: Boolean
    
    val sliceEnd: Double
    
    val sliceStart: Double
  }
  object LineInfo {
    
    @scala.inline
    def apply(indent: Double, line: String, locked: Boolean, sliceEnd: Double, sliceStart: Double): LineInfo = {
      val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], sliceEnd = sliceEnd.asInstanceOf[js.Any], sliceStart = sliceStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineInfo]
    }
    
    @scala.inline
    implicit class LineInfoMutableBuilder[Self <: LineInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliceEnd(value: Double): Self = StObject.set(x, "sliceEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliceStart(value: Double): Self = StObject.set(x, "sliceStart", value.asInstanceOf[js.Any])
    }
  }
  
  type Pos = Position
}
