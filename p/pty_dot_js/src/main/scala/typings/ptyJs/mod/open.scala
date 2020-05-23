package typings.ptyJs.mod

import typings.ptyJs.anon.Cols
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pty.js", "open")
@js.native
object open extends js.Object {
  def apply(): Terminal = js.native
  def apply(opt: Cols): Terminal = js.native
}

