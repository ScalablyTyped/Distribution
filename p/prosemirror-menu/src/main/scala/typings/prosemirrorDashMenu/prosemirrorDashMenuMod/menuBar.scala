package typings.prosemirrorDashMenu.prosemirrorDashMenuMod

import typings.prosemirrorDashMenu.Anon_Content
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashState.prosemirrorDashStateMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-menu", "menuBar")
@js.native
object menuBar extends js.Object {
  def apply[S /* <: Schema[_, _] */](options: Anon_Content[S]): Plugin[S, _] = js.native
}

