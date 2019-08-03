package typings.slateDashReact

import typings.immutable.immutableMod.List
import typings.slate.slateMod.Controller
import typings.slate.slateMod.Editor
import typings.slate.slateMod.InlineProperties
import typings.slate.slateMod.NodeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_NewProperties extends js.Object {
  def apply(path: List[Double], newProperties: String): Editor = js.native
  def apply(path: List[Double], newProperties: InlineProperties): Controller = js.native
  def apply(path: List[Double], newProperties: NodeProperties): Editor = js.native
}

