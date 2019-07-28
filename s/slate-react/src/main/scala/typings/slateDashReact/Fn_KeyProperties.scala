package typings.slateDashReact

import typings.slate.slateMod.BlockProperties
import typings.slate.slateMod.Editor
import typings.slate.slateMod.InlineProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_KeyProperties extends js.Object {
  def apply(key: String, properties: String): Editor = js.native
  def apply(key: String, properties: BlockProperties): Editor = js.native
  def apply(key: String, properties: InlineProperties): Editor = js.native
}

