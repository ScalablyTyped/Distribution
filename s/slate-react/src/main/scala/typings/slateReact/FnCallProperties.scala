package typings.slateReact

import typings.slate.mod.Block
import typings.slate.mod.BlockJSON
import typings.slate.mod.BlockProperties
import typings.slate.mod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallProperties extends js.Object {
  def apply(properties: String): Editor = js.native
  def apply(properties: Block): Editor = js.native
  def apply(properties: BlockJSON): Editor = js.native
  def apply(properties: BlockProperties): Editor = js.native
}

