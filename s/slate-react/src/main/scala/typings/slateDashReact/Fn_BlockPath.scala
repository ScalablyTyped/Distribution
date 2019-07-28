package typings.slateDashReact

import typings.slate.slateMod.Block
import typings.slate.slateMod.Editor
import typings.slate.slateMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BlockPath extends js.Object {
  def apply(path: Path, block: String): Editor = js.native
  def apply(path: Path, block: Block): Editor = js.native
}

