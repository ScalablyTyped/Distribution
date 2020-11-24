package typings.reactMonacoEditor.anon

import org.scalablytyped.runtime.Instantiable4
import typings.monacoEditor.mod.IPosition
import typings.monacoEditor.mod.IRange
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRange extends Instantiable4[
      /* startLineNumber */ Double, 
      /* startColumn */ Double, 
      /* endLineNumber */ Double, 
      /* endColumn */ Double, 
      Range
    ] {
  
  /**
    * Test if the two ranges are intersecting. If the ranges are touching it returns true.
    */
  def areIntersecting(a: IRange, b: IRange): Boolean = js.native
  
  /**
    * Test if the two ranges are touching in any way.
    */
  def areIntersectingOrTouching(a: IRange, b: IRange): Boolean = js.native
  
  /**
    * Create a new empty range using this range's start position.
    */
  def collapseToStart(range: IRange): Range = js.native
  
  /**
    * A function that compares ranges, useful for sorting ranges
    * It will first compare ranges on the endPosition and then on the startPosition
    */
  def compareRangesUsingEnds(a: IRange, b: IRange): Double = js.native
  
  /**
    * A function that compares ranges, useful for sorting ranges
    * It will first compare ranges on the startPosition and then on the endPosition
    */
  def compareRangesUsingStarts(): Double = js.native
  def compareRangesUsingStarts(a: js.UndefOr[scala.Nothing], b: IRange): Double = js.native
  def compareRangesUsingStarts(a: Null, b: IRange): Double = js.native
  def compareRangesUsingStarts(a: IRange): Double = js.native
  def compareRangesUsingStarts(a: IRange, b: IRange): Double = js.native
  
  /**
    * Test if `position` is in `range`. If the position is at the edges, will return true.
    */
  def containsPosition(range: IRange, position: IPosition): Boolean = js.native
  
  /**
    * Test if `otherRange` is in `range`. If the ranges are equal, will return true.
    */
  def containsRange(range: IRange, otherRange: IRange): Boolean = js.native
  
  /**
    * Test if range `a` equals `b`.
    */
  def equalsRange(): Boolean = js.native
  def equalsRange(a: Null, b: IRange): Boolean = js.native
  def equalsRange(a: IRange): Boolean = js.native
  def equalsRange(a: IRange, b: IRange): Boolean = js.native
  
  def fromPositions(start: IPosition): Range = js.native
  def fromPositions(start: IPosition, end: IPosition): Range = js.native
  
  /**
    * Return the end position (which will be after or equal to the start position)
    */
  def getEndPosition(range: IRange): Position = js.native
  
  /**
    * Return the start position (which will be before or equal to the end position)
    */
  def getStartPosition(range: IRange): Position = js.native
  
  /**
    * A intersection of the two ranges.
    */
  def intersectRanges(a: IRange, b: IRange): Range | Null = js.native
  
  /**
    * Test if `range` is empty.
    */
  def isEmpty(range: IRange): Boolean = js.native
  
  /**
    * Test if `obj` is an `IRange`.
    */
  def isIRange(obj: js.Any): /* is monaco-editor.monaco-editor.IRange */ Boolean = js.native
  
  /**
    * Create a `Range` from an `IRange`.
    */
  def lift(): Null = js.native
  def lift(range: IRange): Range = js.native
  
  /**
    * A reunion of the two ranges.
    * The smallest position will be used as the start point, and the largest one as the end point.
    */
  def plusRange(a: IRange, b: IRange): Range = js.native
  
  /**
    * Test if the range spans multiple lines.
    */
  def spansMultipleLines(range: IRange): Boolean = js.native
  
  /**
    * Test if `otherRange` is strinctly in `range` (must start after, and end before). If the ranges are equal, will return false.
    */
  def strictContainsRange(range: IRange, otherRange: IRange): Boolean = js.native
}
