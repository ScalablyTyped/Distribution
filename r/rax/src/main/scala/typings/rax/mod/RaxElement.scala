package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaxElement[P, T /* <: String | JSXElementConstructor[_] */] extends js.Object {
  var key: Key | Null
  var props: P
  var `type`: T
}

object RaxElement {
  @scala.inline
  def apply[P, T](props: P, `type`: T, key: Key = null): RaxElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxElement[P, T]]
  }
}

