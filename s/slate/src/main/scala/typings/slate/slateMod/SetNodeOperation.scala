package typings.slate.slateMod

import typings.immutable.Immutable.List
import typings.slate.slateStrings.set_node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "SetNodeOperation")
@js.native
class SetNodeOperation ()
  extends BaseOperation
     with Operation {
  var data: Data = js.native
  var newProperties: NodeProperties = js.native
  var path: List[Double] = js.native
  var properties: NodeProperties = js.native
  @JSName("type")
  var type_SetNodeOperation: set_node = js.native
}

