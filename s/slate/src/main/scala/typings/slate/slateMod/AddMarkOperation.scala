package typings.slate.slateMod

import typings.immutable.immutableMod.List
import typings.slate.slateStrings.add_mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "AddMarkOperation")
@js.native
class AddMarkOperation ()
  extends BaseOperation
     with Operation {
  var data: Data = js.native
  var mark: Mark = js.native
  var path: List[Double] = js.native
  @JSName("type")
  var type_AddMarkOperation: add_mark = js.native
}

