package typings.slateReact

import typings.slate.mod.Editor
import typings.slate.mod.Operation
import typings.slate.mod.OperationJSON
import typings.slate.mod.OperationProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallOperation extends js.Object {
  def apply(operation: Operation): Editor = js.native
  def apply(operation: OperationJSON): Editor = js.native
  def apply(operation: OperationProperties): Editor = js.native
}

