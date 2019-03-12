package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line strict-export-declare-modifiers
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait BaseNode[DataMap] extends js.Object {
  var data: immutableLib.immutableMod.Map[
    java.lang.String, 
    /* import warning: ImportType.apply Failed type conversion: DataMap[keyof DataMap] */ js.Any
  ] = js.native
  var key: java.lang.String = js.native
  var nodes: immutableLib.immutableMod.List[Node] = js.native
  var `object`: slateLib.slateLibStrings.document | slateLib.slateLibStrings.block | slateLib.slateLibStrings.`inline` | slateLib.slateLibStrings.text = js.native
  val text: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  def addMark(path: Path, offset: scala.Double, length: scala.Double, mark: Mark): Node = js.native
  def createDecoration(properties: Decoration): Decoration = js.native
  def createDecoration(properties: DecorationProperties): Decoration = js.native
  def createPoint(properties: Point): Point = js.native
  def createPoint(properties: PointProperties): Point = js.native
  def createRange(properties: Range): Range = js.native
  def createRange(properties: RangeProperties): Range = js.native
  def createSelection(properties: Selection): Selection = js.native
  def createSelection(properties: SelectionProperties): Selection = js.native
  def filterDescendants(iterator: js.Function1[/* node */ Node, scala.Boolean]): immutableLib.immutableMod.List[Node] = js.native
  def findDescendants(iterator: js.Function1[/* node */ Node, scala.Boolean]): Node | scala.Null = js.native
  def getActiveMarksAtRange(range: Range): immutableLib.immutableMod.Set[Mark] = js.native
  def getAncestors(path: Path): immutableLib.immutableMod.List[Node] | scala.Null = js.native
  def getBlocks(): immutableLib.immutableMod.List[Block] = js.native
  def getBlocksAsArray(): js.Array[Block] = js.native
  def getBlocksByType(`type`: java.lang.String): immutableLib.immutableMod.List[Block] = js.native
  def getBlocksByTypeAsArray(`type`: java.lang.String): js.Array[Block] = js.native
  def getChild(path: Path): Node | scala.Null = js.native
  def getClosest(path: Path, iterator: js.Function1[/* node */ Node, scala.Boolean]): Node | scala.Null = js.native
  def getClosestBlock(path: Path): Block | scala.Null = js.native
  def getClosestInline(path: Path): Inline | scala.Null = js.native
  def getClosestVoid(key: java.lang.String): Node | scala.Null = js.native
  def getClosestVoid(key: Path): Node | scala.Null = js.native
  def getCommonAncestor(a: Path, b: Path): Node = js.native
  def getDecorations(editor: Editor): immutableLib.immutableMod.List[Decoration] = js.native
  def getDepth(path: Path): scala.Double = js.native
  def getDepth(path: Path, startAt: scala.Double): scala.Double = js.native
  def getDescendant(path: Path): Node | scala.Null = js.native
  def getFirstText(): Text | scala.Null = js.native
  def getFragmentAtRange(range: Range): Document[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def getFurthest(path: Path, iterator: js.Function1[/* node */ Node, scala.Boolean]): Node | scala.Null = js.native
  def getFurthestAncestor(path: Path): Node | scala.Null = js.native
  def getFurthestBlock(path: Path): Block | scala.Null = js.native
  def getFurthestInline(path: Path): Inline | scala.Null = js.native
  def getFurthestOnlyChildAncestor(path: Path): Node | scala.Null = js.native
  def getInlines(): immutableLib.immutableMod.List[Inline] = js.native
  def getInlinesAsArray(): js.Array[Inline] = js.native
  def getInlinesAtRange(range: Range): immutableLib.immutableMod.List[Inline] = js.native
  def getInlinesAtRangeAsArray(range: Range): js.Array[Inline] = js.native
  def getInlinesByType(`type`: java.lang.String): immutableLib.immutableMod.List[Inline] = js.native
  def getInlinesByTypeAsArray(`type`: java.lang.String): js.Array[Inline] = js.native
  def getInsertMarksAtRange(range: Range): immutableLib.immutableMod.Set[Mark] = js.native
  def getKeysToPathsTable(): js.Object = js.native
  def getLastText(): Text | scala.Null = js.native
  def getLeafBlocksAtRange(range: Range): immutableLib.immutableMod.List[Block] = js.native
  def getLeafBlocksAtRangeAsArray(range: Range): js.Array[Block] = js.native
  def getMarks(): immutableLib.immutableMod.Set[Mark] = js.native
  def getMarksAsArray(): js.Array[Mark] = js.native
  def getMarksAtPosition(key: java.lang.String, offset: scala.Double): immutableLib.immutableMod.Set[Mark] = js.native
  def getMarksAtRange(range: Range): immutableLib.immutableMod.Set[Mark] = js.native
  def getMarksByType(`type`: java.lang.String): immutableLib.immutableMod.Set[Mark] = js.native
  def getMarksByTypeAsArray(`type`: java.lang.String): js.Array[Mark] = js.native
  def getNextBlock(key: java.lang.String): Block | scala.Null = js.native
  def getNextBlock(key: Node): Block | scala.Null = js.native
  def getNextNode(path: Path): Node | scala.Null = js.native
  def getNextSibling(path: Path): Node | scala.Null = js.native
  def getNextText(path: Path): Text | scala.Null = js.native
  def getNode(path: Path): Node | scala.Null = js.native
  def getOffset(key: java.lang.String): scala.Double = js.native
  def getOffsetAtRange(range: Range): scala.Double = js.native
  def getOrderedMarks(): immutableLib.immutableMod.OrderedSet[Mark] = js.native
  def getOrderedMarksAtRange(range: Range): immutableLib.immutableMod.OrderedSet[Mark] = js.native
  def getOrderedMarksBetweenPositions(
    startKey: java.lang.String,
    startOffset: scala.Double,
    endKey: java.lang.String,
    endOffset: scala.Double
  ): immutableLib.immutableMod.OrderedSet[Mark] = js.native
  def getOrderedMarksByType(`type`: java.lang.String): immutableLib.immutableMod.OrderedSet[Mark] = js.native
  def getParent(path: Path): Node | scala.Null = js.native
  def getPath(key: java.lang.String): Path = js.native
  def getPath(key: Path): Path = js.native
  def getPreviousBlock(key: java.lang.String): Block | scala.Null = js.native
  def getPreviousBlock(key: Node): Block | scala.Null = js.native
  def getPreviousNode(path: Path): Node | scala.Null = js.native
  def getPreviousSibling(path: Path): Node | scala.Null = js.native
  def getPreviousText(path: Path): Text | scala.Null = js.native
  def getRootBlocksAtRange(range: Range): immutableLib.immutableMod.List[Block] = js.native
  def getRootInlinesAtRange(range: Range): immutableLib.immutableMod.List[Block] = js.native
  def getSelectionIndexes(range: Range): slateLib.Anon_End | scala.Null = js.native
  def getSelectionIndexes(range: Range, isSelected: scala.Boolean): slateLib.Anon_End | scala.Null = js.native
  def getText(): java.lang.String = js.native
  def getTextAtOffset(offset: scala.Double): Text | scala.Null = js.native
  def getTextDirection(): java.lang.String | scala.Null = js.native
  def getTexts(): immutableLib.immutableMod.List[Text] = js.native
  def getTextsAsArray(): js.Array[Text] = js.native
  def getTextsAtRange(range: Range): immutableLib.immutableMod.List[Text] = js.native
  def getTextsAtRangeAsArray(range: Range): js.Array[Text] = js.native
  def getTextsBetweenPositionsAsArray(startKey: java.lang.String, endKey: java.lang.String): js.Array[Text] = js.native
  def hasBlockChildren(): scala.Boolean = js.native
  def hasChild(path: Path): scala.Boolean = js.native
  def hasDescendant(path: Path): scala.Boolean = js.native
  def hasInlineChildren(): scala.Boolean = js.native
  def hasNode(path: Path): scala.Boolean = js.native
  def hasVoidParent(path: Path, editor: Editor): scala.Boolean = js.native
  def insertNode(path: Path, node: Node): Node = js.native
  def insertText(
    path: Path,
    offset: scala.Double,
    text: java.lang.String,
    marks: immutableLib.immutableMod.Set[Mark]
  ): Node = js.native
  def isLeafBlock(): scala.Boolean = js.native
  def isLeafInline(): scala.Boolean = js.native
  def mapChildren(iterator: js.Function0[scala.Unit]): Node = js.native
  def mapDescendants(iterator: js.Function0[scala.Unit]): Node = js.native
  def mergeNode(path: Path): Node = js.native
  def moveNode(path: Path, newPath: Path): Node = js.native
  def moveNode(path: Path, newPath: Path, newIndex: scala.Double): Node = js.native
  def normalize(editor: Editor): js.Function0[scala.Unit] = js.native
  def refindPath(path: Path, key: java.lang.String): immutableLib.immutableMod.List[java.lang.String] | scala.Null = js.native
  def refinedNOde(path: Path, key: java.lang.String): Node | scala.Null = js.native
  def regenerateKey(): Node = js.native
  def removeMark(path: Path, offset: scala.Double, length: scala.Double, mark: Mark): Node = js.native
  def removeNode(path: Path): Node = js.native
  def removeText(path: Path, offset: scala.Double, text: java.lang.String): Node = js.native
  def replaceNode(path: Path, node: Node): Node = js.native
  def resolvePath(path: Path, index: scala.Double): immutableLib.immutableMod.List[java.lang.String] = js.native
  def resolvePoint(point: Point): Point = js.native
  def resolveRange(range: Range): Range = js.native
  def setMark(path: Path, offset: scala.Double, length: scala.Double, mark: Mark, properties: MarkProperties): Node = js.native
  def setNode(path: Path, properties: NodeProperties): Node = js.native
  def splitNode(path: Path, position: scala.Double, properties: NodeProperties): Node = js.native
  def validate(editor: Editor): stdLib.Error | scala.Unit = js.native
}

