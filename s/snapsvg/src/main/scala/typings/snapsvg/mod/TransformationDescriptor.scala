package typings.snapsvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationDescriptor extends js.Object {
  var diffMatrix: Matrix_
  var global: String
  var globalMatrix: Matrix_
  var local: String
  var localMatrix: Matrix_
  var string: String
}

object TransformationDescriptor {
  @scala.inline
  def apply(
    diffMatrix: Matrix_,
    global: String,
    globalMatrix: Matrix_,
    local: String,
    localMatrix: Matrix_,
    string: String
  ): TransformationDescriptor = {
    val __obj = js.Dynamic.literal(diffMatrix = diffMatrix.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], globalMatrix = globalMatrix.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], localMatrix = localMatrix.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformationDescriptor]
  }
}

