package typings.slateReact

import typings.slate.mod.BlockProperties
import typings.slate.mod.Editor
import typings.slate.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathProperties extends js.Object {
  def apply(path: Path, properties: String): Editor = js.native
  def apply(path: Path, properties: BlockProperties): Editor = js.native
}

