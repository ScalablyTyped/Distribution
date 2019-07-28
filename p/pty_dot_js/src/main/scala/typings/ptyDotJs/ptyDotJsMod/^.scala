package typings.ptyDotJs.ptyDotJsMod

import typings.ptyDotJs.Anon_Cols
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pty.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createTerminal(): Terminal = js.native
  def createTerminal(file: String): Terminal = js.native
  def createTerminal(file: String, args: js.Array[String]): Terminal = js.native
  def createTerminal(file: String, args: js.Array[String], opt: TerminalOptions): Terminal = js.native
  def fork(): Terminal = js.native
  def fork(file: String): Terminal = js.native
  def fork(file: String, args: js.Array[String]): Terminal = js.native
  def fork(file: String, args: js.Array[String], opt: TerminalOptions): Terminal = js.native
  def open(): Terminal = js.native
  def open(opt: Anon_Cols): Terminal = js.native
  def spawn(): Terminal = js.native
  def spawn(file: String): Terminal = js.native
  def spawn(file: String, args: js.Array[String]): Terminal = js.native
  def spawn(file: String, args: js.Array[String], opt: TerminalOptions): Terminal = js.native
}

