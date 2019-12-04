package typings.slate.slateMod

import typings.immutable.Immutable.List
import typings.slate.slateStrings.move_node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "MoveNodeOperation")
@js.native
class MoveNodeOperation ()
  extends BaseOperation
     with Operation {
  var data: Data = js.native
  var newPath: List[Double] = js.native
  var path: List[Double] = js.native
  @JSName("type")
  var type_MoveNodeOperation: move_node = js.native
}

