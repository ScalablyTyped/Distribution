package typings
package ptyDotJsLib.ptyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pty.js", JSImport.Namespace)
@js.native
object ptyDotJsModMembers extends js.Object {
  def createTerminal(): Terminal = js.native
  def createTerminal(file: java.lang.String): Terminal = js.native
  def createTerminal(file: java.lang.String, args: js.Array[java.lang.String]): Terminal = js.native
  def createTerminal(file: java.lang.String, args: js.Array[java.lang.String], opt: TerminalOptions): Terminal = js.native
  def fork(): Terminal = js.native
  def fork(file: java.lang.String): Terminal = js.native
  def fork(file: java.lang.String, args: js.Array[java.lang.String]): Terminal = js.native
  def fork(file: java.lang.String, args: js.Array[java.lang.String], opt: TerminalOptions): Terminal = js.native
  def open(): Terminal = js.native
  def open(opt: ptyDotJsLib.Anon_Cols): Terminal = js.native
  def spawn(): Terminal = js.native
  def spawn(file: java.lang.String): Terminal = js.native
  def spawn(file: java.lang.String, args: js.Array[java.lang.String]): Terminal = js.native
  def spawn(file: java.lang.String, args: js.Array[java.lang.String], opt: TerminalOptions): Terminal = js.native
}

