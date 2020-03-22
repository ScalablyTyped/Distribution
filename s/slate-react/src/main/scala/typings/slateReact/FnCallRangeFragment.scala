package typings.slateReact

import typings.slate.mod.Document
import typings.slate.mod.Editor
import typings.slate.mod.RangeType
import typings.slate.mod.RangeTypeJSON
import typings.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangeFragment extends js.Object {
  def apply(range: RangeTypeJSON, fragment: Document): Editor = js.native
  def apply(range: RangeTypeProperties, fragment: Document): Editor = js.native
  def apply(range: RangeType, fragment: Document): Editor = js.native
}

