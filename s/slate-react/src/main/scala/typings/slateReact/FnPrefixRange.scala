package typings.slateReact

import typings.slate.mod.Editor
import typings.slate.mod.RangeType
import typings.slate.mod.RangeTypeJSON
import typings.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnPrefixRange extends js.Object {
  def apply(range: RangeTypeJSON, prefix: String): Editor = js.native
  def apply(range: RangeTypeJSON, prefix: String, suffix: String): Editor = js.native
  def apply(range: RangeTypeProperties, prefix: String): Editor = js.native
  def apply(range: RangeTypeProperties, prefix: String, suffix: String): Editor = js.native
  def apply(range: RangeType, prefix: String): Editor = js.native
  def apply(range: RangeType, prefix: String, suffix: String): Editor = js.native
}

