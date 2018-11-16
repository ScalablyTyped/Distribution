package typings
package reactDashCodemirrorLib.ReactCodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactCodeMirror
  extends reactLib.reactMod.Component[ReactCodeMirrorProps, js.Object, js.Any] {
  /** Focuses the CodeMirror instance. */
  def focus(): scala.Unit = js.native
  /** Returns the CodeMirror instance, if available. */
  def getCodeMirror(): codemirrorLib.codemirrorMod.CodeMirrorNs.Editor = js.native
}

