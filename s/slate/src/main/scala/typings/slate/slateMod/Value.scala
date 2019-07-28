package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.List
import typings.immutable.immutableMod.Set
import typings.slate.slateStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("slate", "Value")
@js.native
class Value () extends js.Object {
  val activeMarks: Set[Mark] = js.native
  val anchorBlock: Block = js.native
  val anchorInline: Inline = js.native
  val anchorText: Text = js.native
  val blocks: List[Block] = js.native
  var data: Data = js.native
  var decorations: List[Decoration] = js.native
  var document: Document[StringDictionary[_]] = js.native
  val endBlock: Block = js.native
  val endInline: Inline = js.native
  val endText: Text = js.native
  val focusBlock: Block = js.native
  val focusInline: Inline = js.native
  val focusText: Text = js.native
  val fragment: Document[StringDictionary[_]] = js.native
  val inlines: List[Inline] = js.native
  val marks: Set[Mark] = js.native
  val nextBlock: Block = js.native
  val nextInline: Inline = js.native
  val nextText: Text = js.native
  var `object`: value = js.native
  val previousBlock: Block = js.native
  val previousInline: Inline = js.native
  val previousText: Text = js.native
  var selection: Selection = js.native
  val startBlock: Block = js.native
  val startInline: Inline = js.native
  val startText: Text = js.native
  val texts: List[Text] = js.native
  def addMark(path: Path, offset: Double, length: Double, mark: Mark): Value = js.native
  def clearAtomicRanges(key: String, from: Double): Value = js.native
  def clearAtomicRanges(key: String, from: Double, to: Double): Value = js.native
  def insertNode(path: Path, node: Node): Value = js.native
  def insertText(path: Path, offset: Double, text: String, marks: Set[Mark]): Value = js.native
  def isValue(value: Value): Boolean = js.native
  def mapRanges(iterator: js.Function0[Unit]): Value = js.native
  def mergeNode(path: Path): Value = js.native
  def moveNode(path: Path, newPath: Path): Value = js.native
  def moveNode(path: Path, newPath: Path, newIndex: Double): Value = js.native
  def removeMark(path: Path, offset: Double, length: Double, mark: Mark): Value = js.native
  def removeNode(path: Path): Value = js.native
  def removeText(path: Path, offset: Double, text: Text): Value = js.native
  def setMark(path: Path, offset: Double, length: Double, mark: Mark, properties: MarkProperties): Value = js.native
  def setNode(path: Path, properties: js.Any): Value = js.native
  def setProperties(properties: ValueProperties): Value = js.native
  def setSelection(properties: RangeProperties): Value = js.native
  def splitNode(path: Path, position: Double, properties: js.Any): Value = js.native
  def toJSON(): ValueJSON = js.native
}

/* static members */
@JSImport("slate", "Value")
@js.native
object Value extends js.Object {
  def create(): Value = js.native
  def create(properties: Value): Value = js.native
  def create(properties: ValueProperties): Value = js.native
  def createProperties(attrs: Value): ValueProperties = js.native
  def createProperties(attrs: ValueProperties): ValueProperties = js.native
  def fromJS(properties: ValueJSON): Value = js.native
  def fromJSON(properties: ValueJSON): Value = js.native
  def isValue(maybeValue: js.Any): /* is slate.slate.Value */ Boolean = js.native
}

