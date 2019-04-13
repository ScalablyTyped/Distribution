package typings
package snapsvgLib.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationDescriptor extends js.Object {
  var diffMatrix: Matrix
  var global: java.lang.String
  var globalMatrix: Matrix
  var local: java.lang.String
  var localMatrix: Matrix
  var string: java.lang.String
}

object TransformationDescriptor {
  @scala.inline
  def apply(
    diffMatrix: Matrix,
    global: java.lang.String,
    globalMatrix: Matrix,
    local: java.lang.String,
    localMatrix: Matrix,
    string: java.lang.String,
    toString: () => java.lang.String
  ): TransformationDescriptor = {
    val __obj = js.Dynamic.literal(diffMatrix = diffMatrix, global = global, globalMatrix = globalMatrix, local = local, localMatrix = localMatrix, string = string, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[TransformationDescriptor]
  }
}

