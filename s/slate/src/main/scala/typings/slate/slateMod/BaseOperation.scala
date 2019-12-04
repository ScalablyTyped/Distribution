package typings.slate.slateMod

import typings.immutable.Immutable.List
import typings.slate.slateStrings.operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall $anonfun class extends from : Immutable.Record(object) * / any */ @JSImport("slate", "BaseOperation")
@js.native
class BaseOperation () extends js.Object {
  var `object`: operation = js.native
  var `type`: String = js.native
  @JSName("apply")
  def apply(value: Value): Value = js.native
  def invert(): this.type = js.native
  def toJSON(): OperationJSON = js.native
}

/* static members */
@JSImport("slate", "BaseOperation")
@js.native
object BaseOperation extends js.Object {
  def create(): Operation = js.native
  def create(attrs: Operation): Operation = js.native
  def create(attrs: OperationJSON): Operation = js.native
  def create(attrs: OperationProperties): Operation = js.native
  def createList(): (List[Operation | OperationProperties | OperationJSON]) | (js.Array[Operation | OperationProperties | OperationJSON]) = js.native
  def fromJS(`object`: OperationJSON): Operation = js.native
  def fromJS(`object`: OperationProperties): Operation = js.native
  def fromJSON(`object`: OperationJSON): Operation = js.native
  def fromJSON(`object`: OperationProperties): Operation = js.native
  def isOperation(maybeOperation: js.Any): /* is slate.slate.Operation */ Boolean = js.native
  def isOperationList(maybeOperationList: js.Any): /* is immutable.Immutable.List<slate.slate.Operation> */ Boolean = js.native
}

