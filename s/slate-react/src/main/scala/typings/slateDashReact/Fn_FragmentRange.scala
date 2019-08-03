package typings.slateDashReact

import typings.slate.slateMod.Document
import typings.slate.slateMod.Editor
import typings.slate.slateMod.RangeType
import typings.slate.slateMod.RangeTypeJSON
import typings.slate.slateMod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_FragmentRange extends js.Object {
  def apply(range: RangeTypeJSON, fragment: Document): Editor = js.native
  def apply(range: RangeTypeProperties, fragment: Document): Editor = js.native
  def apply(range: RangeType, fragment: Document): Editor = js.native
}

