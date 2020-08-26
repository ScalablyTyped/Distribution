package typings.rangy

import typings.rangy.anon.End
import typings.std.Document
import typings.std.Node
import typings.std.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangyRange extends Range {
  def canSurroundContents(): Boolean = js.native
  def collapseAfter(node: Node): js.Any = js.native
  def collapseBefore(node: Node): js.Any = js.native
  def collapseToPoint(node: Node, offset: Double): js.Any = js.native
  def compareNode(node: Node): js.Any = js.native
  def containsNode(node: Node, partial: Boolean): Boolean = js.native
  def containsNodeContents(node: Node): Boolean = js.native
  def containsNodeText(node: Node): Boolean = js.native
  def containsRange(range: RangyRange): Boolean = js.native
  def equals(range: RangyRange): Boolean = js.native
  def getBookmark(): End = js.native
  def getBookmark(containerNode: Node): End = js.native
  def getDocument(): Document = js.native
  def getNodes(): js.Array[Node] = js.native
  def getNodes(nodeTypes: js.UndefOr[scala.Nothing], filter: js.Function1[/* node */ Node, Boolean]): js.Array[Node] = js.native
  def getNodes(nodeTypes: js.Array[_]): js.Array[Node] = js.native
  def getNodes(nodeTypes: js.Array[_], filter: js.Function1[/* node */ Node, Boolean]): js.Array[Node] = js.native
  def inspect(): String = js.native
  def intersection(range: RangyRange): RangyRange = js.native
  def intersectsOrTouchesRange(range: RangyRange): Boolean = js.native
  def intersectsRange(range: RangyRange): Boolean = js.native
  def isValid(): Boolean = js.native
  def moveToBookmark(bookmark: js.Object): js.Any = js.native
  def normalizeBoundaries(): js.Any = js.native
  def refresh(): js.Any = js.native
  def select(): js.Any = js.native
  def setStartAndEnd(startNode: Node, startOffset: Double): js.Any = js.native
  def setStartAndEnd(startNode: Node, startOffset: Double, endNode: js.UndefOr[scala.Nothing], endOffset: Double): js.Any = js.native
  def setStartAndEnd(startNode: Node, startOffset: Double, endNode: Node): js.Any = js.native
  def setStartAndEnd(startNode: Node, startOffset: Double, endNode: Node, endOffset: Double): js.Any = js.native
  def setStartAndEnd(startNode: Node, startOffset: Double, endOffset: Double): js.Any = js.native
  def splitBoundaries(): js.Any = js.native
  def toCharacterRange(containerNode: Node): End = js.native
  def toCharacterRange(containerNode: Node, opts: js.Any): End = js.native
  def toHtml(): String = js.native
  def union(range: RangyRange): RangyRange = js.native
}

