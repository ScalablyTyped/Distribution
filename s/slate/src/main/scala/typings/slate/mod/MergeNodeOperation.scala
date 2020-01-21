package typings.slate.mod

import typings.immutable.Immutable.List
import typings.slate.slateStrings.merge_node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "MergeNodeOperation")
@js.native
class MergeNodeOperation ()
  extends BaseOperation
     with Operation {
  var data: Data = js.native
  var path: List[Double] = js.native
  var position: Double = js.native
  var properties: NodeProperties = js.native
  @JSName("type")
  var type_MergeNodeOperation: merge_node = js.native
}

