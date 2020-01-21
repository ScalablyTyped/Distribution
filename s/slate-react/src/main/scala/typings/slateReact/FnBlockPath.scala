package typings.slateReact

import typings.immutable.Immutable.List
import typings.slate.mod.Block
import typings.slate.mod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnBlockPath extends js.Object {
  def apply(path: List[Double], block: String): Editor = js.native
  def apply(path: List[Double], block: Block): Editor = js.native
}

