package typings.slateReact.mod

import typings.slate.mod.RangeType
import typings.slate.mod.RangeTypeJSON
import typings.slate.mod.RangeTypeProperties
import typings.std.Range
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "findDOMRange")
@js.native
object findDOMRange extends js.Object {
  def apply(range: RangeType): Range | Null = js.native
  def apply(range: RangeTypeJSON): Range | Null = js.native
  def apply(range: RangeTypeJSON, win: Window_): Range | Null = js.native
  def apply(range: RangeTypeProperties): Range | Null = js.native
  def apply(range: RangeTypeProperties, win: Window_): Range | Null = js.native
  def apply(range: RangeType, win: Window_): Range | Null = js.native
}

