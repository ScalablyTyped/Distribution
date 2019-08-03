package typings.slateDashReact

import typings.slate.slateMod.Editor
import typings.slate.slateMod.RangeType
import typings.slate.slateMod.RangeTypeJSON
import typings.slate.slateMod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_NRange extends js.Object {
  def apply(range: RangeType): Editor = js.native
  def apply(range: RangeTypeJSON): Editor = js.native
  def apply(range: RangeTypeJSON, n: Double): Editor = js.native
  def apply(range: RangeTypeProperties): Editor = js.native
  def apply(range: RangeTypeProperties, n: Double): Editor = js.native
  def apply(range: RangeType, n: Double): Editor = js.native
}

