package typings.shelljsExecProxy.mod

import org.scalablytyped.runtime.StringDictionary
import typings.shelljs.mod.ExecOutputReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exec extends /* k */ StringDictionary[Exec] {
  def apply(command: String*): ExecOutputReturnValue = js.native
}

