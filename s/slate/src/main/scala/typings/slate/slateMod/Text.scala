package typings.slate.slateMod

import typings.immutable.immutableMod.List
import typings.immutable.immutableMod.OrderedSet
import typings.immutable.immutableMod.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("slate", "Text")
@js.native
class Text () extends _Node {
  var key: String = js.native
  var `object`: typings.slate.slateStrings.text = js.native
  val text: String = js.native
  def addMark(index: Double, length: Double, mark: Mark): Text = js.native
  def addMarks(index: Double, lenght: Double, marks: Set[Mark]): Text = js.native
  def getActiveMarks(): Set[Mark] = js.native
  def getActiveMarksBetweenOffsets(startOffset: Double, endOffset: Double): Set[Mark] = js.native
  def getFirstText(): Text = js.native
  def getKeysToPathsTable(): js.Object = js.native
  def getLastText(): Text = js.native
  def getLeaves(): List[Leaf] = js.native
  def getLeaves(decorations: js.Array[Range]): List[Leaf] = js.native
  def getMarks(): OrderedSet[Mark] = js.native
  def getMarksAsArray(): js.Array[Mark] = js.native
  def getMarksAtIndex(index: Double): OrderedSet[Mark] = js.native
  def getMarksBetweenOffsets(startOffset: Double, endOffset: Double): Set[Mark] = js.native
  def getNode(key: String): Node | Null = js.native
  def getPath(key: String): Path = js.native
  def getPath(key: Path): Path = js.native
  def getString(): String = js.native
  def getText(): String = js.native
  def hasNode(key: String): Boolean = js.native
  def insertText(offset: Double, text: String): Text = js.native
  def insertText(offset: Double, text: String, marks: Set[Mark]): Text = js.native
  def mergeText(text: Text): Text = js.native
  def regenerateKey(): Text = js.native
  def removeMark(index: Double, length: Mark, mark: Mark): Text = js.native
  def removeText(start: Double, length: Double): Text = js.native
  def resolvePath(path: Path, index: Double): List[String] = js.native
  def searchLeafAtOffset(offset: Double): LeafAndOffset = js.native
  def setLeaves(leaves: List[Leaf]): Text = js.native
  def splitText(offset: Double): js.Array[Text] = js.native
  def toJSON(): TextJSON = js.native
  def updateMark(index: Double, length: Double, mark: Mark, properties: MarkProperties): Text = js.native
}

/* static members */
@JSImport("slate", "Text")
@js.native
object Text extends js.Object {
  def create(properties: String): Text = js.native
  def create(properties: Text): Text = js.native
  def create(properties: TextProperties): Text = js.native
  def createList(): List[Text] = js.native
  def createList(elements: js.Array[Text | TextProperties]): List[Text] = js.native
  def createList(elements: List[Text | TextProperties]): List[Text] = js.native
  def fromJS(properties: Text): Text = js.native
  def fromJS(properties: TextJSON): Text = js.native
  def fromJSON(properties: Text): Text = js.native
  def fromJSON(properties: TextJSON): Text = js.native
  def isText(maybeText: js.Any): /* is slate.slate.Text */ Boolean = js.native
}

