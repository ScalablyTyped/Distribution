package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNode extends js.Object {
  def getNode(): js.Any
}

object GetNode {
  @scala.inline
  def apply(getNode: () => js.Any): GetNode = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction0(getNode))
    __obj.asInstanceOf[GetNode]
  }
}

