package typings.slate.slateMod

import typings.immutable.immutableMod.List
import typings.slate.slateStrings.split_node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "SplitNodeOperation")
@js.native
class SplitNodeOperation ()
  extends BaseOperation
     with Operation {
  var data: Data = js.native
  var path: List[Double] = js.native
  var position: Double = js.native
  var properties: NodeProperties = js.native
  var target: Double = js.native
  @JSName("type")
  var type_SplitNodeOperation: split_node = js.native
}

