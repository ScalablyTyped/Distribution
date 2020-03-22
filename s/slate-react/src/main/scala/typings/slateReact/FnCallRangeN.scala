package typings.slateReact

import typings.slate.mod.Editor
import typings.slate.mod.RangeType
import typings.slate.mod.RangeTypeJSON
import typings.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangeN extends js.Object {
  def apply(range: RangeType): Editor = js.native
  def apply(range: RangeTypeJSON): Editor = js.native
  def apply(range: RangeTypeJSON, n: Double): Editor = js.native
  def apply(range: RangeTypeProperties): Editor = js.native
  def apply(range: RangeTypeProperties, n: Double): Editor = js.native
  def apply(range: RangeType, n: Double): Editor = js.native
}

