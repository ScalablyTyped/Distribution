package typings.slateReact.mod

import typings.std.Range
import typings.std.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "findRange")
@js.native
object findRange extends js.Object {
  def apply(domRange: Range, editor: typings.slate.mod.Editor): typings.slate.mod.Range | Null = js.native
  def apply(domRange: Selection, editor: typings.slate.mod.Editor): typings.slate.mod.Range | Null = js.native
}

