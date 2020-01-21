package typings.slate.mod

import typings.immutable.Immutable.Set_
import typings.slate.slateStrings.mark
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : Immutable.Record(object) * / any */ @JSImport("slate", "Mark")
@js.native
class Mark () extends js.Object {
  var data: Data = js.native
  var `object`: mark = js.native
  var `type`: String = js.native
  def toJS(): MarkJSON = js.native
  def toJSON(): MarkJSON = js.native
}

/* static members */
@JSImport("slate", "Mark")
@js.native
object Mark extends js.Object {
  def create(properties: String): Mark = js.native
  def create(properties: Mark): Mark = js.native
  def create(properties: MarkJSON): Mark = js.native
  def create(properties: MarkProperties): Mark = js.native
  def createProperties(attrs: Partial[MarkProperties | MarkJSON | Mark | String]): MarkProperties = js.native
  def createSet(): Set_[Mark] = js.native
  def createSet(element: js.Array[MarkProperties | MarkJSON | Mark | String]): Set_[Mark] = js.native
  def createSet(element: Set_[MarkProperties | MarkJSON | Mark | String]): Set_[Mark] = js.native
  def fromJS(properties: Mark): Mark = js.native
  def fromJS(properties: MarkJSON): Mark = js.native
  def fromJS(properties: MarkProperties): Mark = js.native
  def fromJSON(properties: Mark): Mark = js.native
  def fromJSON(properties: MarkJSON): Mark = js.native
  def fromJSON(properties: MarkProperties): Mark = js.native
  def isMark(maybeMark: js.Any): /* is slate.slate.Mark */ Boolean = js.native
  def isMarkSet(maybeMarkSet: js.Any): /* is immutable.Immutable.Set<slate.slate.Mark> */ Boolean = js.native
}

