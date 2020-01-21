package typings.slate.mod

import typings.immutable.Immutable.List
import typings.slate.slateStrings.insert_node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "InsertNodeOperation")
@js.native
class InsertNodeOperation ()
  extends BaseOperation
     with Operation {
  var data: Data = js.native
  var node: Node = js.native
  var path: List[Double] = js.native
  @JSName("type")
  var type_InsertNodeOperation: insert_node = js.native
}

