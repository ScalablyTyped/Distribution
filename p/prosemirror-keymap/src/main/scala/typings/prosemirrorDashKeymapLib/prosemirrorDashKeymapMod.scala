package typings
package prosemirrorDashKeymapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-keymap", JSImport.Namespace)
@js.native
object prosemirrorDashKeymapMod extends js.Object {
  def keydownHandler(bindings: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Function2[
    /* view */ prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[_], 
    /* event */ stdLib.Event, 
    scala.Boolean
  ] = js.native
  def keymap(bindings: org.scalablytyped.runtime.StringDictionary[js.Any]): prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[_] = js.native
}

