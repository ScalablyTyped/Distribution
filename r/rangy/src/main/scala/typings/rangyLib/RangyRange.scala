package typings
package rangyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangyRange
  extends stdLib.Range {
  def canSurroundContents(): scala.Boolean = js.native
  def collapseAfter(node: stdLib.Node): js.Any = js.native
  def collapseBefore(node: stdLib.Node): js.Any = js.native
  def collapseToPoint(node: stdLib.Node, offset: scala.Double): js.Any = js.native
  def compareNode(node: stdLib.Node): js.Any = js.native
  def containsNode(node: stdLib.Node, partial: scala.Boolean): scala.Boolean = js.native
  def containsNodeContents(node: stdLib.Node): scala.Boolean = js.native
  def containsNodeText(node: stdLib.Node): scala.Boolean = js.native
  def containsRange(range: RangyRange): scala.Boolean = js.native
  def equals(range: RangyRange): scala.Boolean = js.native
  def getBookmark(): Anon_End = js.native
  def getBookmark(containerNode: stdLib.Node): Anon_End = js.native
  def getDocument(): stdLib.Document = js.native
  def getNodes(): js.Array[stdLib.Node] = js.native
  def getNodes(nodeTypes: js.Array[_]): js.Array[stdLib.Node] = js.native
  def getNodes(nodeTypes: js.Array[_], filter: js.Function1[/* node */ stdLib.Node, scala.Boolean]): js.Array[stdLib.Node] = js.native
  def inspect(): java.lang.String = js.native
  def intersection(range: RangyRange): RangyRange = js.native
  def intersectsOrTouchesRange(range: RangyRange): scala.Boolean = js.native
  def intersectsRange(range: RangyRange): scala.Boolean = js.native
  def isValid(): scala.Boolean = js.native
  def moveToBookmark(bookmark: js.Object): js.Any = js.native
  def normalizeBoundaries(): js.Any = js.native
  def refresh(): js.Any = js.native
  def select(): js.Any = js.native
  def setStartAndEnd(startNode: stdLib.Node, startOffset: scala.Double): js.Any = js.native
  def setStartAndEnd(startNode: stdLib.Node, startOffset: scala.Double, endNode: stdLib.Node): js.Any = js.native
  def setStartAndEnd(startNode: stdLib.Node, startOffset: scala.Double, endNode: stdLib.Node, endOffset: scala.Double): js.Any = js.native
  def setStartAndEnd(startNode: stdLib.Node, startOffset: scala.Double, endOffset: scala.Double): js.Any = js.native
  def splitBoundaries(): js.Any = js.native
  def toCharacterRange(containerNode: stdLib.Node): Anon_End = js.native
  def toCharacterRange(containerNode: stdLib.Node, opts: js.Any): Anon_End = js.native
  def toHtml(): java.lang.String = js.native
  def union(range: RangyRange): RangyRange = js.native
}

