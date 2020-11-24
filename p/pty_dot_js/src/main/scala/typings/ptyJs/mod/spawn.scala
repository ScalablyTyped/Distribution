package typings.ptyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pty.js", "spawn")
@js.native
object spawn extends js.Object {
  
  def apply(): Terminal = js.native
  def apply(file: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], opt: TerminalOptions): Terminal = js.native
  def apply(file: js.UndefOr[scala.Nothing], args: js.Array[String]): Terminal = js.native
  def apply(file: js.UndefOr[scala.Nothing], args: js.Array[String], opt: TerminalOptions): Terminal = js.native
  def apply(file: String): Terminal = js.native
  def apply(file: String, args: js.UndefOr[scala.Nothing], opt: TerminalOptions): Terminal = js.native
  def apply(file: String, args: js.Array[String]): Terminal = js.native
  def apply(file: String, args: js.Array[String], opt: TerminalOptions): Terminal = js.native
}
