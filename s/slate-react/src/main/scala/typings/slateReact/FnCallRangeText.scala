package typings.slateReact

import typings.slate.mod.Editor
import typings.slate.mod.RangeType
import typings.slate.mod.RangeTypeJSON
import typings.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangeText extends js.Object {
  def apply(range: RangeTypeJSON, text: String): Editor = js.native
  def apply(range: RangeTypeProperties, text: String): Editor = js.native
  def apply(range: RangeType, text: String): Editor = js.native
}

