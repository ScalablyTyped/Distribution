package typings.rangy

import typings.rangy.anon.End
import typings.std.Document
import typings.std.Node
import typings.std.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangyRange
  extends StObject
     with Range {
  
  def canSurroundContents(): Boolean = js.native
  
  def collapseAfter(node: Node): Any = js.native
  
  def collapseBefore(node: Node): Any = js.native
  
  def collapseToPoint(node: Node, offset: Double): Any = js.native
  
  def compareNode(node: Node): Any = js.native
  
  def containsNode(node: Node, partial: Boolean): Boolean = js.native
  
  def containsNodeContents(node: Node): Boolean = js.native
  
  def containsNodeText(node: Node): Boolean = js.native
  
  def containsRange(range: RangyRange): Boolean = js.native
  
  def equals(range: RangyRange): Boolean = js.native
  
  def getBookmark(): End = js.native
  def getBookmark(containerNode: Node): End = js.native
  
  def getDocument(): Document = js.native
  
  def getNodes(): js.Array[Node] = js.native
  def getNodes(nodeTypes: js.Array[Any]): js.Array[Node] = js.native
  def getNodes(nodeTypes: js.Array[Any], filter: js.Function1[/* node */ Node, Boolean]): js.Array[Node] = js.native
  def getNodes(nodeTypes: Unit, filter: js.Function1[/* node */ Node, Boolean]): js.Array[Node] = js.native
  
  def inspect(): String = js.native
  
  def intersection(range: RangyRange): RangyRange = js.native
  
  def intersectsOrTouchesRange(range: RangyRange): Boolean = js.native
  
  def intersectsRange(range: RangyRange): Boolean = js.native
  
  def isValid(): Boolean = js.native
  
  def moveToBookmark(bookmark: js.Object): Any = js.native
  
  def normalizeBoundaries(): Any = js.native
  
  def refresh(): Any = js.native
  
  def select(): Any = js.native
  
  def setStartAndEnd(startNode: Node, startOffset: Double): Any = js.native
  def setStartAndEnd(startNode: Node, startOffset: Double, endNode: Unit, endOffset: Double): Any = js.native
  def setStartAndEnd(startNode: Node, startOffset: Double, endNode: Node): Any = js.native
  def setStartAndEnd(startNode: Node, startOffset: Double, endNode: Node, endOffset: Double): Any = js.native
  def setStartAndEnd(startNode: Node, startOffset: Double, endOffset: Double): Any = js.native
  
  def splitBoundaries(): Any = js.native
  
  def toCharacterRange(containerNode: Node): End = js.native
  def toCharacterRange(containerNode: Node, opts: Any): End = js.native
  
  def toHtml(): String = js.native
  
  def union(range: RangyRange): RangyRange = js.native
}
