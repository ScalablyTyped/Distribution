package typings.slate.slateMod

import typings.immutable.Immutable.List
import typings.slate.slateStrings.remove_mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "RemoveMarkOperation")
@js.native
class RemoveMarkOperation ()
  extends BaseOperation
     with Operation {
  var data: Data = js.native
  var mark: Mark = js.native
  var path: List[Double] = js.native
  @JSName("type")
  var type_RemoveMarkOperation: remove_mark = js.native
}

