package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("slate", "Value")
@js.native
class Value () extends js.Object {
  val activeMarks: immutableLib.immutableMod.Set[Mark] = js.native
  val anchorBlock: Block = js.native
  val anchorInline: Inline = js.native
  val anchorText: Text = js.native
  val blocks: immutableLib.immutableMod.List[Block] = js.native
  var data: Data = js.native
  var decorations: immutableLib.immutableMod.List[Decoration] = js.native
  var document: Document[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  val endBlock: Block = js.native
  val endInline: Inline = js.native
  val endText: Text = js.native
  val focusBlock: Block = js.native
  val focusInline: Inline = js.native
  val focusText: Text = js.native
  val fragment: Document[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  val inlines: immutableLib.immutableMod.List[Inline] = js.native
  val marks: immutableLib.immutableMod.Set[Mark] = js.native
  val nextBlock: Block = js.native
  val nextInline: Inline = js.native
  val nextText: Text = js.native
  var `object`: slateLib.slateLibStrings.value = js.native
  val previousBlock: Block = js.native
  val previousInline: Inline = js.native
  val previousText: Text = js.native
  var selection: Selection = js.native
  val startBlock: Block = js.native
  val startInline: Inline = js.native
  val startText: Text = js.native
  val texts: immutableLib.immutableMod.List[Text] = js.native
  def addMark(path: Path, offset: scala.Double, length: scala.Double, mark: Mark): Value = js.native
  def clearAtomicRanges(key: java.lang.String, from: scala.Double): Value = js.native
  def clearAtomicRanges(key: java.lang.String, from: scala.Double, to: scala.Double): Value = js.native
  def insertNode(path: Path, node: Node): Value = js.native
  def insertText(
    path: Path,
    offset: scala.Double,
    text: java.lang.String,
    marks: immutableLib.immutableMod.Set[Mark]
  ): Value = js.native
  def isValue(value: Value): scala.Boolean = js.native
  def mapRanges(iterator: js.Function0[scala.Unit]): Value = js.native
  def mergeNode(path: Path): Value = js.native
  def moveNode(path: Path, newPath: Path): Value = js.native
  def moveNode(path: Path, newPath: Path, newIndex: scala.Double): Value = js.native
  def removeMark(path: Path, offset: scala.Double, length: scala.Double, mark: Mark): Value = js.native
  def removeNode(path: Path): Value = js.native
  def removeText(path: Path, offset: scala.Double, text: Text): Value = js.native
  def setMark(path: Path, offset: scala.Double, length: scala.Double, mark: Mark, properties: MarkProperties): Value = js.native
  def setNode(path: Path, properties: js.Any): Value = js.native
  def setProperties(properties: ValueProperties): Value = js.native
  def setSelection(properties: RangeProperties): Value = js.native
  def splitNode(path: Path, position: scala.Double, properties: js.Any): Value = js.native
  def toJSON(): ValueJSON = js.native
}

/* static members */
@JSImport("slate", "Value")
@js.native
object Value extends js.Object {
  def create(): slateLib.slateMod.Value = js.native
  def create(properties: slateLib.slateMod.Value): slateLib.slateMod.Value = js.native
  def create(properties: slateLib.slateMod.ValueProperties): slateLib.slateMod.Value = js.native
  def createProperties(attrs: slateLib.slateMod.Value): slateLib.slateMod.ValueProperties = js.native
  def createProperties(attrs: slateLib.slateMod.ValueProperties): slateLib.slateMod.ValueProperties = js.native
  def fromJS(properties: slateLib.slateMod.ValueJSON): slateLib.slateMod.Value = js.native
  def fromJSON(properties: slateLib.slateMod.ValueJSON): slateLib.slateMod.Value = js.native
  def isValue(maybeValue: js.Any): /* is slate.slate.Value */ scala.Boolean = js.native
}

