package typings.shelljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shelljsMod {
  type ExecCallback = js.Function3[/* code */ Double, /* stdout */ String, /* stderr */ String, js.Any]
  type ShellArray = js.Array[String] with ShellReturnValue
  type ShellString = String with ShellReturnValue
}
