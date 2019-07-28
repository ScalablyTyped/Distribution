package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.List
import typings.immutable.immutableMod.Map
import typings.immutable.immutableMod.OrderedSet
import typings.immutable.immutableMod.Set
import typings.slate.Anon_End
import typings.slate.slateStrings.`inline`
import typings.slate.slateStrings.block
import typings.slate.slateStrings.document
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line strict-export-declare-modifiers
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait BaseNode[DataMap] extends js.Object {
  var data: Map[
    String, 
    /* import warning: ImportType.apply Failed type conversion: DataMap[keyof DataMap] */ js.Any
  ] = js.native
  var key: String = js.native
  var nodes: List[Node] = js.native
  var `object`: document | block | `inline` | typings.slate.slateStrings.text = js.native
  val text: String = js.native
  var `type`: String = js.native
  def addMark(path: Path, offset: Double, length: Double, mark: Mark): Node = js.native
  def createDecoration(properties: Decoration): Decoration = js.native
  def createDecoration(properties: DecorationProperties): Decoration = js.native
  def createPoint(properties: Point): Point = js.native
  def createPoint(properties: PointProperties): Point = js.native
  def createRange(properties: Range): Range = js.native
  def createRange(properties: RangeProperties): Range = js.native
  def createSelection(properties: Selection): Selection = js.native
  def createSelection(properties: SelectionProperties): Selection = js.native
  def filterDescendants(iterator: js.Function1[/* node */ Node, Boolean]): List[Node] = js.native
  def findDescendant(iterator: js.Function1[/* node */ Node, Boolean]): Node | Null = js.native
  def getActiveMarksAtRange(range: Range): Set[Mark] = js.native
  def getAncestors(path: Path): List[Node] | Null = js.native
  def getBlocks(): List[Block] = js.native
  def getBlocksAsArray(): js.Array[Block] = js.native
  def getBlocksByType(`type`: String): List[Block] = js.native
  def getBlocksByTypeAsArray(`type`: String): js.Array[Block] = js.native
  def getChild(path: Path): Node | Null = js.native
  def getClosest(path: Path, iterator: js.Function1[/* node */ Node, Boolean]): Node | Null = js.native
  def getClosestBlock(path: Path): Block | Null = js.native
  def getClosestInline(path: Path): Inline | Null = js.native
  def getClosestVoid(key: String): Node | Null = js.native
  def getClosestVoid(key: Path): Node | Null = js.native
  def getCommonAncestor(a: Path, b: Path): Node = js.native
  def getDecorations(editor: Editor): List[Decoration] = js.native
  def getDepth(path: Path): Double = js.native
  def getDepth(path: Path, startAt: Double): Double = js.native
  def getDescendant(path: Path): Node | Null = js.native
  def getFirstText(): Text | Null = js.native
  def getFragmentAtRange(range: Range): Document[StringDictionary[_]] = js.native
  def getFurthest(path: Path, iterator: js.Function1[/* node */ Node, Boolean]): Node | Null = js.native
  def getFurthestAncestor(path: Path): Node | Null = js.native
  def getFurthestBlock(path: Path): Block | Null = js.native
  def getFurthestInline(path: Path): Inline | Null = js.native
  def getFurthestOnlyChildAncestor(path: Path): Node | Null = js.native
  def getInlines(): List[Inline] = js.native
  def getInlinesAsArray(): js.Array[Inline] = js.native
  def getInlinesAtRange(range: Range): List[Inline] = js.native
  def getInlinesAtRangeAsArray(range: Range): js.Array[Inline] = js.native
  def getInlinesByType(`type`: String): List[Inline] = js.native
  def getInlinesByTypeAsArray(`type`: String): js.Array[Inline] = js.native
  def getInsertMarksAtRange(range: Range): Set[Mark] = js.native
  def getKeysToPathsTable(): js.Object = js.native
  def getLastText(): Text | Null = js.native
  def getLeafBlocksAtRange(range: Range): List[Block] = js.native
  def getLeafBlocksAtRangeAsArray(range: Range): js.Array[Block] = js.native
  def getMarks(): Set[Mark] = js.native
  def getMarksAsArray(): js.Array[Mark] = js.native
  def getMarksAtPosition(key: String, offset: Double): Set[Mark] = js.native
  def getMarksAtRange(range: Range): Set[Mark] = js.native
  def getMarksByType(`type`: String): Set[Mark] = js.native
  def getMarksByTypeAsArray(`type`: String): js.Array[Mark] = js.native
  def getNextBlock(key: String): Block | Null = js.native
  def getNextBlock(key: Node): Block | Null = js.native
  def getNextNode(path: Path): Node | Null = js.native
  def getNextSibling(path: Path): Node | Null = js.native
  def getNextText(path: Path): Text | Null = js.native
  def getNode(path: Path): Node | Null = js.native
  def getOffset(key: String): Double = js.native
  def getOffsetAtRange(range: Range): Double = js.native
  def getOrderedMarks(): OrderedSet[Mark] = js.native
  def getOrderedMarksAtRange(range: Range): OrderedSet[Mark] = js.native
  def getOrderedMarksBetweenPositions(startKey: String, startOffset: Double, endKey: String, endOffset: Double): OrderedSet[Mark] = js.native
  def getOrderedMarksByType(`type`: String): OrderedSet[Mark] = js.native
  def getParent(path: Path): Node | Null = js.native
  def getPath(key: String): Path = js.native
  def getPath(key: Path): Path = js.native
  def getPreviousBlock(key: String): Block | Null = js.native
  def getPreviousBlock(key: Node): Block | Null = js.native
  def getPreviousNode(path: Path): Node | Null = js.native
  def getPreviousSibling(path: Path): Node | Null = js.native
  def getPreviousText(path: Path): Text | Null = js.native
  def getRootBlocksAtRange(range: Range): List[Block] = js.native
  def getRootInlinesAtRange(range: Range): List[Block] = js.native
  def getSelectionIndexes(range: Range): Anon_End | Null = js.native
  def getSelectionIndexes(range: Range, isSelected: Boolean): Anon_End | Null = js.native
  def getText(): String = js.native
  def getTextAtOffset(offset: Double): Text | Null = js.native
  def getTextDirection(): String | Null = js.native
  def getTexts(): List[Text] = js.native
  def getTextsAsArray(): js.Array[Text] = js.native
  def getTextsAtRange(range: Range): List[Text] = js.native
  def getTextsAtRangeAsArray(range: Range): js.Array[Text] = js.native
  def getTextsBetweenPositionsAsArray(startKey: String, endKey: String): js.Array[Text] = js.native
  def hasBlockChildren(): Boolean = js.native
  def hasChild(path: Path): Boolean = js.native
  def hasDescendant(path: Path): Boolean = js.native
  def hasInlineChildren(): Boolean = js.native
  def hasNode(path: Path): Boolean = js.native
  def hasVoidParent(path: Path, editor: Editor): Boolean = js.native
  def insertNode(path: Path, node: Node): Node = js.native
  def insertText(path: Path, offset: Double, text: String, marks: Set[Mark]): Node = js.native
  def isLeafBlock(): Boolean = js.native
  def isLeafInline(): Boolean = js.native
  def mapChildren(iterator: js.Function0[Unit]): Node = js.native
  def mapDescendants(iterator: js.Function0[Unit]): Node = js.native
  def mergeNode(path: Path): Node = js.native
  def moveNode(path: Path, newPath: Path): Node = js.native
  def moveNode(path: Path, newPath: Path, newIndex: Double): Node = js.native
  def normalize(editor: Editor): js.Function0[Unit] = js.native
  def refindPath(path: Path, key: String): List[String] | Null = js.native
  def refinedNOde(path: Path, key: String): Node | Null = js.native
  def regenerateKey(): Node = js.native
  def removeMark(path: Path, offset: Double, length: Double, mark: Mark): Node = js.native
  def removeNode(path: Path): Node = js.native
  def removeText(path: Path, offset: Double, text: String): Node = js.native
  def replaceNode(path: Path, node: Node): Node = js.native
  def resolvePath(path: Path, index: Double): List[String] = js.native
  def resolvePoint(point: Point): Point = js.native
  def resolveRange(range: Range): Range = js.native
  def setMark(path: Path, offset: Double, length: Double, mark: Mark, properties: MarkProperties): Node = js.native
  def setNode(path: Path, properties: NodeProperties): Node = js.native
  def splitNode(path: Path, position: Double, properties: NodeProperties): Node = js.native
  def validate(editor: Editor): Error | Unit = js.native
}

