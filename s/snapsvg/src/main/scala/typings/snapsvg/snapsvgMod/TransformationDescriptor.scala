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
    string: String,
    toString: () => String
  ): TransformationDescriptor = {
    val __obj = js.Dynamic.literal(diffMatrix = diffMatrix, global = global, globalMatrix = globalMatrix, local = local, localMatrix = localMatrix, string = string, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[TransformationDescriptor]
  }
}

