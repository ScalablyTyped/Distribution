package typings.snapsvg.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationDescriptor extends js.Object {
  var diffMatrix: Matrix
  var global: String
  var globalMatrix: Matrix
  var local: String
  var localMatrix: Matrix
  var string: String
}

object TransformationDescriptor {
  @scala.inline
  def apply(
    diffMatrix: Matrix,
    global: String,
    globalMatrix: Matrix,
    local: String,
    localMatrix: Matrix,
    string: String
  ): TransformationDescriptor = {
    val __obj = js.Dynamic.literal(diffMatrix = diffMatrix.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], globalMatrix = globalMatrix.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], localMatrix = localMatrix.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransformationDescriptor]
  }
}

