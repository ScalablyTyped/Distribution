package typings.slateDashReact

import typings.slate.slateMod.Block
import typings.slate.slateMod.BlockJSON
import typings.slate.slateMod.BlockProperties
import typings.slate.slateMod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_PropertiesBlock extends js.Object {
  def apply(properties: String): Editor = js.native
  def apply(properties: Block): Editor = js.native
  def apply(properties: BlockJSON): Editor = js.native
  def apply(properties: BlockProperties): Editor = js.native
}

