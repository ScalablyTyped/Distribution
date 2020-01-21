package typings.rfc4648.codecMod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc4648/lib/src/codec", "stringify")
@js.native
object stringify extends js.Object {
  def apply(data: ArrayLike[Double], encoding: Encoding): String = js.native
  def apply(data: ArrayLike[Double], encoding: Encoding, opts: StringifyOptions): String = js.native
}

