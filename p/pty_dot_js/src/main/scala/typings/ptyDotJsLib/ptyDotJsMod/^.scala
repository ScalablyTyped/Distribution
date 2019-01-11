package typings
package ptyDotJsLib.ptyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pty.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createTerminal(): ptyDotJsLib.ptyDotJsMod.Terminal = js.native
  def createTerminal(file: java.lang.String): ptyDotJsLib.ptyDotJsMod.Terminal = js.native
  def createTerminal(file: java.lang.String, args: js.Array[java.lang.String]): ptyDotJsLib.ptyDotJsMod.Terminal = js.native
  def createTerminal(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    opt: ptyDotJsLib.ptyDotJsMod.TerminalOptions
  ): ptyDotJsLib.ptyDotJsMod.Terminal = js.native
  def fork(): ptyDotJsLib.ptyDotJsMod.Terminal = js.native
  def fork(file: java.lang.String): ptyDotJsLib.ptyDotJsMod.Terminal = js.native
  def fork(file: java.lang.String, args: js.Array[java.lang.String]): ptyDotJsLib.ptyDotJsMod.Terminal = js.native
  def fork(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    opt: ptyDotJsLib.ptyDotJsMod.TerminalOptions
  ): ptyDotJsLib.ptyDotJsMod.Terminal = js.native
  def open(): ptyDotJsLib.ptyDotJsMod.Terminal = js.native
  def open(opt: ptyDotJsLib.Anon_Cols): ptyDotJsLib.ptyDotJsMod.Terminal = js.native
  def spawn(): ptyDotJsLib.ptyDotJsMod.Terminal = js.native
  def spawn(file: java.lang.String): ptyDotJsLib.ptyDotJsMod.Terminal = js.native
  def spawn(file: java.lang.String, args: js.Array[java.lang.String]): ptyDotJsLib.ptyDotJsMod.Terminal = js.native
  def spawn(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    opt: ptyDotJsLib.ptyDotJsMod.TerminalOptions
  ): ptyDotJsLib.ptyDotJsMod.Terminal = js.native
}

