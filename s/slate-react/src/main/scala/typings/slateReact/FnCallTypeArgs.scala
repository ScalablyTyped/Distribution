package typings.slateReact

import typings.slate.mod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallTypeArgs extends js.Object {
  def apply(`type`: String, args: js.Any*): Editor = js.native
  def apply(`type`: js.Function1[/* repeated */ js.Any, _], args: js.Any*): Editor = js.native
}

