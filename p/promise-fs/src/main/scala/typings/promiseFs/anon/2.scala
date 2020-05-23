package typings.promiseFs.anon

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2` extends js.Object {
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
}

object `2` {
  @scala.inline
  def apply(encoding: js.UndefOr[Null | BufferEncoding] = js.undefined): `2` = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
}

