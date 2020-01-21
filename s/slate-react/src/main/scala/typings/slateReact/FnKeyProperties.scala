package typings.slateReact

import typings.slate.mod.BlockProperties
import typings.slate.mod.Editor
import typings.slate.mod.InlineProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnKeyProperties extends js.Object {
  def apply(key: String, properties: String): Editor = js.native
  def apply(key: String, properties: BlockProperties): Editor = js.native
  def apply(key: String, properties: InlineProperties): Editor = js.native
}

