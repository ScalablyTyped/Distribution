package typings.prosemirrorMenu.mod

import typings.prosemirrorMenu.AnonContent
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-menu", "menuBar")
@js.native
object menuBar extends js.Object {
  def apply[S /* <: Schema[_, _] */](options: AnonContent[S]): Plugin[S, _] = js.native
}

