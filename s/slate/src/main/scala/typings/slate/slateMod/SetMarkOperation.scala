package typings.slate.slateMod

import typings.immutable.immutableMod.List
import typings.slate.slateStrings.set_mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "SetMarkOperation")
@js.native
class SetMarkOperation ()
  extends BaseOperation
     with Operation {
  var data: Data = js.native
  var newProperties: MarkProperties = js.native
  var path: List[Double] = js.native
  var properties: MarkProperties = js.native
  @JSName("type")
  var type_SetMarkOperation: set_mark = js.native
}

