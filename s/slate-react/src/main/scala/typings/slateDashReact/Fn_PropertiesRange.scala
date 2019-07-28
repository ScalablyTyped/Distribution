package typings.slateDashReact

import typings.slate.slateMod.BlockProperties
import typings.slate.slateMod.Editor
import typings.slate.slateMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_PropertiesRange extends js.Object {
  def apply(range: Range, properties: String): Editor = js.native
  def apply(range: Range, properties: BlockProperties): Editor = js.native
}

