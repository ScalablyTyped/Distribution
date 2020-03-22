package typings.slate.mod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.Immutable.List
import typings.immutable.Immutable.OrderedSet
import typings.immutable.Immutable.Set_
import typings.slate.AnonEnd
import typings.slate.IterableOptionsonlyLeaves
import typings.slate.IterableOptionsonlyTypesA
import typings.slate.slateStrings.`inline`
import typings.slate.slateStrings.block
import typings.slate.slateStrings.document
import typings.std.Error
import typings.std.Iterable
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line strict-export-declare-modifiers
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : Immutable.Record(object) * / any */ @js.native
trait BaseNode extends js.Object {
  var data: Data = js.native
  var key: String = js.native
  var nodes: List[Node] = js.native
  var `object`: document | block | `inline` | typings.slate.slateStrings.text = js.native
  val text: String = js.native
  var `type`: String = js.native
  def addMark(path: Path, mark: Mark): Node = js.native
  def ancestors(path: Path): Iterable[js.Tuple2[Node, List[Double]]] = js.native
  /**
    * Assertion variants.
    */
  def assertChild(path: Path): Node = js.native
  def assertDepth(path: Path): Double = js.native
  def assertDepth(path: Path, startAt: Double): Double = js.native
  def assertDescendant(path: Path): Node = js.native
  def assertNode(path: Path): Node = js.native
  def assertParent(path: Path): Node = js.native
  def assertPath(key: Path): List[Double] = js.native
  def blocks(): Iterable[js.Tuple2[Block, List[Double]]] = js.native
  def blocks(options: IterableOptionsonlyLeaves): Iterable[js.Tuple2[Block, List[Double]]] = js.native
  def createAnnotation(properties: Annotation): Annotation = js.native
  def createAnnotation(properties: AnnotationJSON): Annotation = js.native
  def createAnnotation(properties: AnnotationProperties): Annotation = js.native
  def createDecoration(properties: Decoration): Decoration = js.native
  def createDecoration(properties: DecorationJSON): Decoration = js.native
  def createDecoration(properties: DecorationProperties): Decoration = js.native
  def createIterable(): Iterable[js.Tuple2[Node, List[Double]]] = js.native
  def createIterable(options: IterableOptions): Iterable[js.Tuple2[Node, List[Double]]] = js.native
  def createPoint(properties: Point): Point = js.native
  def createPoint(properties: PointJSON): Point = js.native
  def createPoint(properties: PointProperties): Point = js.native
  def createRange(properties: RangeType): Range = js.native
  def createRange(properties: RangeTypeJSON): Range = js.native
  def createRange(properties: RangeTypeProperties): Range = js.native
  def createSelection(properties: Range): Selection = js.native
  def createSelection(properties: Selection): Selection = js.native
  def createSelection(properties: SelectionJSON): Selection = js.native
  def createSelection(properties: SelectionProperties): Selection = js.native
  def descendants(): Iterable[js.Tuple2[Node, List[Double]]] = js.native
  def descendants(options: IterableOptions): Iterable[js.Tuple2[Node, List[Double]]] = js.native
  def filterDescendants(): List[Node] = js.native
  def filterDescendants(predicate: js.Function2[/* node */ Node, /* path */ List[Double], Boolean]): List[Node] = js.native
  def findDescendant(): Node | Null = js.native
  def findDescendant(predicate: js.Function2[/* node */ Node, /* path */ List[Double], Boolean]): Node | Null = js.native
  def findDescendantAndPath(iterator: js.Function3[/* node */ Node, /* path */ List[Double], /* nodes */ List[Node], Boolean]): (js.Tuple2[Node, List[Double]]) | Null = js.native
  def findDescendantAndPath(
    iterator: js.Function3[/* node */ Node, /* path */ List[Double], /* nodes */ List[Node], Boolean],
    path: List[Double]
  ): (js.Tuple2[Node, List[Double]]) | Null = js.native
  def findDescendantAndPath(
    iterator: js.Function3[/* node */ Node, /* path */ List[Double], /* nodes */ List[Node], Boolean],
    path: List[Double],
    findLast: Boolean
  ): (js.Tuple2[Node, List[Double]]) | Null = js.native
  def findFirstDescendantAndPath(
    iterator: js.Function3[/* node */ Node, /* path */ List[Double], /* nodes */ List[Node], Boolean],
    pathToThisNode: List[Double]
  ): (js.Tuple2[Node, List[Double]]) | Null = js.native
  def findLastDescendantAndPath(
    iterator: js.Function3[/* node */ Node, /* path */ List[Double], /* nodes */ List[Node], Boolean],
    pathToThisNode: List[Double]
  ): (js.Tuple2[Node, List[Double]]) | Null = js.native
  def forEachDescendant(): Unit = js.native
  def forEachDescendant(predicate: js.Function2[/* node */ Node, /* path */ List[Double], Boolean]): Unit = js.native
  def forEachDescendantWithPath(iterator: js.Function3[/* node */ Node, /* path */ List[Double], /* nodes */ List[Node], Boolean]): Boolean = js.native
  def forEachDescendantWithPath(
    iterator: js.Function3[/* node */ Node, /* path */ List[Double], /* nodes */ List[Node], Boolean],
    path: List[Double]
  ): Boolean = js.native
  def forEachDescendantWithPath(
    iterator: js.Function3[/* node */ Node, /* path */ List[Double], /* nodes */ List[Node], Boolean],
    path: List[Double],
    findLast: Boolean
  ): Boolean = js.native
  def getActiveMarksAtRange(range: RangeType): Set_[Mark] = js.native
  def getActiveMarksAtRange(range: RangeTypeJSON): Set_[Mark] = js.native
  def getActiveMarksAtRange(range: RangeTypeProperties): Set_[Mark] = js.native
  def getAncestors(path: Path): List[Node] | Null = js.native
  def getBlocks(): List[Block] = js.native
  def getBlocksAsArray(): js.Array[Block] = js.native
  def getBlocksAtRange(range: Range): List[Block] = js.native
  def getBlocksAtRange(range: RangeJSON): List[Block] = js.native
  /**
    * Deprecated.
    */
  def getBlocksAtRange(range: RangeProperties): List[Block] = js.native
  def getBlocksAtRangeAsArray(range: Range): js.Array[Block] = js.native
  def getBlocksAtRangeAsArray(range: RangeJSON): js.Array[Block] = js.native
  def getBlocksAtRangeAsArray(range: RangeProperties): js.Array[Block] = js.native
  def getBlocksByType(`type`: String): List[Block] = js.native
  def getBlocksByTypeAsArray(`type`: String): js.Array[Block] = js.native
  def getChild(path: Path): Node | Null = js.native
  def getClosest(path: Path, predicate: js.Function2[/* node */ Node, /* path */ List[Double], Boolean]): Node | Null = js.native
  def getClosestBlock(path: Path): Block | Null = js.native
  def getClosestInline(path: Path): Inline | Null = js.native
  def getClosestVoid(path: Path, editor: Editor): Node | Null = js.native
  def getCommonAncestor(a: Path, b: Path): Node | Null = js.native
  def getDecorations(editor: Editor): List[Decoration] = js.native
  def getDepth(path: Path): Double | Null = js.native
  def getDepth(path: Path, startAt: Double): Double | Null = js.native
  def getDescendant(path: Path): Node | Null = js.native
  def getDescendantsAtRange(range: RangeType): List[Node] = js.native
  def getDescendantsAtRange(range: RangeTypeJSON): List[Node] = js.native
  def getDescendantsAtRange(range: RangeTypeProperties): List[Node] = js.native
  def getFirstText(): Text | Null = js.native
  def getFragmentAtRange(range: RangeType): Document = js.native
  def getFragmentAtRange(range: RangeTypeJSON): Document = js.native
  def getFragmentAtRange(range: RangeTypeProperties): Document = js.native
  def getFurthest(path: Path): Node | Null = js.native
  def getFurthest(path: Path, predicate: js.Function2[/* node */ Node, /* path */ List[Double], Boolean]): Node | Null = js.native
  def getFurthestAncestor(path: Path): Node | Null = js.native
  def getFurthestBlock(path: Path): Block | Null = js.native
  def getFurthestChild(path: Path): Node | Null = js.native
  def getFurthestInline(path: Path): Inline | Null = js.native
  def getFurthestOnlyChildAncestor(path: Path): Node | Null = js.native
  def getInlines(): List[Inline] = js.native
  def getInlinesAsArray(): js.Array[Inline] = js.native
  def getInlinesAtRange(range: Range): List[Inline] = js.native
  def getInlinesAtRange(range: RangeJSON): List[Inline] = js.native
  def getInlinesAtRange(range: RangeProperties): List[Inline] = js.native
  def getInlinesAtRangeAsArray(range: Range): js.Array[Inline] = js.native
  def getInlinesAtRangeAsArray(range: RangeJSON): js.Array[Inline] = js.native
  def getInlinesAtRangeAsArray(range: RangeProperties): js.Array[Inline] = js.native
  def getInlinesByType(`type`: String): List[Inline] = js.native
  def getInlinesByTypeAsArray(`type`: String): js.Array[Inline] = js.native
  def getInsertMarksAtPoint(point: Point): Set_[Mark] = js.native
  def getInsertMarksAtPoint(point: PointJSON): Set_[Mark] = js.native
  def getInsertMarksAtPoint(point: PointProperties): Set_[Mark] = js.native
  def getInsertMarksAtRange(range: Range): Set_[Mark] = js.native
  def getInsertMarksAtRange(range: RangeJSON): Set_[Mark] = js.native
  def getInsertMarksAtRange(range: RangeProperties): Set_[Mark] = js.native
  def getKeysToPathsTable(): StringDictionary[js.Array[Double]] = js.native
  def getLastText(): Text | Null = js.native
  def getLeafBlocksAtRange(range: RangeType): List[Block] = js.native
  def getLeafBlocksAtRange(range: RangeTypeJSON): List[Block] = js.native
  def getLeafBlocksAtRange(range: RangeTypeProperties): List[Block] = js.native
  def getLeafBlocksAtRangeAsArray(range: Range): js.Array[Block] = js.native
  def getLeafBlocksAtRangeAsArray(range: RangeJSON): js.Array[Block] = js.native
  def getLeafBlocksAtRangeAsArray(range: RangeProperties): js.Array[Block] = js.native
  def getLeafBlocksBetweenPathPositionsAsArray(startPath: List[Double], endPath: List[Double]): js.Array[Block] = js.native
  def getLeafInlinesAtRange(range: RangeType): List[Inline] = js.native
  def getLeafInlinesAtRange(range: RangeTypeJSON): List[Inline] = js.native
  def getLeafInlinesAtRange(range: RangeTypeProperties): List[Inline] = js.native
  def getLeafInlinesAtRangeAsArray(range: Range): js.Array[Inline] = js.native
  def getLeafInlinesAtRangeAsArray(range: RangeJSON): js.Array[Inline] = js.native
  def getLeafInlinesAtRangeAsArray(range: RangeProperties): js.Array[Inline] = js.native
  def getMarks(): OrderedSet[Mark] = js.native
  def getMarksAsArray(): js.Array[Mark] = js.native
  def getMarksAtPosition(path: Path, offset: Double): OrderedSet[Mark] = js.native
  def getMarksAtRange(range: RangeType): OrderedSet[Mark] = js.native
  def getMarksAtRange(range: RangeTypeJSON): OrderedSet[Mark] = js.native
  def getMarksAtRange(range: RangeTypeProperties): OrderedSet[Mark] = js.native
  def getMarksByType(`type`: String): OrderedSet[Mark] = js.native
  def getNextBlock(path: Path): Block | Null = js.native
  def getNextDeepMatchingNodeAndPath(path: List[Double]): Null | (js.Tuple2[Node, List[Double]]) = js.native
  def getNextDeepMatchingNodeAndPath(path: List[Double], iterator: js.Function0[Boolean]): Null | (js.Tuple2[Node, List[Double]]) = js.native
  def getNextMatchingNodeAndPath(path: List[Double]): (js.Tuple2[Node, List[Double]]) | Null = js.native
  def getNextMatchingNodeAndPath(path: List[Double], iterator: js.Function1[/* node */ Node, Boolean]): (js.Tuple2[Node, List[Double]]) | Null = js.native
  def getNextNode(path: Path): Node | Null = js.native
  def getNextSibling(path: Path): Node | Null = js.native
  def getNextText(path: Path): Text | Null = js.native
  def getNextTextAndPath(path: Path): Text | Null = js.native
  def getNode(path: Path): Node | Null = js.native
  def getNodesAtRange(range: Range): Boolean = js.native
  def getNodesAtRange(range: RangeJSON): Boolean = js.native
  def getNodesAtRange(range: RangeProperties): Boolean = js.native
  def getNodesToPathsMap(): Map[Node, List[Double]] = js.native
  def getOffset(path: Path): Double = js.native
  def getOffsetAtRange(range: RangeType): Double = js.native
  def getOffsetAtRange(range: RangeTypeJSON): Double = js.native
  def getOffsetAtRange(range: RangeTypeProperties): Double = js.native
  def getOrderedMarks(): OrderedSet[Mark] = js.native
  def getOrderedMarksAtRange(range: Range): OrderedSet[Mark] = js.native
  def getOrderedMarksAtRange(range: RangeJSON): OrderedSet[Mark] = js.native
  def getOrderedMarksAtRange(range: RangeProperties): OrderedSet[Mark] = js.native
  def getOrderedMarksBetweenPositions(startPath: Path, startOffset: Double, endPath: Path, endOffset: Double): OrderedSet[Mark] = js.native
  def getOrderedMarksByType(`type`: String): OrderedSet[Mark] = js.native
  def getOrderedMarksByTypeAsArray(`type`: String): js.Array[Mark] = js.native
  def getParent(path: Path): Node | Null = js.native
  def getPath(key: String): List[Double] | Null = js.native
  def getPath(key: List[Double]): List[Double] | Null = js.native
  def getPath(key: Node): List[Double] | Null = js.native
  def getPreviousBlock(path: Path): Block | Null = js.native
  def getPreviousDeepMatchingNodeAndPath(path: List[Double]): (js.Tuple2[Node, List[Double]]) | Null = js.native
  def getPreviousDeepMatchingNodeAndPath(path: List[Double], iterator: js.Function1[/* node */ Node, Boolean]): (js.Tuple2[Node, List[Double]]) | Null = js.native
  def getPreviousMatchingNodeAndPath(path: List[Double]): (js.Tuple2[Node, List[Double]]) | Null = js.native
  def getPreviousMatchingNodeAndPath(path: List[Double], iterator: js.Function1[/* node */ Node, Boolean]): (js.Tuple2[Node, List[Double]]) | Null = js.native
  def getPreviousNode(path: Path): Node | Null = js.native
  def getPreviousSibling(path: Path): Node | Null = js.native
  def getPreviousText(path: Path): Text | Null = js.native
  def getPreviousTextAndPath(path: Path): Text | Null = js.native
  def getRootBlocksAtRange(range: RangeType): List[Block] = js.native
  def getRootBlocksAtRange(range: RangeTypeJSON): List[Block] = js.native
  def getRootBlocksAtRange(range: RangeTypeProperties): List[Block] = js.native
  def getRootInlinesAtRange(range: RangeType): List[Inline] = js.native
  def getRootInlinesAtRange(range: RangeTypeJSON): List[Inline] = js.native
  def getRootInlinesAtRange(range: RangeTypeProperties): List[Inline] = js.native
  def getRootInlinesAtRangeAsArray(range: Range): js.Array[Inline] = js.native
  def getRootInlinesAtRangeAsArray(range: RangeJSON): js.Array[Inline] = js.native
  def getRootInlinesAtRangeAsArray(range: RangeProperties): js.Array[Inline] = js.native
  def getSelectionIndexes(range: RangeType): AnonEnd | Boolean | Null = js.native
  def getSelectionIndexes(range: RangeType, isSelected: Boolean): AnonEnd | Boolean | Null = js.native
  def getText(): String = js.native
  def getTextAtOffset(offset: Double): Text | Null = js.native
  def getTextDirection(): String | Null = js.native
  def getTexts(): List[Text] = js.native
  def getTextsAsArray(): js.Array[Text] = js.native
  def getTextsAtRange(range: RangeType): List[Text] = js.native
  def getTextsAtRange(range: RangeTypeJSON): List[Text] = js.native
  def getTextsAtRange(range: RangeTypeProperties): List[Text] = js.native
  def getTextsAtRangeAsArray(range: Range): js.Array[Text] = js.native
  def getTextsAtRangeAsArray(range: RangeJSON): js.Array[Text] = js.native
  def getTextsAtRangeAsArray(range: RangeProperties): js.Array[Text] = js.native
  def getTextsBetweenPathPositionsAsArray(startPath: List[Double], endPath: List[Double]): js.Array[Node | Null] = js.native
  def getTextsBetweenPositionsAsArray(startPath: Path, endPath: Path): js.Array[Node | Null] = js.native
  def hasBlockChildren(): Boolean = js.native
  def hasChild(path: Path): Boolean = js.native
  def hasDescendant(path: Path): Boolean = js.native
  def hasInlineChildren(): Boolean = js.native
  def hasNode(path: Path): Boolean = js.native
  def hasVoidParent(path: Path, editor: Editor): Boolean = js.native
  def inlines(): Iterable[js.Tuple2[Inline, List[Double]]] = js.native
  def inlines(options: IterableOptionsonlyLeaves): Iterable[js.Tuple2[Inline, List[Double]]] = js.native
  def insertNode(path: Path, node: Node): Node = js.native
  def insertText(path: Path, offset: Double, text: String): Node = js.native
  def isInRange(path: Path, range: RangeType): Boolean = js.native
  def isInRange(path: Path, range: RangeTypeJSON): Boolean = js.native
  def isInRange(path: Path, range: RangeTypeProperties): Boolean = js.native
  def isLeafBlock(): /* is slate.slate.Block */ Boolean = js.native
  def isLeafInline(): /* is slate.slate.Inline */ Boolean = js.native
  def isNodeInRange(path: Path, range: Range): Boolean = js.native
  def isNodeInRange(path: Path, range: RangeJSON): Boolean = js.native
  def isNodeInRange(path: Path, range: RangeProperties): Boolean = js.native
  def mapChildren(): Node = js.native
  def mapChildren(predicate: js.Function3[/* node */ Node, /* index */ Double, /* nodes */ List[Node], Node]): Node = js.native
  def mapDescendants(): Node | Unit = js.native
  def mapDescendants(predicate: js.Function3[/* node */ Node, /* index */ Double, /* nodes */ List[Node], Node]): Node | Unit = js.native
  def marks(): Iterable[js.Tuple3[Mark, Node, List[Double]]] = js.native
  def marks(options: IterableOptionsonlyTypesA): Iterable[js.Tuple3[Mark, Node, List[Double]]] = js.native
  def mergeNode(path: Path): Node = js.native
  def moveNode(path: Path, newPath: Path): Node = js.native
  def moveNode(path: Path, newPath: Path, newIndex: Double): Node = js.native
  def normalize(editor: Editor): js.Function0[Unit] = js.native
  def regenerateKey(): Node = js.native
  def removeMark(path: Path, mark: Mark): Node = js.native
  def removeNode(path: Path): Node = js.native
  def removeText(path: Path, offset: Double, text: String): Node = js.native
  def replaceNode(path: Path, node: Node): Node = js.native
  def resolveAnnotation(annotation: Annotation): Annotation = js.native
  def resolveAnnotation(annotation: AnnotationJSON): Annotation = js.native
  def resolveAnnotation(annotation: AnnotationProperties): Annotation = js.native
  def resolveDecoration(decoration: RangeType): Decoration = js.native
  def resolveDecoration(decoration: RangeTypeJSON): Decoration = js.native
  def resolveDecoration(decoration: RangeTypeProperties): Decoration = js.native
  def resolvePath(path: Path): List[Double] = js.native
  def resolvePath(path: Path, index: Double): List[Double] = js.native
  def resolvePoint(point: Point): Point = js.native
  def resolvePoint(point: PointJSON): Point = js.native
  def resolvePoint(point: PointProperties): Point = js.native
  def resolveRange(range: RangeType): Range = js.native
  def resolveRange(range: RangeTypeJSON): Range = js.native
  def resolveRange(range: RangeTypeProperties): Range = js.native
  def resolveSelection(selection: Range): Selection = js.native
  def resolveSelection(selection: Selection): Selection = js.native
  def resolveSelection(selection: SelectionJSON): Selection = js.native
  def resolveSelection(selection: SelectionProperties): Selection = js.native
  def setMark(path: Path, properties: MarkProperties, newProperties: MarkProperties): Node = js.native
  def setNode(path: Path, properties: NodeProperties): Node = js.native
  def siblings(path: Path): Iterable[js.Tuple2[Node, List[Double]]] = js.native
  def siblings(path: Path, options: IterableOptions): Iterable[js.Tuple2[Node, List[Double]]] = js.native
  def splitNode(path: Path, position: Double, properties: NodeProperties): Node = js.native
  def texts(options: IterableOptions): Iterable[js.Tuple2[Text, List[Double]]] = js.native
  def validate(editor: Editor): Error | Unit = js.native
}

