package typings
package snapsvgLib.snapsvgMod.SnapNs

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
    toString: js.Function0[java.lang.String]
  ): TransformationDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("diffMatrix")(diffMatrix)
    __obj.updateDynamic("global")(global)
    __obj.updateDynamic("globalMatrix")(globalMatrix)
    __obj.updateDynamic("local")(local)
    __obj.updateDynamic("localMatrix")(localMatrix)
    __obj.updateDynamic("string")(string)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[TransformationDescriptor]
  }
}

