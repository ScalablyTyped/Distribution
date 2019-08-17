package typings.slate.slateMod

import typings.immutable.immutableMod.List
import typings.immutable.immutableMod.Map
import typings.immutable.immutableMod.OrderedSet
import typings.slate.Anon_PreserveAnnotations
import typings.slate.slateStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall $anonfun class extends from : Immutable.Record(object) * / any */ @JSImport("slate", "Value")
@js.native
class Value () extends js.Object {
  val activeMarks: OrderedSet[Mark] = js.native
  val anchorBlock: Block = js.native
  val anchorInline: Inline = js.native
  val anchorText: Text = js.native
  var annotations: Map[String, Annotation] = js.native
  val blocks: List[Block] = js.native
  var data: Data = js.native
  var document: Document = js.native
  val endBlock: Block = js.native
  val endInline: Inline = js.native
  val endText: Text = js.native
  val focusBlock: Block = js.native
  val focusInline: Inline = js.native
  val focusText: Text = js.native
  val fragment: Document = js.native
  val inlines: List[Inline] = js.native
  val marks: OrderedSet[Mark] = js.native
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
  def addAnnotation(annotation: Annotation): Value = js.native
  def addAnnotation(annotation: AnnotationJSON): Value = js.native
  def addAnnotation(annotation: AnnotationProperties): Value = js.native
  def addMark(path: Path, mark: String): Value = js.native
  def addMark(path: Path, mark: Mark): Value = js.native
  def addMark(path: Path, mark: MarkJSON): Value = js.native
  def addMark(path: Path, mark: MarkProperties): Value = js.native
  def insertNode(path: Path, node: Node): Value = js.native
  def insertText(path: Path, offset: Double, text: String): Value = js.native
  def mapPoints(iterator: js.Function1[/* point */ Point, Point]): Value = js.native
  def mapRanges(iterator: js.Function1[/* val */ Selection | Annotation, _]): Value = js.native
  def mergeNode(path: Path): Value = js.native
  def moveNode(path: List[Double], newPath: List[Double]): Value = js.native
  def moveNode(path: List[Double], newPath: List[Double], newIndex: Double): Value = js.native
  def removeAnnotation(annotation: Annotation): Value = js.native
  def removeAnnotation(annotation: AnnotationJSON): Value = js.native
  def removeAnnotation(annotation: AnnotationProperties): Value = js.native
  def removeMark(path: Path, mark: String): Value = js.native
  def removeMark(path: Path, mark: Mark): Value = js.native
  def removeMark(path: Path, mark: MarkJSON): Value = js.native
  def removeMark(path: Path, mark: MarkProperties): Value = js.native
  def removeNode(path: Path): Value = js.native
  def removeText(path: Path, offset: Double, text: String): Value = js.native
  def setAnnotation(properties: AnnotationJSON, newProperties: Annotation): Value = js.native
  def setAnnotation(properties: AnnotationJSON, newProperties: AnnotationJSON): Value = js.native
  def setAnnotation(properties: AnnotationJSON, newProperties: AnnotationProperties): Value = js.native
  def setAnnotation(properties: AnnotationProperties, newProperties: Annotation): Value = js.native
  def setAnnotation(properties: AnnotationProperties, newProperties: AnnotationJSON): Value = js.native
  def setAnnotation(properties: AnnotationProperties, newProperties: AnnotationProperties): Value = js.native
  def setAnnotation(properties: Annotation, newProperties: Annotation): Value = js.native
  def setAnnotation(properties: Annotation, newProperties: AnnotationJSON): Value = js.native
  def setAnnotation(properties: Annotation, newProperties: AnnotationProperties): Value = js.native
  def setMark(path: Path, properties: MarkProperties, newProperties: MarkProperties): Value = js.native
  def setNode(path: Path, properties: NodeProperties): Value = js.native
  def setProperties(properties: ValueProperties): Value = js.native
  def setSelection(properties: String): Value = js.native
  def setSelection(properties: RangeType): Value = js.native
  def setSelection(properties: RangeTypeJSON): Value = js.native
  def setSelection(properties: RangeTypeProperties): Value = js.native
  def splitNode(path: Path, position: Double, properties: NodeProperties): Value = js.native
  def toJS(): ValueJSON = js.native
  def toJS(options: Anon_PreserveAnnotations): ValueJSON = js.native
  def toJSON(): ValueJSON = js.native
  def toJSON(options: Anon_PreserveAnnotations): ValueJSON = js.native
}

/* static members */
@JSImport("slate", "Value")
@js.native
object Value extends js.Object {
  def create(): Value = js.native
  def create(properties: Value): Value = js.native
  def create(properties: ValueJSON): Value = js.native
  def create(properties: ValueProperties): Value = js.native
  def createProperties(attrs: Value): ValueProperties = js.native
  def createProperties(attrs: ValueJSON): ValueProperties = js.native
  def createProperties(attrs: ValueProperties): ValueProperties = js.native
  def fromJS(properties: ValueJSON): Value = js.native
  def fromJS(properties: ValueProperties): Value = js.native
  def fromJSON(properties: ValueJSON): Value = js.native
  def fromJSON(properties: ValueProperties): Value = js.native
  def isValue(maybeValue: js.Any): /* is slate.slate.Value */ Boolean = js.native
}

