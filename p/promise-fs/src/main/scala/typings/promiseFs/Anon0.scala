package typings.promiseFs

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply(encoding: BufferEncoding = null): Anon0 = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

