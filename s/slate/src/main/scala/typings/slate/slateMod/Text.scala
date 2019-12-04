package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.Immutable.List
import typings.immutable.Immutable.Map
import typings.immutable.Immutable.Set
import typings.slate.Anon_PreserveKeys
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall $anonfun class extends from : Immutable.Record(object) * / any */ @JSImport("slate", "Text")
@js.native
class Text () extends Node {
  var key: String = js.native
  val marks: Set[Mark] | Null = js.native
  var `object`: typings.slate.slateStrings.text = js.native
  val text: String = js.native
  def addMark(mark: String): Text = js.native
  def addMark(mark: Mark): Text = js.native
  def addMark(mark: MarkJSON): Text = js.native
  def addMark(mark: MarkProperties): Text = js.native
  def addMarks(marks: js.Array[MarkProperties | MarkJSON | Mark | String]): Text = js.native
  def addMarks(marks: Set[MarkProperties | MarkJSON | Mark | String]): Text = js.native
  def getFirstText(): Text | Null = js.native
  def getKeysToPathsTable(): StringDictionary[js.Array[Double]] = js.native
  def getLastText(): Text | Null = js.native
  def getLeaves(annotations: Map[String, Annotation]): List[Leaf] = js.native
  def getLeaves(annotations: Map[String, Annotation], decorations: js.Array[Decoration]): List[Leaf] = js.native
  def getLeaves(annotations: Map[String, Annotation], decorations: List[Decoration]): List[Leaf] = js.native
  def getNode(path: Path): Node | Null = js.native
  def getPath(key: String): List[Double] | Null = js.native
  def getPath(key: List[Double]): List[Double] | Null = js.native
  def getPath(key: Node): List[Double] | Null = js.native
  def getText(): String = js.native
  def hasNode(path: Path): Boolean = js.native
  def insertText(index: Double, string: String): Text = js.native
  def mergeText(other: Text): Text = js.native
  def normalize(editor: Editor): js.Function0[Unit] = js.native
  def regenerateKey(): Text = js.native
  def removeMark(mark: String): Text = js.native
  def removeMark(mark: Mark): Text = js.native
  def removeMark(mark: MarkJSON): Text = js.native
  def removeMark(mark: MarkProperties): Text = js.native
  def removeText(index: Double, length: Double): Text = js.native
  def resolvePath(path: Path): List[Double] = js.native
  def resolvePath(path: Path, index: Double): List[Double] = js.native
  def setMark(properties: String, newProperties: MarkProperties): Text = js.native
  def setMark(properties: MarkJSON, newProperties: MarkProperties): Text = js.native
  def setMark(properties: MarkProperties, newProperties: MarkProperties): Text = js.native
  def setMark(properties: Mark, newProperties: MarkProperties): Text = js.native
  def splitText(index: Double): js.Array[Text] = js.native
  def toJS(): TextJSON = js.native
  def toJS(options: Anon_PreserveKeys): TextJSON = js.native
  def toJSON(): TextJSON = js.native
  def toJSON(options: Anon_PreserveKeys): TextJSON = js.native
  def validate(editor: Editor): Error | Unit = js.native
}

/* static members */
@JSImport("slate", "Text")
@js.native
object Text extends js.Object {
  def create(): Text = js.native
  def create(properties: String): Text = js.native
  def create(properties: Text): Text = js.native
  def create(properties: TextJSON): Text = js.native
  def create(properties: TextProperties): Text = js.native
  def createList(): List[Text] = js.native
  def createList(elements: js.Array[TextProperties | TextJSON | Text | String]): List[Text] = js.native
  def createList(elements: List[TextProperties | TextJSON | Text | String]): List[Text] = js.native
  def fromJS(properties: Text): Text = js.native
  def fromJS(properties: TextJSON): Text = js.native
  def fromJS(properties: TextProperties): Text = js.native
  def fromJSON(properties: Text): Text = js.native
  def fromJSON(properties: TextJSON): Text = js.native
  def fromJSON(properties: TextProperties): Text = js.native
  def isText(maybeText: js.Any): /* is slate.slate.Text */ Boolean = js.native
  def isTextList(maybeTextList: js.Any): /* is immutable.Immutable.List<slate.slate.Text> */ Boolean = js.native
}

