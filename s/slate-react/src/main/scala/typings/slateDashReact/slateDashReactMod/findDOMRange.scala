package typings.slateDashReact.slateDashReactMod

import typings.slate.slateMod.RangeType
import typings.slate.slateMod.RangeTypeJSON
import typings.slate.slateMod.RangeTypeProperties
import typings.std.Range
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "findDOMRange")
@js.native
object findDOMRange extends js.Object {
  def apply(range: RangeType): Range | Null = js.native
  def apply(range: RangeTypeJSON): Range | Null = js.native
  def apply(range: RangeTypeJSON, win: Window): Range | Null = js.native
  def apply(range: RangeTypeProperties): Range | Null = js.native
  def apply(range: RangeTypeProperties, win: Window): Range | Null = js.native
  def apply(range: RangeType, win: Window): Range | Null = js.native
}

