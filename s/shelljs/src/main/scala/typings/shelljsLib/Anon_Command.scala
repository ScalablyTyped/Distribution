package typings
package shelljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Command extends js.Object {
  def apply(command: java.lang.String): shelljsLib.shelljsMod.ExecOutputReturnValue = js.native
  def apply(command: java.lang.String, callback: shelljsLib.shelljsMod.ExecCallback): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(command: java.lang.String, options: shelljsLib.shelljsMod.ExecOptions): shelljsLib.shelljsMod.ExecOutputReturnValue | nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(
    command: java.lang.String,
    options: shelljsLib.shelljsMod.ExecOptions,
    callback: shelljsLib.shelljsMod.ExecCallback
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
}

