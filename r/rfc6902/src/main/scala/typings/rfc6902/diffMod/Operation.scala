package typings.rfc6902.diffMod

import typings.rfc6902.rfc6902Strings.add
import typings.rfc6902.rfc6902Strings.copy
import typings.rfc6902.rfc6902Strings.move
import typings.rfc6902.rfc6902Strings.remove
import typings.rfc6902.rfc6902Strings.replace
import typings.rfc6902.rfc6902Strings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rfc6902.diffMod.AddOperation
  - typings.rfc6902.diffMod.RemoveOperation
  - typings.rfc6902.diffMod.ReplaceOperation
  - typings.rfc6902.diffMod.MoveOperation
  - typings.rfc6902.diffMod.CopyOperation
  - typings.rfc6902.diffMod.TestOperation
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  def RemoveOperation(op: remove, path: String): Operation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def AddOperation(op: add, path: String, value: js.Any): Operation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def CopyOperation(from: String, op: copy, path: String): Operation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def MoveOperation(from: String, op: move, path: String): Operation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def ReplaceOperation(op: replace, path: String, value: js.Any): Operation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def TestOperation(op: test, path: String, value: js.Any): Operation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

