package typings.slateDashReact

import typings.immutable.immutableMod.List
import typings.slate.slateMod.Block
import typings.slate.slateMod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BlockPath extends js.Object {
  def apply(path: List[Double], block: String): Editor = js.native
  def apply(path: List[Double], block: Block): Editor = js.native
}

